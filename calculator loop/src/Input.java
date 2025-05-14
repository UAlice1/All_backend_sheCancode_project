public class Input {
    public static void main (String[] args) {
        int input = (int) Integer.parseInt(args[0]);
        // double doubleInput = (double) Double.parseDouble(args[0]);
        System.out.println("Multiplication table of: "+input);
        for (int i=1; i <= 12; i++) {
            System.out.printf("%d x %d = %d\n", input, i, input*i);
        }
    }
}