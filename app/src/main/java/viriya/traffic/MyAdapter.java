package viriya.traffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Pc on 21/9/2559.
 */
public class MyAdapter extends BaseAdapter {
    //explicit
    private Context objContext;
    private int[] trafficInts;
    private  String[] trfficStrings;

    public MyAdapter(Context objContext, int[] trafficInts, String[] trfficStrings) {
        this.objContext = objContext;
        this.trafficInts = trafficInts;
        this.trfficStrings = trfficStrings;
    }

    @Override
    public int getCount() {
        return trfficStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i,View view, ViewGroup viewGroup) {
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewl = objLayoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //show Icon
        ImageView iconImageView = (ImageView) viewl.findViewById(R.id.imvShowIcon);
        iconImageView.setBackgroundResource(trafficInts[i]);

        //show Title
        TextView titleTextview = (TextView) viewl.findViewById(R.id.txtShowTitle);
        titleTextview.setText(trfficStrings[i]);
        return viewl;
    }
}   //Main Class
