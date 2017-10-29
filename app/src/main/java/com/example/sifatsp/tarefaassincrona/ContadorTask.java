package com.example.sifatsp.tarefaassincrona;

import android.os.AsyncTask;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Sifatsp on 29/10/2017.
 */

public class ContadorTask extends AsyncTask<Integer, Integer, Void> {

    private Button button;
    private TextView textView;

    public ContadorTask(Button button, TextView textView){
        this.button = button;
        this.textView = textView;
    }


    @Override
    protected Void doInBackground(Integer... params) {

        int max = params[0];

        for (int contador = max; contador >=0; contador--){

            publishProgress(contador);

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){

            }
        }
        return null;
    }


    @Override
    protected void onProgressUpdate(Integer... values) {

        int contador = values[0];

        textView.setText(String.valueOf(contador));
    }

    @Override
    protected void onPreExecute() {
        button.setEnabled(false);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        button.setEnabled(true);
    }
}
