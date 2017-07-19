package com.example.david.musicalstructure;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class TracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView AlbumsImageView = (ImageView) findViewById(R.id.button_albums);
        ImageView PlayListImageView = (ImageView) findViewById(R.id.button_playlist);
        ImageView PaymentImageView = (ImageView) findViewById(R.id.button_payment);
        /*
          Set onClick events for all Activities
         */
        AlbumsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TracksActivity.this, AlbumsActivity.class);
                startActivity(intent);
            }
        });
        PlayListImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TracksActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });
        PaymentImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TracksActivity.this, PaymentActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finishAffinity();
        return true;
    }
}
