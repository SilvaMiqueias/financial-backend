package com.example.financial.mapper;

import com.example.financial.dto.TransactionDTO;
import com.example.financial.model.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransactionMapper {
    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

    TransactionDTO transactionToTransactionDTO(Transaction transaction);

    @Mapping(target = "userId", ignore = true)
    Transaction  transactionDTOToTransaction(TransactionDTO requestDTO);
}
