package android.example.listview_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] rowNum = {0};

        ListView textListView = findViewById(R.id.list);
        mAdapter = new TextAdapter(this, new ArrayList<Text>());
        textListView.setAdapter(mAdapter);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAdapter.add(new Text("Row : " + rowNum[0]++));
                mAdapter.notifyDataSetChanged();
            }
        });
    }
}