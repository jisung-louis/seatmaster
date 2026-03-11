package com.team3.seatmaster.seat.entity;

import com.team3.seatmaster.BaseTime;
import com.team3.seatmaster.seat.dto.SeatDto;
import com.team3.seatmaster.store.entity.StoreEntity;
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
@Table("seat")
public class SeatEntity extends BaseTime {
    @Id
    private String code;

    private Integer store_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "store_id", nullable = false)
    private StoreEntity store;

    @Column(nullable = false, length = 10)
    private String columnCode;

    @Column(nullable = false, length = 10)
    private String rowNumber;

    @Column
    private Integer status;
}
