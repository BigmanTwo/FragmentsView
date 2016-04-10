package com.example.asus.fragmentsview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Asus on 2016/4/10.
 */
public class MyAdapter extends BaseAdapter{
    private Context mContext;
    private List<String> mList;

    public MyAdapter(Context mContext, List<String> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHold viewHold;

        if(convertView==null){
             viewHold=new ViewHold();
            convertView= LayoutInflater.from(mContext).inflate(R.layout.adapter_layout,null);
            viewHold.mTextView= (TextView) convertView.findViewById(R.id.adapter_text);
            convertView.setTag(viewHold);
            viewHold.mTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext,"点击了文本",Toast.LENGTH_SHORT).show();
                }
            });
        }else{
            viewHold= (ViewHold) convertView.getTag();
        }
        viewHold.mTextView.setText(mList.get(position));
        return convertView;
    }


    class ViewHold{
        private TextView mTextView;
    }

}
