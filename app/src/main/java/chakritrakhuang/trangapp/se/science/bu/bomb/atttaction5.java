package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;

public class atttaction5 extends AppCompatActivity implements OnMapReadyCallback, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    private SliderLayout mDemoSlider;
    WebView mWebView;

    String htmlstr1 = "<p style=\"text-align: center;\">&nbsp;</p>\n" +
            "\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">ข้อมูลทั่วไป :</strong> <strong><span style=\"font-size: 22px;\"> ถ้ำเลเขากอบ </strong><span style=\"font-size: 22px;\">สถานที่ท่องเที่ยวธรรมชาติภายในถ้ำมีหินงอกหินย้อยตลอดเส้นทางถ้ำประมาณ 4 กิโลเมตร&nbsp; เนื่องจากภายในถ้ำมีทางน้ำใต้ดินไหลผ่าน การเข้าไปจึงต้องใช้เรือล่องตามลำน้ำเข้าไปข้างใน เพื่อไปชมหินงอกหินย้อยอันงดงามได้ นอกจากนี้ภายในถ้ำยังมี หนึ่งในความอัศจรรย์ที่ได้รับการยกย่องให้เป็น <strong>Unseen Thailand&nbsp; คือ ถ้ำลอด หรือ ถ้ำมังกร</strong> <span style=\"font-size: 22px;\">ซึ่งถือเป็นไฮไลท์ในการมาเยือนถ้ำเลเขากอบ เพราะสร้างความตื่นเต้น หวาดเสียว ลุ้นระทึก และประทับใจให้กับนักท่องเที่ยว เนื่องจากต้องนอนราบขนานไปกับเรือ เพื่อลอดส่วนที่มีเพดานถ้ำที่ต่ำที่สุด มืดที่สุด แคบที่สุด ตลอดระยะทางประมาณ 350 เมตร เชื่อกันว่าการได้ลอดผ่านจุดนี้ เปรียบเสมือนการนอนลอดผ่านท้องมังกรถือเป็นสิริมงคล ทำให้ชาวจีนในประเทศมาเลเซีย สิงคโปร์ ไต้หวัน เดินทางมาลอดกันเป็นจำนวนมาก</p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">การเดินทาง :</strong><span style=\"font-size: 22px;\"> ถ้ำเลเขากอบห่างจากเมืองตรัง ประมาณ 35 กิโลเมตร ใช้ทางหลวงหมายเลข 4 สายตรัง-ห้วยยอด-วังวิเศษ ทางแยกเข้าถ้ำ อยู่เลยอำเภอห้วยยอดไปทางวังวิเศษประมาณ 7 กิโลเมตร โดยเลี้ยวซ้ายเข้าถนน รพช. (เขากอบ-หัวแหวน) ระหว่างหลัก กิโลเมตรที่ 7-8 เข้าไปประมาณ 500 เมตร จึงเลี้ยวซ้ายไปเขากอบ ซึ่งเป็นสถานที่ตั้ง ถ้ำเลกอบ</p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">วันเวลาเปิด-ปิด :</strong><span style=\"font-size: 22px;\"> สามารถเข้าชมได้ทั้งปี ยกเว้นฤดูน้ำหลาก เวลา 8.00 &ndash; 18.00 น.</p>\n" +
            "\n" +
            "<p style=\"text-align: left;\">&nbsp;</p>";
//------------------------------------------------------------------------------------------------------
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atttaction5);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fragment9);
        mapFragment.getMapAsync(this);
    }
    //------------------------------------------------------------------------------------------------------
    @Override
    public void onMapReady(GoogleMap map) {
        LatLng sydney = new LatLng(7.790147, 99.574124);

        //map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 14));
        map.addMarker(new MarkerOptions().title("ถํ้าเลเขากอบ").position(sydney));
//------------------------------------------------------------------------------------------------------
        mWebView = (WebView) findViewById(R.id.webView2);
        mWebView.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                view.loadUrl(url);
                return true;
            }
        });
        String head1 = "<head><style>@font-face {font-family: 'arial';src: url('file:///android_asset/fonts/angsa.ttf');}body {font-family: 'verdana';}</style></head>";
        String text = "<html>" + head1
                + "<body style=\"font-family: arial\">" + htmlstr1
                + "</body></html>";

        mWebView.loadDataWithBaseURL("",text,"text2/html", "utf-8", "");

        findViewById(R.id.textViewatttaction5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.co.th/maps/dir/13.7125727,100.591817/Khao+Kop+%E0%B8%95%E0%B8%B3%E0%B8%9A%E0%B8%A5+%E0%B9%80%E0%B8%82%E0%B8%B2%E0%B8%81%E0%B8%AD%E0%B8%9A+%E0%B8%AD%E0%B8%B3%E0%B9%80%E0%B8%A0%E0%B8%AD+%E0%B8%AB%E0%B9%89%E0%B8%A7%E0%B8%A2%E0%B8%A2%E0%B8%AD%E0%B8%94+%E0%B8%95%E0%B8%A3%E0%B8%B1%E0%B8%87+92130/@10.7495098,97.5786334,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x30527313e985e75b:0xff8422d2701f0554!2m2!1d99.5741667!2d7.7897222";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

//------------------------------------------------------------------------------------------------------
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<>();
        file_maps.put("ถํ้าเลเขากอบ.", R.drawable.attraction26);
        file_maps.put("ถํ้าเลเขากอบ..", R.drawable.attraction27);
        file_maps.put("ถํ้าเลเขากอบ...", R.drawable.attraction28);

//------------------------------------------------------------------------------------------------------
        for (String name : file_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(this);

            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);

            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(4000);
        mDemoSlider.addOnPageChangeListener(this);
    }
    //------------------------------------------------------------------------------------------------------
    @Override
    protected void onStop() {
        mDemoSlider.stopAutoCycle();
        super.onStop();
    }
    //------------------------------------------------------------------------------------------------------
    public void onSliderClick(BaseSliderView slider) {
        Toast.makeText(this, slider.getBundle().get("extra") + "", Toast.LENGTH_SHORT).show();

    }
//------------------------------------------------------------------------------------------------------

    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }
//------------------------------------------------------------------------------------------------------

    public void onPageSelected(int position) {
        Log.d("Slider Demo", "Page Changed: " + position);
    }
    //------------------------------------------------------------------------------------------------------
    public void onPageScrollStateChanged(int state) {
    }
}