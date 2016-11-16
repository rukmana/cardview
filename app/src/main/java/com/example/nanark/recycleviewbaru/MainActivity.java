package com.example.nanark.recycleviewbaru;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView rvlist;
    List<Person> person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvlist = (RecyclerView) findViewById(R.id.rvlist);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvlist.setLayoutManager(llm);
        rvlist.setHasFixedSize(true);

        /*GridLayoutManager glm = new GridLayoutManager(this, 2);
        rv.setLayoutManager(glm);
        rv.setHasFixedSize(true);*/

        initializeData();
        initializeAdapter();
    }


    private void initializeData() {
        person = new ArrayList<>();
        person.add(new Person("Curug", "Curug cangkring terletak di Desa Jelekong Kecamatan Baleendah Kabupaten Bandung", R.drawable.curug1));
        person.add(new Person("Galery Wayang", "35 years old", R.drawable.galeriwayang1));
        person.add(new Person("Gentong", "23 years old", R.drawable.gentong1));
        person.add(new Person("Lukisan", "25 years old", R.drawable.lukisan));
        person.add(new Person("Padepokan", "23 years old", R.drawable.pesantern1));
        person.add(new Person("Dalang", "25 years old", R.drawable.senimendalang1));
        person.add(new Person("Singa Depok", "35 years old", R.drawable.singadepok1));
        person.add(new Person("Tokoh Pewayangan", "23 years old", R.drawable.tokohwayang1));

    }

    private void initializeAdapter() {
        Main2Activity a_RecycleView = new Main2Activity(this, person);
        rvlist.setAdapter(a_RecycleView);
    }

}
