package niu.edu.tw.who;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WhoamiActivity extends Activity {
    /** Called when the activity is first created. */
	
	EditText et1;
	Button bt1;
	TextView tv1;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        et1 = (EditText) findViewById(R.id.editText1);
        bt1 = (Button) findViewById(R.id.button1);
        tv1= (TextView) findViewById(R.id.textView1);
        
        bt1.setOnClickListener(new Button.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				tv1.setText("§Ú¬O"+ et1.getText().toString());
				
				
			}
		});
        
        
    }
}