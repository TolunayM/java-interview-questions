public class gorilla {
    public Integer find_total(Integer[] my_numbers) {
        int count = 0;

        for (int i : my_numbers) {
            if (i % 2 == 0) {
                count++;
            } else if (i % 2 != 0 && i != 5) {
                count += 3;
            } else if (i == 5) {
                count += 5;
            }

        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        gorilla g = new gorilla();
        g.find_total(new Integer[]{1,2,3,4,5});

    }


}