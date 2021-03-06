/*
 * This file is generated by jOOQ.
 */
package com.binziing.task.jooq;


import com.binziing.task.jooq.tables.TAdmin;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>xforce</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index T_ADMIN_PRIMARY = Indexes0.T_ADMIN_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index T_ADMIN_PRIMARY = Internal.createIndex("PRIMARY", TAdmin.T_ADMIN, new OrderField[] { TAdmin.T_ADMIN.ID }, true);
    }
}
