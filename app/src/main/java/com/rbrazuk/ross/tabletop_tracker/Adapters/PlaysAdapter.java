package com.rbrazuk.ross.tabletop_tracker.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rbrazuk.ross.tabletop_tracker.Models.Play;
import com.rbrazuk.ross.tabletop_tracker.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlaysAdapter extends RecyclerView.Adapter<PlaysAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_play_game_title) TextView mPlayGameTitle;
        @BindView(R.id.tv_play_date) TextView mPlayDate;
        @BindView(R.id.tv_play_players_info) TextView mPlayersInfo;


        public ViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }

    private List<Play> mPlays;
    private Context mContext;

    public PlaysAdapter(Context context, List<Play> plays) {
        mContext = context;
        mPlays = plays;
    }

    private Context getContext() {
        return mContext;
    }


    @Override
    public PlaysAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View playView = inflater.inflate(R.layout.list_item_play, parent, false);

        ViewHolder holder = new ViewHolder(playView);

        return holder;
    }

    @Override
    public void onBindViewHolder(PlaysAdapter.ViewHolder holder, int position) {
        Play play = mPlays.get(position);

//        holder.mPlayGameTitle.setText(play.getGame().getTitle());
//        holder.mPlayDate.setText(play.getDate().getMonthOfYear() + "/" + play.getDate().getDayOfMonth());
//        holder.mPlayersInfo.setText(play.getNumberOfPlayers() + " players");
    }

    @Override
    public int getItemCount() {
        return mPlays.size();
    }


}
