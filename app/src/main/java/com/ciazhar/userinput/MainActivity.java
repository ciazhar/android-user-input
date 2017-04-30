package com.ciazhar.userinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNama;
    RadioGroup rbgSatu;
    RadioGroup rbgDua;
    RadioButton rbNaruto;
    RadioButton rbSakura;
    RadioButton rbWahyu;
    RadioButton rbIav;
    TextView cvJawabanSatu;
    TextView cvJawabanDua;
    TextView cvNilai;
    Button btnSubmit;
    TextView cvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = (EditText) findViewById(R.id.edit_nama);
        rbgSatu = (RadioGroup) findViewById(R.id.rbgsatu);
        rbgDua = (RadioGroup) findViewById(R.id.rbgdua);
        rbNaruto = (RadioButton) findViewById(R.id.rbnaruto);
        rbSakura = (RadioButton) findViewById(R.id.rbsakura);
        rbWahyu = (RadioButton) findViewById(R.id.rbkapankapan);
        rbIav = (RadioButton) findViewById(R.id.rbkapankapan2);
        cvNama = (TextView)findViewById(R.id.cvnama);
        cvJawabanSatu = (TextView) findViewById(R.id.cvjawabansatu);
        cvJawabanDua = (TextView)findViewById(R.id.cvjawabandua);
        cvNilai = (TextView)findViewById(R.id.cvnilai);
        btnSubmit = (Button)findViewById(R.id.buttonSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses();
            }
        });

    }
    public void proses() {
        String Nama = edtNama.getText().toString();
        cvNama.setText(Nama);
        if (rbNaruto.isChecked()) {
            cvJawabanSatu.setText("benar");
        } else {
            cvJawabanSatu.setText("salah");
        }
        if (rbWahyu.isChecked()) {
            cvJawabanDua.setText("benar");
        } else {
            cvJawabanDua.setText("salah");
        }
        if (rbNaruto.isChecked() && rbWahyu.isChecked()) {
            cvNilai.setText("100");
        } else if (rbNaruto.isChecked() || rbWahyu.isChecked()) {
            cvNilai.setText("50");
        } else {
            cvNilai.setText("0");
        }
    }
}
