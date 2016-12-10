package nyc.c4q.shannonalexander_navarro.practicaltest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by shannonalexander-navarro on 12/10/16.
 */

public class DataResponse {
    @SerializedName("data")
    @Expose
    private Data data;

    public DataResponse(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
