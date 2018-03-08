package com.example.davidsantos.exemploretrofit.Retrofit;

import com.example.davidsantos.exemploretrofit.Retrofit.Service.UsuariosService;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by david.santos on 08/03/2018.
 */

public class ManicureAppRetrofitConfig {

    private final Retrofit retrofit;

    public ManicureAppRetrofitConfig() {
        this.retrofit = new Retrofit.Builder().baseUrl("http://localhost:34074/api/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }
    public UsuariosService getUsuarioService() {
        return this.retrofit.create(UsuariosService.class);
    }
}
