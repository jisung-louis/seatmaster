package com.team3.seatmaster.reservation.entity;

import com.team3.seatmaster.BaseTime;
import com.team3.seatmaster.reservation.dto.ReservationDto;
import com.team3.seatmaster.seat.entity.SeatEntity;
import com.team3.seatmaster.user.entity.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "reservation")
public class ReservationEntity extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;

    private String reservedAt;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "seat_code")
    private SeatEntity seat;
}
