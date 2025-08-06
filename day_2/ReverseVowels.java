public class ReverseVowels {
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        // Vowels set for checking
        String vowels = "aeiouAEIOU";

        while (left < right) {
            // Move left forward if not a vowel
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Move right backward if not a vowel
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }

            // Swap vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));     // Output: holle
        System.out.println(reverseVowels("leetcode"));  // Output: leotcede
    }
}

