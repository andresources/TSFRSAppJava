package com.tsfrsapp.ui.home.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.tsfrsapp.R;
import com.tsfrsapp.ui.home.MandalWiseCompletedDetailsActivity;
import com.tsfrsapp.ui.home.VillageWiseCompletedDetailsActivity;
import com.tsfrsapp.ui.model.DistrictWiseCompletedSchoolModel;
import com.tsfrsapp.ui.model.MandalWiseCompletedSchoolModel;

import java.util.List;

public class MandalWiseCompletedSchoolAdapter extends RecyclerView.Adapter<MandalWiseCompletedSchoolAdapter.CompletedSchoolsViewHolder> {
    private List<MandalWiseCompletedSchoolModel> lists;
    Context context;
    public MandalWiseCompletedSchoolAdapter(List<MandalWiseCompletedSchoolModel> _lists, Context _context){
        lists = _lists;
        context = _context;
    }
    @NonNull
    @Override
    public CompletedSchoolsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        return new CompletedSchoolsViewHolder(layoutInflater.inflate(R.layout.row_mandal_school_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CompletedSchoolsViewHolder holder, int position) {
        MandalWiseCompletedSchoolModel model = lists.get(position);
        holder.tvVillage.setText(model.getVillage());
        holder.tvNoOfSchools.setText(String.valueOf(model.getNoOfSchools()));
        holder.tvNoOfStudents.setText(String.valueOf(model.getNoOfStudents()));
        holder.tvCompleted.setText(model.getCompletedPer()+"%");
        holder.ll.setOnClickListener(v->{
            context.startActivity(new Intent(context, VillageWiseCompletedDetailsActivity.class));
        });
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    class CompletedSchoolsViewHolder extends RecyclerView.ViewHolder {
        TextView tvVillage,tvNoOfSchools,tvNoOfStudents,tvCompleted;
        LinearLayoutCompat ll;
        public CompletedSchoolsViewHolder(@NonNull View itemView) {
            super(itemView);
            tvVillage = itemView.findViewById(R.id.tvVillage);
            tvNoOfSchools = itemView.findViewById(R.id.tvNoOfSchools);
            tvNoOfStudents = itemView.findViewById(R.id.tvNoOfStudents);
            tvCompleted = itemView.findViewById(R.id.tvCompleted);
            ll= itemView.findViewById(R.id.ll);
        }
    }
}
