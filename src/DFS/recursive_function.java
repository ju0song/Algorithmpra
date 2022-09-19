package DFS;

import com.sun.tools.javac.Main;

public class recursive_function(int n) {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    public void solution(int n){
        DFS(n);
    }
    
    public static void main(String[] args){
        Main T = new Main();
        T.solution(3);
        //System.out.println(T.solution(3));
    }

}
