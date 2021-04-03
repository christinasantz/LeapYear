import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        System.out.println("Give a year and I will calculate if it is leap or not for you!");
        try{
            int year = console.nextInt();
            if (year%4==0){
                if (year%100!=0){
                    System.out.println("Year "+year+ " is leap!");
                }
            }
            else{
                if (year%400==0){
                    System.out.println("Year "+year+ " is leap!");
                }
                else{
                    System.out.println("Year "+year+ " is not leap!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Try giving an integer number!");
        }
    }
}
