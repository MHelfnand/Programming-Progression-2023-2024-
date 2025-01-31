package com.example.contactlist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etName, etPhone, etSearch;
    Button btAdd, btSearch;
    ListView lst;

    ArrayList<String> arrayListPhone;
    ArrayList<String> arrayListAll;
    ArrayAdapter<String> adapter;

    Cursor c;

    SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = openOrCreateDatabase("ContactList", 0, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS Contact (name TEXT PRIMARY KEY, phone TEXT)");

        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        etSearch = findViewById(R.id.etSearchName);
        btAdd = findViewById(R.id.btAdd);
        btSearch = findViewById(R.id.btSearch);
        lst = findViewById(R.id.lstContact);

        btAdd.setOnClickListener(this);
        btSearch.setOnClickListener(this);

        arrayListPhone = new ArrayList<>();

        arrayListAll = new ArrayList<String>();


        c = db.rawQuery("SELECT * FROM Contact", null);
        while (c.moveToNext()) {
            arrayListAll.add(c.getString(0) + " " + c.getString(1));
        }

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayListAll);

        lst.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (R.id.menuAZ == item.getItemId()) {
            arrayListAll = new ArrayList<String>();


            c = db.rawQuery("SELECT * FROM Contact ORDER BY name ASC", null);
            while (c.moveToNext()) {
                arrayListAll.add(c.getString(0) + " " + c.getString(1));
            }

            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayListAll);

            lst.setAdapter(adapter);
        }
        if (R.id.menuZA == item.getItemId()) {
            arrayListAll = new ArrayList<String>();


            c = db.rawQuery("SELECT * FROM Contact ORDER BY name DESC", null);
            while (c.moveToNext()) {
                arrayListAll.add(c.getString(0) + " " + c.getString(1));
            }

            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayListAll);

            lst.setAdapter(adapter);
        }
        return true;
    }

    @Override
    public void onClick(View v) {

        if (v == btAdd) {
            String name, phone;
            name = etName.getText().toString();
            phone = etPhone.getText().toString();

            db.execSQL("INSERT INTO Contact VALUES ('" + name + "', '" + phone + "')");
            arrayListAll = new ArrayList<String>();


            c = db.rawQuery("SELECT * FROM Contact", null);
            while (c.moveToNext()) {
                arrayListAll.add(c.getString(0) + " " + c.getString(1));
            }

            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayListAll);

            lst.setAdapter(adapter);
            etName.setText("");
            etPhone.setText("");
        }

        if (v == btSearch) {

        }
    }
}