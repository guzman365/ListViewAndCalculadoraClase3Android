package com.example.clase3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView paises;
    String[] valores = new String[]{"El Salvador","Guatemala","Nicaragua","Honduras","Costa Rica", "Panama"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paises=findViewById(R.id.lsvPaises);

        ArrayAdapter<String> adapter;

        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, valores);

        paises.setAdapter(adapter);

        paises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Usted Presiono"+(int)(i+1),Toast.LENGTH_SHORT);
                Intent depto = new Intent(MainActivity.this,Departamentos.class);
                depto.putExtra("dpt",(i+1));
                startActivity(depto);
            }
        });
    }
}