package jp.app.oomae.hisaki.recyclerview_custom_layout_sample;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hisaki on 2017/06/08.
 */

public class custom_recyclerview_adapter extends RecyclerView.Adapter<custom_recyclerview_adapter.ViewHolder>{
    private Activity mactivity;
    private int item_count;

    public custom_recyclerview_adapter(Activity mactivity,int item_count) {
        this.mactivity = mactivity;
        this.item_count = item_count;
    }

    @Override
    public custom_recyclerview_adapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view;
        final custom_recyclerview_adapter.ViewHolder viewHold;

        switch(i) {//ここでレイアウトのviewTypeからそれぞれの適用させたいlayoutへ分岐
            case 0:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout1, viewGroup, false);
                viewHold = new custom_recyclerview_adapter.ViewHolder(view,i);
                // クリックリスナを搭載
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int position = viewHold.getAdapterPosition(); // positionを取得
                        Log.d("test",String.valueOf(position));
                    }
                });
                return viewHold;
            case 1:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout2, viewGroup, false);
                viewHold = new custom_recyclerview_adapter.ViewHolder(view,i);
                // クリックリスナを搭載
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int position = viewHold.getAdapterPosition(); // positionを取得
                        Log.d("test",String.valueOf(position));
                    }
                });
                return viewHold;
            case 2:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout3, viewGroup, false);
                viewHold = new custom_recyclerview_adapter.ViewHolder(view,i);
                // クリックリスナを搭載
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int position = viewHold.getAdapterPosition(); // positionを取得
                        Log.d("test",String.valueOf(position));
                    }
                });
                return viewHold;
        }
        return null;
    }

    @Override//ここでviewに対し変化を施す
    public void onBindViewHolder(custom_recyclerview_adapter.ViewHolder viewHolder, int i) {
        // データ表示
        if(0 <= i && i <= 3) {
            //viewHolder.title1.setText(test[i] + "さん");
        }
        else if(4 <= i && i <= 7){// creates second view
            //viewHolder.title2.setText("hello");
        }
        else{// creates third view
            //viewHolder.title3.setText("test");
        }

    }

    @Override
    public int getItemCount() {
        return item_count;
    }

    @Override
    public int getItemViewType(int position) {//positionはrecyclerviewの中身のitemの位置
        if(0 <= position && position <= 3) {//recyclerviewの中身の0～3番目をviewtype "0" に設定する
            return 0;
        }
        else if(4 <= position && position <= 7){//recyclerviewの中身の4～7番目をviewtype "1" に設定する
            return 1;
        }
        else{//それ以外のviewtype "2" に設定する
            return 2;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        /*TextView title1;
        TextView title2;
        TextView title3;*/
        public ViewHolder(View view,int i) {
            super(view);
            /*title1 = (TextView)view.findViewById(R.id.textsample);
            title2 = (TextView)view.findViewById(R.id.textsample1);
            title3 = (TextView)view.findViewById(R.id.textsample2);*/
        }
    }
}