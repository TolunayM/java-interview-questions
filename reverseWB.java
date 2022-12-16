//Reverse String with StringBuilder

public class reverseWB {
    public static void main(String[] args) {
        String str = "Tolunay";
        StringBuilder str2 = new StringBuilder();
        str2
                .append(str)
                .reverse();
        System.out.println(str2);
    }
}
