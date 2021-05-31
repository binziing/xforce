/*
 * This file is generated by jOOQ.
 */
package com.binziing.task.jooq;


import com.binziing.task.jooq.tables.TAdmin;
import com.binziing.task.jooq.tables.records.TAdminRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>xforce</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TAdminRecord, Integer> IDENTITY_T_ADMIN = Identities0.IDENTITY_T_ADMIN;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TAdminRecord> KEY_T_ADMIN_PRIMARY = UniqueKeys0.KEY_T_ADMIN_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<TAdminRecord, Integer> IDENTITY_T_ADMIN = Internal.createIdentity(TAdmin.T_ADMIN, TAdmin.T_ADMIN.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<TAdminRecord> KEY_T_ADMIN_PRIMARY = Internal.createUniqueKey(TAdmin.T_ADMIN, "KEY_t_admin_PRIMARY", TAdmin.T_ADMIN.ID);
    }
}
