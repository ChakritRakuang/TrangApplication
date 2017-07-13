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

public class phathonamuensi extends AppCompatActivity implements OnMapReadyCallback, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    private SliderLayout mDemoSlider;
    WebView mWebView;

    String htmlstr1 ="<p style=\"text-align: left;\"><br />\n" +
            "<span style=\"font-size:22px;\"><strong>ข้อมูลทั่วไป : </strong><span style=\"font-family: monospace; white-space: pre-wrap;\"> </span></span>&nbsp;<span style=\"font-size:22px;\">ผ้าทอชั้นดีของเมืองตรังทำจากด้ายและไหมถักทอด้วยกี่กระตุกแบบพื้นบ้าน มีลวดลายสีสันต่างๆ อีกทั้งสามารถประดิษฐ์เป็นตัวอักษรตามต้องการ ใช้เป็นผ้าตัดเสื้อผ้าเช็ดหน้าผ้าปูโต๊ะแล้วแต่จะดัดแปลง</span><span style=\"font-size:22px;\"><strong> </strong></span></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><span style=\"font-size:22px;\"><strong>ที่อยู่ :&nbsp;</strong>&nbsp;119 หมู่ที่ 8 ต.นาหมื่นศรี อ.นาโยง&nbsp;</span></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><span style=\"font-size:22px;\"><strong>วันเวลาเปิด-ปิด :</strong>&nbsp;เปิดทุกวัน เวลา 08.00 - 15.00 น.</span></p>\n" +
            "\n" +
            "<p style=\"text-align: left;\">&nbsp;</p>";
//------------------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phathonamuensi_activity);
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fragment5);
        mapFragment.getMapAsync(this);
    }
//------------------------------------------------------------------------------------------------------
    @Override
    public void onMapReady(GoogleMap map) {
        LatLng กลุ่มทอผ้านาหมื่นศรี = new LatLng(7.599643, 99.689022);

        //map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(กลุ่มทอผ้านาหมื่นศรี, 14));
        map.addMarker(new MarkerOptions().title("ผ้าทอนาหมื่นศรี").position(กลุ่มทอผ้านาหมื่นศรี));
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

        mWebView.loadDataWithBaseURL("",text,"text10/html", "utf-8", "");

        findViewById(R.id.textViewphathonamuensi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/dir/13.7125727,100.591817/Na+Muen+Si+Textile+Group,+Na+Muen+Si,+Na+Yong+District,+Trang+92170/@10.6445724,97.5782896,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x304d88d012cf89cb:0xd7eb5c80aa4d3e16!2m2!1d99.6885824!2d7.5996537";

                Intent ii = new Intent(Intent.ACTION_VIEW);
                ii.setData(Uri.parse(url));
                startActivity(ii);
            }
        });

//------------------------------------------------------------------------------------------------------
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<>();
        file_maps.put("ผ้าทอนาหมื่นศร", R.drawable.parrtoo1);
        file_maps.put("ผ้าทอนาหมื่นศร..", R.drawable.parrtoo2);
        file_maps.put("ผ้าทอนาหมื่นศร...", R.drawable.parrtoo3);
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