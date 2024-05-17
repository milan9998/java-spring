package com.example.demo.mappers;

import com.example.demo.Models.UserModel;
import com.example.demo.entities.User;
import org.springframework.data.domain.Page;
import com.example.demo.Models.UserPageModel;
import java.util.ArrayList;
import java.util.List;

public class UserMapper {

    public static User toEntity(UserModel model) {
        User user = new User();
        user.setId(model.getId());
        user.setFirstName(model.getFirst_Name());
        user.setLastName(model.getLast_Name());
        user.setEmail(model.getEmail());
        return user;
    }


    public static UserModel toModel(User entitiy){

        return UserModel.builder().id(entitiy.getId())
                .email(entitiy.getEmail())
                .first_Name(entitiy.getFirstName())
                .last_Name(entitiy.getLastName()).build();
    }

    public static List<UserModel> toModelList(List<User>  entities){
        var list = new ArrayList<UserModel>();
        for(var entitty: entities){
            list.add(toModel(entitty));
        }
        return list;
    }

    public static UserPageModel toModelPagedList(Page<User> pageEntity) {
        return UserPageModel.builder()
                .Users(toModelList(pageEntity.getContent()))
                .totalPages(pageEntity.getTotalPages())
                .totalElements(pageEntity.getNumberOfElements())
                .build();
    }
}
