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
public class Portfolio {
    @Id
    @GeneratedValue()
    private Long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    private Date creationDate;

    protected Portfolio(){}

    public Portfolio(Client client, Date creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getCreationDate() {
        return creationDate;
    }

}
