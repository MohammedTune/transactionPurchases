package com.shamaProject.demoApp.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name = "suppliers")
public class suppliers implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private String  suplierNo;
    private String contactPerson;
    private String firstName;
    private String secondName;
    private String lastName;
    private String email;
    private String mobileNo;
    private String telephone;
    private String houseNo;
    private String streetName;
    private String woreda;
    private String city;
    private String region;
    private String tin;
    private String vat;
    @Column(nullable = false,updatable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String supplierCode;

    public suppliers() {
    }
    public suppliers(String suplierNo, String contactPerson, String firstName, String secondName) {
          this.suplierNo=suplierNo;
          this.contactPerson=contactPerson;
          this.firstName=firstName;

      this.lastName = lastName;
        this.email = email;
        this.mobileNo = mobileNo;
        this.telephone = telephone;
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.woreda = woreda;
        this.city = city;
        this.region = region;
        this.tin = tin;
        this.vat = vat;
        this.supplierCode=supplierCode;
    }

    public String getSuplierNo() {
        return suplierNo;
    }
    public void setSuplierNo(String suplierNo) {
        this.suplierNo = suplierNo;
    }
    public String getContactPerson() {
        return contactPerson;
    }
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public String getHouseNo() {
        return houseNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getWoreda() {
        return woreda;
    }
    public void setWoreda(String woreda) {
        this.woreda = woreda;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getTin() { return tin;
    }
    public void setTin(String tin) {
        this.tin = tin;
    }
    public String getVat() {
        return vat;
    }
    public void setVat(String vat) {
        this.vat = vat;
    }
    public void setSupplierCode(String supplierCode) {
        this.supplierCode=supplierCode;
    }
   public String getSupplierCode() {
        return supplierCode;
    }

    @Override
    public String toString() {
        return "suppliers{" +
                "suplierNo=" + suplierNo +
                ", contactPerson='" + contactPerson + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", telephone='" + telephone + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", woreda='" + woreda + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", tin=" + tin +
                ", vat=" + vat +
                ", supplierCode='" + supplierCode + '\'' +
                '}';
    }

  }

