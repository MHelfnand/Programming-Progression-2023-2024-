package com.company;

public class doublearray {
    static int N = 2;

    public static void main(String[] args) {
        int[][][][][][][][][] goals = new int[N][N][N][N][N][N][N][N][N];
        for (int a = 0; a < N; a++) {
            for (int b = 0; b < N; b++) {
                for (int c = 0; c < N; c++) {
                    for (int d = 0; d < N; d++) {
                        for (int e = 0; e < N; e++) {
                            for (int f = 0; f < N; f++) {
                                for (int g = 0; g < N; g++) {
                                    for (int h = 0; h < N; h++) {
                                        for (int i = 0; i < N; i++) {
                                            goals[a][b][c][d][e][f][g][h][i] = 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

            for (int a = 0; a < N; a++) {
                for (int b = 0; b < N; b++) {
                    for (int c = 0; c < N; c++) {
                        for (int d = 0; d < N; d++) {
                            for (int e = 0; e < N; e++) {
                                for (int f = 0; f < N; f++) {
                                    for (int g = 0; g < N; g++) {
                                        for (int h = 0; h < N; h++) {
                                            for (int i = 0; i < N; i++) {
                                                System.out.println(goals[a][b][c][d][e][f][g][h][i]);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
    }
}
