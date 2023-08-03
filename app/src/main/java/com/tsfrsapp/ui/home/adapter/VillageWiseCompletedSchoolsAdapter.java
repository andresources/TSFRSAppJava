package com.tsfrsapp.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tsfrsapp.R;
import com.tsfrsapp.ui.model.MandalWiseCompletedSchoolModel;
import com.tsfrsapp.ui.model.VillageWiseCompletedSchoolModel;

import java.util.List;

public class VillageWiseCompletedSchoolsAdapter extends RecyclerView.Adapter<VillageWiseCompletedSchoolsAdapter.CompletedSchoolsViewHolder> {
    private List<VillageWiseCompletedSchoolModel> lists;
    Context context;
    public VillageWiseCompletedSchoolsAdapter(List<VillageWiseCompletedSchoolModel> _lists, Context _context){
        lists = _lists;
        context = _context;
    }
    @NonNull
    @Override
    public CompletedSchoolsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        return new CompletedSchoolsViewHolder(layoutInflater.inflate(R.layout.row_village_school_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CompletedSchoolsViewHolder holder, int position) {
        VillageWiseCompletedSchoolModel model = lists.get(position);
        holder.tvSchoolName.setText(model.getSchoolName());
        holder.tvClass.setText(String.valueOf(model.getClassName()));
        holder.tvNoOfStudents.setText(String.valueOf(model.getNoOfStudents()));
        if(model.getCompletedStatus()==1) {
            holder.ivStatus.setVisibility(View.VISIBLE);
        }else{
            holder.ivStatus.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    class CompletedSchoolsViewHolder extends RecyclerView.ViewHolder {
        TextView tvSchoolName,tvClass,tvNoOfStudents;
        ImageView ivStatus;
        public CompletedSchoolsViewHolder(@NonNull View itemView) {
            super(itemView);
            ivStatus = itemView.findViewById(R.id.ivStatus);
            tvSchoolName = itemView.findViewById(R.id.tvSchoolName);
            tvClass = itemView.findViewById(R.id.tvClass);
            tvNoOfStudents = itemView.findViewById(R.id.tvNoOfStudents);
        }
    }
}
