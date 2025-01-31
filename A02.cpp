// Michael Helfand
// 1653490
// Assignment #: 2
// Submission Date: 10/23/2024
//
// Description: A program to create and manipulate matices in the form of double arrays. operations such as dot, cross product, and addition.

#include <iostream> //std::cout, std::cin, etc.
#include <cstdlib>  //C++ version of stdlib.h
#include <cstring>  //C++ version of string.h
#include <string>   //C++ string library

//todo: add other includes you may need
#define CBL 64
//Command line args reference:
//https://docs.microsoft.com/en-us/cpp/cpp/main-function-command-line-args
/*char codebook [] ={'z','Z','y','Y','x','X','w','W','v','V','u','U','t','T','s','S',\
                   'r','R','q','Q','p','P','o','O','n','N','m','M','l','L','k','K',\
                   'j','J','i','I','h','H','g','G','f','F','e','E','d','D','c','C',\
                   'b','B','a','A','0','1','2','3','4','5','6','7','8','9','@',']'
};

int Find(char ch){
    for (int i = 0; i < CBL; i++) {
        if (codebook[i] == ch)return i;
        }
        return -1;
}
std::string encryptT(const std::string str, int k) {
    std::string cipher = "";
    for (char ch : str) {
        int p = Find(ch);
        if (p != -1) {
            int c = (p + k) % CBL;
            cipher += codebook[c];
        } else {
            std::cerr << "Invalid character in plaintext!\n";
            return "";
        }
    }
    return cipher;
}

std::string decryptT(const std::string str, int k) {
    std::string plain = "";
    for (char ch : str) {
        int C = Find(ch);
        if (C != -1) {
            int p = (C - k)%CBL;
            if (p < 0){
                p = (p + CBL)%CBL;
            }
                plain += codebook[p];
        }
        else {
            std::cerr << "Invalid character in ciphertext!\n";
            return "";
            }
    }
    return plain;
}
*/
int dot( int a [], int b [], int length ) {
    int dot_product = 0;
    for(int i=0; i < length; i++){
        dot_product += a[i]*b[i];
    }
    return dot_product;
}
void cross( int a [], int b [],int c [], int length = 3 ){
    int p = 1;
    int q = 2;
    for(int i=0; i < length; i++){
        c[i]= a[p]*b[q]-a[q]*b[p];
        std::swap(p,q);
        q--;
    }
}
void prefix_sum(int A[], int S[], int size){
    int tmp = 0;
    for(int i=0; i < size; i++){
        S[i] = A[i] + tmp;
        tmp += A[i];
    }
}
void diagonal( int matrix[][3], int diagonal[], int size){
    for(int i=0; i < size; i++){
        diagonal[i] = matrix[i][i];
    }
}
void diagonal(int matrix[][2], int diagonal[], int size){
    for(int i=0; i < size; i++){
        diagonal[i] = matrix[i][i];
    }
}
bool symmetric( int matrix[][3], const int size){
    for(int i=0; i < size; i++){
        for(int j=0; j < size; j++){
           // std::cout << matrix[i][j];
            if(matrix[i][j]!=matrix[j][i])
                return 0;
        }
    }
    return 1;
}
bool symmetric( int matrix[][2], const int size){
    for(int i=0; i < size; i++){
        for(int j=0; j < size; j++){
           // std::cout << matrix[i][j];
            if(matrix[i][j]!=matrix[j][i])
                return 0;
        }
    }
    return 1;
}
void multiply(int A[][2], int B[][2], int C[][2], int r, int c){
    for(int i=0; i < r; i++){
        for(int j=0; j < c; j++){
            C[i][j]=A[i][j]*B[i][j];
        }
    }
}
void multiply(int A[][3], int B[][3], int C[][3], int r, int c){
    for(int i=0; i < r; i++){
        for(int j=0; j < c; j++){
            C[i][j]=A[i][j]*B[i][j];
        }
    }
}


int main(int argc, char* argv[])
{
      int size = 3;
    int a[] = {1,1,1};
    int b[] = {2,2,2};
    std::cout << dot(a, b, size);
    
    int c[3]; cross(a, b, c);
    for(int i = 0; i < size; i++)
        std::cout << c[i];
    
   
    
    size = 7;
    int D []={0 ,1 ,2 ,3 ,4 ,5 ,6}; int S [ size ];
    prefix_sum (D ,S , size );
    for ( int i =0; i < size ; ++ i )
    std :: cout << S [ i ] << " " ;
    
    const int size3 = 3; const int size2 = 2;
    int m3 [][ size3 ] = {{1 , 2 , 3} , {4 , 5 , 6} , {7 , 8 , 9}}; int d3 [ size3 ];
    diagonal ( m3 , d3 , size3 );
    for ( int i =0; i < size3 ; ++ i )
    std :: cout << d3 [ i ] << " " ;
    
    int m1 [][ size3 ] = {{3 , 5 , 9} , {5 , 7 , 1} , {9 , 1 , 5}};
    int m2 [][ size3 ] = {{3 , 5 , 10} , {5 , 0 , 6} , {10 , 7 , 1}};
    std :: cout << symmetric ( m1 , size3 );
    std :: cout << symmetric ( m2 , size3 );
    
    const int r = 2; const int d = 2;
    int A [  ][ 2 ] = {{1 ,2} ,{3 ,4}};
    int B [  ][ 2 ] = {{5 ,6} ,{7 ,8}};
    int C [ r ][ d ];
    multiply (A, B, C, r, d);
    for ( int i =0; i < r ; ++ i ){
    for ( int j = 0; j < d ; ++ j )
    std :: cout << C [ i ][ j ] << " " ;
    std :: cout << " \n " ;
     }
    /*// Insufficient arguments, exit program
    if (argc < 6) {
        std::cerr << "Error: Insufficient arguments.\n";
        return -1;
    }
     
    std::string msg;                          // string to store argv[msg_index]
    int k = 0;                               // shift amount
    bool encrypt = false;                         // perform encryption set to true
    bool decrypt = false;
    
    for (int i = 1; i < argc; i++) {
                                   
        if (std::strcmp(argv[i], "-p") == 0){
            msg = argv[++i];
            for (int i = 1; i < argc; i++){
                if(std::strcmp(argv[i], "-e") == 0){
                    encrypt = true;
                }
            }
        }
        
        if (std::strcmp(argv[i], "-c") == 0){
            msg = argv[++i];
            for (int i = 1; i < argc; i++){
                if(std::strcmp(argv[i], "-d") == 0){
                    decrypt = true;
                }
            }
        }
        
        if(std::strcmp(argv[i], "-k") == 0){
            k = std::stoi(argv[++i]);
        }
           }
    
    if (encrypt) {
        
        std::string cipher = encryptT(msg, k);
        if (!cipher.empty()) {
            std::cout << cipher << std::endl;
        }
        else {
            std::cerr << "Invalid option. Use -p for plaintext.\n";
        }
    }
    if (decrypt) {
        std::string plain = decryptT(msg, k);
        if (!plain.empty()) {
            std::cout << plain << std::endl;
        }
        else {
            std::cerr << "Invalid option. Use -c for cypherext.\n";
        }
    }
     */
    return 0;
}//main



