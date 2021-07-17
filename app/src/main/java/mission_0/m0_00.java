package mission_0;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.silvertouch.R;

public class m0_00 extends AppCompatActivity {

    public static int M0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.m0_00);

        ImageView missionOrder1 = (ImageView)findViewById(R.id.missionOrder_1);
        ImageView missionOrder2 = (ImageView)findViewById(R.id.missionOrder_2);
        ImageView missionOrder3 = (ImageView)findViewById(R.id.missionOrder_3);

        int missionOrder = getIntent().getIntExtra("missionOrder",0);

        M0 = missionOrder;

        if (missionOrder==1){
            missionOrder1.setVisibility(View.VISIBLE);
            missionOrder2.setVisibility(View.INVISIBLE);
            missionOrder3.setVisibility(View.INVISIBLE);
        }else if (missionOrder==2){
            missionOrder1.setVisibility(View.INVISIBLE);
            missionOrder2.setVisibility(View.VISIBLE);
            missionOrder3.setVisibility(View.INVISIBLE);
        }else if (missionOrder==3){
            missionOrder1.setVisibility(View.INVISIBLE);
            missionOrder2.setVisibility(View.INVISIBLE);
            missionOrder3.setVisibility(View.VISIBLE);
        }
    }
}
