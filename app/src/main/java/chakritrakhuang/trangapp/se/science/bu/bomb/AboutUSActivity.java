package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

@SuppressWarnings("ALL")
public class AboutUSActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView aboutexit;
    private Boolean isFabOpen = false;
    private FloatingActionButton fab,fab1;
    private Animation fab_open,fab_close,rotate_forward,rotate_backward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();//ซ่อน actionbar
        setContentView(R.layout.aboutus_activity);

        //Onclick AboutUs
        aboutexit = (ImageView) findViewById(R.id.aboutexit);
        aboutexit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i1 = new Intent(AboutUSActivity.this, MainActivity.class);
                startActivity(i1);
            }
        });

        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i2 = new Intent(AboutUSActivity.this, FragmentCredit.class);
                startActivity(i2);
            }
        });

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_backward);
        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.fab:
                animateFAB();
                break;
            case R.id.fab1:
                Log.d("Chakrit", "เครดิต");
                break;
        }
    }

    public void animateFAB() {

        if (isFabOpen) {

            fab.startAnimation(rotate_backward);
            fab1.startAnimation(fab_close);
            fab1.setClickable(false);
            isFabOpen = false;
            Log.d("Chakrit", "close");

        } else {

            fab.startAnimation(rotate_forward);
            fab1.startAnimation(fab_open);
            fab1.setClickable(true);
            isFabOpen = true;
            Log.d("Chakrit", "open");

        }
    }
}