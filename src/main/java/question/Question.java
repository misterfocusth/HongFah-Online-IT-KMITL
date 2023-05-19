/*
 * IG : i_am_bnkt
 */
package question;

/**
 *
 * @author BNKT
 */
public class Question {

    private String questionBy;
    private String questionAt;
    private String questionTItle;
    private String questionBody;
    private String questionResponse;
    private String answerBy;
    private String answerAt;
    private String answerBody;
    private String questionId;

    public Question(String questionId, String questionBy, String questionAt, String questionTitle, String questionBody, String questionResponse, String answerBy, String answerAt, String answerBody) {
        this.questionId = questionId;
        this.questionBy = questionBy;
        this.questionAt = questionAt;
        this.questionTItle = questionTitle;
        this.questionBody = questionBody;
        this.questionResponse = questionResponse;
        this.answerBy = answerBy;
        this.answerAt = answerAt;
        this.answerBody = answerBody;
    }

    public Question() {
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getAnswerAt() {
        return answerAt;
    }

    public String getAnswerBody() {
        return answerBody;
    }

    public String getAnswerBy() {
        return answerBy;
    }

    public String getQuestionAt() {
        return questionAt;
    }

    public String getQuestionBody() {
        return questionBody;
    }

    public String getQuestionBy() {
        return questionBy;
    }

    public String getQuestionResponse() {
        return questionResponse;
    }

    public String getQuestionTitle() {
        return questionTItle;
    }

    public void setAnswerAt(String answerAt) {
        this.answerAt = answerAt;
    }

    public void setAnswerBody(String answerBody) {
        this.answerBody = answerBody;
    }

    public void setAnswerBy(String answerBy) {
        this.answerBy = answerBy;
    }

    public void setQuestionAt(String questionAt) {
        this.questionAt = questionAt;
    }

    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }

    public void setQuestionBy(String questionBy) {
        this.questionBy = questionBy;
    }

    public void setQuestionResponse(String questionResponse) {
        this.questionResponse = questionResponse;
    }

    public void setQuestionTitle(String questionTItle) {
        this.questionTItle = questionTItle;
    }

}
