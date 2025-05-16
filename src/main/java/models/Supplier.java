/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author osmun
 */
public class Supplier {
    private String supplierId;
    private String name;
    private String itemIds;
    private String status;
    private String createdAt;

    public Supplier(String supplierId, String name, String itemIds, String status, String createdAt) {
        this.supplierId = supplierId;
        this.name = name;
        this.itemIds = itemIds;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getSupplierId() { return supplierId; }
    public String getName() { return name; }
    public String getItemIds() { return itemIds; }
    public String getStatus() { return status; }
    public String getCreatedAt() { return createdAt; }
}
