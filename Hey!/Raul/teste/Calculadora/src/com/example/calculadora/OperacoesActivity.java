package com.example.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OperacoesActivity extends Activity{
	
	EditText eN1;
    EditText eN2;
    
    Button bSoma;
    Button bSubtracao;
    Button bMultiplicacao;
    Button bDivisao;
    
    TextView tResultado;
    
    double num1;
    double num2;
    double resultado;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_operacoes);
	}
	
	public void Soma(View v){
		eN1 = (EditText) findViewById(R.Entrada.n1);
		eN2 = (EditText) findViewById(R.Entrada.n2);
		tResultado = (EditText) findViewById(R.Texto.Resultado);
		
		num1 = (Double.parseDouble(eN1.getText().toString()));
		num2 = (Double.parseDouble(eN2.getText().toString()));
		
		resultado = num1 + num2;
		
		tResultado.setText(String.valueOf(resultado));
	}
	
	public void Subtracao(View v){
		eN1 = (EditText) findViewById(R.Entrada.n1);
		eN2 = (EditText) findViewById(R.Entrada.n2);
		tResultado = (EditText) findViewById(R.Texto.Resultado);
		
		num1 = (Double.parseDouble(eN1.getText().toString()));
		num2 = (Double.parseDouble(eN2.getText().toString()));
		
		resultado = num1 - num2;
		
		tResultado.setText(String.valueOf(resultado));
	}
	
	public void Multiplicacao(View v){
		eN1 = (EditText) findViewById(R.Entrada.n1);
		eN2 = (EditText) findViewById(R.Entrada.n2);
		tResultado = (EditText) findViewById(R.Texto.Resultado);
		
		num1 = (Double.parseDouble(eN1.getText().toString()));
		num2 = (Double.parseDouble(eN2.getText().toString()));
		
		resultado = num1 * num2;
		
		tResultado.setText(String.valueOf(resultado));
	}
	
	public void Divisao(View v){
		eN1 = (EditText) findViewById(R.Entrada.n1);
		eN2 = (EditText) findViewById(R.Entrada.n2);
		tResultado = (EditText) findViewById(R.Texto.Resultado);
		
		num1 = (Double.parseDouble(eN1.getText().toString()));
		num2 = (Double.parseDouble(eN2.getText().toString()));
		
		resultado = num1 / num2;
		
		tResultado.setText(String.valueOf(resultado));
	}
}