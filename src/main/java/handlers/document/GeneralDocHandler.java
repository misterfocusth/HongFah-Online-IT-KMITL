package handlers.document;

import database.GeneralDocumentDatabase;
import document.GeneralRequestDocument;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class GeneralDocHandler extends DocumentHandler {

    public static boolean handleAddNewDocument(Map<String, Object> docData) {
        String newDocId = new DocumentHandler().randomID();
        System.out.println(newDocId);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        boolean result = false;
        try {
            Callable<Boolean> callable = () -> new GeneralDocumentDatabase().addNewDocument(docData, newDocId);
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

    public static HashMap<String, HashMap<String, Object>> handleGetAllDocumentsByStudentId(String studentId) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        HashMap<String, HashMap<String, Object>> result = null;
        try {
            Callable<HashMap<String, HashMap<String, Object>>> callable = () -> new GeneralDocumentDatabase().getAllDocumentsByStudentId(studentId);
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
        System.out.println(result);
        return result;
    }

    public static GeneralRequestDocument handleGetDocumentById(String docId) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        HashMap<String, Object> result = null;
        try {
            Callable<HashMap<String, Object>> callable = () -> new GeneralDocumentDatabase().getDocumentByDocID(docId);
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
        String documentId = (String) docId;
        String writtenAt = (String) result.get("writtenAt");
        String requestedAtDay = (String) result.get("requestedAtDay");
        String requestedAtMonth = (String) result.get("requestedAtMonth");
        String requestedAtYear = (String) result.get("requestedAtYear");
        String requestTitle = (String) result.get("requestTitle");
        String requestTo = (String) result.get("requestTo");
        String requestBy = (String) result.get("requestBy");
        String requestStatus = (String) result.get("requestStatus");
        String respondedAt = (String) result.get("respondedAt");
        String respondedBy = (String) result.get("respondedBy");
        String contactAddress = (String) result.get("contactAddress");
        String requestBody = (String) result.get("requestBody");
        ArrayList< String> requestResponses = (ArrayList< String>) result.get("requestResponses");

        return new GeneralRequestDocument(documentId,
                writtenAt,
                requestedAtDay,
                requestedAtMonth,
                requestedAtYear,
                requestTitle,
                requestTo,
                requestBy,
                requestStatus,
                respondedAt,
                respondedBy,
                contactAddress,
                requestBody,
                requestResponses);
    }

}
