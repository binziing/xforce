/*
 * This file is generated by jOOQ.
 */
package com.binziing.task.jooq.tables.records;


import com.binziing.task.jooq.tables.TAdmin;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAdminRecord extends UpdatableRecordImpl<TAdminRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = -416136114;

    /**
     * Setter for <code>xforce.t_admin.id</code>. 主键id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>xforce.t_admin.id</code>. 主键id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>xforce.t_admin.username</code>. 用户名
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>xforce.t_admin.username</code>. 用户名
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>xforce.t_admin.password</code>. 用户密码
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xforce.t_admin.password</code>. 用户密码
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xforce.t_admin.email</code>. 用户邮箱
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xforce.t_admin.email</code>. 用户邮箱
     */
    public String getEmail() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TAdmin.T_ADMIN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TAdmin.T_ADMIN.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TAdmin.T_ADMIN.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TAdmin.T_ADMIN.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAdminRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAdminRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAdminRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAdminRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAdminRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TAdminRecord
     */
    public TAdminRecord() {
        super(TAdmin.T_ADMIN);
    }

    /**
     * Create a detached, initialised TAdminRecord
     */
    public TAdminRecord(Integer id, String username, String password, String email) {
        super(TAdmin.T_ADMIN);

        set(0, id);
        set(1, username);
        set(2, password);
        set(3, email);
    }
}