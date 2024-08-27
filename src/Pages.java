import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println(age + " year olds should be at least " + (100 - age) + " pages before giving up on a book");
    }
}
