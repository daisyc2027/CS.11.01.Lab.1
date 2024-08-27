import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");
        String age = scanner.nextLine();

        int minAge = Integer.parseInt(age);
        System.out.println(age + "-year olds should date somebody who is at least " + (minAge / 2 + 7) + " years old");
        
    }
}

