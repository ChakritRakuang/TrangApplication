package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FragmentCredit extends AppCompatActivity  {

    public static Intent createIntent(Context context) {
        return new Intent(context, FragmentCredit.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();//ซ่อน actionbar
        setContentView(R.layout.fragment_credit);

        FloatingActionButton fab3 = (FloatingActionButton) findViewById(R.id.fab3);
        fab3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i2 = new Intent(FragmentCredit.this, AboutUSActivity.class);
                startActivity(i2);
            }
        });


    }
}
