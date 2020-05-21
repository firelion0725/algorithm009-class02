class PlusOne {


    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;

        while (index >= 0) {
            digits[index]++;
            if (digits[index] % 10 == 0) {
                digits[index] = 0;
                index--;
            } else {
                return digits;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}