package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17042725 on 18/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<MathFormula> mathFormulas;

    public CustomAdapter(@NonNull Context context,@NonNull  int resource,ArrayList<MathFormula> mathFormulas) {
        super(context, resource, mathFormulas);

        this.parent_context = context;
        this.layout_id = resource;
        this.mathFormulas = mathFormulas;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id,parent,false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvMethod = rowView.findViewById(R.id.textViewMethod);
        TextView tvType = rowView.findViewById(R.id.textViewType);

        MathFormula currentInfo = mathFormulas.get(position);
        tvName.setText(currentInfo.getName());
        tvMethod.setText(currentInfo.getMethod());
        tvType.setText(currentInfo.getType());

        return rowView;
    }
}
