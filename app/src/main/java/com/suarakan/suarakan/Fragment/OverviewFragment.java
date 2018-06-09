package com.suarakan.suarakan.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.suarakan.suarakan.Activity.BantuanActivity;
import com.suarakan.suarakan.Activity.BeritaActivity;
import com.suarakan.suarakan.Activity.GuideTipsActivity;
import com.suarakan.suarakan.Activity.TPSActivity;
import com.suarakan.suarakan.SecondActivity;
import com.suarakan.suarakan.R;


public class OverviewFragment extends Fragment implements View.OnClickListener {

    private CardView cardGuideTips, cardBerita, cardDpt, cardKontak,cardTPS;
    public OverviewFragment() {
        // Required empty public constructor
    }

    public static OverviewFragment newInstance() {
        OverviewFragment fragment = new OverviewFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_overview, container, false);
        cardGuideTips = view.findViewById(R.id.card_button_guide);
        cardBerita = view.findViewById(R.id.card_button_berita);
        cardDpt = view.findViewById(R.id.card_button_dpt);
        cardKontak = view.findViewById(R.id.card_button_bantuan);
        cardTPS=view.findViewById(R.id.card_button_tps);
        cardGuideTips.setOnClickListener(this);
        cardBerita.setOnClickListener(this);
        cardDpt.setOnClickListener(this);
        cardKontak.setOnClickListener(this);
        cardTPS.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.card_button_guide:
                startActivity(GuideTipsActivity.class);
                return;
            case R.id.card_button_berita:
                startActivity(BeritaActivity.class);
                return;
            case R.id.card_button_bantuan:
                startActivity(BantuanActivity.class);
                return;
            case R.id.card_button_tps:
                startActivity(TPSActivity.class);
                return;
            case R.id.card_button_dpt:
                startActivity(SecondActivity.class);
                return;

        }
    }

    private void startActivity(Class<?> cls) {
        Intent intent =  new Intent(getContext(), cls);
        startActivity(intent);
    }
}
