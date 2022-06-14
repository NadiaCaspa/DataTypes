import java.util.Scanner;
public class DataTypes {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

   int Weeks = 0;
   int Days = 7;
   int Hours = 168;
   int Minutes = 10080;
   int Seconds = 604800;
        System.out.println("Enter number of weeks");
        Weeks = input.nextInt();
        System.out.println((Days * Weeks) + " Days." );
        System.out.println((Hours * Weeks) + " Hours");
        System.out.println((Minutes * Weeks) + " Minutes");
        System.out.println((Seconds * Weeks) + " Seconds");


    }


}
