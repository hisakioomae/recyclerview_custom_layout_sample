package jp.app.oomae.hisaki.recyclerview_custom_layout_sample;

import android.support.v7.widget.GridLayoutManager;

/**
 * Created by hisaki on 2017/06/08.
 */

public class Custom_Spansize extends GridLayoutManager.SpanSizeLookup{
    private int spanCnt1, spanCnt2 , spanCnt3;

    public Custom_Spansize(int spanCnt1, int spanCnt2,int spanCnt3) {
        super();
        this.spanCnt1 = spanCnt1;
        this.spanCnt2 = spanCnt2;
        this.spanCnt3 = spanCnt3;
    }

    @Override
    public int getSpanSize(int position) {
        int result;
        if(position >= 0 && position <= 3){
            result = spanCnt1;
        }
        else if(position >= 4 && position <= 7){
            result = spanCnt2;
        }
        else {
            result = spanCnt3;
        }
        return result;
    }
}
