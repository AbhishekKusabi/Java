import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int row=scn.nextInt();

        for (int i=1;i<=row;i++){  // for iteration through each line(row)
            for (int j=1;j<=(row-i);j++){ //to print gaps
                System.out.print(" ");
            }
            for (int k=1;k<=(i*2-1);k++){   // to print star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
