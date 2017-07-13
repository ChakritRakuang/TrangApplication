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

public class atttaction4 extends AppCompatActivity implements OnMapReadyCallback, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    private SliderLayout mDemoSlider;
    WebView mWebView;

    String htmlstr1 = "<p style=\"text-align: left;\">&nbsp;</p>\n" +
            "\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">ข้อมูลทั่วไป : เกาะกระดาน ได้รับการยกย่องว่า เป็น เกาะที่สวยที่สุดของทะเลตรัง</strong><span style=\"font-size: 22px;\"> (ไม่นับเกาะรอก ซึ่งอยู่ในเขตจังหวัดกระบี่ แต่เดินทางได้สะดวกจากตรัง) มีเนื้อที่ประมาณ 600 ไร่ 5 ใน 6 ส่วนของเกาะนี้อยู่ในความรับผิดชอบของอุทยานแห่งชาติหาดเจ้าไหม ที่เหลือเป็นสวนยางและสวนมะพร้าวของเอกชน เกาะกระดานเป็นชายหาดที่มีทรายขาวละเอียด ชายหาดกว้างใหญ่สวยงามน่าเล่นน้ำ น้ำทะเลใสจนมองเห็นแนวปะการังน้ำตื้น ตลอดจนฝูงปลาหลากหลายพันธุ์ ทุกวันจะมีนักท่องเที่ยวมาแวะจอดเรือเล่นน้ำ อาบแดด&nbsp; อีกทั้งยังมีอ่าวเนียง ซึ่งเป็นจุดดำน้ำตื้นชมปะการังได้อย่างสวยงามในวันที่เหมาะสม น้ำทะเลที่อ่าวเนียงนี้จะใสปิ๊งเป็นสีมรกตงดงามมาก เหล่าปะการังใต้น้ำเป็นปะการังแข็งที่มีชีวิต มีฝูงปลาต่างๆ หลากหลายให้ชื่นชม บนเกาะมีที่พักบริการทั้งของเอกชนและหน่วยพิทักษ์ อุทยานฯ</p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">การเดินทาง :</strong><span style=\"font-size: 22px;\"> มีเรือของรีสอร์ทบนเกาะกระดานบริการนักท่องเที่ยวที่จองที่พักกับรีสอร์ท ต่างๆและมีเรือเช่าเหมาลำจากท่าเรือปากเมงและท่าเรือควนตุงกู ใช้เวลาเดินทางประมาณ 1 ชั่วโมงครึ่ง</p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">วันเวลาเปิด-ปิด :</strong><span style=\"font-size: 22px;\"> ฤดูท่องเที่ยวคือ ช่วงเดือน พฤศจิกายน - เมษายน </p>\n" +
            "\n" +
            "<p>&nbsp;</p>";
    //------------------------------------------------------------------------------------------------------
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atttaction4);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fragment8);
        mapFragment.getMapAsync(this);
    }
    //------------------------------------------------------------------------------------------------------
    @Override
    public void onMapReady(GoogleMap map) {
        LatLng sydney = new LatLng(7.316033, 99.252130);

        //map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 14));
        map.addMarker(new MarkerOptions().title("เกาะกระดาน").position(sydney));
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

        findViewById(R.id.textViewatttaction4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.co.th/maps/dir/13.7125727,100.591817/%E0%B8%81%E0%B8%A3%E0%B8%B0%E0%B8%94%E0%B8%B2%E0%B8%99%E0%B8%9A%E0%B8%B5%E0%B8%8A%E0%B8%A3%E0%B8%B5%E0%B8%AA%E0%B8%AD%E0%B8%A3%E0%B9%8C%E0%B8%97+%E0%B8%95%E0%B8%B3%E0%B8%9A%E0%B8%A5+%E0%B9%80%E0%B8%81%E0%B8%B2%E0%B8%B0%E0%B8%A5%E0%B8%B4%E0%B8%9A%E0%B8%87+%E0%B8%AD%E0%B8%B3%E0%B9%80%E0%B8%A0%E0%B8%AD+%E0%B8%81%E0%B8%B1%E0%B8%99%E0%B8%95%E0%B8%B1%E0%B8%87+%E0%B8%95%E0%B8%A3%E0%B8%B1%E0%B8%87+92110/@10.5101945,97.6794158,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x304dde4281cf428d:0x53d4bdbfbcda46a!2m2!1d99.2563261!2d7.3127738";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

//------------------------------------------------------------------------------------------------------
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<>();
        file_maps.put("เกาะกระดาน.", R.drawable.attraction1);
        file_maps.put("เกาะกระดาน..", R.drawable.attraction2);
        file_maps.put("เกาะกระดาน...", R.drawable.attraction3);

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