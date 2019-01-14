package ua.od.zpk.zpk.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import ua.od.zpk.zpk.Pojo.SilKorpus;
import ua.od.zpk.zpk.R;
import ua.od.zpk.zpk.SilosDetail;

public class TermoAdapter extends RecyclerView.Adapter<TermoAdapter.TermoViewHolder> {
List<SilKorpus> korpusList;

    public TermoAdapter(List<SilKorpus> korpusa) {
        this.korpusList = korpusa;
    }

    @NonNull
    @Override
    public TermoViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                              int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_card, parent, false);
        TermoViewHolder tvh = new TermoViewHolder(v);
        return tvh;
    }

    @Override
    public void onBindViewHolder(@NonNull TermoViewHolder termoViewHolder, final int i) {

        termoViewHolder.name.setText(korpusList.get(i).name);
        termoViewHolder.description.setText(korpusList.get(i).description);
        termoViewHolder.photo.setImageResource(korpusList.get(i).PhotoId);
        termoViewHolder.action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConnectivityManager cm = (ConnectivityManager)view.getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netInfo = cm.getActiveNetworkInfo();
                if (netInfo != null && netInfo.isConnectedOrConnecting()) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, SilosDetail.class);
                    intent.putExtra("Token", String.valueOf(korpusList.get(i).ID));
                    context.startActivity(intent);
                }else {
                    Toast.makeText(view.getContext(), "Вы не подключены к интернету , пожалуйста подключитесь", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return korpusList.size();
    }

    public static class TermoViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView name;
        TextView description;
        ImageView photo;
        Button action;

        TermoViewHolder(View v){
            super(v);
            cardView = (CardView) v.findViewById(R.id.card_view);
            name = (TextView) v.findViewById(R.id.card_title);
            description = (TextView) v.findViewById(R.id.card_text);
            photo = (ImageView) v.findViewById(R.id.card_image);
            action = (Button) v.findViewById(R.id.action_button);
        }


    }


}
