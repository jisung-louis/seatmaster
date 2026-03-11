package com.team3.seatmaster.store.service;

import com.team3.seatmaster.store.dto.StoreDto;
import com.team3.seatmaster.store.entity.StoreEntity;
import com.team3.seatmaster.store.repository.StoreRepository;
import com.team3.seatmaster.user.entity.UserEntity;
import com.team3.seatmaster.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StoreService {
    @Autowired private StoreRepository storeRepository;
    @Autowired private UserRepository userRepository;

    // 전체 조회
    public List<StoreDto> getStores(){
        List<StoreEntity> storeEntityList=storeRepository.findAll();
        List<StoreDto> storeDtoList=new ArrayList<>();
        storeEntityList.forEach(entity->{
            StoreDto storeDto=new StoreDto();
            storeDto.setNo(entity.getNo());
            storeDto.setOwner_no(entity.getOwner().getNo());
            storeDto.setName(entity.getName());
            storeDto.setCategory(entity.getCategory());
            storeDto.setAddress(entity.getAddress());
            storeDto.setContact(entity.getContact());
            storeDto.setEmail(entity.getEmail());
            storeDto.setBh_weekdays(entity.getBh_weekdays());
            storeDto.setBh_saturday(entity.getBh_saturday());
            storeDto.setBh_sunday(entity.getBh_sunday());
            storeDto.setStatus(entity.getStatus());
            storeDto.setCreate_date(entity.getCreateDate().toString());
            storeDto.setUpdate_date(entity.getUpdateDate().toString());
            storeDtoList.add(storeDto);
        });
        return storeDtoList;
    }

    // 특정 매장 정보 조회
    public StoreDto getStore(int no){
        Optional<StoreEntity> optional=storeRepository.findById(no);
        if(optional.isPresent()){
        }
    }

    // 매장 삭제
    public boolean deleteStore(int no){
        Optional<StoreEntity> optional=storeRepository.findById(no);
        if(optional.isPresent()){
            storeRepository.deleteById(no);
            return true;
        }
        return false;
    }

    // updateStore
    @Transactional
    public boolean updateStore(StoreDto store){
        Optional<StoreEntity> storeOptional = storeRepository.findById(store.getNo());
        Optional<UserEntity> userOptional = userRepository.findById(store.getOwner_no());

        if(storeOptional.isEmpty() || userOptional.isEmpty()){
            return false;
        }

        StoreEntity storeEntity = storeOptional.get();
        UserEntity owner = userOptional.get();

        storeEntity.setName(store.getName());
        storeEntity.setCategory(store.getCategory());
        storeEntity.setAddress(store.getAddress());
        storeEntity.setContact(store.getContact());
        storeEntity.setEmail(store.getEmail());
        storeEntity.setBh_weekdays(store.getBh_weekdays());
        storeEntity.setBh_saturday(store.getBh_saturday());
        storeEntity.setBh_sunday(store.getBh_sunday());
        storeEntity.setStatus(store.getStatus());
        storeEntity.setOwner(owner);
        return true;
    }
    // getMyStores
}
