package nyc.c4q.shannonalexander_navarro.practicaltest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.shannonalexander_navarro.practicaltest.models.AllRecords;
import nyc.c4q.shannonalexander_navarro.practicaltest.models.Record;

/**
 * Created by shannonalexander-navarro on 12/10/16.
 */

public class RecordAdapter extends RecyclerView.Adapter {

    List<Record> recordList = new ArrayList<>();


    public RecordAdapter(AllRecords recordList) {
        this.recordList = (List<Record>) recordList;
    }

    public RecordAdapter(List<Record> records) {

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.record, parent, false);
        return new RecordViewHolder(itemView);    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RecordViewHolder viewHolder = (RecordViewHolder) holder;

        Record aRecord = recordList.get(position);
        viewHolder.bind(aRecord);
    }

    @Override
    public int getItemCount() {
        return recordList.size();
    }
}
