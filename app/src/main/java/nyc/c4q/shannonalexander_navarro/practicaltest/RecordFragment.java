package nyc.c4q.shannonalexander_navarro.practicaltest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import nyc.c4q.shannonalexander_navarro.practicaltest.models.DataResponse;
import nyc.c4q.shannonalexander_navarro.practicaltest.models.Record;
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
    RecyclerView rv;
    RecordAdapter adapter;
    List<Record> records = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_record, container, false);

        rv = (RecyclerView) root.findViewById((R.id.rv));
        rv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        getTheRecords();

        return root;
    }

    private void getTheRecords() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(VINE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        VineService service = retrofit.create(VineService.class);

        Call<DataResponse> call = service.getAllRecords();

        call.enqueue(new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {

                List<Record> ourRecords = response.body().getData().getRecords();
                records = ourRecords;
                adapter = new RecordAdapter(records);
                rv.setAdapter(adapter);
                if (response.isSuccessful()) {
                    Log.d(TAG, "Success: " + response.body().getData().getRecords().size());
                } else {
                    try {
                        Log.d(TAG, "Error" + response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {
                Log.e("FAILURE", "GOT NOTHING" + t);

            }

        });
    }
}
