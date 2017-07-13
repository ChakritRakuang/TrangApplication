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

public class khunglong extends AppCompatActivity implements OnMapReadyCallback, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    private SliderLayout mDemoSlider;
    WebView mWebView;

    String htmlstr1 ="<p style=\"text-align: left;\"><br />\n" +
            "<span style=\"font-size:22px;\"><strong>ข้อมูลทั่วไป : </strong><span style=\"font-family: monospace; white-space: pre-wrap;\"> </span>ร้านขนมพองเค็มก๋งลุ้ง เป็นร้านขนมโบราณร้าน อยู่ใน อ.ห้วยยอด ตั้งอยู่ข้างร้านเค้กสองพี่น้อง เป็นร้านเล็กๆ ตอนเช้าจะขายโจ๊ก เกี๊ยวทอดไส้หมู ขนมจีบ เป็นร้านเก่าแก่อีกแห่งหนึ่งในอำเภอห้วยยอด ขนมพองเค็มจะเป็นสูตรดั้งเดิม เป็นสูตรของก๋งลุ้งที่มาจากเมืองจีน มีลักษณะเป็นข้าวพองกรอบหวานเค็ม มีหอมเจียวโรยหน้า บรรจุใส่ถุง และยังมีขนมก้านบัวกรอบ ขนมหน้าแตก ราคาย่อยเยาว์ ประมาณ 35 บาท ต่อ 1 ถุง<strong> </strong></span></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><span style=\"font-size:22px;\"><strong>การเดินทาง :&nbsp;</strong>ถ.เพชรเกษม &nbsp;ต.ห้วยยอด อ.ห้วยยอด &nbsp;จ.ตรัง</span></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><span style=\"font-size:22px;\"><strong>วันเวลาเปิด-ปิด :</strong> เปิดบริการทุกวัน 07.00-18.00 น.&nbsp;</span></p>\n" +
            "\n" +
            "<p style=\"text-align: left;\">&nbsp;</p>";
//------------------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kunglong_activity);
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fragment2);
        mapFragment.getMapAsync(this);
    }
//------------------------------------------------------------------------------------------------------
    @Override
    public void onMapReady(GoogleMap map) {
        LatLng ThanonPhetkasem = new LatLng(7.78186,99.63557999999999);

        //map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(ThanonPhetkasem, 14));
        map.addMarker(new MarkerOptions().title("ก๋งลุ้ง [ขนมโบราณ]").position(ThanonPhetkasem));
//------------------------------------------------------------------------------------------------------
        mWebView = (WebView) findViewById(R.id.webView22222);
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

        mWebView.loadDataWithBaseURL("",text,"text7/html", "utf-8", "");

        findViewById(R.id.textViewkhunglong).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/dir/13.7125727,100.591817/7.7818611,99.6355833/@8.3952095,97.6551957,7z/data=!4m4!4m3!1m1!4e1!1m0";

                Intent ii = new Intent(Intent.ACTION_VIEW);
                ii.setData(Uri.parse(url));
                startActivity(ii);
            }
        });

//------------------------------------------------------------------------------------------------------
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<>();
        file_maps.put("ก๋งลุ้ง [ขนมโบราณ]", R.drawable.kuunglong1);
        file_maps.put("ก๋งลุ้ง [ขนมโบราณ]..", R.drawable.kuunglong2);
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