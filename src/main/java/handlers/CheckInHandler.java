/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;

import checkin.CheckInSession;
import database.CheckInSessionDatabase;
import interfaces.UniqueAble;
import java.util.ArrayList;
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
        String allRandomizedChar = UUID.randomUUID().toString().replace("-", "");
        return (allRandomizedChar.substring(0, 6).toUpperCase());
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

    public static HashMap<String, Object> handleGetCheckInSessionByCode(String sessionID) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        HashMap<String, Object> result = null;
        try {
            Callable<HashMap<String, Object>> callable = () -> new CheckInSessionDatabase().getCheckInSessionByCode(sessionID);
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

    public static HashMap<String, HashMap<String, Object>> handleGetAllCheckInSessions() {
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

    public static CheckInSession handleGetCheckInBySessionID(String sessionID) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        HashMap<String, Object> result = null;
        try {
            Callable<HashMap<String, Object>> callable = () -> new CheckInSessionDatabase().getChekInByChekInID(sessionID);
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
        String sessionId = sessionID;
        String subjectID = (String) result.get("subjectID");
        String subjectName = (String) result.get("subjectName");
        String teacherName = (String) result.get("teacherName");
        String classTime = (String) result.get("classTime");
        String classroom = (String) result.get("classroom");
        String sessionNote = (String) result.get("sessionNote");
        boolean isActive = (boolean) result.get("isActive");
        ArrayList< String> studentCheckIn = (ArrayList< String>) result.get("studentCheckIn");

        return new CheckInSession(sessionId,
                subjectID,
                subjectName,
                teacherName,
                classTime,
                classroom,
                sessionNote,
                isActive,
                studentCheckIn);
    }

    public static boolean handleUpdateCheckInSession(String docId, HashMap<String, Object> docData) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        boolean result = false;
        try {
            Callable<Boolean> callable = () -> {
                return CheckInSessionDatabase.updateCheckinInfoById(docId, docData);
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
