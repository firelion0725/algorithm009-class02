public class ReverseStr {

    public static void main(String[] args) {
        String s = "abcd";
        int k = 3;
        ReverseStr r = new ReverseStr();
        r.reverseStr(s, k);
    }

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int index1 = 0;
        int index2 = 2 * k - 1;
        while (index2 <= chars.length) {
            reverse(chars, index1, index1 + k - 1);
            index1 += 2 * k;
            index2 += 2 * k;
        }
        if ((chars.length - index1) < k) {
            reverse(chars, index1, chars.length - 1);
        }
        if ((chars.length - index1) < 2 * k && (chars.length - index1) >= k) {
            reverse(chars, index1, index1 + k - 1);
        }

        return new String(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        int s = start;
        int e = end;
        while (s < e) {
            swap(chars, s, e);
            s++;
            e--;
        }
    }

    private void swap(char[] chars, int left, int right) {
        if (left == right) {
            return;
        }
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
    }
}
