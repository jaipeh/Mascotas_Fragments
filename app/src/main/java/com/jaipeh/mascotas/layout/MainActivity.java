package com.jaipeh.mascotas.layout;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


import com.jaipeh.mascotas.R;
import com.jaipeh.mascotas.adapter.PageAdapter;
import com.jaipeh.mascotas.fragments.MascotasFragment;
import com.jaipeh.mascotas.fragments.PerfilFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView toolbar_title = (TextView) findViewById(R.id.toolbar_titulo);
        toolbar_title.setText(R.string.txtMascotas);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        setUpViewPager();
        agregarFAB();

    }

    private ArrayList<Fragment> agregarFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new MascotasFragment());
        fragments.add(new PerfilFragment());
        return fragments;
    }

    private void setUpViewPager() {
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_perfil);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {

            case R.id.about:
                Intent a = new Intent(this, About.class);
                startActivity(a);
                break;

            case R.id.contacto:
                Intent b = new Intent(this, Contacto.class);
                startActivity(b);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void getList(View v){
        Intent intent = new Intent(MainActivity.this, SegundaPantalla.class);
        startActivity(intent);
    }

    public void agregarFAB() {
        FloatingActionButton miFAB = (FloatingActionButton) findViewById(R.id.fabArriba);
        miFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }
        );
    }
}

