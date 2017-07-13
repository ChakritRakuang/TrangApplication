package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;
import java.util.Iterator;

import static android.view.View.OnClickListener;
import static com.daimajia.slider.library.SliderTypes.BaseSliderView.OnSliderClickListener;
import static com.daimajia.slider.library.SliderTypes.BaseSliderView.ScaleType;
import static com.daimajia.slider.library.Tricks.ViewPagerEx.OnPageChangeListener;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity implements OnClickListener, OnSliderClickListener, OnPageChangeListener {
    // ประกาศการ Onclick Fragment  โดยการอ้างอิง id ของ  ImageView 
    ImageView imageView;
    ImageView imageView4;
    ImageView imageView3;
    ImageView imageView2;
    private SliderLayout mDemoSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------
        // เพิ่มไอคอนแอพและชื่อแอพ
        //---------------------------------------------------------------------------------------------
        toolbar.setLogo(R.drawable.u2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  ท่องเที่ยวตรัง");
//------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------
        // Onclick Fragment จากภาพ
        //---------------------------------------------------------------------------------------------
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        //ข้อมูลจังหวัดตรัง
        imageView.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent i1 = new Intent(MainActivity.this, InformationTrangProvinceActivity.class);
                startActivity(i1);
            }
        });
//------------------------------------------------------------------------------------------------------
        //ต้องห้ามพลาด
        imageView4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i2 = new Intent(MainActivity.this, TongHamPhlatActivity.class);
                startActivity(i2);
            }
        });
//------------------------------------------------------------------------------------------------------
        //สถานที่ท่องเที่ยว
        imageView3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i3 = new Intent(MainActivity.this, AttractionsTabsTrangActivity.class);
                startActivity(i3);
            }
        });
//------------------------------------------------------------------------------------------------------
        //สินค้าและของฝาก
        imageView2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i4 = new Intent(MainActivity.this, SouvenirsTabsTrangActivity.class);
                startActivity(i4);
            }
        });
//------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------
        // เพิ่มภาพสไล๋น์และตั้งชื่อภาพ
        //---------------------------------------------------------------------------------------------
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<>();
        // โปรแกรมส่วนนี้เอามาจาก Githup
        file_maps.put("ยุทธจักรความอร่อย", R.drawable.index);
        file_maps.put("หอนาฬิกา", R.drawable.trangclocktower);
        file_maps.put("บรรยากาศตัวเมืองตรัง", R.drawable.teetongtaingtrang);
        file_maps.put("ตรังยุทธจักรความอร่อย", R.drawable.mainactivityimg1);
//------------------------------------------------------------------------------------------------------
        // โปรแกรมส่วนนี้เอามาจาก Githup
        for (Iterator<String> iterator = file_maps.keySet().iterator(); iterator.hasNext(); ) {
            String name = iterator.next();
            TextSliderView textSliderView = new TextSliderView(this);
            textSliderView.description(name).image(file_maps.get(name)).setScaleType(ScaleType.Fit).setOnSliderClickListener(this);
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle().putString("extra", name);
            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(4000);
        mDemoSlider.addOnPageChangeListener(this);
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {
        // โชร์คำอธิบายภาพสไล๋น์
        Toast.makeText(this, slider.getBundle().get("extra") + "", Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        Log.d("Slider Demo", "Page Changed: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        int i1 = item.getItemId();
        if (i1 == R.id.about) {
            Intent i = new Intent(MainActivity.this, AboutUSActivity.class);
            startActivity(i);
            return true;
        }
        return false;
    }

    @Override
    public void onClick(View v) {
    }
}