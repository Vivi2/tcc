package br.java.classe;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Claves extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_claves);
		Button botao = (Button) findViewById(R.id.button1);
		botao.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent i = new Intent(Claves.this, ClaveFa.class);
				startActivityForResult(i, 1);
			}
		});
		
		Button botao2 = (Button) findViewById(R.id.button2);
		botao2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent i = new Intent(Claves.this, ClaveSol.class);
				startActivityForResult(i, 1);
			}
		});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.claves, menu);
		return true;
	}

}
