import java.util.Scanner;

public class Rectangular_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of rows");
        int row=sc.nextInt();

        System.out.println("Enter number of Columns");
        int col=sc.nextInt();

        int i=1;
        int j=1;

        for(i=1;i<=row;i++){
            for (j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}