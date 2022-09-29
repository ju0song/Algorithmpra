import java.util.ArrayList;
import java.util.Scanner;

public class even_and_odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        if(a/2 == 0) {
            System.out.println("ODD");
        }else{
            System.out.println("EVEN");
        }

    }
}
