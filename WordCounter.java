import java.util.TreeMap;

public class WordCounter {

    public static TreeMap<String, Integer> countWords(String[] words) {
        TreeMap<String, Integer> wordCountMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        for (String word : words) {
            String cleanedWord = word.trim();

            if (!cleanedWord.isEmpty()) {
                wordCountMap.put(cleanedWord, wordCountMap.getOrDefault(cleanedWord, 0) + 1);
            }
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        String[] inputWords = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        TreeMap<String, Integer> wordCounts = countWords(inputWords);

        System.out.println("Word Counts:");
        for (String word : wordCounts.keySet()) {
            System.out.println("\"" + word + "\"=" + wordCounts.get(word));
        }
    }
}

