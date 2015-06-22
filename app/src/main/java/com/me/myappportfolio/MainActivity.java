package com.me.myappportfolio;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button spotify_streamer_btn = null;
    Button scores_app_btn = null;
    Button library_app_btn  = null;
    Button xyz_reader_btn = null;
    Button build_it_bigger_btn = null;
    Button capstone_btn = null;

    static int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotify_streamer_btn = (Button) findViewById(R.id.spotify_streamer_btn);
        scores_app_btn = (Button) findViewById(R.id.scores_app_btn);
        library_app_btn  = (Button)findViewById(R.id.library_app_btn);
        xyz_reader_btn = (Button)findViewById(R.id.xyz_reader_btn);
        build_it_bigger_btn = (Button)findViewById(R.id.build_it_bigger_btn);
        capstone_btn = (Button)findViewById(R.id.capstone_btn);

        spotify_streamer_btn.setOnClickListener(btnOnClickListener);
        scores_app_btn.setOnClickListener(btnOnClickListener);
        library_app_btn.setOnClickListener(btnOnClickListener);
        xyz_reader_btn.setOnClickListener(btnOnClickListener);
        build_it_bigger_btn.setOnClickListener(btnOnClickListener);
        capstone_btn.setOnClickListener(btnOnClickListener);
        }

    Button.OnClickListener btnOnClickListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {

            Button btn = (Button) v;
            String btnTxt = btn.getText().toString();
            id = v.getId();

            if(id != 0) {//reset all background colors to default color: white
                spotify_streamer_btn.setBackgroundColor(Color.WHITE);
                scores_app_btn.setBackgroundColor(Color.WHITE);
                library_app_btn.setBackgroundColor(Color.WHITE);
                xyz_reader_btn.setBackgroundColor(Color.WHITE);
                build_it_bigger_btn.setBackgroundColor(Color.WHITE);
                capstone_btn.setBackgroundColor(Color.WHITE);
            }

            btn.setBackgroundColor(Color.YELLOW);
            Toast.makeText(getApplicationContext(), "This button will launch my " + btnTxt, Toast.LENGTH_LONG).show();

           /*
            switch (id) {
                case R.id.spotify_streamer_btn:
                    spotify_streamer_btn.setBackgroundColor(Color.YELLOW);
                    Toast.makeText(getApplicationContext(), "This button will launch my spotify streamer app!", Toast.LENGTH_LONG).show();
                    break;

                case R.id.scores_app_btn:
                    scores_app_btn.setBackgroundColor(Color.YELLOW);
                    Toast.makeText(getApplicationContext(), "This button will launch my scores app!", Toast.LENGTH_LONG).show();
                    break;

                case R.id.library_app_btn:
                    library_app_btn.setBackgroundColor(Color.YELLOW);
                    Toast.makeText(getApplicationContext(), "This button will launch my library app!", Toast.LENGTH_LONG).show();
                    break;

                case R.id.xyz_reader_btn:
                    xyz_reader_btn.setBackgroundColor(Color.YELLOW);
                    Toast.makeText(getApplicationContext(), "This button will launch my XYZ reader app!", Toast.LENGTH_LONG).show();
                    break;

                case R.id.build_it_bigger_btn:
                    build_it_bigger_btn.setBackgroundColor(Color.YELLOW);
                    Toast.makeText(getApplicationContext(), "This button will launch my build-it-bigger app!", Toast.LENGTH_LONG).show();
                    break;

                case R.id.capstone_btn:
                    capstone_btn.setBackgroundColor(Color.YELLOW);
                    Toast.makeText(getApplicationContext(), "This button will launch my capstone app!", Toast.LENGTH_LONG).show();
                    break;

                default:
            }*/
        }
    };
/*
    @Override
    protected void onResume() {
        super.onResume();


    }

    @Override
    protected void onPause() {
        super.onPause();


    }*/
}
