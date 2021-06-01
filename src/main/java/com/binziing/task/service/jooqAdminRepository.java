package com.binziing.task.service;

import com.binziing.task.jooq.tables.daos.TAdminDao;
import com.binziing.task.jooq.tables.pojos.TAdmin;
import com.binziing.task.jooq.tables.records.TAdminRecord;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class jooqAdminRepository implements AdminService {

    @Autowired
    private DSLContext dslContext;

    @Autowired
    private TAdminDao adminDao;

    private com.binziing.task.jooq.tables.TAdmin T_ADMIN = com.binziing.task.jooq.tables.TAdmin.T_ADMIN;

    @Override
    public List<TAdmin> queryAll() {
        return adminDao.findAll();
    }

    @Override
    public TAdmin selectByPrimaryKey(Integer id) {
        Result<TAdminRecord> fetch = dslContext.selectFrom(T_ADMIN).where("id=" + id).fetch();
        TAdmin tAdmin = new TAdmin();
        for(TAdminRecord el:fetch){
            tAdmin.setId(el.getId());
            tAdmin.setUsername(el.getUsername());
            tAdmin.setPassword(el.getPassword());
            tAdmin.setEmail(el.getEmail());
        }
        return tAdmin;
    }

    @Override
    public boolean add(TAdmin admin) {
        dslContext.insertInto(T_ADMIN, T_ADMIN.ID, T_ADMIN.USERNAME, T_ADMIN.PASSWORD, T_ADMIN.EMAIL)
                  .values(admin.getId(), admin.getUsername(), admin.getPassword(), admin.getEmail())
                  .execute();
        // Collection<? extends Field<?>>和Field<?>不知道干啥的
        // dslContext.insertInto(T_ADMIN, (Collection<? extends Field<?>>) admin).execute();
        // dslContext.insertInto(T_ADMIN, (Field<?>) admin).execute();
        // dslContext.insertInto(T_ADMIN).values(admin).execute();
        return true;
    }

    @Override
    public boolean delete(int tadminId) {
        dslContext.deleteFrom(T_ADMIN).where(T_ADMIN.ID.eq(tadminId)).execute();
        return true;
    }

    @Override
    public boolean update(TAdmin tadmin) {
        dslContext.update(T_ADMIN)
                  .set(T_ADMIN.USERNAME, tadmin.getUsername())
                  .set(T_ADMIN.PASSWORD, tadmin.getPassword())
                  .set(T_ADMIN.EMAIL, tadmin.getEmail())
                  .where(T_ADMIN.ID.eq(tadmin.getId())).execute();
//        TAdminRecord tAdminRecord = dslContext.selectFrom(T_ADMIN)
//                                              .where(T_ADMIN.ID.eq(tadmin.getId()))
//                                              .fetchSingle();
//        tAdminRecord.setUsername(tadmin.getUsername());
//        tAdminRecord.setPassword(tadmin.getPassword());
//        tAdminRecord.setEmail(tadmin.getEmail());
        return true;
    }
}
