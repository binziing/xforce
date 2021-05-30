package com.binziing.task.service;

import com.binziing.task.entity.Admin;
import com.binziing.task.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        Admin admin = adminMapper.selectByPrimaryKey(id);
        return admin;
    }

    @Override
    public List<Admin> queryAll() {
        List<Admin> admins = adminMapper.queryAll();
        return admins;
    }

    @Override
    public boolean add(Admin admin) {
        int insert = adminMapper.insert(admin);
        return insert > 0 ? true : false;
    }

    @Override
    public boolean delete(int adminId) {
        int i = adminMapper.deleteByPrimaryKey(adminId);
        return i > 0 ? true : false;
    }

    @Override
    public boolean update(Admin admin) {
        int i = adminMapper.updateByPrimaryKey(admin);
        return i > 0 ? true : false;
    }
}
