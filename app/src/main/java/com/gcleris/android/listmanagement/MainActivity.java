package com.gcleris.android.listmanagement;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new MyAdapter(this, getItems()));
    }

    private ArrayList<Item> getItems() {
        ArrayList<Item> items = new ArrayList<>();
        Item i = new Item(1, 5, 1, "Moutarde", false, false, true);
        items.add(i);

        i = new Item(2, 5, 1, "Lait", false, false, true);
        items.add(i);

        i = new Item(3, 5, 1, "Poulet", true, false, false);
        items.add(i);

        i = new Item(4, 2, 1, "Porc", true, false, false);
        items.add(i);

        i = new Item(5, 1, 1, "Steak", false, false, false);
        items.add(i);

        i = new Item(6, 4, 1, "Jus", true, false, true);
        items.add(i);

        i = new Item(7, 1, 1, "Pommes", true, false, true);
        items.add(i);

        i = new Item(8, 3, 1, "Liqueur", true, false, false);
        items.add(i);

        i = new Item(9, 4, 1, "Brochettes de poulet", true, false, false);
        items.add(i);

        i = new Item(10, 2, 1, "Brochettes de porc", true, false, false);
        items.add(i);

        i = new Item(4, 2, 1, "Lait de soya au chocolat", true, false, false);
        items.add(i);

        i = new Item(2, 5, 1, "Lait", false, false, false);
        items.add(i);

        i = new Item(3, 5, 1, "Poulet", true, false, false);
        items.add(i);

        i = new Item(4, 2, 1, "Porc", true, false, false);
        items.add(i);

        i = new Item(5, 1, 1, "Steak", false, false, false);
        items.add(i);

        i = new Item(6, 4, 1, "Jus", true, false, true);
        items.add(i);

        i = new Item(7, 1, 1, "Pommes", true, false, true);
        items.add(i);

        i = new Item(8, 3, 1, "Liqueur", true, false, true);
        items.add(i);

        i = new Item(9, 4, 1, "Brochettes de poulet", true, false, false);
        items.add(i);

        i = new Item(10, 2, 1, "Brochettes de porc", true, false, false);
        items.add(i);

        i = new Item(4, 2, 1, "Lait de soya au chocolat", true, false, false);
        items.add(i);

        return items;
    }
}
