package main;

import models.*;
import shared.*;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author osmun
 */
public class OWSB {
    public static void main(String[] args) {
        // ✅ Test: User model
        User user = new User("U001", "johnsm", "pass123", "SM", "Active", Utils.getTimestamp());
        System.out.println("User: " + user.getUsername() + " | Role: " + user.getRole());

        // ✅ Test: Item model
        Item item = new Item("I001", "Milo 1kg", "S001", 100, "Active", Utils.getTimestamp());
        System.out.println("Item: " + item.getName() + " | Qty: " + item.getStockQty());

        // ✅ Test: Supplier model
        Supplier supplier = new Supplier("S001", "Nestle", "I001,I003", "Active", Utils.getTimestamp());
        System.out.println("Supplier: " + supplier.getName() + " supplies " + supplier.getItemIds());

        // ✅ Test: Sale model
        Sale sale = new Sale("S001", "I001", 25, "2025-05-16", "U001", Utils.getTimestamp());
        System.out.println("Sale: " + sale.getItemId() + " | Qty: " + sale.getQuantitySold());

        // ✅ Test: Validator
        System.out.println("Valid ID: " + Validator.isValidId("PR001")); // should be true
        System.out.println("Is Positive Number: " + Validator.isPositiveNumber("42")); // should be true

        // ✅ Test: Timestamp
        System.out.println("Timestamp: " + Utils.getTimestamp());

        // ✅ Test: ID Generator
        System.out.println("Generated ID: " + IDGenerator.generate("PO")); // e.g., PO123

        // ✅ Test: Logger
        Logger.log("Test Run", "U001", "Testing shared modules");

        // ✅ Test: Session
        Session.start(user.getUserId(), user.getUsername(), Role.valueOf(user.getRole()));
        System.out.println("Session running: " + Session.getUsername() + " as " + Session.getRole());
        Session.end();
        
        System.out.println("=== USERS ===");
        for (User u : FileIO.loadUsers()) {
            System.out.println(u.getUserId() + " | " + u.getUsername() + " | " + u.getRole());
        }

        System.out.println("\n=== ITEMS ===");
        for (Item i : FileIO.loadItems()) {
            System.out.println(i.getItemId() + " | " + i.getName() + " | Stock: " + i.getStockQty());
        }

        System.out.println("\n=== SUPPLIERS ===");
        for (Supplier s : FileIO.loadSuppliers()) {
            System.out.println(s.getSupplierId() + " | " + s.getName() + " | Items: " + s.getItemIds());
        }

        System.out.println("\n=== SALES ===");
        for (Sale s : FileIO.loadSales()) {
            System.out.println(s.getSaleId() + " | " + s.getItemId() + " | Qty: " + s.getQuantitySold());
        }

        System.out.println("\n=== PURCHASE REQUISITIONS ===");
        for (PurchaseRequisition pr : FileIO.loadPRs()) {
            System.out.println(pr.getPrId() + " | " + pr.getItemId() + " | Qty: " + pr.getQuantity());
        }

        System.out.println("\n=== PURCHASE ORDERS ===");
        for (PurchaseOrder po : FileIO.loadPOs()) {
            System.out.println(po.getPoId() + " | " + po.getItemId() + " | Status: " + po.getStatus());
        }

        System.out.println("\n=== INVENTORY UPDATES ===");
        for (InventoryUpdate inv : FileIO.loadInventoryUpdates()) {
            System.out.println(inv.getUpdateId() + " | " + inv.getItemId() + " | Received: " + inv.getQuantityReceived());
        }

        System.out.println("\n=== FINANCE LOGS ===");
        for (FinanceLog f : FileIO.loadFinanceLogs()) {
            System.out.println(f.getLogId() + " | " + f.getPoId() + " | Amount: RM" + f.getAmountPaid());
        }
    }
    }
