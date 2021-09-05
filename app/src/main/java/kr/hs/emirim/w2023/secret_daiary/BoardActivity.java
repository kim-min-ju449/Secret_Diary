package kr.hs.emirim.w2023.secret_daiary;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BoardActivity extends AppCompatActivity {

    private RecyclerView mPostRecyclerView;

    private BoardAdapter mAdpater;
    private List<Board> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board);

        mPostRecyclerView = findViewById(R.id.recyclerView);
        mDatas = new ArrayList<>();
        mDatas.add(new Board(null,"title","contents"));
        mDatas.add(new Board(null,"title","contents"));
        mDatas.add(new Board(null,"title","contents"));

        // Adapter 연결
        mAdpater = new BoardAdapter(mDatas);
        mPostRecyclerView.setAdapter(mAdpater);
    }



}
