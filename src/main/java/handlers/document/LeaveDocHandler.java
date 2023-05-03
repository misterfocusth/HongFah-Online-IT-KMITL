package handlers.document;

import database.GeneralDocumentDatabase;
import database.LeaveDocumentDatabase;
import document.LeaveRequestDocument;
import java.util.ArrayList;
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

    public static HashMap<String, HashMap<String, Object>> handleGetAllLeaveDoc() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        HashMap<String, HashMap<String, Object>> result = null;
        try {
            Callable<HashMap<String, HashMap<String, Object>>> callable = () -> new LeaveDocumentDatabase().getAllLeaveDoc();
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

    public static LeaveRequestDocument handleGetLeaveDocumentById(String docId) {
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
        String documentId = docId;
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
        String otherLeaveTitle = (String) result.get("otherLeaveTitle");
        String causeOfLeave = (String) result.get("causeOfLeave");
        String leaveTitle = (String) result.get("leaveTitle");
        String leaveFromDay = (String) result.get("selectedLeaveFromDay");
        String leaveFromMonth = (String) result.get("selectedLeaveFromMonth");
        String leaveFromYear = (String) result.get("selectedLeaveFromYear");
        String leaveUntilDay = (String) result.get("selectedLeaveUntilDay");
        String leaveUntilMonth = (String) result.get("selectedLeaveUntilMonth");
        String leaveUntilYear = (String) result.get("selectedLeaveUntilYear");
        String remark = (String) result.get("requestRemark");
        String contactAddress = (String) result.get("contactAddress");
        ArrayList<String> responses = (ArrayList<String>) result.get("requestResponses");

        return new LeaveRequestDocument(documentId,
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
                otherLeaveTitle,
                causeOfLeave,
                leaveTitle,
                leaveFromDay,
                leaveFromMonth,
                leaveFromYear,
                leaveUntilDay,
                leaveUntilMonth,
                leaveUntilYear,
                remark,
                contactAddress,
                responses
        );
    }

    public static boolean handleUpdateLeaveDocAdmin(String docId, HashMap<String, Object> docData) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        boolean result = false;
        try {
            Callable<Boolean> callable = () -> {
                return LeaveDocumentDatabase.updateLeaveDocById(docId, docData);
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
}
