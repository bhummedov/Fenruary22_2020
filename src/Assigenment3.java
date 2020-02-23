import java.util.Scanner;
public class Assigenment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number :");
        int number = scanner.nextInt();
        System.out.println("enter yor power :");
        int power = scanner.nextInt();
        int result = (int) Math.pow(number, power);
        System.out.println("your result is : "+result);
    }
}

