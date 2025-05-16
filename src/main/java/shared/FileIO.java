/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shared;

import java.io.*;
import java.util.*;
import models.*;

/**
 *
 * @author osmun
 */
public class FileIO {
    // === Load Users ===
    public static List<User> loadUsers() {
        List<User> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Config.USERS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 6) {
                    User u = new User(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]);
                    users.add(u);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading users.txt");
        }
        return users;
    }

    public static void saveUser(User user) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Config.USERS_FILE, true))) {
            String line = String.join("|",
                user.getUserId(),
                user.getUsername(),
                user.getPassword(),
                user.getRole(),
                user.getStatus(),
                user.getCreatedAt());
            bw.write(line);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to users.txt");
        }
    }

    // === Load Items ===
    public static List<Item> loadItems() {
        List<Item> items = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Config.ITEMS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 6) {
                    Item i = new Item(parts[0], parts[1], parts[2],
                        Integer.parseInt(parts[3]), parts[4], parts[5]);
                    items.add(i);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading items.txt");
        }
        return items;
    }

    public static void saveItem(Item item) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Config.ITEMS_FILE, true))) {
            String line = String.join("|",
                item.getItemId(),
                item.getName(),
                item.getSupplierId(),
                String.valueOf(item.getStockQty()),
                item.getStatus(),
                item.getCreatedAt());
            bw.write(line);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to items.txt");
        }
    }

    // === Load Suppliers ===
    public static List<Supplier> loadSuppliers() {
        List<Supplier> suppliers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Config.SUPPLIERS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 5) {
                    Supplier s = new Supplier(parts[0], parts[1], parts[2], parts[3], parts[4]);
                    suppliers.add(s);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading suppliers.txt");
        }
        return suppliers;
    }

    public static void saveSupplier(Supplier s) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Config.SUPPLIERS_FILE, true))) {
            String line = String.join("|",
                s.getSupplierId(),
                s.getName(),
                s.getItemIds(),
                s.getStatus(),
                s.getCreatedAt());
            bw.write(line);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to suppliers.txt");
        }
    }
}
