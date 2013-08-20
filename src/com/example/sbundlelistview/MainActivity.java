package com.example.sbundlelistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		String[] asset = { "book", "pencil", "glass", "phone" };
		ListView list = (ListView)findViewById(R.id.list1);
		CustomAdapter ca = new CustomAdapter(this.getApplicationContext(),
				R.layout.listview_items, asset);
		list.setAdapter(ca);
	}

}
