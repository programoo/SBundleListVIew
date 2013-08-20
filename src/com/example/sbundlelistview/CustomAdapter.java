package com.example.sbundlelistview;

import java.io.IOException;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] Ids;
	private final int rowResourceId;

	public CustomAdapter(Context context, int resource, String[] objects) {
		super(context, resource, objects);
		// TODO Auto-generated constructor stub
		this.context = context;
		this.Ids = objects;
		this.rowResourceId = resource;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		System.out.println("position load: " + position);

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View rowView = inflater.inflate(rowResourceId, parent, false);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);
		TextView textView = (TextView) rowView.findViewById(R.id.textView);

		imageView.setImageResource(R.drawable.ic_launcher);
		textView.setText(Ids[position]);

		return rowView;

	}

}