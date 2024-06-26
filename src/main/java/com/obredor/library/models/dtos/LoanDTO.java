package com.obredor.library.models.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LoanDTO {
  
  private Long loanId;

  private Date startLoanDate;

  private Date finishLoanDate;

  private UserDTO user;

  private BookDTO book;
}
