package nyc.c4q.shannonalexander_navarro.practicaltest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by shannonalexander-navarro on 12/10/16.
 */

public class RecordResponse {
        @SerializedName("allRecords")
        @Expose
        private AllRecords fullRecordList;

        public AllRecords getFullRecordList() {
            return fullRecordList;
        }

        public void setPlayList(AllRecords fullRecordList) {
            this.fullRecordList = fullRecordList;
        }

}
