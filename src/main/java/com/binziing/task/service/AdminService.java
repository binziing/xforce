package com.binziing.task.service;

import com.binziing.task.entity.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    List<Admin> queryAll();
    Admin selectByPrimaryKey(Integer id);
    boolean add(Admin admin);
    boolean delete(int adminId);
    boolean update(Admin admin);
}
