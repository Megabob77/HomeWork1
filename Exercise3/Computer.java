package Exercise3;

public class Computer {
    public static void main(String[] args) {


        int[] computers = {5};


        class Computer1 {
            final int[] computer1 = new int[]{1};
        }
        class Computer2 {
            final int[] computer2 = new int[]{2};
        }
        class Computer3 {
            final int[] computer3 = new int[]{3};
        }
        class Computer4 {
            final int[] computer4 = new int[]{4};
        }
        class Computer5 {
            final int[] computer5 = new int[]{5};
        }


        for (int computer : computers) {
            int i = 0;
            while (i < computer) {
                i++;
            }
            System.out.println(i + computer);
        }
    }
}




