package kap.newbie.oop.test.task9;

/**
 * @author Alexandr Korovkin
 */
public enum Answer {
    HELLO("Hi", "Hello"),
    BYE("Bye", "Good Bye"),
    HOW_ARE_YOU("How are you","How are you doing"),
    UNKNOWN(null,"Unknown answer");

    private final String answerString;
    private final String question;

    Answer(String question, String answerString){
        this.answerString = answerString;
        this.question = question;
    }

    public String getAnswerString() {
        return answerString;
    }

    public String getQuestion() {
        return question;
    }

    public static Answer getAnswer(String question){
        for(Answer answer : Answer.values()){
            if(answer.getQuestion() == null){
                return UNKNOWN;
            }
            if(answer.getQuestion().equals(question)){
                return answer;
            }
        }
        return UNKNOWN;
    }
}
