package com.springboot.app.spring_boot_crud_with_thymeleaf.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.app.spring_boot_crud_with_thymeleaf.Entity.Staff;

public interface StaffRepo extends JpaRepository<Staff,Integer>{
}
