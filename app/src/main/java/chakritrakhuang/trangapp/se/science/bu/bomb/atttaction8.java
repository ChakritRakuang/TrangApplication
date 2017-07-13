package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.content.Context;
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

public class atttaction8 extends AppCompatActivity implements OnMapReadyCallback, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    private SliderLayout mDemoSlider;
    WebView mWebView;

    String htmlstr1 = "<p style=\"text-align: left;\"><br />\n" +
            "\n" +
            "<strong><span style=\"font-size: 22px;\">ข้อมูลทั่วไป :</strong><span style=\"font-size: 22px;\"> ต้นยางพาราต้นแรก  จะอยู่ก่อนจะเข้าเมืองกันตัง  หน้าสหกรณ์การเกษตรกันตัง คุณจะเห็นป้ายบอก  <strong><span style=\"font-size: 22px;\"> &quot;ต้นยางพารา</strong><span style=\"font-size: 22px;\">&quot;  ต้นแรกของประเทศไทยเป็นต้นยางที่ <strong><span style=\"font-size: 22px;\">พระยารัษฎานุประดิษฐ์มหิศรภักดี</strong><span style=\"font-size: 22px;\"> เดินทางไปดูงานในประเทศมลายู เห็นชาวมลายูปลุกยางกันมีผลดีมาก ก็เกิดความสนใจที่จะนำยาง เข้ามาปลูกใน ประเทศไทยบ้างแต่พันธุ์ยาง สมัยนั้น ฝรั่งซึ่งเป็นเจ้าของสวนยาง หวงมาก ทำให้ไม่สามารถนนำพันธุ์ยางกลับมาได้ ในการเดินทางครั้งนั้นจนกระทั่ง พ.ศ. 2444 พระสถล สถานพิทักษ์ เดินทางไปที่ประเทศอินโดเซีย จึงมีโอกาสนำกล้ากลับมาได้ โดยเอากล้ายางมาหุ้มรากด้วยสำลีชุบน้ำ แล้วหุ้มทับด้วยยกระดาษหนังสือพิมพ์อีกชั้นหนึ่งจึงบรรจุลงลังไม้ฉำฉา ใส่เรือกลไฟซึ่ง เป็นเรือส่วนตัวของพระสถลฯรีบเดินทางกลับประเทศไทยทันที</p>\n" +
            "\n" +
            "<p style=\"text-align: left;\"><span style=\"font-size: 22px;\">ยางที่นำมาครั้งนี้มีจำนวน ถึง 4 ลัง ด้วยกันพระสถลสถานพิทักษ์ได้นำมาปลูกไว้ที่บริเวณหน้าบ้านพักที่อำเภอกันตังจังหวัดตรังซึ่งปัจจุบันนี้ยังเหลือให้เห็นเป็นหลักฐานเพียงต้นเดียวอยู่บริเวณหน้าสหกรณ์การเกษตรกันตังและจากยางรุ่นแรกนี้ พระสถล สถานพิทักษ์ ได้ขยายเนื้อที่ปลูกออกไปจนมีเนื้อที่ปลูกประมาณ 45 ไร่ นับได้ว่าพระสถลสถานพิทักษ์ คือ ผู้เป็น เจ้าของสวนยางคนแรกของประเทศไทยจากนั้นพระยารัษฎานุประดิษฐ์ได้ส่งคนไปเรียนวิธีปลูกยางเพื่อมาสอนประชาชนนักเรียนของท่านที่ส่งไปก็ล้วนแต่เป็นเจ้าเมือง นายอำเภอ กำนัน และผู้ใหญ่บ้านทั้งสิ้นพร้อมกันนั้นท่านก็สั่งให้กำนัน ผู้ใหญ่บ้าน นำพันธุ์ยาง ไปแจกจ่ายและส่งเสริมให้ราษฎรปลูกทั่วไปซึ่งในยุคนั้น อาจกล่าวได้ว่าเป็นยุคตื่นยาง และชาวบ้านเรียก ยางพารานี้ว่า <strong><span style=\"font-size: 22px;\">&ldquo;ยางเทศา&rdquo;</strong></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">การเดินทาง :</strong><span style=\"font-size: 22px;\"> ตั้งอยู่ที่ถนนตรังคภูมิตำบลกันตัง อำเภอกันตัง จังหวัดตรัง ก่อนเข้าสู่ตัวอำเภอกันตัง หน้าสหกรณ์การเกษตรกันตัง</p>\n" +
            "\n" +
            "<p style=\"text-align: left;\">&nbsp;</p>";

    public static Intent createIntent(Context context) {
        return new Intent(context, atttaction8.class);
    }
//------------------------------------------------------------------------------------------------------
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atttaction8);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fragment12);
        mapFragment.getMapAsync(this);
    }
//------------------------------------------------------------------------------------------------------
    @Override
    public void onMapReady(GoogleMap map) {
        LatLng sydney = new LatLng(7.409489, 99.523647);

        //map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 14));
        map.addMarker(new MarkerOptions().title("ต้นยางพาราต้นแรกของประเทศไทย").position(sydney));
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

        findViewById(R.id.textViewatttaction8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.co.th/maps/dir/13.7126176,100.591814/%E0%B8%95%E0%B9%89%E0%B8%99%E0%B8%A2%E0%B8%B2%E0%B8%87%E0%B8%9E%E0%B8%B2%E0%B8%A3%E0%B8%B2%E0%B8%95%E0%B9%89%E0%B8%99%E0%B9%81%E0%B8%A3%E0%B8%81%E0%B8%82%E0%B8%AD%E0%B8%87%E0%B8%9B%E0%B8%A3%E0%B8%B0%E0%B9%80%E0%B8%97%E0%B8%A8%E0%B9%84%E0%B8%97%E0%B8%A2(First+Para+Rubber+Tree)+%E0%B8%95%E0%B8%B3%E0%B8%9A%E0%B8%A5+%E0%B8%81%E0%B8%B1%E0%B8%99%E0%B8%95%E0%B8%B1%E0%B8%87+%E0%B8%AD%E0%B8%B3%E0%B9%80%E0%B8%A0%E0%B8%AD+%E0%B8%81%E0%B8%B1%E0%B8%99%E0%B8%95%E0%B8%B1%E0%B8%87+%E0%B8%95%E0%B8%A3%E0%B8%B1%E0%B8%87+92110/@10.5587245,97.5786287,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x304deb4283af74fb:0xfefb5bd2a6f8d1d0!2m2!1d99.5228428!2d7.4095846";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

//------------------------------------------------------------------------------------------------------
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<>();
        file_maps.put("ต้นยางพาราต้นแรกของประเทศไทย.", R.drawable.attraction23);
        file_maps.put("ต้นยางพาราต้นแรกของประเทศไทย..", R.drawable.attraction24);
        file_maps.put("ต้นยางพาราต้นแรกของประเทศไทย...", R.drawable.attraction25);

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