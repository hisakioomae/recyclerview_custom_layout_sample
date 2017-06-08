package jp.app.oomae.hisaki.recyclerview_custom_layout_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);//viewの大きさが固定の場合，処理パフォーマンスが向上する
        GridLayoutManager gridLayoutManagerVertical = new GridLayoutManager(this, 4, LinearLayoutManager.VERTICAL,false);
        gridLayoutManagerVertical.setSpanSizeLookup(new Custom_Spansize(4, 2 ,1));
        recyclerView.setLayoutManager(gridLayoutManagerVertical);

        custom_recyclerview_adapter adapter = new custom_recyclerview_adapter(this,20);//20個itemを作る
        recyclerView.setAdapter(adapter);

    }
}
