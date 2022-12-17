package Pratice.DFS.버블정렬;

class Main {
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        int n = 6;
        int arr[] = {7, 5, 9, 4, 65, 1};
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}