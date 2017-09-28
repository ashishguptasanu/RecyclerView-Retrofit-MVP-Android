package registration.testing.firebase.com.retrofitmvp.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import registration.testing.firebase.com.retrofitmvp.Model.CountryRes;
import registration.testing.firebase.com.retrofitmvp.R;

/**
 * Created by Ashish on 28-09-2017.
 */

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.MyViewHolder> {
    private Context context;
    private List<CountryRes> list = new ArrayList<>();
    public CountryAdapter(Context context, List<CountryRes> list){
        this.context = context;
        this.list = list;
    }
    @Override
    public CountryAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(CountryAdapter.MyViewHolder holder, int position) {
        holder.tvCountryName.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvCountryName;
        public MyViewHolder(View itemView) {
            super(itemView);
            tvCountryName = (TextView)itemView.findViewById(R.id.tv_country_name);
        }
    }
}
