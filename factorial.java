public class factorial {
    public static void main(String[] args) {
        //Verilen bir dizideki tüm çift sayıların faktöriyelini bulun.

        int[] array = {2,4,5,10,6};


        for(int i : array){
            int factorial = 1;
            int sum = 0;
            if(i % 2 == 0){
                while(i >= 2){

                    sum = i * (i - 1);
                    factorial *= sum;
                    i -= 2;

                }
            }
            System.out.println(factorial);
        }

    }
}
