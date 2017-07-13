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

@SuppressWarnings("ALL")
public class atttaction1 extends AppCompatActivity implements OnMapReadyCallback, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    private SliderLayout mDemoSlider;
    WebView mWebView;

    String htmlstr1 = "<p>&nbsp;</p>\n" +
            "\n" +
            "<p><strong><span style=\"font-size: 22px;\">ข้อมูลทั่วไป :ถ้ำมรกต</strong><span style=\"font-size: 22px;\"> หรือเรียกอีกชื่อหนึ่งว่า <strong><span style=\"font-size: 22px;\">ถ้ำน้ำ</strong><span style=\"font-size: 22px;\"> ตั้งอยู่บริเวณ<strong><span style=\"font-size: 22px;\"> เกาะมุก </strong>เป็นถ้ำน้ำทะเลเกิดจากมหัศจรรย์ทางธรรมชาติมีความงดงามตระการตาอย่างมาก<strong> ทางเข้าถ้ำเป็นโพรงจะเข้าออกได้เฉพาะช่วงน้ำลงเท่านั้น </strong>ปากถ้ำเป็นโพรงเล็กๆ การเข้าออกจะต้องลอยคอในน้ำลอดถ้ำอันมืดมิดผ่านเส้นทางคดโค้งระยะทางจากปากถ้ำเข้าไปประมาณ 80 เมตรเข้าแถวเรียงหนึ่งตามคนนำทางจับคนข้างหน้าไว้ให้มั่นไม่งั้นอาจหลงทางได้เมื่อพ้นปากถ้ำออกมาอีกด้านหนึ่งจะเป็นหายทรายขาดสะอาดล้อมรอบด้วยหน้าผาสูงชันบริเวณเป็นโพรงที่ลอดเข้าถ้ำมรกตจะอยู่ทางด้านทิศตะวันตกของตัวเกาะเมื่อแสงอาทิตย์ทำมุมพอเหมาะทั้งเกาะและเวิ้งถ้ำก็จะกลายเป็นสีเขียวมรกตงดงามในทันที</p>\n" +
            "\n" +
            "<hr />\n" +
            "<p><strong><span style=\"font-size: 22px;\">การเดินทาง :</strong><br />\n" +
            "<span style=\"font-size: 22px;\">1. จากจังหวัดตรังใช้ทางหลวงหมายเลข 403 ผ่านอำเภอกันตัง สู่บ้านหาดยาว มีเรือออกไปเที่ยวถ้ำมรกตและดำน้ำดูปะการังทุกวัน ที่ท่าเรือบ้านหาดยาว<br />\n" +
            "<span style=\"font-size: 22px;\">2. จากจังหวัดตรังเดินทางสู่ท่าเรือหาดปากเมง แล้วเช่าเหมาเรือไปเที่ยวถ้ำมรกตได้ ใช้เวลาเดินทาง 40 นาที</p>\n" +
            "\n" +
            "<hr />\n" +
            "<p><strong><span style=\"font-size: 22px;\">วันเวลาเปิด-ปิด :</strong><br />\n" +
            "<span style=\"font-size: 22px;\">- ช่วงเวลาที่ดีที่สุดในการเที่ยวถ้ำมรกต คือ ช่วงที่น้ำขึ้นเต็มที่ในแต่ละวัน เนื่องจากจะเห็นทะเลสาบสีมรกตงดงาม<br />\n" +
            "<span style=\"font-size: 22px;\">- เวลาที่แสงจะลอดปากปล่องถ้ำมรกตลงมา คือ ระหว่าง 10.00 &ndash; 14.00 น. ซึ่งการลอดถ้ำสามารถทำได้ตลอดเวลา<br />\n" +
            "<span style=\"font-size: 22px;\">- เดือนที่เหมาะสมในการท่องเที่ยว คือ ระหว่างเดือนพฤศจิกายนถึงต้นเดือนพฤษภาคม เพราะเป็นเวลาน้ำลง เพื่อมุดเข้าถ้ำมรกตได้</p>\n" +
            "\n" +
            "<p>&nbsp;</p>";
//------------------------------------------------------------------------------------------------------
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koh_mook);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fragment);
        mapFragment.getMapAsync(this);
    }
//------------------------------------------------------------------------------------------------------
    @Override
    public void onMapReady(GoogleMap map) {
        LatLng komook = new LatLng(7.378195, 99.310477);

        //map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(komook, 14));
        map.addMarker(new MarkerOptions().title("ถ้ำมรกต เกาะมุก ตรัง").position(komook));
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

        findViewById(R.id.textView100).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.co.th/maps/dir/13.7125627,100.5918791/%E0%B8%97%E0%B9%88%E0%B8%B2%E0%B9%80%E0%B8%A3%E0%B8%B7%E0%B8%AD%E0%B8%9B%E0%B8%B2%E0%B8%81%E0%B9%80%E0%B8%A1%E0%B8%87+Tambon+Administrative+Organizations+TRANG2004+,+Mai+Fat+,+92150+Sikao,+Trang,+Thailand/@10.6028575,97.4431337,7z/data=!4m9!4m8!1m1!4e1!1m5!1m1!1s0x304de4d20918ddc1:0xd7bbd0a2af9a8e63!2m2!1d99.312079!2d7.507778?hl=en";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
//------------------------------------------------------------------------------------------------------
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<>();
        file_maps.put("ถ้ำมรกต เกาะมุก ตรัง.", R.drawable.attraction1);
        file_maps.put("ถ้ำมรกต เกาะมุก ตรัง..", R.drawable.attraction2);
        file_maps.put("ถ้ำมรกต เกาะมุก ตรัง...", R.drawable.attraction3);
//------------------------------------------------------------------------------------------------------
        for (String name : file_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(this);

            textSliderView.description(name).image(file_maps.get(name)).setScaleType(BaseSliderView.ScaleType.Fit).setOnSliderClickListener(this);
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