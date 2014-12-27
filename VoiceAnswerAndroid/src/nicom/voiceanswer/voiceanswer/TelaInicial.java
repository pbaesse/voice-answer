package nicom.voiceanswer.voiceanswer;

//import nicom.voiceanswer.projeto.Cadastro;
//import nicom.voiceanswer.Desafio;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class TelaInicial extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_inicial);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_inicial, menu);
		return true;
	}
	
	public void cadastro(View v){
		Intent it=new Intent(this,Cadastro.class);
		startActivity(it);
	}
	public void desafio(View v){
		Intent it=new Intent(this,Desafio.class);
		startActivity(it);
	}

}
