import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.print(" собрала Маша");
        int x= input.nextInt();
        System.out.print(" собрал Миша");
        int y=input.nextInt();
        System.out.print(" Съели");
        int z= input.nextInt();


        int berries=x+y-z;
        System.out.println();



        if (x+y>z){
            System.out.print("Собрано ягод "+berries);
        }

        else if (z>x+y){
            System.out.print("Impossible");

        }

    }







}
