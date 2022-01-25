package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText objPeso, objAltura;
        Button btCalcular;
        Float peso;
        Float altura;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // Associa os objetos da View
            objPeso = findViewById(R.id.editPeso);
            objAltura = findViewById(R.id.editAltura);

            btCalcular = findViewById(R.id.btCalcular);
            btCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    // Atribui os valores informados às variáveis
                    peso = Float.parseFloat(objPeso.getText().toString());
                    altura = Float.parseFloat(objAltura.getText().toString());

                    Intent it = new Intent(getApplicationContext(), SegundaActivity.class);
                    Bundle dados = new Bundle();

                    // Insere os dados no Bundle para enviar à próxima activity
                    dados.putFloat("peso", peso);
                    dados.putDouble("altura", altura);

                    it.putExtras(dados);

                    startActivity(it);
                }
            });
        }
    }


}
}
