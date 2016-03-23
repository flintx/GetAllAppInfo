package com.flint.getallappinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2016/3/19.
 */
public class AppInfoAdapter extends ArrayAdapter<AppInfo> {
    private int resourceId;

    public AppInfoAdapter(Context context, int textViewResourceId, List<AppInfo> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        AppInfo appInfo = getItem(position);
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        } else {
            view = convertView;
        }
        ImageView appIcon = (ImageView) view.findViewById(R.id.app_icon);
        TextView appName = (TextView) view.findViewById(R.id.app_name);

        appIcon.setImageDrawable(appInfo.appIcon);
        appName.setText(appInfo.appName);

        return view;
    }
}
