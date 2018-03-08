package com.example.davidsantos.exemploretrofit.Retrofit.Service;

import com.example.davidsantos.exemploretrofit.Models.CEP;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by david.santos on 08/03/2018.
 */

public interface CEPService {
    @GET("cep/find/{cep}/json")
    Call<CEP> buscarCEP(@Path("cep") String cep);
}
