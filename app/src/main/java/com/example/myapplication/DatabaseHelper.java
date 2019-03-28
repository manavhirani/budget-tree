package com.example.myapplication;




import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ProgrammingKnowledge on 4/3/2015.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Manager.db";
    public static final String TABLE_NAME = "Record_table";
    public static final String COL_1 = "SRNO";
    public static final String COL_2 = "TRANSPORT";
    public static final String COL_3 = "ENTERTAINMENT";
    public static final String COL_4 = "HOUSEHOLD";
    public static final String COL_5 = "SHOPPING";
    public static final String COL_6 = "FOOD";
    public static final String COL_7 = "OTHERS";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " (SRNO INTEGER PRIMARY KEY AUTOINCREMENT,TRANSPORT INTEGER,ENTERTAINMENT INTEGER,HOUSEHOLD INTEGER, SHOPPING INTEGER, FOOD INTEGER, OTHERS INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }


    public boolean insertData2(String travel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COL_2, travel);
        contentValues.put(COL_3, 0);
        contentValues.put(COL_4, 0);
        contentValues.put(COL_5, 0);
        contentValues.put(COL_6, 0);
        contentValues.put(COL_7, 0);


        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }


    public boolean insertData3(String travel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COL_2, 0);
        contentValues.put(COL_3, travel);
        contentValues.put(COL_4, 0);
        contentValues.put(COL_5, 0);
        contentValues.put(COL_6, 0);
        contentValues.put(COL_7, 0);


        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }


    public boolean insertData4(String travel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COL_2, 0);
        contentValues.put(COL_3, 0);
        contentValues.put(COL_4, travel);
        contentValues.put(COL_5, 0);
        contentValues.put(COL_6, 0);
        contentValues.put(COL_7, 0);


        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public boolean insertData5(String travel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COL_2, 0);
        contentValues.put(COL_3, 0);
        contentValues.put(COL_4, 0);
        contentValues.put(COL_5, travel);
        contentValues.put(COL_6, 0);
        contentValues.put(COL_7, 0);


        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }


    public boolean insertData6(String travel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COL_2, 0);
        contentValues.put(COL_3, 0);
        contentValues.put(COL_4, 0);
        contentValues.put(COL_5, 0);
        contentValues.put(COL_6, travel);
        contentValues.put(COL_7, 0);


        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public boolean insertData7(String travel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COL_2, 0);
        contentValues.put(COL_3, 0);
        contentValues.put(COL_4, 0);
        contentValues.put(COL_5, 0);
        contentValues.put(COL_6, 0);
        contentValues.put(COL_7, travel);


        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
        return res;
    }

   /* public boolean updateData(String srno, String day, String travel, String books, String food) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, srno);
        contentValues.put(COL_2, day);
        contentValues.put(COL_3, travel);
        contentValues.put(COL_4, books);
        contentValues.put(COL_5, food);
        db.update(TABLE_NAME, contentValues, "SRNO = ?", new String[]{srno});
        return true;
    }

    public Integer deleteData(String srno, String day, String travel, String books, String food) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "SRNO = ?", new String[]{srno});
    }
*/

}

