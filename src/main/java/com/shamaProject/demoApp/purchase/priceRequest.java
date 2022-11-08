package com.shamaProject.demoApp.purchase;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity(name="priceRequest")
public class priceRequest implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private long request_no;
    private Date requestDate;
    private Date expectedDate;
    private String Reference;
    private String suppliers;
    private String status;
    private String formates;

    public priceRequest() {
    }

    public priceRequest(long id, long request_no, Date requestDate, Date expectedDate, String reference, String suppliers, String status, String formates) {
        this.id=id;
        this.request_no = request_no;
        this.requestDate = requestDate;
        this.expectedDate = expectedDate;
        Reference = reference;
        this.suppliers = suppliers;
        this.status = status;
        this.formates = formates;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getRequest_no() {
        return request_no;
    }

    public void setRequest_no(long request_no) {
        this.request_no = request_no;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(Date expectedDate) {
        this.expectedDate = expectedDate;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        Reference = reference;
    }

    public String getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(String suppliers) {
        this.suppliers = suppliers;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFormates() {
        return formates;
    }

    public void setFormates(String formates) {
        this.formates = formates;
    }

    @Override
    public String toString() {
        return "priceRequest{" +
                "id=" + id +
                ", request_no=" + request_no +
                ", requestDate=" + requestDate +
                ", expectedDate=" + expectedDate +
                ", Reference='" + Reference + '\'' +
                ", suppliers='" + suppliers + '\'' +
                ", status='" + status + '\'' +
                ", formates='" + formates + '\'' +
                '}';
    }
}
