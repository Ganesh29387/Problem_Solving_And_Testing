class Solution {
    public boolean halvesAreAlike(String s) {
        int balance = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = Character.toLowerCase(s.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                if (i < n / 2) {
                    balance++;
                } else {
                    balance--;
                }
            }
        }

        return balance == 0;
    }
}
