import java.util.Scanner;
public class currency_converter {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to currency coverter");
        System.out.println("1 US Dollar to Indian Rupee ");
        System.out.println("2 Indian rupee to US Dollar");
        System.out.println("3 Russian Ruble to Indian Rupee");
        System.out.println("4 Indian Rupee to russian Ruble");
        System.out.println("5 Nepalese Rupee to Indian Rupee ");
        System.out.println("6 Indian Rupee to Nepalese Rupee");

        System.out.print("Choose a Number:");
        double number=sc.nextInt();

        if(number==1){
            System.out.println("Enter US Dollar");
            double n=sc.nextInt();
            double rupee=n*85.7521;
            System.out.println(rupee + " Indian Rupee");

        }else if(number==2){
            System.out.println("Enter Indian Rupee");
            double n=sc.nextInt();
            double rupee=n*0.0117;
            System.out.println(rupee + " US Dollar");

        }else if(number==3){
            System.out.println("Enter Russian Ruble");
            double n=sc.nextInt();
            double rupee=n*1.097;
            System.out.println(rupee + " Indian Rupee");

        }else if(number==4){
            System.out.println("Enter Indian Rupee");
            double n=sc.nextInt();
            double rupee=n*0.9116;
            System.out.println(rupee + " Russian Ruble ");

        }else if(number==5){
            System.out.println("Enter Nepalese rupee");
            double n=sc.nextInt();
            double rupee=n*0.62;
            System.out.println(rupee + " Indian ruoee");

        }else if(number==6){
            System.out.println("Enter Indian Rupee");
            double n=sc.nextInt();
            double rupee=n*1.6;
            System.out.println(rupee + " Nepalese Rupee");

        }else{
            System.out.println("Invaid Output ");
        }

    }
}
