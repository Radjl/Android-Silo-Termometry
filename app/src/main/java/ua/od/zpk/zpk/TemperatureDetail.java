package ua.od.zpk.zpk;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import ua.od.zpk.zpk.Pojo.Silos;

public class TemperatureDetail extends AppCompatActivity {

    HashMap<String,ArrayList> dataset5 = new HashMap<String,ArrayList>();
    Silos silos;
    String silosNum;
    SharedPreferences prefmen;


    ArrayList podveska2001;
    ArrayList podveska2002;
    ArrayList podveska2003;
    ArrayList podveska2004;
    ArrayList podveska2005;
    ArrayList podveska2006;
    ArrayList podveska2007;
    ArrayList podveska2008;
    ArrayList podveska2009;
    ArrayList podveska2010;
    ArrayList podveska2011;

    ArrayList podveska1001;
    ArrayList podveska1002;
    ArrayList podveska1003;
    ArrayList podveska1004;
    ArrayList podveska1005;
    ArrayList podveska1006;
    ArrayList podveska1007;
    ArrayList podveska1008;
    ArrayList podveska1009;
    ArrayList podveska1010;
    ArrayList podveska1011;
    ArrayList podveska1012;

    ArrayList podveska4001;
    ArrayList podveska4002;
    ArrayList podveska4003;
    ArrayList podveska4004;
    ArrayList podveska4005;
    ArrayList podveska4006;


