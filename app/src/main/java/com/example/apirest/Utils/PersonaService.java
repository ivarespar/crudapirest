package com.example.apirest.Utils;

import com.example.apirest.Model.Persona;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PersonaService {

    @GET("listar")
    Call<List<Persona>> getPersonas();
}
