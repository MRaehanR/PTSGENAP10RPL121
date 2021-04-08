package com.example.ptsgenap10rpl121;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.UserViewHolder> {

    public ArrayList<Makanan> makananList;

    private OnItemClickListener mListener;

    public MakananAdapter(ArrayList<Makanan> makananList) {
        this.makananList = makananList;
    }

    @NonNull
    @Override
    public MakananAdapter.UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(view, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MakananAdapter.UserViewHolder holder, int position) {
        holder.tvName.setText(makananList.get(position).getJudul());
        holder.tvUsername.setText(makananList.get(position).getDeskripsi());
        holder.imageView.setImageDrawable(makananList.get(position).getFoto());
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }


    @Override
    public int getItemCount() {
        return (makananList != null) ? makananList.size() : 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName, tvUsername;
        private ImageView imageView;
        public CardView cvMain;

        public UserViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_judul);
            tvUsername = itemView.findViewById(R.id.tv_deskripsi);
            cvMain = itemView.findViewById(R.id.cv_cardView);
            imageView = itemView.findViewById(R.id.img_imageList);

            cvMain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });

        }
    }
}
