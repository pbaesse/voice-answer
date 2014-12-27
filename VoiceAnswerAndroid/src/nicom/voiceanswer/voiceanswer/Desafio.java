package nicom.voiceanswer.voiceanswer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Desafio extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.desafio);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.desafio, menu);
		return true;
	}
	
	public void buscar(View v){
		Intent it=new Intent(this,BuscarDesafio.class);
		startActivity(it);
	}
	public void cadastrar(View v){
		Intent it=new Intent(this,CadastroDesafio.class);
		startActivity(it);
	}

}
