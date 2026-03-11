package com.team3.seatmaster.user.entity;

import com.team3.seatmaster.BaseTime;
import com.team3.seatmaster.user.dto.UserDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table("user")
public class UserEntity extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(nullable = false, length = 30, unique = true)
    private String id;

    @Column(nullable = false, length = 30)
    private String password;

    @Column(nullable = false, length = 30)
    private String name;

    @Column
    private Boolean isAdmin;

    public UserDto toDto(){
        return UserDto.builder()
                .no(no)
                .id(id)
                .password(password)
                .name(name)
                .isAdmin(isAdmin)
                .createDate(getCreateDate().toString())
                .updateDate(getUpdateDate().toString())
                .build();
    }
}
