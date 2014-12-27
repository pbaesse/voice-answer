package nicom.voiceanswer.voiceanswer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Cadastro extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cadastro);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro, menu);
		return true;
	}
	public void professor(View v){
		Intent it=new Intent(this,CadastroProfessor.class);
		startActivity(it);
	}
	public void aluno(View v){
		Intent it=new Intent(this,CadastroAluno.class);
		startActivity(it);
	}

}
