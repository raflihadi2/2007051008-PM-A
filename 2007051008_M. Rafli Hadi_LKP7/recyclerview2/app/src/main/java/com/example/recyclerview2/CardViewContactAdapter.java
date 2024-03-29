package com.example.recyclerview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewContactAdapter extends RecyclerView.Adapter<CardViewContactAdapter.CardViewViewHolder> {
    private ArrayList<Contact> contactList;
    private Context context;
    public CardViewContactAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;

    }

    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item, parent,
                        false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {
        Contact c = getContactList().get(position);
        Glide.with(context).load(c.getPhoto()).override(350,550).into(holder.imgPhoto);
        holder.tvName.setText(c.getName());
        holder.btnadd.setOnClickListener(new CustomOnItemClickListener(position,
                new CustomOnItemClickListener.OnItemClickCallback() {
                    @Override
                    public void onItemClicked(View view, int position) {
                        Toast.makeText(context, "Added "+getContactList().get(position).getName(), Toast.LENGTH_SHORT).show();

                    }

                }));

        holder.btndelete.setOnClickListener(new
                CustomOnItemClickListener(position, new
                CustomOnItemClickListener.OnItemClickCallback() {

                    @Override

                    public void onItemClicked(View view, int position) {

                        Toast.makeText(context, "Deleted "+getContactList().get(position).getName(), Toast.LENGTH_SHORT).show();

                    }

                }));

    }

    @Override

    public int getItemCount() {

        return getContactList().size();

    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        Button btnadd, btndelete;

        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            btnadd = (Button)itemView.findViewById(R.id.btn_add);
            btndelete = (Button)itemView.findViewById(R.id.btn_delete);
        }
    }
}