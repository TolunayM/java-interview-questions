public class Squares {
    public static void main(String[] args) {
        //Verilen bir dizideki tüm çift sayıların karesinin toplamını bulun.

        int[] array = {2 ,4 ,8,5};

        int sum = 0;
        for(int i : array){
            if(i % 2 == 0){
                sum += (int) Math.pow(i,2);
            }
        }
        System.out.println(sum);
    }
}
