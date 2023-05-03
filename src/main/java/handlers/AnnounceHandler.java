/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;

import announce.Announce;
import database.AnnounceDatabase;

import java.util.concurrent.*;

/**
 *
 * @author misterfocusth
 */
public class AnnounceHandler {

    public static Announce handlerGetCurrentAnnouncement() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Announce result = null;
        try {
            Callable<Announce> callable = () -> new AnnounceDatabase().getAnnouncement();
            Future<Announce> future = executorService.submit(callable);
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

    public static boolean handleUpdateAnnouncement(String announceTitle, String announceBody) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        boolean result = false;
        try {
            Callable<Boolean> callable = () -> new AnnounceDatabase().updateAnnouncement(announceTitle,announceBody);
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
