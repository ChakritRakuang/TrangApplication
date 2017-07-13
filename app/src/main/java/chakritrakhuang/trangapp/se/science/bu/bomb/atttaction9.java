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

public class atttaction9 extends AppCompatActivity implements OnMapReadyCallback, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    private SliderLayout mDemoSlider;
    WebView mWebView;

    String htmlstr1 = "<p style=\"text-align: center;\">&nbsp;</p>\n" +
            "\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">ข้อมูลทั่วไป : </strong><span style=\"font-size: 22px;\">โบสถ์คริสต์เก่าแก่ อายุเกือบร้อยปี ที่คริสตจักรตรัง สร้างขึ้นในปี 1915 มีอักษรจารึกไว้เหนือบันไดทางเข้าข้างหน้าว่า<strong><span style=\"font-size: 22px;\"> &ldquo;วิหารคริสตศาสนา สร้าง ค.ศ. 1915&rdquo;</strong><span style=\"font-size: 22px;\"> แต่เดิมนั้นหอระฆังเป็นเพียงดาดฟ้า มีลักษณะคล้ายกับป้อมทหารสมัยโบราณ หลังจากนั้นมีปรับปรุงใหม่ เนื่องจากระฆังที่อยู่ในหอระฆังชั้นที่สอง ดังก้องมากเกินไป จึงเพิ่มชั้นบนขึ้นเช่นที่เห็นในปัจจุบัน</p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">การเดินทาง :</strong><br />\n" +
            "<span style=\"font-size: 22px;\">อยู่ห่างจากกรุงเทพประมาณ 858 กม.ใช้เวลาเดินทางจากกรุงเทพประมาณ 10 ชั่วโมง 30 นาที อยู่ห่างจากตัวจังหวัดประมาณ 24.3 กม.ใช้เวลาเดินทางตัวจังหวัดประมาณ 33 นาที<br />\n" +
            "<span style=\"font-size: 22px;\">อยู่ห่างจากตัวอำเภอประมาณ 0.5 กม.ใช้เวลาเดินทางตัวอำเภอประมาณ 2 นาท</p>\n" +
            "\n" +
            "<p>&nbsp;</p>";
//------------------------------------------------------------------------------------------------------
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atttaction9);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fragment13);
        mapFragment.getMapAsync(this);
    }
    //------------------------------------------------------------------------------------------------------
    @Override
    public void onMapReady(GoogleMap map) {
        LatLng โบสถ์คริสต์ = new LatLng(7.559170, 99.605205);

        //map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(โบสถ์คริสต์, 14));
        map.addMarker(new MarkerOptions().title("โบสถ์คริสต์").position(โบสถ์คริสต์));
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

        mWebView.loadDataWithBaseURL("",text,"text18/html", "utf-8", "");

        findViewById(R.id.textViewatttaction9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.co.th/maps/dir/13.7126176,100.591814/Trang+Church,+Na+Ta+Luang,+Mueang+Trang+District,+Trang+92000/@10.6342294,97.5786299,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x304d8c4f61c8e5fd:0xb726541da9efc7c9!2m2!1d99.6046904!2d7.5591808?hl=en";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

//------------------------------------------------------------------------------------------------------
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<>();
        file_maps.put("โบสถ์คริสต.", R.drawable.attraction8);
        file_maps.put("โบสถ์คริสต..", R.drawable.attraction9);
        file_maps.put("โบสถ์คริสต...", R.drawable.attraction10);

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