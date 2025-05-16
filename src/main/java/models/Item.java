/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author osmun
 */
public class Item {
    private String itemId;
    private String name;
    private String supplierId;
    private int stockQty;
    private String status;
    private String createdAt;

    public Item(String itemId, String name, String supplierId,
                int stockQty, String status, String createdAt) {
        this.itemId = itemId;
        this.name = name;
        this.supplierId = supplierId;
        this.stockQty = stockQty;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getItemId() { return itemId; }
    public String getName() { return name; }
    public String getSupplierId() { return supplierId; }
    public int getStockQty() { return stockQty; }
    public String getStatus() { return status; }
    public String getCreatedAt() { return createdAt; }
}
