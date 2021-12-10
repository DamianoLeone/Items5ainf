package com.example.items5ainf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lvfilm;
    Button btnesci;
    String film[] = {"Spiderman", "Batman", "Titanic"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvfilm=(ListView) findViewById(R.id.listview);
        ArrayAdapter<String> aaFilm= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, film);  //simple list è un semplice modello di
        // listview(layout) e si chiama adapter perché si adatta al contenuto perché quello che ha
        // dentro lo adatta se ci sono 3 elementi ne mette tre nella list,se ce ne sono 50 ne mette 50
        lvfilm.setAdapter(aaFilm); //ultimiamo, da un errore perché bisogna andare su manifest(file xml in cui ci sono tutte le activity) e mettere android:exported="true"
        btnesci=(Button) findViewById(R.id.bottone);
        btnesci.setOnClickListener(new View.OnClickListener() { //metodo anonimo che verrà distrutto quando si esce dall'activity
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Vuoi uscire",
                        Toast.LENGTH_LONG).show(); //aggiungendo show alla fine mostro direttamente il toast senza dover spezzare in due comandi mettendo show nel secondo
            }
        });


    }
}