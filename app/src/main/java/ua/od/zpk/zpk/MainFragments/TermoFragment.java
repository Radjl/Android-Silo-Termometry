package ua.od.zpk.zpk.MainFragments;


import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ua.od.zpk.zpk.Adapters.TermoAdapter;
import ua.od.zpk.zpk.Pojo.SilKorpus;
import ua.od.zpk.zpk.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TermoFragment extends Fragment {

SilKorpus silKorpus = new SilKorpus();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(
                R.layout.recyles, container, false);

        silKorpus.initializr();
        TermoAdapter termoAdapter = new TermoAdapter(silKorpus.getSilKorpusList());
        recyclerView.setAdapter(termoAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return recyclerView;

    }

}

