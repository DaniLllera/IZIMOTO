package com.example.proyectom07_izimoto;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.proyectom07_izimoto.databinding.FragmentPermisoMotoBinding;
import com.example.proyectom07_izimoto.databinding.FragmentTestTemasBinding;


public class TestTemasFragment extends Fragment {

    FragmentTestTemasBinding binding;
    private NavController navController;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentTestTemasBinding.inflate(inflater, container, false)).getRoot();
    }

}