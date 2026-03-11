package com.team3.seatmaster.seat.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SeatDto {
    private String code;
    private Integer storeId;
    private String columnCode;
    private String rowNumber;
    private Integer status;
    private String createDate;
    private String updateDate;
}