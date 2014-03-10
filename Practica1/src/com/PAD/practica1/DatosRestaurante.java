package com.PAD.practica1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DatosRestaurante extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_datos_restaurante);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.datos_restaurante, menu);
		return true;
	}

}
