package com.example.lab4_1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class FoodDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "lab6"; // nazwa
    private static final int DB_VERSION = 2; // wersja DB


    public FoodDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateMyDatabase(db, oldVersion, newVersion);


    }
    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1) {
            db.execSQL("CREATE TABLE FOOD (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "NAME TEXT, "
                    + "DESCRIPTION TEXT, "
                    + "IMAGE_RESOURCE_ID INTEGER);");
            insertFood(db, "Tosty", "Tost – kromka pieczywa pszennego, podpieczona w tosterze; rodzaj grzanki. Gotowy tost powinien być lekko przyrumieniony i chrupiący.", R.drawable.tosty);
            insertFood(db, "Jajecznica", "Jajecznica – potrawa z rozmąconych, usmażonych na patelni jajek. Jest domeną prostej kuchni, ponieważ nie wymaga umiejętności kulinarnych ani techniki.",
                    R.drawable.jajecznica);
            insertFood(db, "Musli", "Musli - Mieszanka płatków zbożowych, bakalii, orzechów i suszonych owoców; jest spożywana przede wszystkim z mlekiem lub jogurtem", R.drawable.musli);
        }
        if (oldVersion < 2) {
            db.execSQL("ALTER TABLE FOOD ADD COLUMN FAVORITE NUMERIC;");
        }
    }
    private static void insertFood(SQLiteDatabase db, String name,
                                    String description, int resourceId) {
        ContentValues foodValues = new ContentValues();
        foodValues.put("NAME", name);
        foodValues.put("DESCRIPTION", description);
        foodValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("FOOD", null, foodValues);
    }
}
