import java.util.Arrays;
public class largestNum {

    void getBiggest(int[] array){

        Arrays.sort(array);
        int count = 0;
        int[] temp = new int[array.length];
        for(int i = 0; i < array.length;i++){
            if(array[i] < 0){

                count += 1;
            }else{
                temp[i] = array[i];
            }
        }
        if(count == 0){

            System.out.println(temp[temp.length - 1]);

        }else{
            System.out.println("Array contains one or more negatives.");
        }
    }
    public static void main(String[] args) {
        int[] arrayWN = {1,2,3,-12,-655,124,234,65464,23};
        int[] arrayAP = {1,2,3,12,655,124,234,65464,23};
        largestNum gb = new largestNum();
        gb.getBiggest(arrayWN); //Array contains one or more negatives.
        gb.getBiggest(arrayAP); //65464
    }
}
