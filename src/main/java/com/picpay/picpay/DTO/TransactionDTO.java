package com.picpay.picpay.DTO;

import java.math.BigDecimal;

public record TransactionDTO(Long senderId, Long receiverId, BigDecimal value) {

}
