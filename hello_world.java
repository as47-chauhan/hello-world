import java.util.Scanner;

public class hello_world {
    public static void main(String[] args){
        System.out.println("HELLO WORLD");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name :");
        String name = sc.nextLine();
        for (int i=0;i<=3;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("your name is :"+ name);
    }
}
