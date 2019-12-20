package br.com.blimas.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = frases();
        int escolherFrase = escolherNumeros(frases);
        exibirFrase(frases[escolherFrase]);

    }

    private void exibirFrase(String frase) {
        TextView fraseGerada = findViewById(R.id.frase_gerada);
        fraseGerada.setText(frase);
    }

    private int escolherNumeros(String[] frases) {
        return new Random().nextInt(frases.length);
    }

    private String[] frases() {
        return new String[]{
                    "Frase motivacional 01",
                    "Frase motivacional 02",
                    "Frase motivacional 03",
                    "Frase motivacional 04",
                    "Frase motivacional 05"
            };
    }

}
