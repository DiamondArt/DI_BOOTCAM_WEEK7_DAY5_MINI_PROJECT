import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HashMap<String, String> freqMap = new HashMap<>();
        HashMap<String, String> answerMap = new HashMap<>();

        Map<String, String> myMap = new HashMap<String, String>() {{
            put("q1", "b");
            put("a", "d");
            put("b", "d");
            put("c", "d");
        }};
        Question question = new Question();
        TreeMap questions = question.ListQuestion(Arrays.asList("what does counter++; do?","what's a loop that never stops?","What's hardware ?"),2);

       // List<String> inputQuestion = Arrays.asList("What's hardware ?","what does counter++; do?","what's a loop that never stops?");
       // List<String> inputResponses = Arrays.asList("Virtual machine","the physical machine applications","part of the processor");
        questions.forEach((key,val)-> {
            System.out.println(key +" : "+val);
        });
        System.out.println("Tap 1 or 2 to choose response");
        Scanner userResponse = new Scanner(System.in);
        userResponse.nextInt();
        System.out.println(questions);
        //System.out.println(answerMap);
    }
}