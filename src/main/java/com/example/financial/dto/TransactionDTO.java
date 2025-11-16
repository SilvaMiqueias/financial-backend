package com.example.financial.dto;

import com.example.financial.model.User;
import com.example.financial.model.enumerador.CategoryEnum;
import com.example.financial.model.enumerador.PaymentMethod;
import com.example.financial.model.enumerador.RecurrenceType;
import com.example.financial.model.enumerador.TransactionType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {
    private Integer id;
    private TransactionType transactionType;
    private CategoryEnum category;
    private PaymentMethod paymentMethod;
    private Boolean recurring;
    private RecurrenceType recurrenceType;
    private BigDecimal amount;
    private String description;
    private LocalDateTime dateTransaction;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
