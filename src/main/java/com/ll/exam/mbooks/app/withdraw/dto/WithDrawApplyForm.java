package com.ll.exam.mbooks.app.withdraw.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class WithDrawApplyForm {
    @NotBlank
    private String bankName;
    @NotBlank
    private String bankAccountNo;
    @NotNull
    private Integer price;
}
