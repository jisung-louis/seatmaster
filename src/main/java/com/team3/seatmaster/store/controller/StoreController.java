package com.team3.seatmaster.store.controller;

import com.team3.seatmaster.store.dto.StoreDto;
import com.team3.seatmaster.store.service.StoreService;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {
     @Autowired
     private StoreService storeService;

     // 등록 등록 addStore
     @PostMapping
     public boolean addStore(@RequestBody Store store) {
          boolean result = storeService.addStore();
          return result;
     }

     // 전체 매장 조회 getStores
     @GetMapping
     public List<StoreDto> getStores() {
          List<StoreDto> result = storeService.getStores();
          return result;
     }

     // 내 매장 조회 getMyStores
     @GetMapping("/mystores")
     public StoreDto getMyStores(@RequestParam int no) {
          StoreDto result = storeService.getMyStores(no);
          return result;
     }


     // 특정 매장 정보 조회 getStore
     @GetMapping("/detail")
     public StoreDto getStore(@RequestParam int no) {
          StoreDto result = storeService.getStore(no);
          return result;
     }


     // 매장 삭제 deleteStore
     @DeleteMapping
     public boolean deleteStore(@RequestParam int no){
          boolean result = storeService.deleteStore(no);
          return result;
     }

     // 매장 수정 updateStore
     @PutMapping
     public boolean updateStore(@RequestBody StoreDto storeDto){
          boolean result = storeService.upDateStore(storeDto);
          return result;
     }







    /* public boolean addStore(int owner_no, String name, String category, String address, String contact, String email, String bh_weekdays, String bh_saturday, String bh_sunday, int status) {
        boolean result = sd.addStore(owner_no, name, category, address, contact, email, bh_weekdays, bh_saturday, bh_sunday, status);
        return result;
    }

    public boolean updateStore(int store_no, String name, String category, String address, String contact, String email, String bh_weekdays, String bh_saturday, String bh_sunday, int status) {
        boolean result = sd.updateStore(store_no, name, category, address, contact, email, bh_weekdays, bh_saturday, bh_sunday, status);
        return result;
    }

    public boolean deleteStore(int store_no){
        boolean result=sd.deleteStore(store_no);
        return result;
    }

    public StoreDto getStore(int store_no) {
        StoreDto result=sd.getStore(store_no);
        return result;
    }

    public ArrayList<StoreDto> getStores() {
        ArrayList<StoreDto> result=sd.getStores();
        return result;
    }

    public ArrayList<StoreDto> getMyStores(int owner_no) {
        ArrayList<StoreDto> result=sd.getMyStores(owner_no);
        return result;
    }
    */



}
