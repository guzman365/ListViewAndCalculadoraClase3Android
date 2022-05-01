package com.example.clase3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bPunt, bDivision, bMulti, bRes, bSum, bResul;
    TextView res;
    float num1=0;
    float num2=0;
    float numero1=0;
    float result = 0;
    String operacion = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        res=findViewById(R.id.txvRes);
    }

    public void escribirUno(View view){
        num1 = Float.parseFloat(res.getText().toString());
        int temp = detectarPunto();
        if(num1==0 && temp==0){
            res.setText("1");
        }else if(temp==1){
            res.setText(res.getText()+"1");
        }else{
            res.setText(res.getText()+"1");
        }
    }
    public void escribirDos(View view){
        num1 = Float.parseFloat(res.getText().toString());
        int temp = detectarPunto();
        if(num1==0.0f && temp==0){
            res.setText("2");
        }else if(temp==1){
            res.setText(res.getText()+"2");
        }else{
            res.setText(res.getText()+"2");
        }
    }
    public void escribirTres(View view){
        num1 = Float.parseFloat(res.getText().toString());
        int temp = detectarPunto();
        if(num1==0.0f  && temp==0){
            res.setText("3");
        }else if(temp==1){
            res.setText(res.getText()+"3");
        }else{
            res.setText(res.getText()+"3");
        }
    }
    public void escribirCuatro(View view){
        num1 = Float.parseFloat(res.getText().toString());
        int temp = detectarPunto();
        if(num1==0.0f && temp==0){
            res.setText("4");
        }else if(temp==1){
            res.setText(res.getText()+"4");
        }else{
            res.setText(res.getText()+"4");
        }
    }
    public void escribirCinco(View view){
        num1 = Float.parseFloat(res.getText().toString());
        int temp = detectarPunto();
        if(num1==0.0f && temp==0){
            res.setText("5");
        }else if(temp==1){
            res.setText(res.getText()+"5");
        }else{
            res.setText(res.getText()+"5");
        }
    }
    public void escribirSeis(View view){
        num1 = Float.parseFloat(res.getText().toString());
        int temp = detectarPunto();
        if(num1==0.0f && temp==0){
            res.setText("6");
        }else if(temp==1){
            res.setText(res.getText()+"6");
        }else{
            res.setText(res.getText()+"6");
        }
    }
    public void escribirSiete(View view){
        num1 = Float.parseFloat(res.getText().toString());
        int temp = detectarPunto();
        if(num1==0.0f && temp==0){
            res.setText("7");
        }else if(temp==1){
            res.setText(res.getText()+"7");
        }else{
            res.setText(res.getText()+"7");
        }
    }
    public void escribirOcho(View view){
        num1 = Float.parseFloat(res.getText().toString());
        int temp = detectarPunto();
        if(num1==0.0f && temp==0){
            res.setText("8");
        }else if(temp==1){
            res.setText(res.getText()+"8");
        }else{
            res.setText(res.getText()+"8");
        }
    }
    public void escribirNueve(View view){
        num1 = Float.parseFloat(res.getText().toString());
        int temp = detectarPunto();
        if(num1==0.0f && temp==0){
            res.setText("9");
        }else if(temp==1){
            res.setText(res.getText()+"9");
        }else{
            res.setText(res.getText()+"9");
        }
    }
    public void escribirCero(View view){
        num1 = Float.parseFloat(res.getText().toString());
        int temp = detectarPunto();
        if(num1>0){
            res.setText(res.getText()+"0");
        }else if(temp==1){
            res.setText(res.getText()+"0");
        }else{
            res.setText(res.getText()+"0");
        }
    }
    public void escribirPunto(View view){
        int temp = detectarPunto();
        if(temp==0){
            res.setText(res.getText()+".");
        }
    }

    public int detectarPunto(){
        String temp= res.getText().toString();
        char[]vector = temp.toCharArray();
        String punto = ".";
        int senal=0;
        for(int i=0;i<temp.length();i++){
            String buscar = String.valueOf(vector[i]);
            if(punto.equalsIgnoreCase(buscar)){
                senal=1;
            }
        }
        return senal;
    }

    public void limpiar(View view){
        res.setText("0");
        num1=0.0f;
        num2=0.0f;
        numero1=0.0f;
        operacion="";
    }

    public void operacionDividir(View view){
        numero1= Float.parseFloat(res.getText().toString());
        operacion = "/";
        res.setText("0");
    }
    public void operacionMultiplicar(View view){
        numero1= Float.parseFloat(res.getText().toString());
        operacion = "*";
        res.setText("0");
    }
    public void operacionSumar(View view){
        numero1= Float.parseFloat(res.getText().toString());
        operacion = "+";
        res.setText("0");
    }
    public void operacionRestar(View view){
        numero1= Float.parseFloat(res.getText().toString());
        operacion = "-";
        res.setText("0");
    }

    public void resultado(View view){
        num2 = Float.parseFloat(res.getText().toString());

        if(operacion.equals("/")){
            if(num2==0.0f){
                res.setText("0");
                Toast.makeText(this, "Operacion no valida", Toast.LENGTH_LONG).show();
            }else{
                result = numero1/num2;
                res.setText(result+"");
            }
        }else if(operacion.equals("*")){
            result = numero1*num2;
            res.setText(result+"");
        }else if(operacion.equals("-")){
            result = numero1-num2;
            res.setText(result+"");
        }else if(operacion.equals("+")){
            result = numero1+num2;
            res.setText(result+"");
        }

        num1=0.0f;
        num2=0.0f;
        numero1=0.0f;
        result = 0;
        operacion="";
    }
}