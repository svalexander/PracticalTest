package nyc.c4q.shannonalexander_navarro.practicaltest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.shannonalexander_navarro.practicaltest.models.Record;

/**
 * Created by shannonalexander-navarro on 12/10/16.
 */
public class RecordViewHolder extends RecyclerView.ViewHolder {
    TextView likedView;
    TextView userView;
    public Record record;

    public RecordViewHolder(View itemView) {
        super(itemView);
        likedView = (TextView) itemView.findViewById(R.id.likedTV);
        userView = (TextView) itemView.findViewById(R.id.userNameTV);
    }

    public void bind(final Record record) {
        userView.setText(record.getUsername());
    }
}
