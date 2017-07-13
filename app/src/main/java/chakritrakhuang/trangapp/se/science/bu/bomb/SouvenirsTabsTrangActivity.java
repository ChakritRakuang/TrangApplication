package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

@SuppressWarnings("ALL")
public class SouvenirsTabsTrangActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView FrameLayoutn1;
    ImageView FrameLayoutpak_meng_sin2;
    ImageView FrameLayoutpak_meng_sin3;
    ImageView FrameLayoutpak_meng_sin4;
    ImageView FrameLayoutpak_meng_sin5;

//------------------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.souvenirstrang_activity);
//------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------
        // Onclick From
        //---------------------------------------------------------------------------------------------
        FrameLayoutn1 = (ImageView) findViewById(R.id.FrameLayoutn1);
        FrameLayoutn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i21 = new Intent(SouvenirsTabsTrangActivity.this, trangmuuuyang.class);
                startActivity(i21);
            }
        });

        FrameLayoutpak_meng_sin2 = (ImageView) findViewById(R.id.FrameLayoutpak_meng_sin2);
        FrameLayoutpak_meng_sin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i22 = new Intent(SouvenirsTabsTrangActivity.this, khunglong.class);
                startActivity(i22);
            }
        });

        FrameLayoutpak_meng_sin3 = (ImageView) findViewById(R.id.FrameLayoutpak_meng_sin3);
        FrameLayoutpak_meng_sin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i23 = new Intent(SouvenirsTabsTrangActivity.this, cakerose.class);
                startActivity(i23);
            }
        });

        FrameLayoutpak_meng_sin4 = (ImageView) findViewById(R.id.FrameLayoutpak_meng_sin4);
        FrameLayoutpak_meng_sin4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i24 = new Intent(SouvenirsTabsTrangActivity.this, caketragrueelrabb.class);
                startActivity(i24);
            }
        });

        FrameLayoutpak_meng_sin5 = (ImageView) findViewById(R.id.FrameLayoutpak_meng_sin5);
        FrameLayoutpak_meng_sin5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i25 = new Intent(SouvenirsTabsTrangActivity.this, phathonamuensi.class);
                startActivity(i25);
            }
        });
//------------------------------------------------------------------------------------------------------
    }

    public void onClick(View v) {

    }
}