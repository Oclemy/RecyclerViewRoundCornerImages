package com.tutorials.hp.recyclerviewroundcornerimages.mRecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.recyclerviewroundcornerimages.R;
import com.tutorials.hp.recyclerviewroundcornerimages.mCloud.CloudinaryClient;
import com.tutorials.hp.recyclerviewroundcornerimages.mData.TVShow;
import com.tutorials.hp.recyclerviewroundcornerimages.mPicasso.PicassoClient;

import java.util.ArrayList;

/**
 * Created by Oclemmy on 4/27/2016 for ProgrammingWizards Channel.
 */
public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<TVShow> tvShows;

    public MyAdapter(Context c, ArrayList<TVShow> tvShows) {
        this.c = c;
        this.tvShows = tvShows;
    }

    //INITIALIZE VH
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        MyHolder holder=new MyHolder(v);
        return holder;
    }

    //BIND DATA
    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        //NAME
       holder.nameTxt.setText(tvShows.get(position).getName());

        //IMAGE
        PicassoClient.downloadImage(c, CloudinaryClient.getRoundedCornerImage(tvShows.get(position).getUrl()),holder.img);

    }

    @Override
    public int getItemCount() {
        return tvShows.size();
    }
}
