package com.suarakan.suarakan.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.suarakan.suarakan.R;

public class TPSActivity extends AppCompatActivity {
    private Button buttonCari;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tps);
        buttonCari=(Button)findViewById(R.id.button_cari);

        buttonCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(TPSActivity.this,HasilTPSActivity.class);
                startActivity(intent);
            }
        });
    }
}
