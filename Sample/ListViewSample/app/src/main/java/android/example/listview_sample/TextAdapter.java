package android.example.listview_sample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class TextAdapter extends ArrayAdapter<Text> {
    public TextAdapter(Context context, List<Text> texts) {
        super(context, 0, texts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Text currentText = getItem(position);

        TextView text1View = listItemView.findViewById(R.id.text);
        text1View.setText(currentText.getText());

        return listItemView;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}