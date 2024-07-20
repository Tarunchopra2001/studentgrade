import java.util.*;

public class Simple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Simple chatbot = new Simple();

        System.out.println("Hello! I'm a simple chatbot. Type 'quit' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("quit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }
            String response = chatbot.generateResponse(userInput);
            System.out.println("Chatbot: " + response);
        }

        sc.close();
    }

    private String generateResponse(String input) {
        // Simple rule-based response generation
        if (input.contains("hello") || input.contains("hi")) {
            return "Hello there! How can I help you ?";
        } else if (input.contains("how are you?")) {
            return "Im a bot, so Im always doing great! How about you?";
        } else if (input.contains("bye")) {
            return "Goodbye! Have a nice day!";
        } else {
            return "I'm not sure how to respond to that. Can you rephrase your question?";
        }
    }
}