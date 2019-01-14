package ua.od.zpk.zpk.MainFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ua.od.zpk.zpk.Interfaces.ServerAPI;
import ua.od.zpk.zpk.Pojo.AuthRespsonse;
import ua.od.zpk.zpk.Pojo.LoginData;
import ua.od.zpk.zpk.R;

import static android.support.constraint.Constraints.TAG;

/**
 * A simple {@link Fragment} subclass.
 */
public class DoorsFragment extends Fragment {


   private static final String BASE_URL = "http://192.168.61.69:40001/json/";
  // private static final String BASE_URL = "http://10.100.100.254:40001/json/";

    public DoorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_doors, container, false);


        Button btnLogin = view.findViewById(R.id.login);
        final EditText editText = view.findViewById(R.id.LogINText);
        final EditText editText2 = view.findViewById(R.id.PasswordText);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = editText.getText().toString();
                String password = editText2.getText().toString();

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                ServerAPI serverAPI = retrofit.create(ServerAPI.class);


                LoginData data = new LoginData();
                data.setUserName("admin");
                String hash = MD5_Hash(MD5_Hash(MD5_Hash("merka4").toUpperCase() + "F593B01C562548C6B7A31B30884BDE53").toUpperCase().toUpperCase());
                System.out.println(hash);
                data.setPasswordHash(hash.toUpperCase());
                Call<AuthRespsonse> call = serverAPI.Authenticate(data);





                call.enqueue(new Callback<AuthRespsonse>() {
                    @Override
                    public void onResponse(Call<AuthRespsonse> call, Response<AuthRespsonse> response) {
                        Log.d(TAG,"onResponse: Server Response: " +response.toString());



                        Log.d(TAG,"onResponse: Server Response: " +response.body().toString());
                        Log.d(TAG,"onResponse: Server Response: " +response.body().getClass());



                    }

                    @Override
                    public void onFailure(Call<AuthRespsonse> call, Throwable t) {
                        Log.e(TAG, "onFailure: Something went wrong: " + t.getMessage() );
                        Toast.makeText(getActivity(), "Something went wrong ", Toast.LENGTH_SHORT).show();
                    }
                });
            }


        });
        return view;
        }

    public static String MD5_Hash(String s) {
        MessageDigest m = null;

        try {
            m = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        m.update(s.getBytes(),0,s.length());
        String hash = new BigInteger(1, m.digest()).toString(16);
        return hash;
}}
