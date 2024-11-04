
import java.util.*;

public class InnerI_Mad_Triangles {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        in.close();
        }
        
        static void pattern1(int n) {
            for(int row = 1; row <= n;row++){
                for (int col = 1;col <= row;col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }

        static void pattern2(int i) {
            for(int row = 1; row<=i;row++) {
                for(int col =1;col<=i-row;col++){
                    System.out.print(" ");
                }
                
                for(int star=1;star<=row;star++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }

        static void pattern3(int j) {
            for (int row = 1; row<=j;row++){
                for (int col = 1;col<=j-row;col++) {
                    System.out.print(" ");
                }

                for (int star = 1;star<=2*row-1;star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }


        static void pattern4(int k) {
            System.out.println('*');
            int num=k-2;
            for (int r = 1; r<=num;r++){
                System.out.print("*");
                for (int col = 1;col< r;col++) {
                    System.out.print(" ");
                }
                System.out.println('*');
            }
            for(int i=0;i<k;i++){
                System.out.print("*");
            }
            System.out.println();
        }

        static void pattern5(int k) {
            System.out.println();
            for(int row = 1; row<=k;row++) {
                for(int col =1;col<=k-row;col++){
                    System.out.print(" ");
                }
                
                for(int star=1;star<=row;star++){
                    if(star == row || star ==1 || row == k) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        static void pattern6(int j) {
            for (int row = 1; row<=j;row++){
                for (int col = 1;col<=j-row;col++) {
                    System.out.print(" ");
                }
    
                for (int star = 1;star<=2*row-1;star++) {
                    if (star==1||star ==2*row-1 || row == j) {
                        
                    System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
      
}
            
        

    
