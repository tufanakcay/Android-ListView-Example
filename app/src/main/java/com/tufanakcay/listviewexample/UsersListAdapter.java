package com.tufanakcay.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class UsersListAdapter extends BaseAdapter {

    List<UsersModel> list;
    Context context;

    public UsersListAdapter( List<UsersModel> list, Context context) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View layout = LayoutInflater.from(context).inflate(R.layout.layout,parent,false);

        TextView first_name = layout.findViewById(R.id.first_name);
        TextView last_name = layout.findViewById(R.id.last_name);
        TextView date_of_birth = layout.findViewById(R.id.date_of_birth);
        TextView gender = layout.findViewById(R.id.gender);
        TextView email = layout.findViewById(R.id.email);

        first_name.setText(list.get(position).getFirst_name());
        last_name.setText(list.get(position).getLast_name());
        date_of_birth.setText(list.get(position).getDate_of_birth());
        gender.setText(list.get(position).getGender());
        email.setText(list.get(position).getEmail());
		
        return layout;
    }
}
