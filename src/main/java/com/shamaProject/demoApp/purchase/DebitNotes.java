package com.shamaProject.demoApp.purchase;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

public class DebitNotes implements Serializable {
    private long debitNote_no;
    private Date date;
    private String supplirs;
    private String Reference;
    private String invoice_no;
    private String invoice_amount;
    private int credit_amount;
    private String stutus;

    public DebitNotes() {
    }

    public DebitNotes(long debitNote_no, Date date, String supplirs, String reference, String invoice_no, String invoice_amount, int credit_amount, String stutus) {
        this.debitNote_no = debitNote_no;
        this.date = date;
        this.supplirs = supplirs;
        Reference = reference;
        this.invoice_no = invoice_no;
        this.invoice_amount = invoice_amount;
        this.credit_amount = credit_amount;
        this.stutus = stutus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSupplirs() {
        return supplirs;
    }

    public void setSupplirs(String supplirs) {
        this.supplirs = supplirs;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        Reference = reference;
    }

    public String getInvoice_no() {
        return invoice_no;
    }

    public void setInvoice_no(String invoice_no) {
        this.invoice_no = invoice_no;
    }

    public String getInvoice_amount() {
        return invoice_amount;
    }

    public void setInvoice_amount(String invoice_amount) {
        this.invoice_amount = invoice_amount;
    }

    public int getCredit_amount() {
        return credit_amount;
    }

    public void setCredit_amount(int credit_amount) {
        this.credit_amount = credit_amount;
    }

    public String getStutus() {
        return stutus;
    }

    public void setStutus(String stutus) {
        this.stutus = stutus;
    }

    @Override
    public String toString() {
        return "DebitNotes{" +
                "date=" + date +
                ", supplirs='" + supplirs + '\'' +
                ", Reference='" + Reference + '\'' +
                ", invoice_no='" + invoice_no + '\'' +
                ", invoice_amount='" + invoice_amount + '\'' +
                ", credit_amount=" + credit_amount +
                ", stutus='" + stutus + '\'' +
                '}';
    }
}
