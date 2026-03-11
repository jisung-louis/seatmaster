package com.team3.seatmaster.store.dto;

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

}
