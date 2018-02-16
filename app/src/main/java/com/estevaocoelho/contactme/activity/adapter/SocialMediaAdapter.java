package com.estevaocoelho.contactme.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.estevaocoelho.contactme.R;
import com.estevaocoelho.contactme.entity.SocialMedia;

import java.util.List;

/**
 * Created by estevaocoelho on 15/02/18.
 */

public class SocialMediaAdapter extends BaseAdapter {

    private List<SocialMedia> socialMediaList;

    public SocialMediaAdapter(List<SocialMedia> socialMediaList) {
        this.socialMediaList = socialMediaList;
    }

    @Override
    public int getCount() {
        return socialMediaList.size();
    }

    @Override
    public SocialMedia getItem(int position) {
        return socialMediaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);

        ImageView imageViewIcon = view.findViewById(R.id.image_view_icon);
        TextView textViewType = view.findViewById(R.id.text_item_type);
        TextView textViewLink = view.findViewById(R.id.text_view_link);

        SocialMedia item = getItem(position);
        imageViewIcon.setImageResource(item.getMediaType().getIcon());
        textViewLink.setText(item.getUrl());
        textViewType.setText(item.getMediaType().name());

        return view;
    }
}
