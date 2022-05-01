package com.example.clase3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Departamentos extends AppCompatActivity {
    Button btnRegresar;
    ListView depart;
    Integer pais;
    String[] sv= new String[]{"Ahuachapan","Sonsonate", "Santa Ana", "San Salvador", "La Libertad", "La Paz", "Cuscatlan", "Chalatenango", "San Vicente", "Cabañas", "Usulutan", "San Miguel", "Morazán", "La Unión"};
    String[] gt= new String[]{"Peten","Huehuetenango", "Quiché", "Alta Verapaz", "Baja Verapaz", "San Marcos", "Quetzaltenango", "Totonicapan", "Sololá", "Retalhuleu", "Suchitepequez", "Chimaltenango", "Sacatepequez", "Guatemala", "Escuintla", "Santa Rosa", "Jutiapa", "Jalapa", "Chiquimula", "El Progreso", "Zacapa", "Izabal"};
    String[] hn= new String[]{"Atlántida","Colón","Comayagua","Copán","Cortés","Choluteca","El Paraíso","Francisco Morazán","Gracias a Dios","Intibucá","Islas de la Bahía","La Paz","Lempira","Ocotepeque","Olancho","Santa Bárbara","Valle","Yoro"};
    String[] nic= new String[]{"Boaco", "Carazo", "Chinandega", "Chontales", "Costa Caribe Norte", "Costa Caribe Sur", "Estelí", "Granada", "Jinotega", "León", "Madrid", "Managua", "Masaya", "Matagalpa", "Nueva Segovia", "Río San Juan", "Rivas"};
    String[] cr= new String[]{"San José", "Alajuela", "Cartago", "Guanacaste", "Heredia", "Limón", "Puntarenas"};
    String[] pa= new String[]{"Panamá", "Bocas del Toro", "Chiriquí", "Coclé", "Colón", "Darién", "Herrera", "Los Santos", "Panamá Oeste", "Veraguas"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departamentos);

        btnRegresar = findViewById(R.id.btnRegresar);
        depart=findViewById(R.id.deptos);
        Bundle b=getIntent().getExtras();
        pais = b.getInt("dpt");
        ArrayAdapter<String> adapter=null;

        if(pais==1){
            adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,sv);
        }
        if(pais==2){
            adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,gt);
        }
        if(pais==3){
            adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,nic);
        }
        if(pais==4){
            adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,hn);
        }
        if(pais==5){
            adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,cr);
        }
        if(pais==6){
            adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,pa);
        }

        depart.setAdapter(adapter);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act2 = new Intent(Departamentos.this, MainActivity.class);
                startActivity(act2);
            }
        });
    }
}