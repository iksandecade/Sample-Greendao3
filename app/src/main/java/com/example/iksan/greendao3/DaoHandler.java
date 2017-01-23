package com.example.iksan.greendao3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by iksan on 1/20/2017.
 */

public class DaoHandler {

    public static DaoSession getInstance(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, "GreenDao3", null);
        SQLiteDatabase db = helper.getWritableDatabase();

        DaoMaster daoMaster = new DaoMaster(db);
        DaoSession mDaoSession = daoMaster.newSession();
        return mDaoSession;
    }
}
