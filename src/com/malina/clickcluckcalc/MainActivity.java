package com.malina.clickcluckcalc;

import android.app.Activity;  
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		
		int res;
				
		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			Button butPl = (Button) rootView.findViewById(R.id.button1);
			Button butMin = (Button) rootView.findViewById(R.id.button2);
			Button butMult = (Button) rootView.findViewById(R.id.button3);
			Button butDiv = (Button) rootView.findViewById(R.id.button4);
			Button butEq = (Button) rootView.findViewById(R.id.button5);
			final EditText a = (EditText) rootView.findViewById(R.id.editText1);
			final EditText b = (EditText) rootView.findViewById(R.id.editText2);
			final TextView result = (TextView) rootView.findViewById(R.id.textView5);
			butPl.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					int i = Integer.parseInt(a.getText().toString());
					int j = Integer.parseInt(b.getText().toString());
					res = i + j;				
				}
			});
			butMin.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					int i = Integer.parseInt(a.getText().toString());
					int j = Integer.parseInt(b.getText().toString());
					res = i - j;						
				}
			});
			butMult.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					int i = Integer.parseInt(a.getText().toString());
					int j = Integer.parseInt(b.getText().toString());
					res = i * j;						
				}
			});
			butDiv.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					int i = Integer.parseInt(a.getText().toString());
					int j = Integer.parseInt(b.getText().toString());
					res = i / j;					
				}
			});
			butEq.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					String rez = String.valueOf(res);
					result.setText(rez);					
				}
			});
			return rootView;
		}
		
	}

}
