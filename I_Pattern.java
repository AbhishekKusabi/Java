import java.util.Scanner;

public class I_Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for (int i =1; i<=r;i++){
            for (int j=1;j<=r;j++){
                if ( i==1 ||i==r || j == (r/2)+1){
                    System.out.print("*");
                }
                else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}
