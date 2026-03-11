package com.team3.seatmaster.seat.entity;

import com.team3.seatmaster.BaseTime;
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
@Table(name = "seat")
public class SeatEntity extends BaseTime {
    @Id
    private String code;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "store_no", nullable = false)
    private StoreEntity store;

    @Column(nullable = false, length = 10)
    private String columnCode;

    @Column(name="row_no", nullable = false, length = 10)
    private String rowNumber;

    @Column
    private Integer status;
}
