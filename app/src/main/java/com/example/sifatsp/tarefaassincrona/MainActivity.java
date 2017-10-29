package com.example.sifatsp.tarefaassincrona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn_iniciar);
        textView = (TextView) findViewById(R.id.tv_contador);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciar();
            }
        });
    }



    public void iniciar(){

        ContadorTask task = new ContadorTask(button, textView);

        task.execute(10);


    }
}
