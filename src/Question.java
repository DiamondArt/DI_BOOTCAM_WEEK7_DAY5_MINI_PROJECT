import java.util.*;

import static java.util.Map.entry;

public class Question {
    private String prompt;
    private String answer;

    public Question() {
        super();
    }
    public Question(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    List questions = new ArrayList<>();


    public TreeMap ListQuestion (List<String> inputQuestion,int responseIndex) {
        return getList(inputQuestion, responseIndex);
    }

    public TreeMap ListResponse (List<String> inputResponse,int responseIndex) {
        return getList(inputResponse, responseIndex);
    }

    private TreeMap getList(List<String> input, int responseIndex) {
        TreeMap<String, String> inputMap = new TreeMap<>();
        for (int index = 0; index < input.size(); index++) {
            if(index != 0) {
                inputMap.put("Proposition"+index+" ", " "+input.get(index));
            } else {
                inputMap.put("Question ", " "+input.get(index));
            }
        }
        return inputMap;
    }

    public  void resultat(int response) {

    }


}
