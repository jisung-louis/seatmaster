package com.team3.seatmaster.store.service;

import com.team3.seatmaster.store.dto.StoreDto;
import com.team3.seatmaster.store.entity.StoreEntity;
import com.team3.seatmaster.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StoreService {
    @Autowired private StoreRepository storeRepository;

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
}
