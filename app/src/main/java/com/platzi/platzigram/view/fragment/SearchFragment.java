package com.platzi.platzigram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.platzi.platzigram.R;
import com.platzi.platzigram.adapter.PictureAdapterRecyclerView;
import com.platzi.platzigram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor , GridLayoutManager.VERTICAL, false
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        showToolbar("", false, view);

        RecyclerView picturesRecycler = view.findViewById(R.id.pictureSearchRecycler);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);//, GridLayoutManager.VERTICAL, false
        picturesRecycler.setLayoutManager(gridLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buildPicture(), R.layout.card_view_picture, getActivity());

        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }


    public ArrayList<Picture> buildPicture(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg","Cristian Alejandro","4 dias","3"+getResources().getString(R.string.like)));
        pictures.add(new Picture("http://www.novalandtours.com/images/cambodia/cambodia.jpg","Evelyn Osuna","3 dias","10"+getResources().getString(R.string.like)));
        pictures.add(new Picture("http://www.novalandtours.com/india-tours/2.jpeg","Anahi Salgado","2 dias","1"+getResources().getString(R.string.like)));
        pictures.add(new Picture("http://www.novalandtours.com/india-tours/1.jpeg","Alejandro Quijada","1 dia","12"+getResources().getString(R.string.like)));
        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg","Cristian Alejandro","4 dias","3"+getResources().getString(R.string.like)));
        pictures.add(new Picture("http://www.novalandtours.com/images/cambodia/cambodia.jpg","Evelyn Osuna","3 dias","10"+getResources().getString(R.string.like)));
        pictures.add(new Picture("http://www.novalandtours.com/india-tours/2.jpeg","Anahi Salgado","2 dias","1"+getResources().getString(R.string.like)));
        pictures.add(new Picture("http://www.novalandtours.com/india-tours/1.jpeg","Alejandro Quijada","1 dia","12"+getResources().getString(R.string.like)));
        return  pictures;
    }
    public void showToolbar(String tittle, boolean upButton, View view) {
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}
