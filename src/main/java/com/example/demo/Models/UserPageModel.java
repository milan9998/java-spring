package com.example.demo.Models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserPageModel {
    private List<UserModel> Users;
    private int totalPages;
    private int totalElements;
}
