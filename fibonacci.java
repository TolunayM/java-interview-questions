import java.util.Scanner;

public class fibonacci {

    void fibon(){
        int a = 0, b= 0, c= 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for fibonacci");
        int input = scanner.nextInt();
        for(int i = 0; i < input; i++){
            a = b;
            b = c;
            c = a+b;
            System.out.println(b);
        }
    }


    public static void main(String[] args) {

        fibonacci test = new fibonacci();
        test.fibon();

    }
}
