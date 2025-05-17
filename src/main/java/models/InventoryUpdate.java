/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author osmun
 */
public class InventoryUpdate {
    private String updateId;
    private String poId;
    private String itemId;
    private int quantityReceived;
    private String updatedBy;
    private String createdAt;

    public InventoryUpdate(String updateId, String poId, String itemId,
                           int quantityReceived, String updatedBy, String createdAt) {
        this.updateId = updateId;
        this.poId = poId;
        this.itemId = itemId;
        this.quantityReceived = quantityReceived;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
    }

    public String getUpdateId() { return updateId; }
    public String getPoId() { return poId; }
    public String getItemId() { return itemId; }
    public int getQuantityReceived() { return quantityReceived; }
    public String getUpdatedBy() { return updatedBy; }
    public String getCreatedAt() { return createdAt; }
}
