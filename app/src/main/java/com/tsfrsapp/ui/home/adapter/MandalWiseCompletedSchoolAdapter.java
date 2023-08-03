package com.tsfrsapp.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tsfrsapp.R;
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
        return new CompletedSchoolsViewHolder(layoutInflater.inflate(R.layout.row_mandal_schools_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CompletedSchoolsViewHolder holder, int position) {
        MandalWiseCompletedSchoolModel model = lists.get(position);
        holder.tvMandal.setText(model.getMandal());
        holder.tvNoOfVillages.setText(String.valueOf(model.getNoOfVillages()));
        holder.tvNoOfSchools.setText(String.valueOf(model.getNoOfSchools()));
        holder.tvCompleted.setText(model.getCompletedPer()+"%");
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    class CompletedSchoolsViewHolder extends RecyclerView.ViewHolder {
        TextView tvMandal,tvNoOfVillages,tvNoOfSchools,tvCompleted;
        public CompletedSchoolsViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMandal = itemView.findViewById(R.id.tvMandal);
            tvNoOfVillages = itemView.findViewById(R.id.tvNoOfVillages);
            tvNoOfSchools = itemView.findViewById(R.id.tvNoOfSchools);
            tvCompleted = itemView.findViewById(R.id.tvCompleted);
        }
    }
}
