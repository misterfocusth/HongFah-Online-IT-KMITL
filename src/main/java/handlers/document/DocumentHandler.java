package handlers.document;

import database.DocumentDatabase;
import database.GeneralDocumentDatabase;
import interfaces.UniqueAble;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.*;

public class DocumentHandler implements UniqueAble {
    @Override
    public String randomID() {
        String result = "DOC-";
        String allRandomizedChar = UUID.randomUUID().toString().replace("-", "");
        return result + allRandomizedChar.substring(0,7);
    }

    public static HashMap<String, HashMap<String, Object>> handleGetAllDocumentsByStudentId(String studentId) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        HashMap<String, HashMap<String, Object>> result = null;
        try {
            Callable<HashMap<String, HashMap<String, Object>>> callable = () -> new DocumentDatabase().getAllDocumentsByStudentId(studentId);
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
}
