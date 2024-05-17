package com.example.demo.Models;

import com.example.demo.validators.ContactNumberConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class UserModel {
    private int id;
    @NotBlank
    private String first_Name;
    private String last_Name;
    @Email
    private String email;
    @ContactNumberConstraint
    private String contactNumber;
}
