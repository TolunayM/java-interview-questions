import java.util.ArrayList;
import java.util.List;

public class repeatString {

    void repeatedChar(String word) {
    String temp = "";
    List<Character> rp = new ArrayList<>();
    char[] chArray = word.toCharArray();

    for(int i = 0; i < chArray.length;i++){
        for(int j = 1; j < i; j++){
            if(chArray[i] == chArray[j]){
                if(!rp.contains(chArray[i])){
                    rp.add(chArray[i]);
                    temp += chArray[i];
                }


            }
        }
    }
        System.out.println(temp);
        System.out.println(rp);

    }

    public static void main(String[] args) {

        repeatString rp = new repeatString();
        rp.repeatedChar("aaaaasdfrrrrbboo");
    }
}
