package ncsu.carjuice.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
//Test comment
public class CarJuiceActivity extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.example.myapp.MESSAGE";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    /** Called when the user selects the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
    	Intent intent = new Intent(this, SearchableActivity.class);
    	EditText editText = (EditText) findViewById(R.id.edit_message);
    	String message = editText.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE, message);
    	//Starts instance of the activity called by intent parameter, in this case: DisplayMessageActivity
    	startActivity(intent);
    }
}