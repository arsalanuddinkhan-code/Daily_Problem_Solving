class Solution {

    public String toGoatLatin(String sentence) {

        String words[] = sentence.split(" ");
        String ans = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            if ("aeiouAEIOU".indexOf(word.charAt(0)) >= 0) {
                word = word + "ma";
            } 
            else {
                word = word.substring(1) + word.charAt(0) + "ma";
            }

            for (int j = 0; j <= i; j++) {
                word = word + "a";
            }

            if (i > 0) {
                ans = ans + " ";
            }

            ans = ans + word;
        }

        return ans;
    }
}