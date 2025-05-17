/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shared;

/**
 *
 * @author osmun
 */
public class IDGenerator {
    public static String generate(String prefix) {
        int randomNumber = (int)(Math.random() * 1000);
        String formattedNumber = String.format("%03d", randomNumber);
        return prefix + formattedNumber;
    }
}
