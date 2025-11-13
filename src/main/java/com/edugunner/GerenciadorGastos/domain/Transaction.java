package com.edugunner.GerenciadorGastos.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "tb_transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private BigDecimal value;
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    @NotNull
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @NotNull
    private String category;

    @CreationTimestamp
    private LocalDateTime date;

}
