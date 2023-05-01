/*
 * IG : i_am_bnkt
 */
package database;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import static database.Database.db;
import helper.StudentDataHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author BNKT
 */
public class QuestionDatabase extends Database {

    public synchronized boolean addNewQuestion(Map<String, Object> questionData, String questionId) {
        DocumentReference docRef = db.collection(QUESTION_COLLECTION).document(questionId);
        docRef.set(questionData);
        return true;
    }

    public static synchronized boolean updateQuestionInfoById(String questionID, HashMap<String, String> questionData) {
        DocumentReference docRef = db.collection("question").document(questionID);
        Map<String, Object> data = StudentDataHelper.toFirestoreObj(questionData);
        ApiFuture<WriteResult> result = docRef.update(data);
        return true;
    }

    public synchronized HashMap<String, HashMap<String, Object>> getAllQuestionByStudentId(String studentId) throws ExecutionException, InterruptedException {
        HashMap<String, HashMap<String, Object>> questionData = new HashMap<>();
        ApiFuture<QuerySnapshot> query = db.collection(QUESTION_COLLECTION).whereEqualTo("questionBy", studentId).get();
        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> queryDocuments = querySnapshot.getDocuments();
        try {
            for (QueryDocumentSnapshot document : queryDocuments) {
                questionData.put(document.getId(), toQuestionDataMap(document));
            }
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        return questionData;
    }

    public synchronized HashMap<String, Object> getQuestionByQuestionID(String questioncId) throws InterruptedException, ExecutionException {
        DocumentReference docRef = db.collection(QUESTION_COLLECTION).document(questioncId);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        if (!document.exists()) {
            return null;
        }
        return (HashMap<String, Object>) document.getData();
    }

    public HashMap<String, Object> toQuestionDataMap(QueryDocumentSnapshot document) {
        HashMap<String, Object> currentQuestion = new HashMap<>();
        try {
            String questionBy = document.getString("questionBy");
            String questionAt = document.getString("questionAt");
            String questionTitle = document.getString("questionTitle");
            String questionBody = document.getString("questionBody");
            String questionReponse = document.getString("questionReponse");
            String answerBy = document.getString("answerBy");
            String answerAt = document.getString("answerAt");
            String answerBody = document.getString("answerBody");

            currentQuestion.put("questionBy", questionBy);
            currentQuestion.put("questionAt", questionAt);
            currentQuestion.put("questionTitle", questionTitle);
            currentQuestion.put("questionBody", questionBody);
            currentQuestion.put("questionReponse", questionReponse);
            currentQuestion.put("answerBy", answerBy);
            currentQuestion.put("answerAt", answerAt);
            currentQuestion.put("answerBody", answerBody);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return currentQuestion;
    }
}
