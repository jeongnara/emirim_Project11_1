package kr.hs.emirimw2016.emirim_project11_1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.img01, R.drawable.img02, R.drawable.img03, R.drawable.img04, R.drawable.img05,
                        R.drawable.img06,R.drawable.img07,R.drawable.img08,R.drawable.img09,R.drawable.img10,
                        R.drawable.img01, R.drawable.img02, R.drawable.img03, R.drawable.img04, R.drawable.img05,
                        R.drawable.img06,R.drawable.img07,R.drawable.img08,R.drawable.img09,R.drawable.img10};

    public GridAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return posterIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new ViewGroup.LayoutParams(200, 300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setImageResource(posterIds[i]);
        return imgv;
    }
}
