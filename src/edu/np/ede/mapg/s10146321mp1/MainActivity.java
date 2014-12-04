package edu.np.ede.mapg.s10146321mp1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	int myNumber = 8;
	EditText stMessage;
	TextView textView1;
	Button BtGuess;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btGuess = (Button) this.findViewById(R.id.btGuess);
		stMessage = (EditText) this.findViewById(R.id.stMessage);
		btGuess.setOnClickListener(listener);

	}

	View.OnClickListener listener = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			String message = stMessage.getText().toString();
			int num = Interger.parseInt(message);
			Toast.makeText(getBaseContext(), String.valueOf(num),
					Toast.LENGTH_LONG).show();
			if (num == 8) {
				Toast.makeText(getBaseContext(), "Bingo! correct number",
						Toast.LENGTH_LONG).show();

			} else {
				Toast.makeText(getBaseContext(), "Wrong ! try again",
						Toast.LENGTH_LONG).show();
			}
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
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
}
