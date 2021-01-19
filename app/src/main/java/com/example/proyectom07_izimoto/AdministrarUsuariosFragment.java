package com.example.proyectom07_izimoto;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.proyectom07_izimoto.databinding.FragmentAdministrarUsuariosBinding;
import com.example.proyectom07_izimoto.databinding.FragmentPaginaPrincipalProfessorBinding;
import com.example.proyectom07_izimoto.databinding.ViewholderUsuariosBinding;


public class AdministrarUsuariosFragment extends Fragment {

FragmentAdministrarUsuariosBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentAdministrarUsuariosBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        AppViewModel appViewModel = new ViewModelProvider(this).get(AppViewModel.class);

       /* appViewModel.usuarios();*/
    }
    class UsuarioViewHolder extends RecyclerView.ViewHolder {

ViewholderUsuariosBinding binding;

        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}