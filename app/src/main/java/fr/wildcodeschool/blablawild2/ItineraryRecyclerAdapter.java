package fr.wildcodeschool.blablawild2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ItineraryRecyclerAdapter extends RecyclerView.Adapter<ItineraryRecyclerAdapter.ViewHolder>  {


    private ArrayList<ItineraryModel> mItineraries;
    // TODO : ajouter le constructeur initialisant la liste d'itinéraires

    @Override
    public ItineraryRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_itinerary, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ItineraryRecyclerAdapter.ViewHolder holder, int position) {

        ItineraryModel itineraryModel = mItineraries.get(position);
        holder.tvDriver.setText(itineraryModel.getDriver());
        holder.tvDate.setText(itineraryModel.getDate().toString());
        holder.tvPrice.setText(String.valueOf(itineraryModel.getPrice()));


    }

    @Override
    public int getItemCount() {

        return mItineraries.size();


    }

    public ItineraryRecyclerAdapter(ArrayList<ItineraryModel> itineraries) {

        mItineraries = itineraries;

    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

            TextView tvDate, tvDriver, tvPrice;

            public ViewHolder(View v) {
                super(v);
                this.tvDate = v.findViewById(R.id.tv_date);
                this.tvDriver = v.findViewById(R.id.tv_driver);
                this.tvPrice = v.findViewById(R.id.tv_price);
            }



    }

}







