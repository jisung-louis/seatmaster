package com.team3.seatmaster.reservation.dto;

import com.team3.seatmaster.reservation.entity.ReservationEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ReservationDto {
    private Integer no;
    private Integer user_no;
    private String seat_code;
    private String createDate;

    public ReservationEntity toEntity() {
        return ReservationEntity
                .builder()
                .user_no(user_no)
                .seat_code(seat_code)
                .build();
    }


}
