/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author osmun
 */
public class PurchaseRequisition {
    private String prId;
    private String itemId;
    private int quantity;
    private String requiredDate;
    private String supplierId;
    private String raisedBy;
    private String createdAt;
    private String status;

    public PurchaseRequisition(String prId, String itemId, int quantity,
                               String requiredDate, String supplierId,
                               String raisedBy, String createdAt, String status) {
        this.prId = prId;
        this.itemId = itemId;
        this.quantity = quantity;
        this.requiredDate = requiredDate;
        this.supplierId = supplierId;
        this.raisedBy = raisedBy;
        this.createdAt = createdAt;
        this.status = status;
    }

    public String getPrId() { return prId; }
    public String getItemId() { return itemId; }
    public int getQuantity() { return quantity; }
    public String getRequiredDate() { return requiredDate; }
    public String getSupplierId() { return supplierId; }
    public String getRaisedBy() { return raisedBy; }
    public String getCreatedAt() { return createdAt; }
    public String getStatus() { return status; }
}
