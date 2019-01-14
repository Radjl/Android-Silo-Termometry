package ua.od.zpk.zpk.Pojo;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ua.od.zpk.zpk.LaptopServer;
import ua.od.zpk.zpk.R;

public class Silos implements Serializable {


    HashMap<String, ArrayList> dataset1 = new HashMap<>();
    HashMap<String, ArrayList> dataset2 = new HashMap<>();
    HashMap<String, ArrayList> dataset3 = new HashMap<>();
    HashMap<String, ArrayList> dataset5 = new HashMap<String, ArrayList>();


    private int tempmax;
    public String description;
    public int PhotoId;
    public int ID;
    private String token;
    public int silkorpus;
    public int WarningID;
    Context context;
    SharedPreferences prefmen;


    //
    public List<Silos> Siloss;

    public Silos(String description, int photoId, int ID, int silkorpus, int warning) {
        this.description = description;
        PhotoId = photoId;
        this.ID = ID;
        this.silkorpus = silkorpus;
        this.WarningID = warning;
    }

    public Silos(HashMap<String, ArrayList> dataset, String number, Context context) {
        this.context = context;
        this.dataset5 = dataset;
        this.token = number;
    }


    public List<Silos> getSiloss() {
        return Siloss;
    }

    public void initializr() {

        switch (token) {
            case "1":
                if (dataset1.isEmpty()) {
                    try {
                        Siloss = new ArrayList<>();
                        dataset1 = dataset5;
                        processValue(dataset1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            case "2":
                if (dataset2.isEmpty()) {
                    try {
                        Siloss = new ArrayList<>();
                        dataset2 = dataset5;

                        processValue(dataset2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            case "3":
                if (dataset3.isEmpty()) {
                    try {
                        Siloss = new ArrayList<>();
                        dataset3 = dataset5;
                        processValue(dataset3);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        }

    }

    private void processValue(HashMap<String, ArrayList> dataset1) {
        switch (dataset1.size()) {
            case 12:
                ArrayList podveska1001 = dataset1.get("1");
                ArrayList podveska1002 = dataset1.get("2");
                ArrayList podveska1003 = dataset1.get("3");
                ArrayList podveska1004 = dataset1.get("4");
                ArrayList podveska1005 = dataset1.get("5");
                ArrayList podveska1006 = dataset1.get("6");
                ArrayList podveska1007 = dataset1.get("7");
                ArrayList podveska1008 = dataset1.get("8");
                ArrayList podveska1009 = dataset1.get("9");
                ArrayList podveska1010 = dataset1.get("10");
                ArrayList podveska1011 = dataset1.get("11");
                ArrayList podveska1012 = dataset1.get("12");

                Siloss.add(new Silos("Силос 1001", R.drawable.silos_2_b, 1, 2, CheckTemp(podveska1001)));
                Siloss.add(new Silos("Силос 1002", R.drawable.silos_2_b, 2, 2, CheckTemp(podveska1002)));
                Siloss.add(new Silos("Силос 1003", R.drawable.silos_2_b, 3, 2, CheckTemp(podveska1003)));
                Siloss.add(new Silos("Силос 1004", R.drawable.silos_2_b, 4, 2, CheckTemp(podveska1004)));
                Siloss.add(new Silos("Силос 1005", R.drawable.silos_2_b, 5, 2, CheckTemp(podveska1005)));
                Siloss.add(new Silos("Силос 1006", R.drawable.silos_2_b, 6, 2, CheckTemp(podveska1006)));
                Siloss.add(new Silos("Силос 1007", R.drawable.silos_2_b, 7, 2, CheckTemp(podveska1007)));
                Siloss.add(new Silos("Силос 1008", R.drawable.silos_2_b, 8, 2, CheckTemp(podveska1008)));
                Siloss.add(new Silos("Силос 1009", R.drawable.silos_2_b, 9, 2, CheckTemp(podveska1009)));
                Siloss.add(new Silos("Силос 1010", R.drawable.silos_2_b, 10, 2, CheckTemp(podveska1010)));
                Siloss.add(new Silos("Силос 1011", R.drawable.silos_2_b, 11, 2, CheckTemp(podveska1011)));
                Siloss.add(new Silos("Силос 1012", R.drawable.silos_2_b, 12, 2, CheckTemp(podveska1012)));
                break;


            case 11:

                ArrayList podveska2001 = dataset1.get("1");
                ArrayList podveska2002 = dataset1.get("2");
                ArrayList podveska2003 = dataset1.get("3");
                ArrayList podveska2004 = dataset1.get("4");
                ArrayList podveska2005 = dataset1.get("5");
                ArrayList podveska2006 = dataset1.get("6");
                ArrayList podveska2007 = dataset1.get("7");
                ArrayList podveska2008 = dataset1.get("8");
                ArrayList podveska2009 = dataset1.get("9");
                ArrayList podveska2010 = dataset1.get("10");
                ArrayList podveska2011 = dataset1.get("11");


                Siloss.add(new Silos("Силос 2001", R.drawable.silos_2_b, 1, 1, CheckTemp(podveska2001)));
                Siloss.add(new Silos("Силос 2002", R.drawable.silos_2_b, 2, 1, CheckTemp(podveska2002)));
                Siloss.add(new Silos("Силос 2003", R.drawable.silos_2_b, 3, 1, CheckTemp(podveska2003)));
                Siloss.add(new Silos("Силос 2004", R.drawable.silos_2_b, 4, 1, CheckTemp(podveska2004)));
                Siloss.add(new Silos("Силос 2005", R.drawable.silos_2_b, 5, 1, CheckTemp(podveska2005)));
                Siloss.add(new Silos("Силос 2006", R.drawable.silos_2_b, 6, 1, CheckTemp(podveska2006)));
                Siloss.add(new Silos("Силос 2007", R.drawable.silos_2_b, 7, 1, CheckTemp(podveska2007)));
                Siloss.add(new Silos("Силос 2008", R.drawable.silos_2_b, 8, 1, CheckTemp(podveska2008)));
                Siloss.add(new Silos("Силос 2009", R.drawable.silos_2_b, 9, 1, CheckTemp(podveska2009)));
                Siloss.add(new Silos("Силос 2010", R.drawable.silos_2_b, 10, 1,CheckTemp(podveska2010)));
                Siloss.add(new Silos("Силос 2011", R.drawable.silos_2_b, 11, 1,CheckTemp(podveska2011)));
                break;


            case 6:
                ArrayList podveska4001 = dataset1.get("1");
                ArrayList podveska4002 = dataset1.get("2");
                ArrayList podveska4003 = dataset1.get("3");
                ArrayList podveska4004 = dataset1.get("4");
                ArrayList podveska4005 = dataset1.get("5");
                ArrayList podveska4006 = dataset1.get("6");



                    Siloss.add(new Silos("Силос 4001", R.drawable.silos_2_b, 1, 3, CheckTemp(podveska4001)));
                    Siloss.add(new Silos("Силос 4002", R.drawable.silos_2_b, 2, 3, CheckTemp(podveska4002)));
                    Siloss.add(new Silos("Силос 4003", R.drawable.silos_2_b, 3, 3, CheckTemp(podveska4003)));
                    Siloss.add(new Silos("Силос 4004", R.drawable.silos_2_b, 4, 3, CheckTemp(podveska4004)));
                    Siloss.add(new Silos("Силос 4005", R.drawable.silos_2_b, 5, 3, CheckTemp(podveska4005)));
                    Siloss.add(new Silos("Силос 4006", R.drawable.silos_2_b, 6, 3, CheckTemp(podveska4006)));
                    break;
                }


        }

    private int CheckTemp(ArrayList podveska) {
        prefmen = PreferenceManager.getDefaultSharedPreferences(context);
        tempmax = Integer.parseInt(prefmen.getString("temperature",""));


        int temp = 0;

        for (int i = 2; i <podveska.size() ; i++) {
            if (Double.parseDouble(String.valueOf(podveska.get(i))) > tempmax){
                temp = R.drawable.testred;
                break;
            }else temp = R.drawable.greent;


        }



     return temp;
    }


}


