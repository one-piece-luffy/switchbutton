package com.kyleduo.switchbutton.demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView listView = (ListView) findViewById(R.id.list);
		listView.setOnItemClickListener(this);
	}



	private void jumpToStyle() {
		startActivity(new Intent(this, StyleActivity.class));
	}

	private void jumpToStyleInCode() {
		startActivity(new Intent(this, StyleInCodeActivity.class));
	}

	private void jumpToUse() {
		startActivity(new Intent(this, UseActivity.class));
	}

	private void jumpToRecycler() {
		startActivity(new Intent(this, RecyclerActivity.class));
	}



	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		switch (position) {
			case 0:
				jumpToStyle();
				break;
			case 1:
				jumpToStyleInCode();
				break;
			case 2:
				jumpToUse();
				break;
			case 3:
				jumpToRecycler();
				break;

			default:
				break;
		}
	}

}
