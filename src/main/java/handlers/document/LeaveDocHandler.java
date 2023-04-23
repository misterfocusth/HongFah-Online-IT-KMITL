package handlers.document;

import database.LeaveDocumentDatabase;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class LeaveDocHandler extends DocumentHandler {

    public static boolean handleAddNewDocument(Map<String, Object> docData) {
        String newDocId = new DocumentHandler().randomID();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        boolean result = false;
        try {
            Callable<Boolean> callable = () -> new LeaveDocumentDatabase().addNewDocument(docData, newDocId);
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
            Callable<HashMap<String, HashMap<String, Object>>> callable = () -> new LeaveDocumentDatabase().getAllDocumentsByStudentId(studentId);
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
}
