package com.example.proyectom07_izimoto;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.proyectom07_izimoto.databinding.FragmentTestOficialesDGTBinding;
import com.example.proyectom07_izimoto.databinding.FragmentTestOficialesDGTTiempoBinding;



public class TestOficialesDGTTiempoFragment extends Fragment {

    FragmentTestOficialesDGTTiempoBinding binding;
    private NavController navController;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentTestOficialesDGTTiempoBinding.inflate(inflater, container, false)).getRoot();
    }
}