/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shared;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 *
 * @author osmun
 */
public class Logger {
    private static final String LOG_FILE = "data/system.log";

    public static void log(String action, String userId, String details) {
        try (FileWriter fw = new FileWriter(LOG_FILE, true)) {
            String logEntry = String.format("%s | %s | %s | %s%n",
                    LocalDateTime.now(), userId, action, details);
            fw.write(logEntry);
        } catch (IOException e) {
            System.err.println("Failed to write to log file.");
        }
    }   
}
