package com.example.davidsantos.exemploretrofit.Retrofit;

import com.example.davidsantos.exemploretrofit.Retrofit.Service.CEPService;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by david.santos on 08/03/2018.
 */

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder().baseUrl("http://ws.matheuscastiglioni.com.br/ws/")
        .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }
    public CEPService getCEPService() {
        return this.retrofit.create(CEPService.class);
    }

}
