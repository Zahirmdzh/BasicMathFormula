package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMath;
    ArrayList<MathFormula> alMathList;
    CustomAdapter caMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMath = findViewById(R.id.ListViewCube);

        alMathList = new ArrayList<>();
        MathFormula item1 = new MathFormula("Area of Rectangle", "Length x breadth", "Formula Type: Area");
        MathFormula item2 = new MathFormula("Area of Triangle", "Length x Height / (2)", "Formula Type: Area");
        MathFormula item3 = new MathFormula("Volume of Cube","Length x Length x Length", "Formula Type: Volume");


        alMathList.add(item1);
        alMathList.add(item2);
        alMathList.add(item3);


        caMath = new CustomAdapter(this,R.layout.volume_item, alMathList);
        lvMath.setAdapter(caMath);
    }
}
