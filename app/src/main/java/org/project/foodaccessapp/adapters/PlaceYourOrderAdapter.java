package org.project.foodaccessapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.project.foodaccessapp.R;
import org.project.foodaccessapp.model.Menu;

import java.util.List;

public class PlaceYourOrderAdapter extends RecyclerView.Adapter<PlaceYourOrderAdapter.MyViewHolder> {

    private List<Menu> menuList;

    public PlaceYourOrderAdapter(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void updateData(List<Menu> menuList) {
        this.menuList = menuList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.place_order_recycler_row, parent, false);
        return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.menuName.setText(menuList.get(position).getName());
        holder.menuPrice.setText("Price: ugx"+String.format("%.2f", menuList.get(position).getPrice()*menuList.get(position).getTotalInCart()));
        holder.menuQty.setText("Qty: " + menuList.get(position).getTotalInCart());
        Menu menu  = menuList.get(position);


        int num=R.drawable.logo;

        switch (menu.getUrl()){

            case "10":
                num=R.drawable.logo;
            case "11":
                num=R.drawable.logo;
            case "12":
                num=R.drawable.logo;
            case "13":
                num=R.drawable.logo;
            case "14":
                num=R.drawable.logo;
            case "15":
                num=R.drawable.logo;
            case "16":
                num=R.drawable.logo;
            case "17":
                num=R.drawable.logo;
            case "18":
                num=R.drawable.logo;
            case "19":
                num=R.drawable.logo;
            case "20":
                num=R.drawable.logo;
            case "21":
                num=R.drawable.logo;
            case "22":
                num=R.drawable.logo;
            case "23":
                num=R.drawable.logo;
            case "24":
                num=R.drawable.logo;
            case "25":
                num=R.drawable.logo;
            case "26":
                num=R.drawable.logo;
            case "27":
                num=R.drawable.logo;
            case "28":
                num=R.drawable.logo;
            case "29":
                num=R.drawable.logo;
            case "30":
                num=R.drawable.logo;
            case "31":
                num=R.drawable.logo;
            case "32":
                num=R.drawable.logo;
            case "33":
                num=R.drawable.logo;
            case "34":
                num=R.drawable.logo;
            case "35":
                num=R.drawable.logo;
            case "36":
                num=R.drawable.logo;
            case "37":
                num=R.drawable.logo;
            case "38":
                num=R.drawable.logo;
            case "39":
                num=R.drawable.logo;

            case "4":
                num=R.drawable.logo;


            case "40":
                num=R.drawable.logo;
            case "41":
                num=R.drawable.logo;
            case "42":
                num=R.drawable.logo;
            case "43":
                num=R.drawable.logo;
            case "44":
                num=R.drawable.logo;
            case "45":
                num=R.drawable.logo;
            case "46":
                num=R.drawable.logo;
            case "47":
                num=R.drawable.logo;


        }

        Glide.with(holder.thumbImage)
                .load(num)
                .into(holder.thumbImage);

    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView  menuName;
        TextView  menuPrice;
        TextView  menuQty;
        ImageView thumbImage;

        public MyViewHolder(View view) {
            super(view);
            menuName = view.findViewById(R.id.menuName);
            menuPrice = view.findViewById(R.id.menuPrice);
            menuQty = view.findViewById(R.id.menuQty);
            thumbImage = view.findViewById(R.id.thumbImage);
        }
    }
}
