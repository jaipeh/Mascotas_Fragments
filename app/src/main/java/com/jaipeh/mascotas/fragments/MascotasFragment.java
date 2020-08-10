package com.jaipeh.mascotas.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jaipeh.mascotas.pojo.Mascota;
import com.jaipeh.mascotas.R;
import com.jaipeh.mascotas.adapter.MascotaAdaptador;

import java.util.ArrayList;

public class MascotasFragment extends Fragment {

    private RecyclerView listMascotas;
    ArrayList<Mascota> mascotas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(R.layout.fragment_mascotas, container, false);

        listMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listMascotas.setLayoutManager(llm);

        initMascotas();
        inicilizarAdaptador();

        return v;
    }

    private void inicilizarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        listMascotas.setAdapter(adaptador);
    }

    public void initMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(1,"Chester",R.drawable.gato,"2"));
        mascotas.add(new Mascota(1,"Daysi",R.drawable.pez,"4"));
        mascotas.add(new Mascota(1,"Caty",R.drawable.vaca,"5"));
        mascotas.add(new Mascota(1,"Coto",R.drawable.loro,"6"));
        mascotas.add(new Mascota(1,"Perry",R.drawable.perro,"8"));
        mascotas.add(new Mascota(1,"Tuly",R.drawable.jirafa,"0"));
        mascotas.add(new Mascota(1,"Gonza",R.drawable.leon,"5"));
        mascotas.add(new Mascota(1,"Pingu",R.drawable.pinguino,"1"));
        mascotas.add(new Mascota(1,"Pepa",R.drawable.cerdo,"5"));
        mascotas.add(new Mascota(1,"Rabby",R.drawable.conejo,"9"));
    }
}
