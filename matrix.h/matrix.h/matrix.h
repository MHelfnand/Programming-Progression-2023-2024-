//
//  main.cpp
//  matrix.h
//
//  Michael Helfand
//  1653490
//  Assignment 2
//  10/23/24
//  The Program matrix.h runs six different vector and matrix oporations. Including dot and cross product of two vectors, the prefix sum of a vector, finding the diagnol of a matrix, a tru or false statement of symmetry of a matrix, and the matrix multiplication of two matricies.


#include <iostream>

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
