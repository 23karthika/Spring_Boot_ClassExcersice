package com.day3.day3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MedicineDetails {
    @Id
    private int medicineId;

    private String medicineName;
    private String medicineFor;
    private String medicineBrand;
    private String manufacturedln;
    private double medicinePrice;
    private String expiryDate;
    
    public MedicineDetails() {
       
    }

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineFor() {
        return medicineFor;
    }

    public void setMedicineFor(String medicineFor) {
        this.medicineFor = medicineFor;
    }

    public String getMedicineBrand() {
        return medicineBrand;
    }

    public void setMedicineBrand(String medicineBrand) {
        this.medicineBrand = medicineBrand;
    }

    public String getManufacturedln() {
        return manufacturedln;
    }

    public void setManufacturedln(String manufacturedln) {
        this.manufacturedln = manufacturedln;
    }

    public double getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    
}