    private int tempmax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_detail);
        prefmen = PreferenceManager.getDefaultSharedPreferences(this);
        tempmax = Integer.parseInt(prefmen.getString("air",""));
        System.out.println(tempmax);
        Intent intent = getIntent();
        dataset5 = (HashMap<String, ArrayList>) intent.getSerializableExtra("Map");
        silos = (Silos) intent.getSerializableExtra("Token");

        ProcessData(silos,dataset5);




    }



    private void ProcessData(Silos silos, HashMap<String,ArrayList> dataset5) {

            switch (silos.silkorpus){
                case 1:

                podveska2001 = dataset5.get("1");
                podveska2002 = dataset5.get("2");
                podveska2003 = dataset5.get("3");
                podveska2004 = dataset5.get("4");
                podveska2005 = dataset5.get("5");
                podveska2006 = dataset5.get("6");
                podveska2007 = dataset5.get("7");
                podveska2008 = dataset5.get("8");
                podveska2009 = dataset5.get("9");
                podveska2010 = dataset5.get("10");
                podveska2011 = dataset5.get("11");

                switch (silos.description){
                    case "Силос 2001":
                        silosNum = "2001";
                        initsilos(podveska2001,silosNum);
                        break;
                    case "Силос 2002":
                        silosNum = "2002";
                        initsilos(podveska2002,silosNum);
                        break;
                    case "Силос 2003":
                        silosNum = "2003";
                        initsilos(podveska2003,silosNum);
                        break;
                    case "Силос 2004":
                        silosNum = "2004";
                        initsilos(podveska2004,silosNum);
                        break;
                    case "Силос 2005":
                        silosNum = "2005";
                        initsilos(podveska2005,silosNum);
                        break;
                    case "Силос 2006":
                        silosNum = "2006";
                        initsilos(podveska2006,silosNum);
                        break;
                    case "Силос 2007":
                        silosNum = "2007";
                        initsilos(podveska2007,silosNum);
                        break;
                    case "Силос 2008":
                        silosNum = "2008";
                        initsilos(podveska2008,silosNum);
                        break;
                    case "Силос 2009":
                        silosNum = "2009";
                        initsilos(podveska2009,silosNum);
                        break;
                    case "Силос 2010":
                        silosNum = "2010";
                        initsilos(podveska2010,silosNum);
                        break;
                    case "Силос 2011":
                        silosNum = "2011";
                        initsilos(podveska2011,silosNum);
                        break;
                }


                    break;
                case 2:
                    podveska1001 = dataset5.get("1");
                    podveska1002 = dataset5.get("2");
                    podveska1003 = dataset5.get("3");
                    podveska1004 = dataset5.get("4");
                    podveska1005 = dataset5.get("5");
                    podveska1006 = dataset5.get("6");
                    podveska1007 = dataset5.get("7");
                    podveska1008 = dataset5.get("8");
                    podveska1009 = dataset5.get("9");
                    podveska1010 = dataset5.get("10");
                    podveska1011 = dataset5.get("11");
                    podveska1012 = dataset5.get("12");

                    switch (silos.description){
                        case "Силос 1001":
                            silosNum = "1001";
                            initsilos2(podveska1001,silosNum);
                            break;
                        case "Силос 1002":
                            silosNum = "1002";
                            initsilos2(podveska1002,silosNum);
                            break;
                        case "Силос 1003":
                            silosNum = "1003";
                            initsilos2(podveska1003,silosNum);
                            break;
                        case "Силос 1004":
                            silosNum = "1004";
                            initsilos2(podveska1004,silosNum);
                            break;
                        case "Силос 1005":
                            silosNum = "1005";
                            initsilos2(podveska1005,silosNum);
                            break;
                        case "Силос 1006":
                            silosNum = "1006";
                            initsilos2(podveska1006,silosNum);
                            break;
                        case "Силос 1007":
                            silosNum = "1007";
                            initsilos2(podveska1007,silosNum);
                            break;
                        case "Силос 1008":
                            silosNum = "1008";
                            initsilos2(podveska1008,silosNum);
                            break;
                        case "Силос 1009":
                            silosNum = "1009";
                            initsilos2(podveska1009,silosNum);
                            break;
                        case "Силос 1010":
                            silosNum = "1010";
                            initsilos2(podveska1010,silosNum);
                            break;
                        case "Силос 1011":
                            silosNum = "1011";
                            initsilos2(podveska1011,silosNum);
                            break;
                        case "Силос 1012":
                            silosNum = "1012";
                            initsilos2(podveska1012,silosNum);
                            break;
                    }
                    break;
                case 3:
                    podveska4001 = dataset5.get("1");
                    podveska4002 = dataset5.get("2");
                    podveska4003 = dataset5.get("3");
                    podveska4004 = dataset5.get("4");
                    podveska4005 = dataset5.get("5");
                    podveska4006 = dataset5.get("6");
                    switch (silos.description){
                        case "Силос 4001":
                            silosNum = "4001";
                            initsilos3(podveska4001,silosNum);
                            break;
                        case "Силос 4002":
                            silosNum = "4002";
                            initsilos3(podveska4002,silosNum);
                            break;
                        case "Силос 4003":
                            silosNum = "4003";
                            initsilos3(podveska4003,silosNum);
                            break;
                        case "Силос 4004":
                            silosNum = "4004";
                            initsilos3(podveska4004,silosNum);
                            break;
                        case "Силос 4005":
                            silosNum = "4005";
                            initsilos3(podveska4005,silosNum);
                            break;
                        case "Силос 4006":
                            silosNum = "4006";
                            initsilos3(podveska4006,silosNum);
                            break;
                    }
                    break;
            }







    }

    private void initsilos3(ArrayList podveska, String silosNum) {
        ArrayList<TextView> views = new ArrayList<>();
        views.add((TextView) findViewById(R.id.P1_1));
        views.add((TextView) findViewById(R.id.P1_2));
        views.add((TextView) findViewById(R.id.P1_3));
        views.add((TextView) findViewById(R.id.P1_4));
        views.add((TextView) findViewById(R.id.P1_5));
        views.add((TextView) findViewById(R.id.P1_6));
        views.add((TextView) findViewById(R.id.P1_7));


        views.add((TextView) findViewById(R.id.P2_1));
        views.add((TextView) findViewById(R.id.P2_2));
        views.add((TextView) findViewById(R.id.P2_3));
        views.add((TextView) findViewById(R.id.P2_4));
        views.add((TextView) findViewById(R.id.P2_5));
        views.add((TextView) findViewById(R.id.P2_6));
        views.add((TextView) findViewById(R.id.P2_7));


        views.add((TextView) findViewById(R.id.P3_1));
        views.add((TextView) findViewById(R.id.P3_2));
        views.add((TextView) findViewById(R.id.P3_3));
        views.add((TextView) findViewById(R.id.P3_4));
        views.add((TextView) findViewById(R.id.P3_5));
        views.add((TextView) findViewById(R.id.P3_6));
        views.add((TextView) findViewById(R.id.P3_7));


        views.add((TextView) findViewById(R.id.P4_1));
        views.add((TextView) findViewById(R.id.P4_2));
        views.add((TextView) findViewById(R.id.P4_3));
        views.add((TextView) findViewById(R.id.P4_4));
        views.add((TextView) findViewById(R.id.P4_5));
        views.add((TextView) findViewById(R.id.P4_6));
        views.add((TextView) findViewById(R.id.P4_7));


        views.add((TextView) findViewById(R.id.P5_1));
        views.add((TextView) findViewById(R.id.P5_2));
        views.add((TextView) findViewById(R.id.P5_3));
        views.add((TextView) findViewById(R.id.P5_4));
        views.add((TextView) findViewById(R.id.P5_5));
        views.add((TextView) findViewById(R.id.P5_6));
        views.add((TextView) findViewById(R.id.P5_7));


        views.add((TextView) findViewById(R.id.P6_1));
        views.add((TextView) findViewById(R.id.P6_2));
        views.add((TextView) findViewById(R.id.P6_3));
        views.add((TextView) findViewById(R.id.P6_4));
        views.add((TextView) findViewById(R.id.P6_5));
        views.add((TextView) findViewById(R.id.P6_6));
        views.add((TextView) findViewById(R.id.P6_7));


        views.add((TextView) findViewById(R.id.P7_1));
        views.add((TextView) findViewById(R.id.P7_2));
        views.add((TextView) findViewById(R.id.P7_3));
        views.add((TextView) findViewById(R.id.P7_4));
        views.add((TextView) findViewById(R.id.P7_5));
        views.add((TextView) findViewById(R.id.P7_6));
        views.add((TextView) findViewById(R.id.P7_7));
        views.add((TextView) findViewById(R.id.P7_8));


        switch (silosNum) {
            case "4001":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
            case "4002":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
            case "4003":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
            case "4004":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
            case "4005":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
            case "4006":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;

        }
    }

    @SuppressLint("ResourceAsColor")
    private void initsilos2(ArrayList podveska, String silosNum) {
        ArrayList<TextView> views = new ArrayList<>();
        views.add((TextView) findViewById(R.id.P1_1));
        views.add((TextView) findViewById(R.id.P1_2));
        views.add((TextView) findViewById(R.id.P1_3));
        views.add((TextView) findViewById(R.id.P1_4));
        views.add((TextView) findViewById(R.id.P1_5));
        views.add((TextView) findViewById(R.id.P1_6));
        views.add((TextView) findViewById(R.id.P1_7));
        views.add((TextView) findViewById(R.id.P1_8));

        views.add((TextView) findViewById(R.id.P2_1));
        views.add((TextView) findViewById(R.id.P2_2));
        views.add((TextView) findViewById(R.id.P2_3));
        views.add((TextView) findViewById(R.id.P2_4));
        views.add((TextView) findViewById(R.id.P2_5));
        views.add((TextView) findViewById(R.id.P2_6));
        views.add((TextView) findViewById(R.id.P2_7));
        views.add((TextView) findViewById(R.id.P2_8));

        views.add((TextView) findViewById(R.id.P3_1));
        views.add((TextView) findViewById(R.id.P3_2));
        views.add((TextView) findViewById(R.id.P3_3));
        views.add((TextView) findViewById(R.id.P3_4));
        views.add((TextView) findViewById(R.id.P3_5));
        views.add((TextView) findViewById(R.id.P3_6));
        views.add((TextView) findViewById(R.id.P3_7));
        views.add((TextView) findViewById(R.id.P3_8));

        views.add((TextView) findViewById(R.id.P4_1));
        views.add((TextView) findViewById(R.id.P4_2));
        views.add((TextView) findViewById(R.id.P4_3));
        views.add((TextView) findViewById(R.id.P4_4));
        views.add((TextView) findViewById(R.id.P4_5));
        views.add((TextView) findViewById(R.id.P4_6));
        views.add((TextView) findViewById(R.id.P4_7));
        views.add((TextView) findViewById(R.id.P4_8));

        views.add((TextView) findViewById(R.id.P5_1));
        views.add((TextView) findViewById(R.id.P5_2));
        views.add((TextView) findViewById(R.id.P5_3));
        views.add((TextView) findViewById(R.id.P5_4));
        views.add((TextView) findViewById(R.id.P5_5));
        views.add((TextView) findViewById(R.id.P5_6));
        views.add((TextView) findViewById(R.id.P5_7));
        views.add((TextView) findViewById(R.id.P5_8));

        views.add((TextView) findViewById(R.id.P6_1));
        views.add((TextView) findViewById(R.id.P6_2));
        views.add((TextView) findViewById(R.id.P6_3));
        views.add((TextView) findViewById(R.id.P6_4));
        views.add((TextView) findViewById(R.id.P6_5));
        views.add((TextView) findViewById(R.id.P6_6));
        views.add((TextView) findViewById(R.id.P6_7));
        views.add((TextView) findViewById(R.id.P6_8));

        views.add((TextView) findViewById(R.id.P7_1));
        views.add((TextView) findViewById(R.id.P7_2));
        views.add((TextView) findViewById(R.id.P7_3));
        views.add((TextView) findViewById(R.id.P7_4));
        views.add((TextView) findViewById(R.id.P7_5));
        views.add((TextView) findViewById(R.id.P7_6));
        views.add((TextView) findViewById(R.id.P7_7));
        views.add((TextView) findViewById(R.id.P7_8));

        views.add((TextView) findViewById(R.id.P8_1));
        views.add((TextView) findViewById(R.id.P8_2));
        views.add((TextView) findViewById(R.id.P8_3));
        views.add((TextView) findViewById(R.id.P8_4));
        views.add((TextView) findViewById(R.id.P8_5));
        views.add((TextView) findViewById(R.id.P8_6));
        views.add((TextView) findViewById(R.id.P8_7));
        views.add((TextView) findViewById(R.id.P8_8));

        views.add((TextView) findViewById(R.id.P9_1));
        views.add((TextView) findViewById(R.id.P9_2));
        views.add((TextView) findViewById(R.id.P9_3));
        views.add((TextView) findViewById(R.id.P9_4));
        views.add((TextView) findViewById(R.id.P9_5));
        views.add((TextView) findViewById(R.id.P9_6));
        views.add((TextView) findViewById(R.id.P9_7));
        views.add((TextView) findViewById(R.id.P9_8));

        views.add((TextView) findViewById(R.id.P10_1));
        views.add((TextView) findViewById(R.id.P10_2));
        views.add((TextView) findViewById(R.id.P10_3));
        views.add((TextView) findViewById(R.id.P10_4));
        views.add((TextView) findViewById(R.id.P10_5));
        views.add((TextView) findViewById(R.id.P10_6));
        views.add((TextView) findViewById(R.id.P10_7));
        views.add((TextView) findViewById(R.id.P10_8));

        views.add((TextView) findViewById(R.id.P11_1));
        views.add((TextView) findViewById(R.id.P11_2));
        views.add((TextView) findViewById(R.id.P11_3));
        views.add((TextView) findViewById(R.id.P11_4));
        views.add((TextView) findViewById(R.id.P11_5));
        views.add((TextView) findViewById(R.id.P11_6));
        views.add((TextView) findViewById(R.id.P11_7));
        views.add((TextView) findViewById(R.id.P11_8));
        switch (silosNum) {
            case "1001":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
            case "1002":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
            case "1003":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
            case "1004":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
            case "1005":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }

                    }
                } catch (Exception e) {

                }
                break;
            case "1006":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
            case "1007":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
            case "1008":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
            case "1009":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
            case "1010":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
            case "1011":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
            case "1012":
                try {

                    TextView time = findViewById(R.id.TimeText);
                    time.setText("Обновлено на: " + podveska.get(0));

                    for (int i = 0; i < views.size(); i++) {
                        views.get(i).setText((CharSequence) podveska.get(i + 2));
                        if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                            views.get(i).setBackgroundColor(Color.YELLOW);
                        }
                    }
                } catch (Exception e) {

                }
                break;
        }
    }

    private void initsilos(ArrayList podveska, String silosNum) {
      //  textView6.setText((CharSequence) podveska.get(8));
        ArrayList<TextView> views = new ArrayList<>();
        views.add((TextView) findViewById(R.id.P1_1));
        views.add((TextView) findViewById(R.id.P1_2));
        views.add((TextView) findViewById(R.id.P1_3));
        views.add((TextView) findViewById(R.id.P1_4));
        views.add((TextView) findViewById(R.id.P1_5));
        views.add((TextView) findViewById(R.id.P1_6));
        views.add((TextView) findViewById(R.id.P1_7));
        views.add((TextView) findViewById(R.id.P2_1));
        views.add((TextView) findViewById(R.id.P2_2));
        views.add((TextView) findViewById(R.id.P2_3));
        views.add((TextView) findViewById(R.id.P2_4));
        views.add((TextView) findViewById(R.id.P2_5));
        views.add((TextView) findViewById(R.id.P2_6));
        views.add((TextView) findViewById(R.id.P2_7));
        views.add((TextView) findViewById(R.id.P3_1));
        views.add((TextView) findViewById(R.id.P3_2));
        views.add((TextView) findViewById(R.id.P3_3));
        views.add((TextView) findViewById(R.id.P3_4));
        views.add((TextView) findViewById(R.id.P3_5));
        views.add((TextView) findViewById(R.id.P3_6));
        views.add((TextView) findViewById(R.id.P3_7));
        views.add((TextView) findViewById(R.id.P4_1));
        views.add((TextView) findViewById(R.id.P4_2));
        views.add((TextView) findViewById(R.id.P4_3));
        views.add((TextView) findViewById(R.id.P4_4));
        views.add((TextView) findViewById(R.id.P4_5));
        views.add((TextView) findViewById(R.id.P4_6));
        views.add((TextView) findViewById(R.id.P4_7));
        views.add((TextView) findViewById(R.id.P5_1));
        views.add((TextView) findViewById(R.id.P5_2));
        views.add((TextView) findViewById(R.id.P5_3));
        views.add((TextView) findViewById(R.id.P5_4));
        views.add((TextView) findViewById(R.id.P5_5));
        views.add((TextView) findViewById(R.id.P5_6));
        views.add((TextView) findViewById(R.id.P5_7));
        views.add((TextView) findViewById(R.id.P6_1));
        views.add((TextView) findViewById(R.id.P6_2));
        views.add((TextView) findViewById(R.id.P6_3));
        views.add((TextView) findViewById(R.id.P6_4));
        views.add((TextView) findViewById(R.id.P6_5));
        views.add((TextView) findViewById(R.id.P6_6));
        views.add((TextView) findViewById(R.id.P6_7));
        views.add((TextView) findViewById(R.id.P7_1));
        views.add((TextView) findViewById(R.id.P7_2));
        views.add((TextView) findViewById(R.id.P7_3));
        views.add((TextView) findViewById(R.id.P7_4));
        views.add((TextView) findViewById(R.id.P7_5));
        views.add((TextView) findViewById(R.id.P7_6));
        views.add((TextView) findViewById(R.id.P7_7));
        views.add((TextView) findViewById(R.id.P7_8));
            switch (silosNum){
                case "2001":
                    try {

                        TextView time = findViewById(R.id.TimeText);
                        time.setText("Обновлено на: " + podveska.get(0));

                        for (int i = 0; i <views.size() ; i++) {
                            views.get(i).setText((CharSequence) podveska.get(i+2));
                            if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                                views.get(i).setBackgroundColor(Color.YELLOW);
                            }
                        }
                    }catch (Exception e){

                    }
                    break;
                case "2002":
                    try {

                        TextView time = findViewById(R.id.TimeText);
                        time.setText("Обновлено на: " + podveska.get(0));

                        for (int i = 0; i <views.size() ; i++) {
                            views.get(i).setText((CharSequence) podveska.get(i+2));
                            if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                                views.get(i).setBackgroundColor(Color.YELLOW);
                            }
                        }
                    }catch (Exception e){

                    }
                    break;
                case "2003":
                    try {

                        TextView time = findViewById(R.id.TimeText);
                        time.setText("Обновлено на: " + podveska.get(0));

                        for (int i = 0; i <views.size() ; i++) {
                            views.get(i).setText((CharSequence) podveska.get(i+2));
                            if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                                views.get(i).setBackgroundColor(Color.YELLOW);
                            }
                        }
                    }catch (Exception e){

                    }
                    break;
                case "2004":
                    try {

                        TextView time = findViewById(R.id.TimeText);
                        time.setText("Обновлено на: " + podveska.get(0));

                        for (int i = 0; i <views.size() ; i++) {
                            views.get(i).setText((CharSequence) podveska.get(i+2));
                            if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                                views.get(i).setBackgroundColor(Color.YELLOW);
                            }
                        }
                    }catch (Exception e){

                    }
                    break;
                case "2005":
                    try {

                        TextView time = findViewById(R.id.TimeText);
                        time.setText("Обновлено на: " + podveska.get(0));

                        for (int i = 0; i <views.size() ; i++) {
                            views.get(i).setText((CharSequence) podveska.get(i+2));
                            if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                                views.get(i).setBackgroundColor(Color.YELLOW);
                            }
                        }
                    }catch (Exception e){

                    }
                    break;
                case "2006":
                    try {

                        TextView time = findViewById(R.id.TimeText);
                        time.setText("Обновлено на: " + podveska.get(0));

                        for (int i = 0; i <views.size() ; i++) {
                            views.get(i).setText((CharSequence) podveska.get(i+2));
                            if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                                views.get(i).setBackgroundColor(Color.YELLOW);
                            }
                        }
                    }catch (Exception e){

                    }
                    break;
                case "2007":
                    try {

                        TextView time = findViewById(R.id.TimeText);
                        time.setText("Обновлено на: " + podveska.get(0));

                        for (int i = 0; i <views.size() ; i++) {
                            views.get(i).setText((CharSequence) podveska.get(i+2));
                            if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                                views.get(i).setBackgroundColor(Color.YELLOW);
                            }
                        }
                    }catch (Exception e){

                    }
                    break;
                case "2008":
                    try {

                        TextView time = findViewById(R.id.TimeText);
                        time.setText("Обновлено на: " + podveska.get(0));

                        for (int i = 0; i <views.size() ; i++) {
                            views.get(i).setText((CharSequence) podveska.get(i+2));
                            if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                                views.get(i).setBackgroundColor(Color.YELLOW);
                            }
                        }
                    }catch (Exception e){

                    }
                    break;
                case "2009":
                    try {

                        TextView time = findViewById(R.id.TimeText);
                        time.setText("Обновлено на: " + podveska.get(0));

                        for (int i = 0; i <views.size() ; i++) {
                            views.get(i).setText((CharSequence) podveska.get(i+2));
                            if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                                views.get(i).setBackgroundColor(Color.YELLOW);
                            }
                        }
                    }catch (Exception e){

                    }
                    break;
                case "2010":
                    try {

                        TextView time = findViewById(R.id.TimeText);
                        time.setText("Обновлено на: " + podveska.get(0));

                        for (int i = 0; i <views.size() ; i++) {
                            views.get(i).setText((CharSequence) podveska.get(i+2));
                            if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                                views.get(i).setBackgroundColor(Color.YELLOW);
                            }
                        }
                    }catch (Exception e){

                    }
                    break;
                case "2011":
                    try {

                        TextView time = findViewById(R.id.TimeText);
                        time.setText("Обновлено на: " + podveska.get(0));

                        for (int i = 0; i <views.size() ; i++) {
                            views.get(i).setText((CharSequence) podveska.get(i+2));
                            if(Double.parseDouble(String.valueOf(podveska.get(i+2))) > tempmax){
                                views.get(i).setBackgroundColor(Color.YELLOW);
                            }
                        }
                    }catch (Exception e){

                    }
                    break;
            }











    }
}
