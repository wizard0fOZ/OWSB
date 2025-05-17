/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author osmun
 */

public class FinanceLog {
    private String logId;
    private String poId;
    private String supplierId;
    private double amountPaid;
    private String paidBy;
    private String date;
    private String note;

    public FinanceLog(String logId, String poId, String supplierId,
                      double amountPaid, String paidBy, String date, String note) {
        this.logId = logId;
        this.poId = poId;
        this.supplierId = supplierId;
        this.amountPaid = amountPaid;
        this.paidBy = paidBy;
        this.date = date;
        this.note = note;
    }

    public String getLogId() { return logId; }
    public String getPoId() { return poId; }
    public String getSupplierId() { return supplierId; }
    public double getAmountPaid() { return amountPaid; }
    public String getPaidBy() { return paidBy; }
    public String getDate() { return date; }
    public String getNote() { return note; }
}
