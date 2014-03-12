package com.PAD.practica1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DatosRestaurante extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_restaurante);
        
        Spinner sp = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this, R.array.vias, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
        
        sp.setOnItemSelectedListener(new OnItemSelectedListener() {
           
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, 
            		int position, long id) {
            	
            	    
            }
                                 
            public void onNothingSelected(AdapterView<?> parentView) {
            	
            }
        });

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.datos_restaurante, menu);
		return true;
	}

}
