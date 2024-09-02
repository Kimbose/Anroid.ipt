package com.example.tradehelp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        ImageView download= findViewById(R.id.download);
        ImageView account= findViewById(R.id.account);
        ImageView browser= findViewById(R.id.browser);
        ImageView post= findViewById(R.id.post);
        ImageView update= findViewById(R.id.update);
        ImageView chat= findViewById(R.id.chat);
        ImageView change= findViewById(R.id.change);


        download.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, downloadActivity.class);
            startActivity(intent);
        });
        account.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, accountActivity.class);
            startActivity(intent);
        });
        browser.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, browserActivity.class);
            startActivity(intent);
        });
        post.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, postActivity.class);
            startActivity(intent);
        });
        update.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, updateActivity
                    .class);
            startActivity(intent);
        });
        chat.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, chatActivity
                    .class);
            startActivity(intent);
        });
        change.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, changeActivity
                    .class);
            startActivity(intent);
        });
    }
}