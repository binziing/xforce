package com.binziing.task.service;

import com.binziing.task.jooq.tables.pojos.TAdmin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    List<TAdmin> queryAll();
    TAdmin selectByPrimaryKey(Integer id);
    boolean add(TAdmin admin);
    boolean delete(int adminId);
    boolean update(TAdmin admin);
}
