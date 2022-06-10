public class StringQuestions {
    public static void main(String[] args) {
        String paragraph = "something big here something else here";

        System.out.println(countWord(paragraph, "something"));
        System.out.println(countVowels(paragraph));
    }

    /**
     * Count and return the number of words that are equal to the value of 
     * the variable x 
     * 
     * @param paragraph The paragraph that you want to search
     * @param x The word you want to find in the paragraph
     * @return The count of x words found in the paragraph.
     */
    public static int countWord(String paragraph, String x){
        int wordCount = 0;
        for(String word: paragraph.split(" ")){
            if(word.toLowerCase().equals(x.toLowerCase())){
                wordCount++;
            }
        }
        return wordCount;
    }

    /**
     * Count and return the number of vowels found in a paragraph.
     * @param paragraph The paragraph you want to search.
     * @return Count of the number of vowels found.
     */
    public static int countVowels(String paragraph){
        int vowelCount = 0;
        String[] vowels = {"a", "e", "i", "o", "u"};
        for(String letter: paragraph.split("")){
            for(String vowel: vowels){
                if(letter.toLowerCase().equals(vowel)){
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }
}