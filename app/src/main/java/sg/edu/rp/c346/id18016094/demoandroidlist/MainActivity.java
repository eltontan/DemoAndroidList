package sg.edu.rp.c346.id18016094.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayAdapter <AndroidVersion> aa;
    ArrayList<AndroidVersion> androidList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewAndroid);

        androidList = new ArrayList<>();
        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        androidList.add(item1);
        androidList.add(item2);
        androidList.add(item3);

        aa = new CustomAdapter(this, R.layout.row, androidList);
        lvMovie.setAdapter(aa);


    }
}