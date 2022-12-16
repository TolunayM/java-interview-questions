import java.util.Scanner;

public class perfectNum {

    public static void main(String[] args) {
        int temp = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number ");
        num = scanner.nextInt();

        for(int i = 1; i <= num/2;i++) {
            if (num % i == 0) {
                temp += i;
            }
        }
        System.out.println(num == temp ? "Perfect Number": "Nope");
    }
}
