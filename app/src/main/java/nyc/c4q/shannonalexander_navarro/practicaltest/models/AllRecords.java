package nyc.c4q.shannonalexander_navarro.practicaltest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shannonalexander-navarro on 12/10/16.
 */

public class AllRecords {
    @SerializedName("records")
    @Expose
    public List<Record> records = new ArrayList<>();

    public List<Record> getAllRecords() {
        return records;
    }
}
