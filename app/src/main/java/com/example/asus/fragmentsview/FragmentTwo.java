package com.example.asus.fragmentsview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/4/10.
 */
public class FragmentTwo extends Fragment implements AdapterView.OnItemClickListener{
    private ListView listView;
    private List<String> mList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_two,null);
        listView= (ListView) view.findViewById(R.id.list_item);
        mList=new ArrayList<>();
        for (int i=0;i<50;i++) {
            String str="Hello!";
            mList.add(str);

        }
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),
//                android.R.layout.simple_expandable_list_item_1,
//                mList);
        MyAdapter adapter=new MyAdapter(getActivity(),mList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(),"item"+position,Toast.LENGTH_SHORT).show();
    }
}
