package com.example.booking_app_authentication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class HistoryAdapter extends FirebaseRecyclerAdapter<studios, HistoryAdapter.HistoryViewHolder> {

    public HistoryAdapter(@NonNull FirebaseRecyclerOptions<studios> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull HistoryViewHolder holder, int position, @NonNull studios model) {

    }

    @NonNull
    @Override
    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.studios,parent,false);
        return new ChatHolder(view);
    }

    class HistoryViewHolder extends RecyclerView.ViewHolder{

        public HistoryViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
