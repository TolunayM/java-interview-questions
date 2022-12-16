//Reverse String without stringbuilder

public class reverseStr {
    public static void main(String[] args) {
        String str = "Tolunay";
        String temp = "";
        for(int i = 0; i < str.length();i++){
            temp = str.charAt(i) + temp;
            System.out.println(temp);
        }

    }
}
