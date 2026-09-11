class Solution {
    public boolean backspaceCompare(String s, String t) {
        String a = "";
        String b = "";

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!a.isEmpty())
                    a = a.substring(0, a.length() - 1);
            } else {
                a += c;
            }
        }

        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!b.isEmpty())
                    b = b.substring(0, b.length() - 1);
            } else {
                b += c;
            }
        }

        return a.equals(b);
    }
}