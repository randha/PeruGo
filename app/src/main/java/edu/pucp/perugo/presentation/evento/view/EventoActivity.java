package edu.pucp.perugo.presentation.evento.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

import edu.pucp.perugo.R;
import edu.pucp.perugo.data.entities.Evento;

public class EventoActivity extends AppCompatActivity {
    private ListView lvEventos;
    private EventoAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evento);

        lvEventos = findViewById(R.id.lvEventos);
        adaptador = new EventoAdapter(this, GetArrayEventos());

        lvEventos.setAdapter(adaptador);

    }

    private ArrayList<Evento> GetArrayEventos(){
        ArrayList<Evento> listEventos = new ArrayList<>();
        listEventos.add(new Evento(1, "Evento 1", "Descripcion 1", 1));
        listEventos.add(new Evento(2, "Evento 2", "Descripcion 2", 2));
        listEventos.add(new Evento(3, "Evento 3", "Descripcion 3", 3));
        listEventos.add(new Evento(4, "Evento 4", "Descripcion 4", 4));

        return listEventos;
    }
}
