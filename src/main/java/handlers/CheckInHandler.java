/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;

import database.CheckInSessionDatabase;
import interfaces.UniqueAble;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author WINDOWS 10
 */
public class CheckInHandler implements UniqueAble {

    @Override
    public String randomID() {
        String result = "CHECKIN-";
        String allRandomizedChar = UUID.randomUUID().toString().replace("-", "");
        return (result + allRandomizedChar.substring(0, 7).toUpperCase());
    }

    public static boolean handleAddNewCheckIn(Map<String, Object> checkInData) {
        String newCheckInSessionID = new CheckInHandler().randomID();
        System.out.println(newCheckInSessionID);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        boolean result = false;
        try {
            Callable<Boolean> callable = () -> new CheckInSessionDatabase().addNewCheckInSession(checkInData, newCheckInSessionID);
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

    public static HashMap<String, Object> handleGetCheckInSessionByCode(String subjectCode) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        HashMap<String, Object> result = null;
        try {
            Callable<HashMap<String, Object>> callable = () -> new CheckInSessionDatabase().getCheckInSessionByCode(subjectCode);
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
        return result;
    }

    public static HashMap<String, HashMap<String, Object>> handlegetAllCheckInSessions() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        HashMap<String, HashMap<String, Object>> result = null;
        try {
            Callable<HashMap<String, HashMap<String, Object>>> callable = () -> new CheckInSessionDatabase().getAllCheckInSessions();
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
