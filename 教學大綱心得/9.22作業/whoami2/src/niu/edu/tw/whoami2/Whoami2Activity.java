package niu.edu.tw.whoami2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Whoami2Activity extends Activity {
    /** Called when the activity is first created. */
	
	EditText et1;
	Button bt1;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        et1 = (EditText) findViewById(R.id.editText1);
        bt1 = (Button) findViewById(R.id.button1);
        
        bt1.setOnClickListener(new Button.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = 
						new Intent(Whoami2Activity.this, Whoami3Activity.class);
				intent.putExtra("S", et1.getText().toString());
				
				startActivity(intent);
			}
		});

    }
}