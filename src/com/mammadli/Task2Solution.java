package com.mammadli;

public class Task2Solution {


    public static void check(int[][] mas, int N, int M, int nameOfLand, int Nlength, int Mlength) {
        if (N+1<Nlength && nameOfLand == mas[N+1][M]) {
            mas[N+1][M] = -1;
            check(mas, N + 1, M, nameOfLand,Nlength,Mlength);
        }

        if (N-1>=0 && nameOfLand == mas[N-1][M]) {
            mas[N-1][M] = -1;
            check(mas, N - 1, M, nameOfLand,Nlength,Mlength);
        }

        if (M+1<Mlength && nameOfLand== mas[N][M+1]) {
            mas[N][M+1] = -1;
            check(mas, N , M + 1, nameOfLand,Nlength, Mlength);
        }

        if (M-1>=0 && nameOfLand == mas[N][M-1]) {
            mas[N][M-1] = -1;
            check(mas, N , M - 1, nameOfLand,Nlength, Mlength);
        }

    }

    public static int solution(int[][] mas) {
        int landCount = 0;
        int M = mas[0].length;
        int N = mas.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (mas[i][j] > -1) {
                    check(mas, i, j, mas[i][j],N,M);
                    mas[i][j]=-1;
                    landCount++;
                }
            }
        }


        return landCount;
    }

    public static void main(String[] args) {


        int[][] mas = {{5, 4, 4}, {4, 3, 4}, {3, 2, 4}, {2, 2, 2}, {3, 3, 4}, {1, 4, 4}, {4, 1, 1}};

        System.out.println(solution(mas));

    }
}
