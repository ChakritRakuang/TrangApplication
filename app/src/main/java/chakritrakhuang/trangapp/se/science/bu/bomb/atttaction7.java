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

public class atttaction7 extends AppCompatActivity implements OnMapReadyCallback, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    private SliderLayout mDemoSlider;
    WebView mWebView;

    String htmlstr1 = "<p style=\"text-align: center;\">&nbsp;</p>\n" +
            "\n" +
            "<p><strong><span style=\"font-size: 22px;\">ข้อมูลทั่วไป :</strong><span style=\"font-size: 22px;\"> ตั้งอยู่ถนนหน้าค่าย อยู่ห่างจากเทศบาลกันตังประมาณ 200 เมตร เป็นที่ตั้ง ของสถานที่ประวัติศาสตร์ที่สำคัญแห่งหนึ่งของเมืองตรัง<strong><span style=\"font-size: 22px;\"> &ldquo;จวนเก่าเจ้าเมืองตรัง&rdquo;</strong><span style=\"font-size: 22px;\"> <strong><span style=\"font-size: 22px;\">บ้านพักอดีตเจ้าเมืองตรัง &quot;พระยารัษฎานุประดิษฐ์มหิศรภักดี</strong><span style=\"font-size: 22px;\">&quot; เป็นเรือนไม้ 2 ชั้น มีรูปปั้นหุ่นขี้ผึ้งและเครื่องมือเครื่องใช้ในชีวิตประจำวันของท่านอย่างครบถ้วนโดยทายาทเป็นผู้ดูแลชาวกันตังและเทศบาลเมืองกันตังเห็นว่าบ้านหลังนี้คือหลักฐานสำคัญทางประวัติศาสตร์ควรรักษาไว้คู่เมืองตรังจึงคิดจัดทำเป็นพิพิธภัณฑ์แสดงชีวิต และผลงานของพระยารัษฎาฯให้ชาวตรังได้ศึกษาโดยได้ขออนุญาตใช้เป็นอนุสรณ์สถานของพระยารัษฎาฯ โดย ตาโต๊ะเบียนจง อนุญาตให้จังหวัดตรังใช้บ้านหลังนี้จัดทำเป็นพิพิธภัณฑ์ เมื่อ 10 กันยายน 2535 ใช้นามว่า <strong>พิพิธภัณฑ์พระยารัษฎานุประดิษฐ์ มหิศรภักดี (คอซิมบี๊ ณ ระนอง)</strong></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p><strong><span style=\"font-size: 22px;\">การเดินทาง :</strong><span style=\"font-size: 22px;\"> สามารถนั่งรถไปอำเภอกันตรัง สาย ตรัง-กันตัง ใช้เวลา 30 นาที ขึ้นรถที่หน้าสถานีรถไฟตรัง บอกคนขับลงพิพิธภัณฑ์ พระยารัษฎา ค่าโดยสารคนละ 60 บาท หลังจากนั้นสามารถเดินไปยังสถานีรถไฟกันตังสถานีรถไฟสุดคลาสสิค</p>\n" +
            "\n" +
            "<hr />\n" +
            "<p><strong><span style=\"font-size: 22px;\">วันเวลาเปิด-ปิด :</strong><span style=\"font-size: 22px;\"> เปิดอังคาร - อาทิตย์ 9:00 - 16:00 น. ปิดวันจันทร์ โดยไม่เก็บค่าเข้าชม</p>\n" +
            "\n" +
            "<p>&nbsp;</p>";
    //------------------------------------------------------------------------------------------------------
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atttaction7);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fragment11);
        mapFragment.getMapAsync(this);
    }
    //------------------------------------------------------------------------------------------------------
    @Override
    public void onMapReady(GoogleMap map) {
        LatLng sydney = new LatLng(7.407594, 99.516445);

        //map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 14));
        map.addMarker(new MarkerOptions().title("พิพิธภัณฑ์พระยารัษฎานุประดิษฐ์มหิศรภักดี").position(sydney));
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

        findViewById(R.id.textViewatttaction7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.co.th/maps/dir/13.7125727,100.591817/%E0%B8%9E%E0%B8%B4%E0%B8%9E%E0%B8%B4%E0%B8%98%E0%B8%A0%E0%B8%B1%E0%B8%93%E0%B8%91%E0%B9%8C%E0%B8%9E%E0%B8%A3%E0%B8%B0%E0%B8%A2%E0%B8%B2%E0%B8%A3%E0%B8%B1%E0%B8%A9%E0%B8%8E%E0%B8%B2%E0%B8%99%E0%B8%B8%E0%B8%9B%E0%B8%A3%E0%B8%B0%E0%B8%94%E0%B8%B4%E0%B8%A9%E0%B8%90%E0%B9%8C%E0%B8%A1%E0%B8%AB%E0%B8%B4%E0%B8%A8%E0%B8%A3%E0%B8%A0%E0%B8%B1%E0%B8%81%E0%B8%94%E0%B8%B5+%E0%B8%95%E0%B8%B3%E0%B8%9A%E0%B8%A5+%E0%B8%81%E0%B8%B1%E0%B8%99%E0%B8%95%E0%B8%B1%E0%B8%87+%E0%B8%AD%E0%B8%B3%E0%B9%80%E0%B8%A0%E0%B8%AD+%E0%B8%81%E0%B8%B1%E0%B8%99%E0%B8%95%E0%B8%B1%E0%B8%87+%E0%B8%95%E0%B8%A3%E0%B8%B1%E0%B8%87+92110/@10.5584501,97.5786302,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x304deb6e9322894b:0xdd6178cba708bb1d!2m2!1d99.5154153!2d7.4075831";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

//------------------------------------------------------------------------------------------------------
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<>();
        file_maps.put("พิพิธภัณฑ์พระยารัษฎานุประดิษฐ์มหิศรภักดี.", R.drawable.attraction12);
        file_maps.put("พิพิธภัณฑ์พระยารัษฎานุประดิษฐ์มหิศรภักดี..", R.drawable.attraction13);
        file_maps.put("พิพิธภัณฑ์พระยารัษฎานุประดิษฐ์มหิศรภักดี...", R.drawable.attraction14);

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