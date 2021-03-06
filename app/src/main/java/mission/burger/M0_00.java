package mission.burger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.silvertouch.MainActivity;
import com.example.silvertouch.R;

import mission.MissionMethods;
import static mission.burger.M0_Map.M0;

public class M0_00 extends AppCompatActivity {

    MissionMethods missionMethods = new MissionMethods();
    Intent i;
    ImageButton di, le, ca, to, exit, hint;
    View.OnClickListener cl;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m000);

        ImageView missionOrder1 = (ImageView)findViewById(R.id.bg_m0_00_mission_order_1);
        ImageView missionOrder2 = (ImageView)findViewById(R.id.bg_m0_00_mission_order_2);
        ImageView missionOrder3 = (ImageView)findViewById(R.id.bg_m0_00_mission_order_3);

        di=(ImageButton) findViewById(R.id.disabled);
        le=(ImageButton) findViewById(R.id.lens);
        ca=(ImageButton) findViewById(R.id.call);
        to=(ImageButton) findViewById(R.id.touch);
        exit=(ImageButton) findViewById(R.id.bg0_x0);
        hint = (ImageButton) findViewById(R.id.m000_hint);

        //몇번째 미션인지
        missionMethods.set_missionOrder(M0,missionOrder1,missionOrder2,missionOrder3);
        //종료버튼
        missionMethods.set_Exit(exit,this);


        cl= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.touch:
                        i = new Intent(getApplicationContext(), mission.burger.M0_01.class);
                        startActivity(i);
                        overridePendingTransition(0, 0); //애니메이션 없애기
                        break;
                }
            }
        };
        to.setOnClickListener(cl);

        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                mp = MediaPlayer.create(getApplicationContext(),R.raw.seburger_1);
                mp.start();
            }
        });
    }
    /*
뒤로가기 버튼 눌렀을 때
*/
    @Override
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // MediaPlayer 해지
        if(mp != null) {
            mp.release();
            mp = null;
        }
    }
}