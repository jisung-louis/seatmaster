package com.team3.seatmaster.store.dto;

import com.team3.seatmaster.store.entity.StoreEntity;
import com.team3.seatmaster.user.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class StoreDto {
    private Integer no;
    private Integer owner_no;
    private String name;
    private String category;
    private String address;
    private String contact;
    private String email;
    private String bh_weekdays;
    private String bh_saturday;
    private String bh_sunday;
    private Integer status;
    private String create_date;
    private String update_date;

    public StoreEntity toEntity(UserEntity owner){
        return StoreEntity.builder()
                .no(no)
                .owner(owner)
                .name(name)
                .category(category)
                .address(address)
                .contact(contact)
                .email(email)
                .bh_weekdays(bh_weekdays)
                .bh_saturday(bh_saturday)
                .bh_sunday(bh_sunday)
                .status(status)
                .build();
    }
}
