import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        input.nextLine();

        String[] array = new String[T];

        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < T; i++) { //fill array with strings ex. 5 7 3
            array[i] = input.nextLine();
        }

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if ((j % 2) == 0) {
                    even.append(array[i].charAt(j));
                } else {
                    odd.append(array[i].charAt(j));
                }
            }
            System.out.println(even + " " + odd);
            even.delete(0, even.length());
            odd.delete(0, odd.length());
        }
    }
}