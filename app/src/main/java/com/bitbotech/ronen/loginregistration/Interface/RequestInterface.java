package com.bitbotech.ronen.loginregistration.Interface;

import com.bitbotech.ronen.loginregistration.Model.ServerRequest;
import com.bitbotech.ronen.loginregistration.Model.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by ronen on 09/07/2017.
 */

public interface RequestInterface {

    @POST("API/")
    Call<ServerResponse> operation(@Body ServerRequest request);
}
