package kr.hs.emirim.w2023.secret_daiary;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    MyDB dpHelper;
    EditText title_diary;
    SQLiteDatabase db;
    Button btn;
    TextView title;
    TextView date;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listdiary);

//        btn=findViewById(R.id.btn_j);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                db = dpHelper.getWritableDatabase();
////                db.execSQL("insert into groupTB values('"+ title_diary.getText().toString() +"', "+ title_diary.getText().toString() +");");
//                Toast.makeText(getApplicationContext(), "저장되었습니다", Toast.LENGTH_SHORT).show();
//                //selectDB();
//            }
//        });

    }
//    public void selectDB(){
//        db = dpHelper.getReadableDatabase();
//        Cursor cursor = db.rawQuery("select * from groupTB;", null);
//        String strName = "제목\r\n_________\r\n";
//        String strCount = "날짜\r\n_________\r\n";
//        while (cursor.moveToNext()){
//            strName += cursor.getString(0) + "\r\n";
//            strCount += cursor.datetime('now','localtime') + "\r\n";
//        }
//
//        title.setText(strName);
//        date.setText(strCount);
//
//        cursor.close();
//        db.close();
//    }



    public class MyDB extends SQLiteOpenHelper{

        public MyDB(Context context){

            super(context, "groupDB", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table groupTB (name char(20), date char(20));");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) { //이건 초기화고 난 초기화 하기 싫은데...
            db.execSQL("drop table if exists groupTB");
            onCreate(db);

        }

    }
}

