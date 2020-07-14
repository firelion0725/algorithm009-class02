public class ReverseWords {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        ReverseWords r = new ReverseWords();
        r.reverseWords(s);
    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strings = s.split(" ");
        for (String string : strings) {
            sb.append(reverseWord(string));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private String reverseWord(String string) {
        char[] chars = string.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
