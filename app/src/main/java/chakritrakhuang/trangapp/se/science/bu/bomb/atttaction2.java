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

public class atttaction2 extends AppCompatActivity implements OnMapReadyCallback, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    private SliderLayout mDemoSlider;
    WebView mWebView;
    String htmlstr1 = "<p style=\"text-align: left;\">&nbsp;</p>\n" +
            "\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">ข้อมูลทั่วไป : อุทยานแห่งชาติหาดเจ้าไหม </strong> <span style=\"font-size: 22px;\">เป็นแหล่งท่องเที่ยวที่ได้นับความนิยมมากอีกแห่งหนึ่งของทะเลตรัง มีแหล่งท่องเที่ยวทั้งที่อยู่บนฝั่งและอยู่ในทะเล หลายประเภท ทั้ง ประเภทถ้ำ บ่อน้ำร้อน ชายหาด และแหล่งดำน้ำดูปะการัง เป็นต้น อุทยานแห่งชาติแห่งนี้อยู่ในเขตอิทธิพลของลมมรสุมตะวันตกเฉียงใต้ช่วงระหว่างเดือนกรกฎาคม - กันยายน มีฝนตกชุก คลื่นลมแรง ดังนั้น เพื่อความปลอดภัยของนักท่องเที่ยว จึงมีกำหนดปิดการท่องเที่ยวประจำปี บริเวณถ้ำมรกต เกาะกระดาน เกาะเชือก และเกาะแหวน ในระหว่างวันที่ 1 กรกฎาคม - 30 กันยายน ของทุกปี สำหรับแหล่งท่องเที่ยวที่อยู่บนฝั่ง สามารถท่องเที่ยวได้ตามปกติตลอดทั้งปี</p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">การเดินทาง :</strong>&nbsp;<br />\n" +
            "<strong><span style=\"font-size: 22px;\">รถยนต์ :</strong> <span style=\"font-size: 22px;\"> จากจังหวัดตรังไปตามทางหลวงจังหวัดตรังหมายเลข 4046 (ตรัง &ndash; สิเกา) ถึงกิโลเมตรที่ 30 เลี้ยวซ้ายไปตามทางหลวงจังหวัดหมายเลข 4162 สู่หาดปากเมงเป็นระยะทาง ประมาณ 40 กิโลเมตร จากหาดปากเมงเลี้ยวซ้ายไปตามถนนเลียบชายหาดอีกประมาณ 7 กิโลเมตร ก็จะถึงที่ทำการอุทยานแห่งชาติหาดเจ้าไหม (บริเวณหาดฉางหลาง) รวมระยะทางทั้งสิ้น 47 กิโลเมตร</p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">เรือ :</strong><span style=\"font-size: 22px;\"> การเดินทางไปตามเกาะต่าง ๆ ให้ติดต่อเช่าเหมาเรือที่ท่าเรือปากเมง ท่าเรือหาดยาว และท่าเรือควนตุ้งกู ท่าเรือปากเมงเป็นท่าเรือหลักที่จะไปยังเกาะต่าง ๆ คือ เกาะกระดาน เกาะมุกต์ เกาะแหวน และเกาะเชือก โดยมีที่พักในหมู่เกาะเหล่านี้ 3 แห่ง คือ เกาะกระดาน เกาะมุกต์ และเกาะไหง ระยะทางจากหาดปากเมงถึงตรัง 40 กิโลเมตร ใช้เวลาในการเดินทางประมาณ 30 นาที มีเรือให้เช่าโดยลักษณะการเช่าเป็นวัน ท่าเรือหาดยาว เป็นท่าเรือที่ตั้งอยู่ถนนสายตรัง-กันตัง ข้ามฟากไปท่าส้ม แล้ววิ่งตามทางไปยังหาดเจ้าไหม ระยะทางประมาณ 50 กิโลเมตร แล้วลงไปยังท่าเรือไปเกาะต่าง ๆ ได้</p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">วันเวลาเปิด-ปิด :</strong> <span style=\"font-size: 22px;\">เวลาเปิดทำการ: 06.00 - 18.00 น.</p>\n" +
            "\n" +
            "<p>&nbsp;</p>";
//------------------------------------------------------------------------------------------------------
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atttaction2);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fragment6);
        mapFragment.getMapAsync(this);
    }
//------------------------------------------------------------------------------------------------------
    @Override
    public void onMapReady(GoogleMap map) {
        LatLng AndamanSea = new LatLng(7.407721, 99.346103);

        //map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(AndamanSea, 14));
        map.addMarker(new MarkerOptions().title("อุทยานแห่งชาติหาดเจ้าไหม").position(AndamanSea));
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

        mWebView.loadDataWithBaseURL("",text,"text11/html", "utf-8", "");

        findViewById(R.id.textViewatttaction2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.co.th/maps/dir/13.7125727,100.591817/%E0%B8%AD%E0%B8%B8%E0%B8%97%E0%B8%A2%E0%B8%B2%E0%B8%99%E0%B9%81%E0%B8%AB%E0%B9%88%E0%B8%87%E0%B8%8A%E0%B8%B2%E0%B8%95%E0%B8%B4%E0%B8%AB%E0%B8%B2%E0%B8%94%E0%B9%80%E0%B8%88%E0%B9%89%E0%B8%B2%E0%B9%84%E0%B8%AB%E0%B8%A1+%E0%B8%AD%E0%B8%B3%E0%B9%80%E0%B8%A0%E0%B8%AD+%E0%B8%AA%E0%B8%B4%E0%B9%80%E0%B8%81%E0%B8%B2+%E0%B8%95%E0%B8%A3%E0%B8%B1%E0%B8%87/@10.5588371,97.4431019,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x304de60b41336a57:0x3f645c86ee500475!2m2!1d99.3449377!2d7.4069937";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

//------------------------------------------------------------------------------------------------------
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<>();
        file_maps.put("อุทยานแห่งชาติ หาด เจ้า ไหม.", R.drawable.attraction4);
        file_maps.put("อุทยานแห่งชาติ หาด เจ้า ไหม..", R.drawable.attraction5);
        file_maps.put("อุทยานแห่งชาติ หาด เจ้า ไหม...", R.drawable.attraction6);

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