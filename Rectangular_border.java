import java.util.Scanner;

public class Rectangular_border {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int row=sc.nextInt();
        int col=sc.nextInt();
        int i=1;
        int j=1;
        for (i=1;i<=row;i++){
            for (j=1;j<=col;j++){
                if(i==1 || i ==row || j==1 || j == col){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
