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

    // === USERS ===
    public static List<User> loadUsers() {
        List<User> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Config.USERS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\\|");
                if (p.length == 6)
                    users.add(new User(p[0], p[1], p[2], p[3], p[4], p[5]));
            }
        } catch (IOException e) {
            System.err.println("Error loading users.");
        }
        return users;
    }

    public static void saveUser(User u) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Config.USERS_FILE, true))) {
            bw.write(String.join("|", u.getUserId(), u.getUsername(), u.getPassword(),
                u.getRole(), u.getStatus(), u.getCreatedAt()));
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error saving user.");
        }
    }

    // === ITEMS ===
    public static List<Item> loadItems() {
        List<Item> items = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Config.ITEMS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\\|");
                if (p.length == 6)
                    items.add(new Item(p[0], p[1], p[2], Integer.parseInt(p[3]), p[4], p[5]));
            }
        } catch (IOException e) {
            System.err.println("Error loading items.");
        }
        return items;
    }

    public static void saveItem(Item i) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Config.ITEMS_FILE, true))) {
            bw.write(String.join("|", i.getItemId(), i.getName(), i.getSupplierId(),
                String.valueOf(i.getStockQty()), i.getStatus(), i.getCreatedAt()));
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error saving item.");
        }
    }

    // === SUPPLIERS ===
    public static List<Supplier> loadSuppliers() {
        List<Supplier> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Config.SUPPLIERS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\\|");
                if (p.length == 5)
                    list.add(new Supplier(p[0], p[1], p[2], p[3], p[4]));
            }
        } catch (IOException e) {
            System.err.println("Error loading suppliers.");
        }
        return list;
    }

    public static void saveSupplier(Supplier s) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Config.SUPPLIERS_FILE, true))) {
            bw.write(String.join("|", s.getSupplierId(), s.getName(), s.getItemIds(),
                s.getStatus(), s.getCreatedAt()));
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error saving supplier.");
        }
    }

    // === SALES ===
    public static List<Sale> loadSales() {
        List<Sale> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Config.SALES_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\\|");
                if (p.length == 6)
                    list.add(new Sale(p[0], p[1], Integer.parseInt(p[2]), p[3], p[4], p[5]));
            }
        } catch (IOException e) {
            System.err.println("Error loading sales.");
        }
        return list;
    }

    public static void saveSale(Sale s) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Config.SALES_FILE, true))) {
            bw.write(String.join("|", s.getSaleId(), s.getItemId(), String.valueOf(s.getQuantitySold()),
                s.getDate(), s.getEnteredBy(), s.getCreatedAt()));
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error saving sale.");
        }
    }

    // === PR ===
    public static List<PurchaseRequisition> loadPRs() {
        List<PurchaseRequisition> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Config.PR_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\\|");
                if (p.length == 8)
                    list.add(new PurchaseRequisition(p[0], p[1], Integer.parseInt(p[2]), p[3],
                        p[4], p[5], p[6], p[7]));
            }
        } catch (IOException e) {
            System.err.println("Error loading PRs.");
        }
        return list;
    }

    public static void savePR(PurchaseRequisition pr) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Config.PR_FILE, true))) {
            bw.write(String.join("|", pr.getPrId(), pr.getItemId(), String.valueOf(pr.getQuantity()),
                pr.getRequiredDate(), pr.getSupplierId(), pr.getRaisedBy(),
                pr.getCreatedAt(), pr.getStatus()));
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error saving PR.");
        }
    }

    // === PO ===
    public static List<PurchaseOrder> loadPOs() {
        List<PurchaseOrder> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Config.PO_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\\|");
                if (p.length == 9)
                    list.add(new PurchaseOrder(p[0], p[1], p[2], Integer.parseInt(p[3]),
                        p[4], p[5], p[6], p[7], p[8]));
            }
        } catch (IOException e) {
            System.err.println("Error loading POs.");
        }
        return list;
    }

    public static void savePO(PurchaseOrder po) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Config.PO_FILE, true))) {
            bw.write(String.join("|", po.getPoId(), po.getPrId(), po.getItemId(),
                String.valueOf(po.getQuantity()), po.getSupplierId(), po.getRaisedBy(),
                po.getApprovedBy(), po.getStatus(), po.getCreatedAt()));
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error saving PO.");
        }
    }

    // === INVENTORY ===
    public static List<InventoryUpdate> loadInventoryUpdates() {
        List<InventoryUpdate> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Config.INVENTORY_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\\|");
                if (p.length == 6)
                    list.add(new InventoryUpdate(p[0], p[1], p[2], Integer.parseInt(p[3]), p[4], p[5]));
            }
        } catch (IOException e) {
            System.err.println("Error loading inventory updates.");
        }
        return list;
    }

    public static void saveInventoryUpdate(InventoryUpdate inv) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Config.INVENTORY_FILE, true))) {
            bw.write(String.join("|", inv.getUpdateId(), inv.getPoId(), inv.getItemId(),
                String.valueOf(inv.getQuantityReceived()), inv.getUpdatedBy(), inv.getCreatedAt()));
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error saving inventory update.");
        }
    }

    // === FINANCE ===
    public static List<FinanceLog> loadFinanceLogs() {
        List<FinanceLog> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Config.FINANCE_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\\|");
                if (p.length == 7)
                    list.add(new FinanceLog(p[0], p[1], p[2], Double.parseDouble(p[3]), p[4], p[5], p[6]));
            }
        } catch (IOException e) {
            System.err.println("Error loading finance logs.");
        }
        return list;
    }

    public static void saveFinanceLog(FinanceLog f) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Config.FINANCE_FILE, true))) {
            bw.write(String.join("|", f.getLogId(), f.getPoId(), f.getSupplierId(),
                String.valueOf(f.getAmountPaid()), f.getPaidBy(), f.getDate(), f.getNote()));
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error saving finance log.");
        }
    }
}