package finalreport.mobile.dduwcom.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import io.antmedia.android.liveVideoBroadcaster.R;

public class CardviewViewHolder extends RecyclerView.ViewHolder{


    public ImageView icon;
    public TextView title;
    public TextView genre;
    public TextView time;
    public TextView location;

    public CardviewViewHolder(View itemView) {
        super(itemView);
        icon = (ImageView)itemView.findViewById(R.id.vertical_icon);
        title = (TextView) itemView.findViewById(R.id.vertical_title);
        genre = (TextView) itemView.findViewById(R.id.vertical_genre);
        time = (TextView) itemView.findViewById(R.id.vertical_time);
        location = (TextView) itemView.findViewById(R.id.vertical_location);
    }

}