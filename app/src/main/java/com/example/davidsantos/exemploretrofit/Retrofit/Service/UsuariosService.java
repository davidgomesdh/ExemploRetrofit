package com.example.davidsantos.exemploretrofit.Retrofit.Service;

import com.example.davidsantos.exemploretrofit.Models.CEP;
import com.example.davidsantos.exemploretrofit.Models.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by david.santos on 08/03/2018.
 */

public interface UsuariosService {
    @GET("Usuarios")
    Call<List<Usuario>> getUsuario();
}
