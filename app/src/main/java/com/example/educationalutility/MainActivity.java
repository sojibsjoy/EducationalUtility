package com.example.educationalutility;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder alb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(MainActivity.this);
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.aboutUsItem) {
            Toast.makeText(MainActivity.this,"About Us",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.exitItem) {
            Toast.makeText(MainActivity.this,"Exit",Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        alb.setTitle(R.string.alb_title);
        alb.setMessage(R.string.alb_message);
        alb.setIcon(R.drawable.question);
        alb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Application closed",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        alb.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                Toast.makeText(MainActivity.this,"Thank you",Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog ald = alb.create();
        ald.show();
    }
    private void add() {
        int i = 11;
        int ii = 22;
        int iii = i + ii;
    }
}
