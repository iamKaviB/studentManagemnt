package com.example.demo.MarketingStaff.service;

import com.example.demo.MarketingStaff.model.MarketingStaff;
import com.example.demo.MarketingStaff.repository.MarketingStaffRepository;
import com.example.demo.student.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MarketingStaffService {

    private MarketingStaffRepository marketingStaffRepository;

    public boolean addStaff(MarketingStaff marketingStaff){

        try {
            marketingStaffRepository.save(marketingStaff);
            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public List<MarketingStaff> findAll(){
        return marketingStaffRepository.findAll();
    }


    public MarketingStaff findById(long id){
        return marketingStaffRepository.findById(id).orElseThrow(()->new RuntimeException("Staff not found"));
    }

    public boolean existsById(long id){
        return marketingStaffRepository.existsById(id);
    }
}
