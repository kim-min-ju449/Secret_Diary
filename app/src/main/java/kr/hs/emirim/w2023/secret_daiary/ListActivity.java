package kr.hs.emirim.w2023.secret_daiary;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    MyDB dpHelper;
    EditText title_diary;
    SQLiteDatabase db;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listdiary);

    }

//        Button btn = findViewById(R.id.btn_j);
//        title_diary=findViewById(R.id.title_diary);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                db = dpHelper.getWritableDatabase();
//                db.execSQL("insert into groupTB values('"+ title_diary.getText().toString() +"', "+ title_diary.getText().toString() +");");
//
//                db.close();
//                Toast.makeText(getApplicationContext(), "정상적으로 행이 삽입 되었습니다.", Toast.LENGTH_SHORT).show();
//            }
//        });





    public class MyDB extends SQLiteOpenHelper{

        public MyDB(Context context){
            super(context, "groupDB", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table groupTB (name char(20), date date);");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        }
    }
}

