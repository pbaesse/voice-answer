package nicom.voiceanswer.voiceanswer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CadastroAluno extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cadastro_aluno);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro_aluno, menu);
		return true;
	}
	
	//M�todo

}