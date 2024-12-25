package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold the Accounts details of the Customer"
)
public class AccountsDto {


    @NotEmpty(message = "Account number cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number should be 10 digits")
    @Schema(
            description = "Account number of the Customer"
    )
    private Long accountNumber;

    @Schema(
            description = "Account type of the Customer", example = "Savings"
    )
    @NotEmpty(message = "Account type cannot be empty")
    private String accountType;

    @Schema(
            description = "Branch address of the Customer"
    )
    @NotEmpty(message = "Branch address cannot be empty")
    private String branchAddress;


}
