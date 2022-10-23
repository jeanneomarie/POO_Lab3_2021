public class Problem3 {
    public static void countConsonantsAndVowels(String input) {
        String lowerCaseInput = input.toLowerCase();
        int countConsonants = 0;
        int countVowels = 0;

        for (int i = 0; i < lowerCaseInput.length(); i++) {
            if (lowerCaseInput.charAt(i) >= 'a' && lowerCaseInput.charAt(i) <= 'z') {
                if ("aeiou".contains(lowerCaseInput.charAt(i) + "")) {
                    System.out.println(lowerCaseInput.charAt(i) + " - vowel");
                    countVowels++;
                }
                else {
                    System.out.println(lowerCaseInput.charAt(i) + " - consonant");
                    countConsonants++;
                }
            }
        }

        System.out.println(countConsonants + " " + countVowels);
    }

    private static void findVowelIndexes(String input, char vowel) {
        if ("aeiou".contains(vowel + "") == false) {
            System.out.println("This character is not a vowel!");
        }

        String lowerCaseInput = input.toLowerCase();
        int[] indexes = new int[input.length()];
        int count = 0;

        for (int i = 0; i < lowerCaseInput.length(); i++) {
            if (lowerCaseInput.charAt(i) == vowel) {
                indexes[count++] = i;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(indexes[i] + " ");
        }
    }

    public static void main(String[] args) {
        countConsonantsAndVowels("My name is Ioana!");
        findVowelIndexes("My name is Ioana!", 'a');
    }
}

