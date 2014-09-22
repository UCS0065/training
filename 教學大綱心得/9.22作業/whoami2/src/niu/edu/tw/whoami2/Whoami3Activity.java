package niu.edu.tw.whoami2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Whoami3Activity extends Activity {
    /** Called when the activity is first created. */
	
	TextView tv2;
	Button bt2;
	
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        
        tv2 = (TextView) findViewById(R.id.textView2);
        bt2 = (Button) findViewById(R.id.button2);
        
        Intent intent2 = getIntent();
        tv2.setText("§Ú¬O"+intent2.getStringExtra("S"));
        
        bt2.setOnClickListener(new Button.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
        
        
        
    }
}