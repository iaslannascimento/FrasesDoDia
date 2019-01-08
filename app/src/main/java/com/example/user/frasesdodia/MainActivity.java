package com.example.user.frasesdodia;

import android.support.v7.app.AppCompatActivity;
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

    public void gerarFrase(View view){
        String[] frases = {
           "Porque a vida é mágica, aproveite os milagres do dia a dia. Boa tarde!",
           "Mais importante que mostrar ao mundo que temos valores e princípios é lutar por eles, e viver diariamente sua verdade.",
           "É tempo de esquecer os problemas, jogar fora as frustrações do dia a dia e desfrutar do Carnaval em grande estilo!",
           "Sou apenas um pequeno planeta que se perde diariamente em todo o seu universo.",
           "Novas amizades serão sempre bem-vindas para darem cor e alegria ao meu dia a dia.",
           "Obrigado aos professores que lutam diariamente para que todos os seus alunos tenham a melhor educação possível!"
        };

        int n = new Random().nextInt(frases.length);
        TextView texto=(TextView) findViewById(R.id.novas);;
        texto.setText(frases[n]);



    }
}
