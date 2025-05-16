/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author osmun
 */
public class Sale {
    private String saleId;
    private String itemId;
    private int quantitySold;
    private String date;
    private String enteredBy;
    private String createdAt;

    public Sale(String saleId, String itemId, int quantitySold,
                String date, String enteredBy, String createdAt) {
        this.saleId = saleId;
        this.itemId = itemId;
        this.quantitySold = quantitySold;
        this.date = date;
        this.enteredBy = enteredBy;
        this.createdAt = createdAt;
    }

    public String getSaleId() { return saleId; }
    public String getItemId() { return itemId; }
    public int getQuantitySold() { return quantitySold; }
    public String getDate() { return date; }
    public String getEnteredBy() { return enteredBy; }
    public String getCreatedAt() { return createdAt; }
}
