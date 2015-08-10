package com.example.andres_bonilla.calculadora;

import android.app.SearchManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements OnClickListener {

    Button btnCero,btnUno,btnDos,btnTres,btnCuatro,btnCinco,btnSeis,btnSiete,btnOcho, btnNueve, btnSuma,btnResta
            , btnDivision, btnMulti, btnIgual, btnAC, btnCE;

    boolean suma=false;
    boolean resta=false;
    boolean multi=false;
    boolean div=false;
    Double[] num = new Double[10];
    double result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCero= (Button)findViewById(R.id.cero);
        btnCero.setOnClickListener(this);

        btnUno= (Button)findViewById(R.id.uno);
        btnUno.setOnClickListener(this);

        btnDos= (Button)findViewById(R.id.dos);
        btnDos.setOnClickListener(this);

        btnTres= (Button)findViewById(R.id.tres);
        btnTres.setOnClickListener(this);

        btnCuatro= (Button)findViewById(R.id.cuatro);
        btnCuatro.setOnClickListener(this);

        btnCinco= (Button)findViewById(R.id.cinco);
        btnCinco.setOnClickListener(this);

        btnSeis= (Button)findViewById(R.id.seis);
        btnSeis.setOnClickListener(this);

        btnSiete= (Button)findViewById(R.id.siete);
        btnSiete.setOnClickListener(this);

        btnOcho= (Button)findViewById(R.id.ocho);
        btnOcho.setOnClickListener(this);

        btnNueve= (Button)findViewById(R.id.nueve);
        btnNueve.setOnClickListener(this);

        btnSuma= (Button)findViewById(R.id.suma);
        btnSuma.setOnClickListener(this);

        btnResta= (Button)findViewById(R.id.resta);
        btnResta.setOnClickListener(this);

        btnMulti= (Button)findViewById(R.id.multi);
        btnMulti.setOnClickListener(this);

        btnDivision= (Button)findViewById(R.id.division);
        btnDivision.setOnClickListener(this);

        btnAC= (Button)findViewById(R.id.AC);
        btnAC.setOnClickListener(this);

        btnCE= (Button)findViewById(R.id.CE);
        btnCE.setOnClickListener(this);

        btnIgual= (Button)findViewById(R.id.igual);
        btnIgual.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        TextView entrada = (TextView)findViewById(R.id.entrada);
        TextView anterior= (TextView)findViewById(R.id.anterior);
        int seleccion = v.getId();
        String ant = entrada.getText().toString();
        String pos=anterior.getText().toString();

        try{
            switch (seleccion){

                case R.id.cero:
                    anterior.setText(pos+btnCero.getText().toString());
                    entrada.setText(btnCero.getText().toString());
                    break;

                case R.id.uno:
                    anterior.setText(pos+btnUno.getText().toString());
                    entrada.setText(btnUno.getText().toString());
                    break;

                case R.id.dos:
                    anterior.setText(pos+btnDos.getText().toString());
                    entrada.setText(btnDos.getText().toString());
                    break;

                case R.id.tres:
                    anterior.setText(pos+btnTres.getText().toString());
                    entrada.setText(btnTres.getText().toString());
                    break;

                case R.id.cuatro:
                    anterior.setText(pos+btnCuatro.getText().toString());
                    entrada.setText(btnCuatro.getText().toString());
                    break;

                case R.id.cinco:
                    anterior.setText(pos+btnCinco.getText().toString());
                    entrada.setText(btnCinco.getText().toString());
                    break;

                case R.id.seis:
                    anterior.setText(pos+btnSeis.getText().toString());
                    entrada.setText(btnSeis.getText().toString());
                    break;

                case R.id.siete:
                    anterior.setText(pos+btnSiete.getText().toString());
                    entrada.setText(btnSiete.getText().toString());
                    break;

                case R.id.ocho:
                    anterior.setText(pos+btnOcho.getText().toString());
                    entrada.setText(btnOcho.getText().toString());
                    break;

                case R.id.nueve:
                    anterior.setText(pos+btnNueve.getText().toString());
                    entrada.setText(btnNueve.getText().toString());
                break;

                case R.id.suma:
                    anterior.setText(pos+btnSuma.getText().toString());
                    entrada.setText("");
                    suma=true;
                    num[0]= Double.parseDouble(ant);
                    break;

                case R.id.resta:
                    anterior.setText(pos+btnResta.getText().toString());
                    entrada.setText("");
                    resta=true;
                    num[0]= Double.parseDouble(ant);

                    break;

                case R.id.multi:
                    anterior.setText(pos+btnMulti.getText().toString());
                    entrada.setText("");
                    multi=true;
                    num[0]= Double.parseDouble(ant);
                    break;

                case R.id.division:
                    anterior.setText(pos+btnDivision.getText().toString());
                    entrada.setText("");
                    div=true;
                    num[0]= Double.parseDouble(ant);
                    break;

                case R.id.igual:

                   num[1]=Double.parseDouble(ant);

                    if(suma){
                        result= num[0] + num[1];
                        entrada.setText(String.valueOf(result));
                    }
                    else if(resta){
                        result=num[0]- num[1];
                        entrada.setText(String.valueOf(result));
                    }
                    else if(multi){
                        result=num[0]* num[1];
                        entrada.setText(String.valueOf(result));
                    }
                    else if(div){
                        result=num[0]/num[1];
                        entrada.setText(String.valueOf(result));
                    }

                    suma=false;
                    resta=false;
                    multi=false;
                    div=false;
                    break;

                case R.id.AC:
                    entrada.setText("");
                    anterior.setText("");
                    break;

                case R.id.CE:
                    break;

            }
        }catch (Exception e){
            entrada.setText("Error");
        }


    }
}
