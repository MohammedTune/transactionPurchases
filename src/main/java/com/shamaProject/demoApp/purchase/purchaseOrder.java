package com.shamaProject.demoApp.purchase;
import jakarta.persistence.*;
import java.sql.Date;
import java.io.Serializable;
@Entity(name = "purchaseOrder")

public class purchaseOrder implements Serializable {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String PurchOrder_id;
    private Date purch_Date;
    private String products;
    private String invoice_no;
    private Date delivery_Date;
    private String delivery_adress;
    private String suppliers;

    private String purch_amount;
    private String reference;
    private String status;

    public purchaseOrder() {
    }

    public purchaseOrder(String purchOrder_id, Date purch_Date,String products, String invoice_no, Date delivery_Date, String delivery_adress, String suppliers, String purch_amount, String reference, String status) {
        this.PurchOrder_id = purchOrder_id;
        this.purch_Date = purch_Date;
        this.products = products;
        this.invoice_no = invoice_no;
        this.delivery_Date = delivery_Date;
        this.delivery_adress = delivery_adress;
        this.suppliers = suppliers;
        this.purch_amount = purch_amount;
        this.reference = reference;
        this.status = status;
    }

       public String getPurchOrder_id() {
        return PurchOrder_id;
    }

    public void setPurchOrder_id(String purchOrder_id) {
        PurchOrder_id = purchOrder_id;
    }

    public Date getPurch_Date() {
        return purch_Date;
    }

    public void setPurch_Date(Date purch_Date) {
        this.purch_Date = purch_Date;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getInvoice_no() {
        return invoice_no;
    }

    public void setInvoice_no(String invoice_no) {
        this.invoice_no = invoice_no;
    }

    public Date getDelivery_Date() {
        return delivery_Date;
    }

    public void setDelivery_Date(Date delivery_Date) {
        this.delivery_Date = delivery_Date;
    }

    public String getDelivery_adress() {
        return delivery_adress;
    }

    public void setDelivery_adress(String delivery_adress) {
        this.delivery_adress = delivery_adress;
    }

    public String getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(String suppliers) {
        this.suppliers = suppliers;
    }

    public String getPurch_amount() {
        return purch_amount;
    }

    public void setPurch_amount(String purch_amount) {
        this.purch_amount = purch_amount;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "purchaseOrder{" +
                ", PurchOrder_id='" + PurchOrder_id + '\'' +
                ", purch_Date=" + purch_Date +
                ", products='" + products + '\'' +
                ", invoice_no='" + invoice_no + '\'' +
                ", delivery_Date=" + delivery_Date +
                ", delivery_adress='" + delivery_adress + '\'' +
                ", suppliers='" + suppliers + '\'' +
                ", purch_amount='" + purch_amount + '\'' +
                ", reference='" + reference + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

