import java.util.*;

class flashCard<T, D> {
    private T term;
    private D definition;

    // Constructor
    public flashCard(T term, D definition) {
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

public class flashCardApp {
    private int numCards;
    public Scanner scanner = new Scanner(System.in);

    public void setNumberOfFlashCard () {
        System.out.println("Input the number of cards:");
        numCards = Integer.parseInt(scanner.nextLine());
    }

    public int getNumberOfFlashCard() {
        return this.numCards;
    }
    public void inputCards(FlashCardList cardList) {
        int i=0;
        do {
            System.out.println("Card #" + (i + 1) + ":");
            String term = scanner.nextLine();
            System.out.println("The definition for card #" + (i + 1) + ":");
            String definition = scanner.nextLine();
            flashCard<String,String> ob = new flashCard<>(term, definition);
            if(cardList.addFlashcardIfNew(ob.getTerm(), ob.getDefinition())){
                System.out.println("Card Already Exists\nTry Again\n");
            }
            else {
                i++;
            }

        } while(i!=getNumberOfFlashCard());
    }
    public static void main(String[] args) {

        flashCardApp object = new flashCardApp();
        object.setNumberOfFlashCard();
        FlashCardList cardList = new FlashCardList();
        object.inputCards(cardList);
        // Get the number of flashcards

        cardList.testKnowledge();



        // Create flashcards and add them to the card list


        // Test the user's knowledge of the flashcards

    }
}