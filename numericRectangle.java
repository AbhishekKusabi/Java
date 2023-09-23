import java.util.Scanner;

public class numericRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();

//        Iteration through each row
        for (int i=1 ; i<=r;i++) {
            for (int j = i; j <= r; j++) {      // prints number in inverted triangle form
                System.out.print(j);
            }
            for (int k = 1; k <= i - 1; k++) {  // after first row prints all starting missing numbers & forms box with numbers

                System.out.print(k);
            }
            System.out.println();
        }


    }
}
