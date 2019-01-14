package ua.od.zpk.zpk;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import ua.od.zpk.zpk.Adapters.SilosDetailAdapter;
import ua.od.zpk.zpk.Interfaces.OnItemClickListener;
import ua.od.zpk.zpk.Pojo.Silos;

public class SilosDetail extends AppCompatActivity {
    ProgressDialog mProgressBar;
    RecyclerView recyclerView;
    SilosDetailAdapter detailAdapter;
    LaptopServer server = null;
    HashMap<String,ArrayList> dataset5 = new HashMap<String,ArrayList>();
    HashMap<String,ArrayList> dataset1 = new HashMap<>();
    HashMap<String,ArrayList> dataset2 = new HashMap<>();
    HashMap<String,ArrayList> dataset3 = new HashMap<>();
    Silos silos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silos_detail);

        Intent intent = getIntent();
        mProgressBar = new ProgressDialog(this);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view1);
        recyclerView.setHasFixedSize(true);
        int tilePadding = getResources().getDimensionPixelSize(R.dimen.tile_padding);

        recyclerView.setPadding(tilePadding, tilePadding, tilePadding, tilePadding);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

            new ProgressClass().execute(intent.getStringExtra("Token"));


















    }



   public class ProgressClass extends AsyncTask<String, Integer, HashMap<String, ArrayList>> {




        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            mProgressBar.setCancelable(false);
             mProgressBar.setMessage("Ожидайте , идёт загрузка данных...");
             mProgressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);
             mProgressBar.show();

        }

        @Override
        protected HashMap<String, ArrayList> doInBackground(String... strings) {
            server = new LaptopServer();
            String silkorp = strings[0];





            try {
                server.OpenConection();
                server.sendData(silkorp);
                System.out.println(silkorp);
                dataset5 = server.getDataMap();




                server.closeConnection();
                ProcessValue(dataset5,silkorp);


            } catch (Exception e) {
                e.printStackTrace();
            }



            return null;
        }


        protected void onPostExecute(HashMap<String, ArrayList> s) {
            super.onPostExecute(s);
            if (mProgressBar.isShowing()) {
                          mProgressBar.dismiss();
                      }

                detailAdapter = new SilosDetailAdapter(silos,SilosDetail.this);
            detailAdapter.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(Silos item) {
                    Toast.makeText(SilosDetail.this, item.description, Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(SilosDetail.this,TemperatureDetail.class);
                    intent.putExtra("Token",item);
                    intent.putExtra("Map",dataset5);
                    startActivity(intent);
                }
            });
                recyclerView.setAdapter(detailAdapter);

            }
            }











    private void ProcessValue(HashMap<String, ArrayList> dataset5, String silkorp) {
        Context context = this;
            silos = new Silos(dataset5,silkorp,context);
            silos.initializr();





    }
}
