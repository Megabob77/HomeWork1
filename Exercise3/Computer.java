package Exercise3;

import java.util.Arrays;

public class Computer{
    private int id;

    public Computer(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        for (int i = 0; i < computers.length; i++){
            computers[i] = new Computer(i);
        }
        System.out.println(Arrays.toString(computers));
    }

    @Override
    public String toString() {
        return "Computer(" + "id" + id + ")";
    }
}




