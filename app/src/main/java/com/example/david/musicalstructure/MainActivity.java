package com.example.david.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private boolean paused = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView tracksImageView = (ImageView) findViewById(R.id.button_tracks);
        ImageView albumsImageView = (ImageView) findViewById(R.id.button_albums);
        ImageView playListImageView = (ImageView) findViewById(R.id.button_playlist);
        TextView playListTextView = (TextView) findViewById(R.id.playlist_name);
        ImageView paymentImageView = (ImageView) findViewById(R.id.button_payment);
        final ImageView playImageView = (ImageView) findViewById(R.id.button_play);
        /*
          Set onClick events for all Activities
         */
        tracksImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TracksActivity.class);
                startActivity(intent);
            }
        });

        albumsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(intent);
            }
        });

        playListImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startPlaylist();
            }
        });

        playListTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startPlaylist();
            }
        });

        paymentImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(intent);
            }
        });

        playImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (paused) {
                    paused = false;
                    playImageView.setImageResource(R.drawable.playbutton);
                } else {
                    paused = true;
                    playImageView.setImageResource(R.drawable.pausebutton);
                }
            }
        });
    }

    private void startPlaylist() {
        Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
        startActivity(intent);
    }
}
