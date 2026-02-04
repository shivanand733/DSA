import java.util.Scanner;

public class ravi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Name");
        int size = scan.nextInt();
        String[] arry = new  String[size];

        for (int i = 0; i <= arry.length-1; i++) {
            arry[i] = scan.next();
        }
        for (int i = 0; i <= arry.length-1; i++) {
            System.out.println(arry[i]);
        }
        
    }

}
