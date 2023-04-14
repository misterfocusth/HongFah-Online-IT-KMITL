package handlers.document;

import database.DocumentDatabase;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.*;

public class GeneralDocHandler extends DocumentHandler {
    public static boolean handleAddNewDocument(Map<String, Object> docData) {
        String newDocId = new DocumentHandler().randomID();
        System.out.println(newDocId);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        boolean result = false;
        try {
            Callable<Boolean> callable = () -> {
                return DocumentDatabase.addNewDocument(docData, newDocId);
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
