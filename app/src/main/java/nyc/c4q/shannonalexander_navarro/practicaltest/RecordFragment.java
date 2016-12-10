package nyc.c4q.shannonalexander_navarro.practicaltest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.IOException;

import nyc.c4q.shannonalexander_navarro.practicaltest.models.AllRecords;
import nyc.c4q.shannonalexander_navarro.practicaltest.network.VineService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by shannonalexander-navarro on 12/10/16.
 */

public class RecordFragment extends Fragment {
    private static final String VINE_URL = "http://vine.co/";
    private static final String TAG = MainActivity.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_record, container, false);

        getTheRecords();

        return root;
    }
    private void getTheRecords() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(VINE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        VineService service = retrofit.create(VineService.class);

        Call<AllRecords> call = service.getAllRecords();

        call.enqueue(new Callback<AllRecords>() {
            @Override
            public void onResponse(Call<AllRecords> call, Response<AllRecords> response) {

                if (response.isSuccessful()) {
                    Log.d(TAG, "Success: " + response.body().getAllRecords().toString());
                } else {
                    try {
                        Log.d(TAG, "Error" + response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<AllRecords> call, Throwable t) {
                Log.e("FAILURE", "GOT NOTHING");

            }

        });
    }
}
