package com.example.demo.MarketingStaff.controllers;

import com.example.demo.MarketingStaff.model.MarketingStaff;
import com.example.demo.MarketingStaff.service.MarketingStaffService;
import com.example.demo.student.model.Student;
import com.example.demo.student.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
@AllArgsConstructor
public class MarketingStaffController {

    private final MarketingStaffService marketingStaffService;

    @PostMapping("/create")
    public boolean createNewStaff(@RequestBody MarketingStaff request){
        return marketingStaffService.addStaff(request);
    }

    @PutMapping("/update")
    public boolean updateStaff(@RequestBody MarketingStaff marketingStaff){
        return marketingStaffService.addStaff(marketingStaff);
    }

    @GetMapping("/findall")
    public List<MarketingStaff> findAll(){
        return marketingStaffService.findAll();
    }

    @GetMapping("/findbyid")
    public MarketingStaff findById(@RequestBody long id){
        return marketingStaffService.findById(id);
    }

}
