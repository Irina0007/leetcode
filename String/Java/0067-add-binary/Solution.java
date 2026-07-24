class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = 0;
            int digitB = 0;

            if (i >= 0) {
                digitA = a.charAt(i) - '0';
            }

            if (j >= 0) {
                digitB = b.charAt(j) - '0';
            }

            int c = carry + digitA + digitB;
            int d = c % 2;
            carry = c / 2;
            sb.append(d);
            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}
