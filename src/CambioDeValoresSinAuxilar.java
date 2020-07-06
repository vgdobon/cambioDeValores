import java.util.Scanner;

 public class CambioDeValoresSinAuxilar {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int aux;
            System.out.println("Dime un valor");
            int num1=sc.nextInt();

            System.out.println("Dime otro valor");
            int num2=sc.nextInt();

            num1=num1+num2;

            num2=num1-num2;

            num1=num1-num2;

            System.out.println("Numero1:"+num1+"\n Numero 2:" +num2);


        }
 }

