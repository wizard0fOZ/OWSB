/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author osmun
 */
public class PurchaseOrder {
    private String poId;
    private String prId;
    private String itemId;
    private int quantity;
    private String supplierId;
    private String raisedBy;
    private String approvedBy;
    private String status;
    private String createdAt;

    public PurchaseOrder(String poId, String prId, String itemId, int quantity,
                         String supplierId, String raisedBy, String approvedBy,
                         String status, String createdAt) {
        this.poId = poId;
        this.prId = prId;
        this.itemId = itemId;
        this.quantity = quantity;
        this.supplierId = supplierId;
        this.raisedBy = raisedBy;
        this.approvedBy = approvedBy;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getPoId() { return poId; }
    public String getPrId() { return prId; }
    public String getItemId() { return itemId; }
    public int getQuantity() { return quantity; }
    public String getSupplierId() { return supplierId; }
    public String getRaisedBy() { return raisedBy; }
    public String getApprovedBy() { return approvedBy; }
    public String getStatus() { return status; }
    public String getCreatedAt() { return createdAt; }
}
