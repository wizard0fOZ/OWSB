/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shared;

/**
 *
 * @author osmun
 */
public class Validator {
    public static boolean isValidId(String id) {
        return id != null && id.matches("[A-Z]{2,3}\\d{3}");
    }

    public static boolean isNonEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public static boolean isPositiveNumber(String input) {
        try {
            return Double.parseDouble(input) > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
