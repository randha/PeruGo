package edu.pucp.perugo.presentation.evento.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import edu.pucp.perugo.R;
import edu.pucp.perugo.data.entities.Evento;

public class EventoAdapter extends BaseAdapter {
    private ArrayList<Evento> listEventos;
    private Context context;

    public EventoAdapter(Context context, ArrayList<Evento> listEventos) {
        this.context = context;
        this.listEventos = listEventos;
    }

    @Override
    public int getCount() {
        return listEventos.size();
    }

    @Override
    public Object getItem(int position) {
        return listEventos.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Evento evento = (Evento) getItem(position);

        view = LayoutInflater.from(context).inflate(R.layout.evento, null);
        ImageView imgPhoto = (ImageView)view.findViewById(R.id.imgFoto);
        TextView tvTitulo = view.findViewById(R.id.tvTitulo);
        TextView tvContenido = view.findViewById(R.id.tvContenido);

        imgPhoto.setImageResource(evento.getIdImagen());
        tvTitulo.setText(evento.getTitulo());
        tvContenido.setText(evento.getDescripcion());

        return view;
    }
}
