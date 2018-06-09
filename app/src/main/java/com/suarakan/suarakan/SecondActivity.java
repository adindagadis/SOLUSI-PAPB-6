package com.suarakan.suarakan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.suarakan.suarakan.Bantul;
import com.suarakan.suarakan.Gunungkidul;
import com.suarakan.suarakan.Kulonprogo;
import com.suarakan.suarakan.R;
import com.suarakan.suarakan.Sleman;
import com.suarakan.suarakan.Yogya;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView bantul;
    private CardView gunungkidul;
    private CardView kulonprogo;
    private CardView sleman;
    private CardView jogja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        bantul = findViewById(R.id.button_bantul);
        gunungkidul = findViewById(R.id.button_gunungkidul);
        kulonprogo = findViewById(R.id.button_kulonprogo);
        sleman = findViewById(R.id.button_sleman);
        jogja = findViewById(R.id.button_jogja);

        bantul.setOnClickListener(this);
        gunungkidul.setOnClickListener(this);
        kulonprogo.setOnClickListener(this);
        sleman.setOnClickListener(this);
        jogja.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent i ;

        switch (view.getId()) {
            case R.id.button_bantul:
                i = new Intent(this,Bantul.class);
                startActivity(i);
                break;
            case R.id.button_gunungkidul:
                i = new Intent(this,Gunungkidul.class);
                startActivity(i);
                break;
            case R.id.button_kulonprogo:
                i = new Intent(this,Kulonprogo.class);
                startActivity(i);
                break;
            case R.id.button_sleman:
                i = new Intent(this,Sleman.class);
                startActivity(i);
                break;
            case R.id.button_jogja:
                i = new Intent(this,Yogya.class);
                startActivity(i);
                break;
        }
    }
}
