package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

@SuppressWarnings("ALL")
public class AttractionsTabsTrangActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView Attractiontrangimg1;
    ImageView nnnFrameLayoutpak_meng_sin2;
    ImageView nnnFrameLayoutpak_meng_sin3;
    ImageView nnnFrameLayoutpak_meng_sin4;
    ImageView nnnFrameLayoutpak_meng_sin5;
    ImageView nnnFrameLayoutpak_meng_sin6;
    ImageView nnnFrameLayoutpak_meng_sin7;
    ImageView nnnFrameLayoutpak_meng_sin8;
    ImageView nnnFrameLayoutpak_meng_sin9;
    ImageView nnnFrameLayoutpak_meng_sin10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attractiontrang_activity);

//---------------------------------------------------------------------------------------------
// Onclick From
//---------------------------------------------------------------------------------------------

        ImageView  Attractiontrangimg1 = (ImageView ) findViewById(R.id.Attractiontrangimg1);
        Attractiontrangimg1.setOnClickListener(this);

        ImageView  nnnFrameLayoutpak_meng_sin2 = (ImageView ) findViewById(R.id.nnnFrameLayoutpak_meng_sin2);
        nnnFrameLayoutpak_meng_sin2.setOnClickListener(this);

        ImageView  nnnFrameLayoutpak_meng_sin3 = (ImageView ) findViewById(R.id.nnnFrameLayoutpak_meng_sin3);
        nnnFrameLayoutpak_meng_sin3.setOnClickListener(this);

        ImageView  nnnFrameLayoutpak_meng_sin4 = (ImageView ) findViewById(R.id.nnnFrameLayoutpak_meng_sin4);
        nnnFrameLayoutpak_meng_sin4.setOnClickListener(this);

        ImageView  nnnFrameLayoutpak_meng_sin5 = (ImageView ) findViewById(R.id.nnnFrameLayoutpak_meng_sin5);
        nnnFrameLayoutpak_meng_sin5.setOnClickListener(this);

        ImageView  nnnFrameLayoutpak_meng_sin6 = (ImageView ) findViewById(R.id.nnnFrameLayoutpak_meng_sin6);
        nnnFrameLayoutpak_meng_sin6.setOnClickListener(this);

        ImageView  nnnFrameLayoutpak_meng_sin7 = (ImageView ) findViewById(R.id.nnnFrameLayoutpak_meng_sin7);
        nnnFrameLayoutpak_meng_sin7.setOnClickListener(this);

        ImageView  nnnFrameLayoutpak_meng_sin8 = (ImageView ) findViewById(R.id.nnnFrameLayoutpak_meng_sin8);
        nnnFrameLayoutpak_meng_sin8.setOnClickListener(this);

        ImageView  nnnFrameLayoutpak_meng_sin9 = (ImageView ) findViewById(R.id.nnnFrameLayoutpak_meng_sin9);
        nnnFrameLayoutpak_meng_sin9.setOnClickListener(this);

        ImageView  nnnFrameLayoutpak_meng_sin10 = (ImageView ) findViewById(R.id.nnnFrameLayoutpak_meng_sin10);
        nnnFrameLayoutpak_meng_sin10.setOnClickListener(this);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Attractiontrangimg1:
                startActivity(new Intent(AttractionsTabsTrangActivity.this, atttaction1.class));
                break;
            case R.id.nnnFrameLayoutpak_meng_sin2:
                startActivity(new Intent(AttractionsTabsTrangActivity.this, atttaction2.class));
                break;
            case R.id.nnnFrameLayoutpak_meng_sin3:
                startActivity(new Intent(AttractionsTabsTrangActivity.this, atttaction3.class));
                break;
            case R.id.nnnFrameLayoutpak_meng_sin4:
                startActivity(new Intent(AttractionsTabsTrangActivity.this, atttaction4.class));
                break;
            case R.id.nnnFrameLayoutpak_meng_sin5:
                startActivity(new Intent(AttractionsTabsTrangActivity.this, atttaction5.class));
                break;
            case R.id.nnnFrameLayoutpak_meng_sin6:
                startActivity(new Intent(AttractionsTabsTrangActivity.this, atttaction6.class));
                break;
            case R.id.nnnFrameLayoutpak_meng_sin7:
                startActivity(new Intent(AttractionsTabsTrangActivity.this, atttaction7.class));
                break;
            case R.id.nnnFrameLayoutpak_meng_sin8:
                startActivity(new Intent(AttractionsTabsTrangActivity.this, atttaction8.class));
                break;
            case R.id.nnnFrameLayoutpak_meng_sin9:
                startActivity(new Intent(AttractionsTabsTrangActivity.this, atttaction9.class));
                break;
            case R.id.nnnFrameLayoutpak_meng_sin10:
                startActivity(new Intent(AttractionsTabsTrangActivity.this, atttaction10.class));
                break;
        }
    }
}