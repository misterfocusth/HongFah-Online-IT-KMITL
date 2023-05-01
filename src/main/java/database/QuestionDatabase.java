/*
 * IG : i_am_bnkt
 */
package database;

import com.google.cloud.firestore.QueryDocumentSnapshot;
import java.util.HashMap;

/**
 *
 * @author BNKT
 */
public class QuestionDatabase extends Database {

    public HashMap<String, Object> toQuestionDataMap(QueryDocumentSnapshot document) {
        HashMap<String, Object> currentDocument = new HashMap<>();
        try {
            String questionBy = document.getString("questionBy");
            String questionAt = document.getString("questionAt");
            String questionTitle = document.getString("questionTitle");
            String questionBody = document.getString("questionBody");
            String questionReponse = document.getString("questionReponse");
            String answerBy = document.getString("answerBy");
            String answerAt = document.getString("answerAt");
            String answerBody = document.getString("answerBody");

            currentDocument.put("questionBy", questionBy);
            currentDocument.put("questionAt", questionAt);
            currentDocument.put("questionTitle", questionTitle);
            currentDocument.put("questionBody", questionBody);
            currentDocument.put("questionReponse", questionReponse);
            currentDocument.put("answerBy", answerBy);
            currentDocument.put("answerAt", answerAt);
            currentDocument.put("answerBody", answerBody);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return currentDocument;
    }
}
