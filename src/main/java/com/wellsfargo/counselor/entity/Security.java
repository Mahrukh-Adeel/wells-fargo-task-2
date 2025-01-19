package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

// Done according to example solution
@Entity
public class Security {
    @Id
    @GeneratedValue()
    private Long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int purchasePrice;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private int quantity;

    protected Security(){}

    public Security(Portfolio portfolio, String name, String category, int purchasePrice, int quantity, Date purchaseDate) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setClient(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public int getPurchasePrice(){
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }
}
