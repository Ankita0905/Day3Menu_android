package com.example.day3menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_add=findViewById(R.id.button_menu);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerForContextMenu(btn_add);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mMenuInflator=getMenuInflater();
        mMenuInflator.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action_add:
                Toast.makeText(MainActivity.this,"Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_edit:
                Toast.makeText(MainActivity.this,"Edit",Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            MenuInflater mMenuInflator=getMenuInflater();
            mMenuInflator.inflate(R.menu.menu_main,menu);
            super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action_add:
                Toast.makeText(MainActivity.this,"cAdd",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_edit:
                Toast.makeText(MainActivity.this,"cEdit",Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onContextItemSelected(item);
    }
}
