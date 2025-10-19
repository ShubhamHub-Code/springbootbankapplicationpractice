package com.fullstack.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Account {

    @Id
    private long accountID;

    @Column(unique = true)
    private long accountNumber;

    private double accountBalance;

    private String accountType;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate createdAt;

    @OneToOne
    @JoinColumn(name = "user_id")   // foreign key column in Account table
    private User user;
}
