

/*

class FlashCards<T, D> {
    private T term;
    private D definition;

    // Constructor
    public FlashCards(T term, D definition) {
        this.term = term;
        this.definition = definition;
    }


    public T getTerm() {
        return term;
    }

    public D getDefinition() {
        return definition;
    }
}
class flashCard {
    public String term;
    public String definition;

}


public class FlashCardApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number of cards:");
        int numCards = Integer.parseInt(scanner.nextLine());


        FlashCards[] flashcards = new FlashCards[numCards];


        for (int i = 0; i < numCards; i++) {
            System.out.println("Card #" + (i + 1) + ":");
            String term = scanner.nextLine();
            System.out.println("The definition for card #" + (i + 1) + ":");
            String definition = scanner.nextLine();
            flashcards[i] = new FlashCards<>(term, definition);
        }

        for (int i = 0; i < numCards; i++) {
            System.out.println("Print the definition of \"" + flashcards[i].getTerm() + "\":");
            String answer = scanner.nextLine();
            if (answer.equals(flashcards[i].getDefinition())) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong. The right answer is \"" + flashcards[i].getDefinition() + "\".");
            }
        }

        scanner.close();
    }
}
        */