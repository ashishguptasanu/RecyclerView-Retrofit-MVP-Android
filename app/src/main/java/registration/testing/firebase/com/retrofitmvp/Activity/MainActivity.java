package registration.testing.firebase.com.retrofitmvp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import registration.testing.firebase.com.retrofitmvp.Adapter.CountryAdapter;
import registration.testing.firebase.com.retrofitmvp.Core.GetDataContract;
import registration.testing.firebase.com.retrofitmvp.Core.Presenter;
import registration.testing.firebase.com.retrofitmvp.Model.CountryRes;
import registration.testing.firebase.com.retrofitmvp.R;

public class MainActivity extends AppCompatActivity implements GetDataContract.View {
    private Presenter mPresenter;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    CountryAdapter countryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new Presenter(this);
        mPresenter.getDataFromURL(getApplicationContext(), "");
        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void onGetDataSuccess(String message, List<CountryRes> allCountriesData) {
        countryAdapter = new CountryAdapter(getApplicationContext(), allCountriesData);
        recyclerView.setAdapter(countryAdapter);

    }

    @Override
    public void onGetDataFailure(String message) {
        Log.d("Status",message);
    }
}
