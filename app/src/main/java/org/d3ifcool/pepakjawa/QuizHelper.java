package org.d3ifcool.pepakjawa;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


class QuizHelper extends SQLiteOpenHelper {

    private Context context;
    private static final String DB_NAME = "PQuiz.db";
    private static final int DB_VERSION = 3;
    //Table name
    private static final String TABLE_NAME = "PQ";
    //Id of question
    private static final String UID = "_UID";
    //Question
    private static final String QUESTION = "QUESTION";
    //Option A
    private static final String OPTA = "OPTA";
    //Option B
    private static final String OPTB = "OPTB";
    //Option C
    private static final String OPTC = "OPTC";
    //Option D
    private static final String OPTD = "OPTD";
    //Answer
    private static final String ANSWER = "ANSWER";
    //So basically we are now creating table with first column-id , sec column-question , third column -option A, fourth column -option B , Fifth column -option C , sixth column -option D , seventh column - answer(i.e ans of  question)
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255), " + OPTA + " VARCHAR(255), " + OPTB + " VARCHAR(255), " + OPTC + " VARCHAR(255), " + OPTD + " VARCHAR(255), " + ANSWER + " VARCHAR(255));";
    //Drop table query
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    QuizHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //OnCreate is called only once
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //OnUpgrade is called when ever we upgrade or increment our database version no
        sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);
    }

    void allQuestion() {
        ArrayList<Question> arraylist = new ArrayList<>();

        arraylist.add(new Question("Apa arti kata Mustaka dalam Bahasa Indonesia ?", "Kepala", "Telinga", "Kaki", "Tangan", "Kepala"));

        arraylist.add(new Question("Apa arti kata Telinga dalam Bahasa Jawa ?", "Paningal", "Mustaka", "Talingan", "Untu", "Talingan"));

        arraylist.add(new Question("Apa arti kata Kaki dalam Bahasa Indonesia ?", "Untu", "Paningal", "Mustaka", "Suku", "Suku"));

        arraylist.add(new Question("Apa arti kata Asta dalam Bahasa Indonesia", "Telinga", "Tangan", "Kaki", "Perut", "Tangan"));

        arraylist.add(new Question("Apa arti kata Rikma dalam Bahasa Indonesia ?", "Perut", "Kepala", "Rambut", "Hidung", "Rambut"));

        arraylist.add(new Question("Apa arti kata Hidung dalam Bahasa Jawa ?", "Grana", "Rikma", "Asta", "Paningal", "Grana"));

        arraylist.add(new Question("Apa arti kata Mata dalam Bahasa Jawa ?", "Rikma", "Asta", "Mustaka", "Mripat", "Mripat"));

        arraylist.add(new Question("Apa arti kata Tedha dalam Bahasa Indonesia ?", "Minum", "Tidur", "Makan", "Duduk", "Makan"));

        arraylist.add(new Question("Apa arti kata Luwe dalam Bahasa Indonesia ?", "Makan", "Lapar", "Haus", "Lama", "Lapar"));

        arraylist.add(new Question("Apa arti kata Kesah dalam Bahasa Indonesia ?", "Datang", "Menunggu", "Pergi", "Pulang", "Pergi"));

        arraylist.add(new Question("Dalam Bahasa Jawa, anak ayam disebut ?", "Kuthuk", "Kirik", "Nener", "Ketul", "Kuthuk"));

        arraylist.add(new Question("Dalam Bahasa Jawa, anak babi disebut ?", "Genjik", "Piyik", "Cempe", "Gembluk", "Gembluk"));

        arraylist.add(new Question("Dalam Bahasa Jawa, anak bebek disebut ?", "Cempe", "Meri", "Kirik", "Piyik", "Meri"));

        arraylist.add(new Question("Dalam Bahasa Jawa, anak kambing disebut ?", "Kirik", "Piyik", "Gudel", "Cempe", "Cempe"));

        arraylist.add(new Question("Rete dalam Bahasa Jawa adalah sebutan untuk anak ?", "Kambing", "Monyet", "Buaya", "Ulur", "Buaya"));

        arraylist.add(new Question("Bledug dalam Bahasa Jawa adalah sebutan untuk anak ?", "Buaya", "Gajah", "Harimau", "Kerbau", "Gajah"));

        arraylist.add(new Question("Sawijah dalam Bahasa Jawa adalah sebutan untuk anak ?", "Cicak", "Cacing", "Bebek", "Gajah", "Cicak"));

        arraylist.add(new Question("Cemeng dalam Bahasa Jawa adalah sebutan untuk anak ?", "Bebek", "Cicak", "Harimau", "Kucing", "Kucing"));

        arraylist.add(new Question("Dibal dalam Bahasa Jawa adalah sebutan untuk anak ?", "Harimau", "Ular", "Singa", "Naga", "Singa"));

        arraylist.add(new Question("Kisi/Ucet dalam Bahasa Jawa adalah sebutan untuk anak ?", "Cicak", "Ular", "Kambing", "Burung", "Ular"));

        arraylist.add(new Question("Dalam Bahasa Jawa, cara memanggil angsa yaitu dengan cara ?", "Jih, jih", "Kati, kati", "Pus, pus", "Meh, meh", "Kati, kati"));

        arraylist.add(new Question("Dalam Bahasa Jawa, cara memanggil kucing yaitu dengan cara ?", "Pus, pus", "Meh, meh", "Jih, jih", "Kur, kur", "Pus, pus"));

        arraylist.add(new Question("Dalam Bahasa Jawa, cara memanggil kambing yaitu dengan cara ?", "Kur, kur", "Thi, thi, thi", "Pus, pus", "Mi, mi, mi", "Mi, mi, mi"));

        arraylist.add(new Question("Dalam Bahasa Jawa, cara memanggil kuda yaitu dengan cara ?", "Mi, mi, mi", "Ki, ki, ki", "Meh, meh", "O-ek, o-ek", "Ki, ki, ki"));

        arraylist.add(new Question("Dalam Bahasa Jawa, cara memanggil bebek yaitu dengan cara ?", "Meh, meh", "Pus, pus", "Ri, ri, ri", "Thi, thi, thi", "Ri, ri, ri"));

        arraylist.add(new Question( "Dalam Bahasa Jawa, nama batang pisang disebut ?", "Ruyung", "Debog", "Gleges", "Glugu", "Debog"));

        arraylist.add(new Question( "Dalam Bahasa Jawa, nama batang jagung disebut ?", "Glugu", "Ruyung", "Debog", "Tebon", "Tebon"));

        arraylist.add(new Question( "Dalam Bahasa Jawa, nama batang kapas disebut ?", "Ruyung", "Tebon", "Randhu", "Gleges", "Randhu"));

        arraylist.add(new Question( "Dalam Bahasa Jawa, nama batang aren disebut ?", "Randhu", "Gleges", "Ruyung", "Bonggol", "Ruyung"));

        arraylist.add(new Question( "Dalam Bahasa Jawa, nama batang bambu muda disebut ?", "Bung", "Bungkilan", "Glugu", "Tebon", "Bung"));

        arraylist.add(new Question( "Dalam Bahasa Indonesia, Glugu berarti ?", "Batang Kelapa", "Batang Padi", "Batang Jagug", "Batang Bambu Muda", "Batang Kelapa"));

        arraylist.add(new Question( "Dalam Bahasa Indonesia, Gleges berarti ?", "Batang Bambu Tua", "Batang Jagung", "Batang Tebu", "Batang Kelapa ", "Batang Tebu"));

        arraylist.add(new Question( "Dalam Bahasa Indonesia, Damen berarti ?", "Batang Tebu", "Batang Kelapa", "Batang Jagung", "Batang Padi", "Batang Padi"));

        arraylist.add(new Question( "Dalam Bahasa Indonesia, Bungkilan berarti ?", "Batang Bambu Muda", "Batang Bambu Tua", "Batang Tebu", "Batang Kelapa", "Batang Bambu Tua"));

        arraylist.add(new Question( "Dalam Bahasa Indonesia, Aren berarti ?", "Batang Tebu", "Batang Melinjo", "Batang Kolang-kaling", "Batang Bambu Muda", "Batang Kolang-kaling"));
        this.addAllQuestions(arraylist);

    }


    private void addAllQuestions(ArrayList<Question> allQuestions) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        try {
            ContentValues values = new ContentValues();
            for (Question question : allQuestions) {
                values.put(QUESTION, question.getQuestion());
                values.put(OPTA, question.getOptA());
                values.put(OPTB, question.getOptB());
                values.put(OPTC, question.getOptC());
                values.put(OPTD, question.getOptD());
                values.put(ANSWER, question.getAnswer());
                db.insert(TABLE_NAME, null, values);
            }
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
            db.close();
        }
    }


    List<Question> getAllOfTheQuestions() {

        List<Question> questionsList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        String coloumn[] = {UID, QUESTION, OPTA, OPTB, OPTC, OPTD, ANSWER};
        Cursor cursor = db.query(TABLE_NAME, coloumn, null, null, null, null, null);


        while (cursor.moveToNext()) {
            Question question = new Question();
            question.setId(cursor.getInt(0));
            question.setQuestion(cursor.getString(1));
            question.setOptA(cursor.getString(2));
            question.setOptB(cursor.getString(3));
            question.setOptC(cursor.getString(4));
            question.setOptD(cursor.getString(5));
            question.setAnswer(cursor.getString(6));
            questionsList.add(question);
        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return questionsList;
    }
}
