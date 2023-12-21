package com.springboot.app.spring_boot_crud_with_thymeleaf.Service;

import java.util.List;
import com.springboot.app.spring_boot_crud_with_thymeleaf.Entity.Staff;

public interface StaffService {
    void save(Staff staff);
    List<Staff> getAll();
    Staff getById(Integer id);
    void delete(Staff staff);
}
