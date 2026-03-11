package com.team3.seatmaster.store.repository;

import com.team3.seatmaster.store.entity.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository  extends JpaRepository<StoreEntity,Integer> {
}
