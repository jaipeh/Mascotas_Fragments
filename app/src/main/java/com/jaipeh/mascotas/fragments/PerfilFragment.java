package com.jaipeh.mascotas.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jaipeh.mascotas.pojo.Mascota;
import com.jaipeh.mascotas.R;
import com.jaipeh.mascotas.adapter.MascotaAdaptador;

import java.util.ArrayList;

public class PerfilFragment extends Fragment {

    ArrayList<Mascota> miMascota;
    private RecyclerView fotosMiMascota;


    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_perfil, container, false);

        fotosMiMascota = (RecyclerView) view.findViewById(R.id.recyclerFragmentMiMascota);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        fotosMiMascota.setLayoutManager(gridLayoutManager);

        inicializarListaMiMascota();
        inicializarAdaptador();

        // Inflate the layout for this fragment
        return view;
    }

    public void inicializarListaMiMascota(){

        miMascota = new ArrayList<Mascota>();

        miMascota.add(new Mascota(R.drawable.gato1, "5"));
        miMascota.add(new Mascota(R.drawable.gato2, "3"));
        miMascota.add(new Mascota(R.drawable.gato3, "9"));
        miMascota.add(new Mascota(R.drawable.gato4, "1"));
        miMascota.add(new Mascota(R.drawable.gato5, "8"));
        miMascota.add(new Mascota(R.drawable.gato6, "6"));
    }


    public void inicializarAdaptador(){

        MascotaAdaptador adaptador = new MascotaAdaptador(miMascota, getActivity());
        fotosMiMascota.setAdapter(adaptador);

    }

}
