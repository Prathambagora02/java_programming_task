public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String input = "00000123789";
        String output = removeLeadingZeros(input);
        System.out.println("Output: " + output);
    }

    public static String removeLeadingZeros(String input) {
        int i = 0;
        while (i < input.length() && input.charAt(i) == '0') {
            i++;
        }
        return input.substring(i);
    }
}