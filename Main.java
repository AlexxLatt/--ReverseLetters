
public class Main {
    String startText ="J@va the be$t!123";
    String finalText = "t@eb eht av$J!123";
    static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        int start = 0;
        int end = str.length()-1;
        char[] output = str.toCharArray();

        while (start< end){

            boolean isStartLetter = Character.isLetter(output[start]);
            boolean isEndLetter = Character.isLetter(output[end]);


            if(!isStartLetter){
                start++;
                continue;
            }

            if(!isEndLetter){
                end--;
                continue;
            }

            char temp = output[start];
            output[start] = output[end];
            output[end] = temp;
            start++;
            end--;

        }




        return new String(output);
    }

    public static void main(String[] args) {
        String str = "J@va the be$t!123";
        System.out.println(reverse(str));

    }
}