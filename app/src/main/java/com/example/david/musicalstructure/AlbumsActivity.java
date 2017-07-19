package com.example.david.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView TracksImageView = (ImageView) findViewById(R.id.button_tracks);
        ImageView PlayListImageView = (ImageView) findViewById(R.id.button_playlist);
        ImageView PaymentImageView = (ImageView) findViewById(R.id.button_payment);
        /*
          Set onClick events for all Activities
         */
        TracksImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlbumsActivity.this, TracksActivity.class);
                startActivity(intent);
            }
        });
        PlayListImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlbumsActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });
        PaymentImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlbumsActivity.this, PaymentActivity.class);
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
