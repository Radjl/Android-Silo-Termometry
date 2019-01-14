package ua.od.zpk.zpk.Interfaces;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import ua.od.zpk.zpk.Pojo.AuthRespsonse;
import ua.od.zpk.zpk.Pojo.LoginData;

public interface ServerAPI {

   // @GET("getOrder")
   // Order getOrder(long orderId);

    @POST("Authenticate")
    Call<AuthRespsonse> Authenticate(@Body LoginData loginData);


}
