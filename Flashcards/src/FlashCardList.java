import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

class FlashCardList {
    private Map<String, String> flashcards;

    // Constructor
    public FlashCardList() {
        flashcards = new HashMap<>();
    }

    // Add a flashcard to the card list
    public void addFlashcard(String term, String definition) {
        flashcards.put(term, definition);
    }

    public boolean addFlashcardIfNew(String term, String definition) {
        boolean checker = flashcards.containsKey(term);
        if (checker) {
            return checker;
        } else {
            addFlashcard(term, definition);
            return false;
        }
    }

    public static <K, V> K getKeyByValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null; // If value is not found, return null
    }

    public void testKnowledge() {
        for (String key : flashcards.keySet()) {
            String value = flashcards.get(key);
            System.out.println("Print the definition of \""+ key +"\":");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if (s.equals(value)) {
                System.out.println("Correct!");
            } else {
                String se = getKeyByValue(flashcards, s);
                if (se != null) {
                    System.out.println("Wrong. The right answer is \"" + value + ",/" + "but your definition is correct for " + se + ".");
                } else {
                    System.out.println("Wrong. The right answer is \"" + value + "\".");
                }
            }
        }
    }


}
