package ua.od.zpk.zpk.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ua.od.zpk.zpk.Interfaces.OnItemClickListener;
import ua.od.zpk.zpk.Pojo.Silos;
import ua.od.zpk.zpk.R;

public class SilosDetailAdapter extends RecyclerView.Adapter<SilosDetailAdapter.SilosViewHolder> {
   // Silos silos;
   //HashMap<String,ArrayList> dataset5 = new HashMap<String,ArrayList>();
    List<Silos> SilosList;
    private Context context;


    private OnItemClickListener onItemClickListener;

    public OnItemClickListener getOnItemClickListener() {
        return onItemClickListener;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public SilosDetailAdapter(Silos silos, Context context) {
         this.SilosList = silos.getSiloss();
         this.context = context;





    }

    @NonNull
    @Override
    public SilosViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {



        final View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_card_silos, viewGroup, false);
        SilosDetailAdapter.SilosViewHolder svh = new SilosDetailAdapter.SilosViewHolder(v);
        return svh;

    }

    @Override
    public void onBindViewHolder(@NonNull SilosViewHolder silosViewHolder, int i) {
        final Silos silos = SilosList.get(i);

        silosViewHolder.description.setText(SilosList.get(i).description);
        silosViewHolder.photo.setImageResource(SilosList.get(i).PhotoId);
        silosViewHolder.warning.setImageResource(SilosList.get(i).WarningID);




        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onItemClick(silos);
            }
        };

            silosViewHolder.button.setOnClickListener(listener);


    }

    @Override
    public int getItemCount() {

        return SilosList.size();

    }


    public static class SilosViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView description;
        ImageView photo;
        Button button;
        ImageButton warning;


        SilosViewHolder(View v){
            super(v);
            cardView = (CardView) v.findViewById(R.id.card_view_silos);
            description = (TextView) v.findViewById(R.id.silos2);
            photo = (ImageView) v.findViewById(R.id.silos1);
            button = v.findViewById(R.id.button1);
            warning = v.findViewById(R.id.share_button1);

        }
    }





}
