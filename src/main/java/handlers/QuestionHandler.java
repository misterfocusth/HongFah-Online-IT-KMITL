/*
 * IG : i_am_bnkt
 */
package handlers;

import database.QuestionDatabase;
import interfaces.UniqueAble;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import question.Question;

/**
 *
 * @author BNKT
 */
public class QuestionHandler implements UniqueAble {

    public String randomID() {
        String result = "QUES-";
        String allRandomizedChar = UUID.randomUUID().toString().replace("-", "");
        return (result + allRandomizedChar.substring(0, 7).toUpperCase());
    }

    public static boolean handleAddNewQuestion(Map<String, Object> questionData) {
        String newQuestionID = new QuestionHandler().randomID();
        System.out.println(newQuestionID);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        boolean result = false;
        try {
            Callable<Boolean> callable = () -> new QuestionDatabase().addNewQuestion(questionData, newQuestionID);
            Future<Boolean> future = executorService.submit(callable);
            while (!future.isDone() && !future.isCancelled()) {
                Thread.sleep(1000);
            }
            result = future.get();
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        return result;
    }

    public static boolean handleUpdateAnswerAdmin(String questionId, HashMap<String, Object> questionData) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        boolean result = false;
        try {
            Callable<Boolean> callable = () -> {
                return QuestionDatabase.updateQuestionInfoById(questionId, questionData);
            };
            Future<Boolean> future = executorService.submit(callable);
            while (!future.isDone() && !future.isCancelled()) {
                Thread.sleep(1000);
            }
            result = future.get();
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        return result;
    }

    public static HashMap<String, HashMap<String, Object>> handleGetAllQuestionByStudentId(String studentId) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        HashMap<String, HashMap<String, Object>> result = null;
        try {
            Callable<HashMap<String, HashMap<String, Object>>> callable = () -> new QuestionDatabase().getAllQuestionByStudentId(studentId);
            Future<HashMap<String, HashMap<String, Object>>> future = executorService.submit(callable);
            while (!future.isDone() && !future.isCancelled()) {
                Thread.sleep(1000);
            }
            result = future.get();
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        return result;
    }

    public static HashMap<String, HashMap<String, Object>> handleGetAllQuestion() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        HashMap<String, HashMap<String, Object>> result = null;
        try {
            Callable<HashMap<String, HashMap<String, Object>>> callable = () -> new QuestionDatabase().getAllQuestion();
            Future<HashMap<String, HashMap<String, Object>>> future = executorService.submit(callable);
            while (!future.isDone() && !future.isCancelled()) {
                Thread.sleep(1000);
            }
            result = future.get();
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        return result;
    }

    public static Question handleGetQuestionByQuestionID(String questionID) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        HashMap<String, Object> result = null;
        try {
            Callable<HashMap<String, Object>> callable = () -> new QuestionDatabase().getQuestionByQuestionID(questionID);
            Future<HashMap<String, Object>> future = executorService.submit(callable);
            while (!future.isDone() && !future.isCancelled()) {
                Thread.sleep(1000);
            }
            result = future.get();
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        System.out.println(result);
        String questionId = questionID;
        String questionBy = (String) result.get("questionBy");
        String questionAt = (String) result.get("questionAt");
        String questionTitle = (String) result.get("questionTitle");
        String questionBody = (String) result.get("questionBody");
        String questionResponse = (String) result.get("questionResponse");
        String answerBy = (String) result.get("answerBy");
        String answerAt = (String) result.get("answerAt");
        String answerBody = (String) result.get("answerBody");

        return new Question(questionId,
                questionBy,
                questionAt,
                questionTitle,
                questionBody,
                questionResponse,
                answerBy,
                answerAt,
                answerBody);
    }
}
