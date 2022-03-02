package com.example.demo.MarketingStaff.repository;

import com.example.demo.MarketingStaff.model.MarketingStaff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketingStaffRepository extends JpaRepository<MarketingStaff,Long> {
}
