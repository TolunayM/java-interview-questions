import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner primeScan = new Scanner(System.in);
        int stop = 0;
        int prime = primeScan.nextInt();
        for (int x = 2; x < prime; x++) {
            if (prime % x == 0) {
                stop++;
                if(stop >= 1){
                    break;
                }
            }
        }
        if(stop >= 1){
            System.out.println(prime + " is not prime");
        }else{
            System.out.println(prime + " is prime");
        }

    }
}

