package com.example.rrifafauzikomara.kuizmodifikasiintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class KirimDataIntent extends AppCompatActivity {

    TextView nama, npm, email, nohp, jeniskelamin, hobby ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kirim_data_intent);



        Bundle b = getIntent().getExtras();
//membuat obyek dari widget textview
        nama = (TextView) findViewById(R.id.namaValue);
        npm = (TextView) findViewById(R.id.npmValue);
        email = (TextView) findViewById(R.id.emailValue);
        nohp = (TextView) findViewById(R.id.nohpValue);
        jeniskelamin = (TextView) findViewById(R.id.jeniskelaminValue);
        hobby = (TextView) findViewById(R.id.hobyValue);

//menset nilai dari widget textview
        nama.setText(b.getCharSequence("nama"));
        npm.setText(b.getCharSequence("npm"));
        email.setText(b.getCharSequence("email"));
        nohp.setText(b.getCharSequence("nohp"));
        jeniskelamin.setText(b.getCharSequence("jeniskelamin"));
        hobby.setText(b.getCharSequence("hobby"));

    }
}
