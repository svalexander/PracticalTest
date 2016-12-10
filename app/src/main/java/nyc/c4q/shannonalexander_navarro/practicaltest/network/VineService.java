package nyc.c4q.shannonalexander_navarro.practicaltest.network;

import nyc.c4q.shannonalexander_navarro.practicaltest.models.AllRecords;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by shannonalexander-navarro on 12/10/16.
 */

public interface VineService {
    @GET("api/timelines/users/918753190470619136")
   // Call<DataResponse> getAllRecords();

    Call<AllRecords> getAllRecords();
}
