package com.lidersupremo.frases;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void novaFrase(View view){
        String[] frases = {
                "Meu professor é nosso Líder Supremo!",
                "O Ricas é nosso Líder Supremo!",
                "Essa turma é a melhor turma do Senac",
                "Quando teremos pizza?",
                "Essa turma é uma turma Suprema!",
                "As polstronas de massagem do nosso Líder Supremo são da marca Suprema Plus!"};
        int indice = (int) (Math.random() * frases.length);

        TextView texto = findViewById(R.id.texto);
        texto.setText(frases[indice]);


        TextView numero = findViewById(R.id.numero);
        numero.setText(String.valueOf(indice));

    }
}