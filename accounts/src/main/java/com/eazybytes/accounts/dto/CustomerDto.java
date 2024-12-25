package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;


@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account details"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer", example = "Eazy bytes"
    )
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 5, max = 30, message = "The length should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email of the customer", example = "y9Y5n@example.com"
    )
    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Email should be valid")
    private String email;

    @Schema(
            description = "Mobile number of the customer", example = "1234567890"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number should be 10 digits")
    private String mobileNumber;

    @Schema(
        description = "Accounts details of the Customer"
    )
    public AccountsDto accountsDto;

}
