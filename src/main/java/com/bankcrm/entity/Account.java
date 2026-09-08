package com.bankcrm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String accountNumber;

    @Column(nullable = false)
    private String accountType;

    @Column(nullable = false)
    private Double balance;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    public Account() {}

    public Account(String accountNumber, String accountType, Double balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.customer = customer;
    }

    public Long getId() { 
        return id; 
    }
    
    public void setId(Long id) { 
        this.id = id; 
    }

    public String getAccountNumber() { 
        return accountNumber; 
    }
    
    public void setAccountNumber(String accountNumber) { 
        this.accountNumber = accountNumber; 
    }

    public String getAccountType() { 
        return accountType; 
    }
    
    public void setAccountType(String accountType) { 
        this.accountType = accountType; 
    }

    public Double getBalance() { 
        return balance; 
    }
    
    public void setBalance(Double balance) { 
        this.balance = balance; 
    }

    public Customer getCustomer() { 
        return customer; 
    }
    
    public void setCustomer(Customer customer) { 
        this.customer = customer; 
    }
}