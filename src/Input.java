import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
    private static BufferedReader input;

    public Input() {
    }

    public static Character getCharacter(String prompt) {
        System.out.print(prompt);

        Character value;
        try {
            value = input.readLine().charAt(0);
        } catch (Exception var3) {
            value = null;
        }

        return value;
    }

    public static Double getDouble(String prompt) {
        System.out.print(prompt);

        try {
            Double value = Double.parseDouble(input.readLine());
            return value;
        } catch (Exception var3) {
            throw new NumberFormatException();
        }
    }

    public static Integer getInteger(String prompt) {
        System.out.print(prompt);

        try {
            Integer value = Integer.parseInt(input.readLine());
            return value;
        } catch (Exception var3) {
            throw new NumberFormatException();
        }
    }

    public static String getString(String prompt) {
        System.out.print(prompt);

        String string;
        try {
            string = input.readLine();
        } catch (Exception var3) {
            string = null;
        }

        return string;
    }

    static {
        input = new BufferedReader(new InputStreamReader(System.in));
    }
}
