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

public class atttaction10 extends AppCompatActivity implements OnMapReadyCallback, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    private SliderLayout mDemoSlider;
    WebView mWebView;

    String htmlstr1 = "<p style=\"text-align: left;\"><br />\n" +
            "<strong><span style=\"font-size: 22px;\">ข้อมูลทั่วไป : สถานีรถไฟกันตัง</strong> <span style=\"font-size: 22px;\">ตั้งอยู่บนถนนหน้าค่าย ตำบลกันตัง อำเภอกันตังจังหวัดตรังเป็นสถานีรถไฟสุดทางของทางรถไฟสายใต้ฝั่งทะเลอันดามันสถานีรถไฟกันตังเปิดใช้อย่างเป็นทางการเมื่อวันที่  1  เมษายน  พ.ศ.  2456  ใช้เป็นที่รับส่งสินค้ากับต่างประเทศทั้งสิงคโปร์ มาเลเซีย อินโดนีเซียมีรางรถไฟต่อไปเป็นระยะทาง 500 เมตร สถานีรถไฟกันตังเป็นอาคารไม้ชั้นเดียวทรงปั้นหยาทาสีเหลืองมัสตาร์ดสลับน้ำตาลอันเป็นคู่สีหลักที่คุ้นตาของอาคารรถไฟทั่วไปตัวอาคารแบ่งออกเป็น 2 ส่วนคือตัวอาคารและชานชาลาด้านหน้าของอาคารมีมุขยื่นมีการตกแต่งประดับมุมเสาด้วยลวดลายไม้ฉลุคงเอกลักษณ์เดิมตั้งแต่สมัยรัชกาลที่ 6 <strong><span style=\"font-size: 22px;\">ปัจจุบันได้รับการขึ้นทะเบียนเป็นโบราณสถานโดยกรมศิลปากรแล้ว</strong><strong> </strong></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">การเดินทาง :</strong><span style=\"font-size: 22px;\"> สามารถนั่งรถไปอำเภอกันตรัง สาย ตรัง-กันตัง ใช้เวลา 30 นาที ขึ้นรถที่หน้าสถานีรถไฟตรัง บอกคนขับลงสถานีรถไฟกันตัง จังหวัดตรังพระยารัษฎา ค่าโดยสารคนละ 60 บาท หลังจากเที่ยวชมสถานีรถไฟกันตังก็สามารถเดินไปชมพิพิธภัณฑ์ พระยารัษฎา ซึ่งอยู่ไม่ไกลกัน</p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">วันเวลาเปิด-ปิด :</strong><span style=\"font-size: 22px;\"> เที่ยวชมได้ตลอดวัน</p>\n" +
            "\n" +
            "<p style=\"text-align: left;\">&nbsp;</p>";

    public static Intent createIntent(Context context) {
        return new Intent(context, atttaction10.class);
    }
//------------------------------------------------------------------------------------------------------
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atttaction10);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fragment14);
        mapFragment.getMapAsync(this);
    }
//------------------------------------------------------------------------------------------------------
    @Override
    public void onMapReady(GoogleMap map) {
        LatLng สถานีรถไฟกันตัง = new LatLng(7.410655, 99.515196);

        //map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(สถานีรถไฟกันตัง, 14));
        map.addMarker(new MarkerOptions().title("สถานีรถไฟกันตัง").position(สถานีรถไฟกันตัง));
//------------------------------------------------------------------------------------------------------
        mWebView = (WebView) findViewById(R.id.webView2);
        mWebView.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                view.loadUrl(url);
                return true;
            }
        });
        String head1 = "<head><style>@font-face {font-family: 'arial';src: url('file:///android_asset/fonts/angsa.ttf');}body {font-family: 'verdana';}</style></head>";
        String text = "<html>" + head1
                + "<body style=\"font-family: arial\">" + htmlstr1
                + "</body></html>";

        mWebView.loadDataWithBaseURL("",text,"text19/html", "utf-8", "");

        findViewById(R.id.textViewatttaction10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.co.th/maps/dir/13.7126176,100.591814/%E0%B8%AA%E0%B8%96%E0%B8%B2%E0%B8%99%E0%B8%B5%E0%B8%A3%E0%B8%96%E0%B9%84%E0%B8%9F%E0%B8%81%E0%B8%B1%E0%B8%99%E0%B8%95%E0%B8%B1%E0%B8%87+%E0%B8%95%E0%B8%B3%E0%B8%9A%E0%B8%A5+%E0%B8%81%E0%B8%B1%E0%B8%99%E0%B8%95%E0%B8%B1%E0%B8%87+%E0%B8%AD%E0%B8%B3%E0%B9%80%E0%B8%A0%E0%B8%AD+%E0%B8%81%E0%B8%B1%E0%B8%99%E0%B8%95%E0%B8%B1%E0%B8%87+%E0%B8%95%E0%B8%A3%E0%B8%B1%E0%B8%87+92110/@10.5583088,97.5786287,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x304deb6f9e6e9a29:0x9ef03bfda07e01d!2m2!1d99.5143932!2d7.4106376";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

//------------------------------------------------------------------------------------------------------
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<>();
        file_maps.put("สถานีรถไฟกันตัง.", R.drawable.attraction15);
        file_maps.put("สถานีรถไฟกันตัง..", R.drawable.attraction16);
        file_maps.put("สถานีรถไฟกันตัง...", R.drawable.attraction17);

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