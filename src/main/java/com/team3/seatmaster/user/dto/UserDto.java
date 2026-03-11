package com.team3.seatmaster.user.dto;

import com.team3.seatmaster.user.entity.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDto {
    private Long no;
    private String id;
    private String password;
    private String name;
    private Boolean isAdmin;
    private String createDate;
    private String updateDate;

    public UserEntity toEntity(){
        return UserEntity.builder()
                .no(no)
                .id(id)
                .password(password)
                .name(name)
                .isAdmin(isAdmin)
                .build();
    }
}