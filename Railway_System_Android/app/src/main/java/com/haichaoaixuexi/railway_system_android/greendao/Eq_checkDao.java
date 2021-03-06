package com.haichaoaixuexi.railway_system_android.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.haichaoaixuexi.railway_system_android.entity.Eq_check;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "EQ_CHECK".
*/
public class Eq_checkDao extends AbstractDao<Eq_check, Long> {

    public static final String TABLENAME = "EQ_CHECK";

    /**
     * Properties of entity Eq_check.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property EQ_CHECK_ID = new Property(1, int.class, "EQ_CHECK_ID", false, "EQ__CHECK__ID");
        public final static Property JCLX = new Property(2, String.class, "JCLX", false, "JCLX");
        public final static Property SBBH = new Property(3, int.class, "SBBH", false, "SBBH");
        public final static Property GZLX = new Property(4, int.class, "GZLX", false, "GZLX");
        public final static Property GZMS = new Property(5, String.class, "GZMS", false, "GZMS");
        public final static Property BXR = new Property(6, int.class, "BXR", false, "BXR");
        public final static Property BXSJ = new Property(7, String.class, "BXSJ", false, "BXSJ");
        public final static Property YSR = new Property(8, int.class, "YSR", false, "YSR");
        public final static Property YSSJ = new Property(9, String.class, "YSSJ", false, "YSSJ");
        public final static Property GZTP = new Property(10, String.class, "GZTP", false, "GZTP");
        public final static Property ABC = new Property(11, String.class, "ABC", false, "ABC");
        public final static Property ImgString = new Property(12, String.class, "imgString", false, "IMG_STRING");
        public final static Property BXR_NAME = new Property(13, String.class, "BXR_NAME", false, "BXR__NAME");
        public final static Property YSJG = new Property(14, String.class, "YSJG", false, "YSJG");
    }


    public Eq_checkDao(DaoConfig config) {
        super(config);
    }
    
    public Eq_checkDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"EQ_CHECK\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"EQ__CHECK__ID\" INTEGER NOT NULL ," + // 1: EQ_CHECK_ID
                "\"JCLX\" TEXT," + // 2: JCLX
                "\"SBBH\" INTEGER NOT NULL ," + // 3: SBBH
                "\"GZLX\" INTEGER NOT NULL ," + // 4: GZLX
                "\"GZMS\" TEXT," + // 5: GZMS
                "\"BXR\" INTEGER NOT NULL ," + // 6: BXR
                "\"BXSJ\" TEXT," + // 7: BXSJ
                "\"YSR\" INTEGER NOT NULL ," + // 8: YSR
                "\"YSSJ\" TEXT," + // 9: YSSJ
                "\"GZTP\" TEXT," + // 10: GZTP
                "\"ABC\" TEXT," + // 11: ABC
                "\"IMG_STRING\" TEXT," + // 12: imgString
                "\"BXR__NAME\" TEXT," + // 13: BXR_NAME
                "\"YSJG\" TEXT);"); // 14: YSJG
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"EQ_CHECK\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Eq_check entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getEQ_CHECK_ID());
 
        String JCLX = entity.getJCLX();
        if (JCLX != null) {
            stmt.bindString(3, JCLX);
        }
        stmt.bindLong(4, entity.getSBBH());
        stmt.bindLong(5, entity.getGZLX());
 
        String GZMS = entity.getGZMS();
        if (GZMS != null) {
            stmt.bindString(6, GZMS);
        }
        stmt.bindLong(7, entity.getBXR());
 
        String BXSJ = entity.getBXSJ();
        if (BXSJ != null) {
            stmt.bindString(8, BXSJ);
        }
        stmt.bindLong(9, entity.getYSR());
 
        String YSSJ = entity.getYSSJ();
        if (YSSJ != null) {
            stmt.bindString(10, YSSJ);
        }
 
        String GZTP = entity.getGZTP();
        if (GZTP != null) {
            stmt.bindString(11, GZTP);
        }
 
        String ABC = entity.getABC();
        if (ABC != null) {
            stmt.bindString(12, ABC);
        }
 
        String imgString = entity.getImgString();
        if (imgString != null) {
            stmt.bindString(13, imgString);
        }
 
        String BXR_NAME = entity.getBXR_NAME();
        if (BXR_NAME != null) {
            stmt.bindString(14, BXR_NAME);
        }
 
        String YSJG = entity.getYSJG();
        if (YSJG != null) {
            stmt.bindString(15, YSJG);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Eq_check entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getEQ_CHECK_ID());
 
        String JCLX = entity.getJCLX();
        if (JCLX != null) {
            stmt.bindString(3, JCLX);
        }
        stmt.bindLong(4, entity.getSBBH());
        stmt.bindLong(5, entity.getGZLX());
 
        String GZMS = entity.getGZMS();
        if (GZMS != null) {
            stmt.bindString(6, GZMS);
        }
        stmt.bindLong(7, entity.getBXR());
 
        String BXSJ = entity.getBXSJ();
        if (BXSJ != null) {
            stmt.bindString(8, BXSJ);
        }
        stmt.bindLong(9, entity.getYSR());
 
        String YSSJ = entity.getYSSJ();
        if (YSSJ != null) {
            stmt.bindString(10, YSSJ);
        }
 
        String GZTP = entity.getGZTP();
        if (GZTP != null) {
            stmt.bindString(11, GZTP);
        }
 
        String ABC = entity.getABC();
        if (ABC != null) {
            stmt.bindString(12, ABC);
        }
 
        String imgString = entity.getImgString();
        if (imgString != null) {
            stmt.bindString(13, imgString);
        }
 
        String BXR_NAME = entity.getBXR_NAME();
        if (BXR_NAME != null) {
            stmt.bindString(14, BXR_NAME);
        }
 
        String YSJG = entity.getYSJG();
        if (YSJG != null) {
            stmt.bindString(15, YSJG);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Eq_check readEntity(Cursor cursor, int offset) {
        Eq_check entity = new Eq_check( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // EQ_CHECK_ID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // JCLX
            cursor.getInt(offset + 3), // SBBH
            cursor.getInt(offset + 4), // GZLX
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // GZMS
            cursor.getInt(offset + 6), // BXR
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // BXSJ
            cursor.getInt(offset + 8), // YSR
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // YSSJ
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // GZTP
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // ABC
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // imgString
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // BXR_NAME
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14) // YSJG
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Eq_check entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setEQ_CHECK_ID(cursor.getInt(offset + 1));
        entity.setJCLX(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSBBH(cursor.getInt(offset + 3));
        entity.setGZLX(cursor.getInt(offset + 4));
        entity.setGZMS(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setBXR(cursor.getInt(offset + 6));
        entity.setBXSJ(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setYSR(cursor.getInt(offset + 8));
        entity.setYSSJ(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setGZTP(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setABC(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setImgString(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setBXR_NAME(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setYSJG(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Eq_check entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Eq_check entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Eq_check entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
