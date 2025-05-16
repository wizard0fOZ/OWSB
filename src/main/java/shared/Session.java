/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shared;

/**
 *
 * @author osmun
 */
public class Session {
    private static String userId;
    private static String username;
    private static Role role;

    public static void start(String id, String name, Role r) {
        userId = id;
        username = name;
        role = r;
    }

    public static void end() {
        userId = null;
        username = null;
        role = null;
    }

    public static String getUserId() { return userId; }
    public static String getUsername() { return username; }
    public static Role getRole() { return role; }
}
