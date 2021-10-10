package mission.burger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.silvertouch.MainActivity;
import com.example.silvertouch.R;

import mission.MissionMethods;
import static mission.burger.M0_Map.M0;

public class M1_07 extends AppCompatActivity {
    ImageButton more, cancel, ca, mo, lp, tm,exit;
    View.OnClickListener cl;
    Intent i;
    MissionMethods missionMethods = new MissionMethods();

    int count1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m107);

        ImageView missionOrder1 = (ImageView)findViewById(R.id.bg_m1_07_mission_order_1);
        ImageView missionOrder2 = (ImageView)findViewById(R.id.bg_m1_07_mission_order_2);
        ImageView missionOrder3 = (ImageView)findViewById(R.id.bg_m1_07_mission_order_3);



        exit=(ImageButton) findViewById(R.id.bg1_x7);
        cancel=(ImageButton)findViewById(R.id.cancel);
        more=(ImageButton)findViewById(R.id.more);
        ca=(ImageButton)findViewById(R.id.card2);
        mo=(ImageButton)findViewById(R.id.mobile);
        lp=(ImageButton)findViewById(R.id.lpay);
        tm=(ImageButton)findViewById(R.id.tmoney);

        //몇번째 미션인지
        missionMethods.set_missionOrder(M0,missionOrder1,missionOrder2,missionOrder3);
        //종료버튼
        missionMethods.set_Exit(exit,this);




        cl= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.more:
                        i = new Intent(getApplicationContext(), mission.burger.M1_02.class);
                        startActivity(i);
                        overridePendingTransition(0, 0); //애니메이션 없애기
                        break;
                    case R.id.cancel:
                        i = new Intent(getApplicationContext(), mission.burger.M1_00.class);
                        startActivity(i);
                        overridePendingTransition(0, 0); //애니메이션 없애기
                        break;
                    case R.id.card2:
                        i = new Intent(getApplicationContext(), M1_08.class);
                        startActivity(i);
                        overridePendingTransition(0, 0); //애니메이션 없애기
                        break;
                    case R.id.mobile:
                        i = new Intent(getApplicationContext(), M1_08.class);
                        startActivity(i);
                        overridePendingTransition(0, 0); //애니메이션 없애기
                        break;
                    case R.id.lpay:
                        i = new Intent(getApplicationContext(), M1_08.class);
                        startActivity(i);
                        overridePendingTransition(0, 0); //애니메이션 없애기
                        break;
                    case R.id.tmoney:
                        i = new Intent(getApplicationContext(), M1_08.class);
                        startActivity(i);
                        overridePendingTransition(0, 0); //애니메이션 없애기
                        break;

                }
            }
        };
        more.setOnClickListener(cl);
        cancel.setOnClickListener(cl);
        ca.setOnClickListener(cl);
        mo.setOnClickListener(cl);
        lp.setOnClickListener(cl);
        tm.setOnClickListener(cl);
    }
    /*
뒤로가기 버튼 눌렀을 때
*/
    @Override
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), MainActivity.class); //합칠 때 수정필요
        startActivity(i);
        super.onBackPressed();
    }
}