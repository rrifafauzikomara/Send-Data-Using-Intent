package com.example.rrifafauzikomara.kuizmodifikasiintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class KuizModifikasiIntent extends AppCompatActivity implements
        View.OnClickListener {

    EditText nama, npm, email, nohp;
    RadioGroup rg;
    CheckBox cb1, cb2, cb3, cb4;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuiz_modifikasi_intent);

        findAllViewsId();
        btn1.setOnClickListener(this);
    }
    private void findAllViewsId() {
        btn1 = (Button) findViewById(R.id.button1);
        nama = (EditText) findViewById(R.id.editText5);
        npm = (EditText) findViewById(R.id.editText6);
        email = (EditText) findViewById(R.id.editText7);
        nohp = (EditText) findViewById(R.id.editText8);
        rg = (RadioGroup) findViewById(R.id.radio);
    }
    @Override
    public void onClick(View v) {

        cb1 = (CheckBox) findViewById(R.id.checkBox);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        cb4 = (CheckBox) findViewById(R.id.checkBox4);

        String a = "";
        if (cb1.isChecked()) {
            a = a + "Traveling\n";
        }
        if (cb2.isChecked()) {
            a = a + "Baca\n";
        }
        if (cb3.isChecked()) {
            a = a + "Main Game\n";
        }
        if (cb4.isChecked()) {
            a = a + "Memasak\n";
        }

        Intent intent = new Intent(getApplicationContext(),
                KirimDataIntent.class);


//Membuat obyek bundle
        Bundle b = new Bundle();
//Menyisipkan tipe data String ke dalam obyek bundle
        b.putString("nama", nama.getText().toString());
        b.putString("npm", npm.getText().toString());
        b.putString("email", email.getText().toString());
        b.putString("nohp", nohp.getText().toString());
        int id = rg.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(id);
        b.putString("jeniskelamin", radioButton.getText().toString());
        b.putString("hobby", a);
//Menambahkan bundle intent
        intent.putExtras(b);
//memulai Activity kedua
        startActivity(intent);

    }
}
