package ua.od.zpk.zpk.Pojo;

import java.util.ArrayList;
import java.util.List;

import ua.od.zpk.zpk.R;

public class SilKorpus {
    public String name;
    public String description;
    public int PhotoId;
    public int ID;

    public List<SilKorpus> silKorpusList;

    public SilKorpus(String name, String description, int photoId,int ID) {
        this.name = name;
        this.description = description;
        this.PhotoId = photoId;
        this.ID = ID;
    }

    public SilKorpus() {
    }

    public List<SilKorpus> getSilKorpusList() {
        return silKorpusList;
    }

    public void initializr(){
        silKorpusList = new ArrayList<>();
        silKorpusList.add(new SilKorpus("","Температура в силосах 1001-1012", R.drawable.sil,1));
        silKorpusList.add(new SilKorpus("","Температура в силосах 2001-2011", R.drawable.sil,2));
        silKorpusList.add(new SilKorpus("","Температура в силосах 4001-4006", R.drawable.sil,3));
    }
}


