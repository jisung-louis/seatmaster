package com.team3.seatmaster.store.entity;

import com.team3.seatmaster.user.entity.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table(name = "store")
public class StoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;
    @ManyToOne @JoinColumn(name = "owner_no")
    private UserEntity owner;
    private String name;
    private String category;
    private String address;
    private String contact;
    private String email;
    private String bh_weekdays;
    private String bh_saturday;
    private String bh_sunday;
    private Integer status;
}
