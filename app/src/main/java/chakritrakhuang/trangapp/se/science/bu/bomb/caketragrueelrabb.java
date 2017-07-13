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

public class caketragrueelrabb extends AppCompatActivity implements OnMapReadyCallback, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    private SliderLayout mDemoSlider;
    WebView mWebView;

    String htmlstr1 ="<p style=\"text-align: left;\"><br />\n" +
            "<span style=\"font-size:22px;\"><strong>ข้อมูลทั่วไป : </strong><span style=\"font-family: monospace; white-space: pre-wrap;\"> </span>สถานที่ร้านเดิมตั้งอยู่ตรงข้ามกับศูนย์ศึกษานอกโรงเรียนเป็นร้านเล็กๆ ผู้ที่ริเริ่มทำขนมเค้กเป็นคนจีนไหหลำ &nbsp; ผลิตภัณฑ์ขึ้นชื่อของร้านคือ เค้กสามรส เค้กเนยสด เค้กผลไม้ &nbsp;เค้กฝอยทอง มีรสชาติที่ดั้งเดิมคงที่ทุกกล่อง เป็นเค้กที่สดใหม่ผลิตวันต่อวัน ร้านนี้อยู่คู่กับคนตรังมานานกว่า50 ปี <strong> </strong></span></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><span style=\"font-size:22px;\"><strong>ที่อยู่ :&nbsp;</strong>&nbsp;53/3 ถนน หลังสถานีรถไฟ ตำบลทับเที่ยง อำเภอเมือง จังหวัดตรัง 92000\u200B</span></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><span style=\"font-size:22px;\"><strong>วันเวลาเปิด-ปิด :</strong> เปิดบริการทุกวัน 07.00-20.00 น</span></p>\n</p>";

    public static Intent createIntent(Context context) {
        return new Intent(context, caketragrueelrabb.class);
    }
//------------------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cakerlardrosse_activity);
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fragment4);
        mapFragment.getMapAsync(this);
    }
//------------------------------------------------------------------------------------------------------
    @Override
    public void onMapReady(GoogleMap map) {
        LatLng ThapThiang = new LatLng(7.553874, 99.618013);

        //map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(ThapThiang, 14));
        map.addMarker(new MarkerOptions().title("เค้กรสเลิศ").position(ThapThiang));
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

        mWebView.loadDataWithBaseURL("",text,"text9/html", "utf-8", "");

        findViewById(R.id.textViewcakerlardrosse).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.co.th/maps/dir/13.7126168,100.5917874/%E0%B8%A3%E0%B9%89%E0%B8%B2%E0%B8%99+%E0%B9%80%E0%B8%84%E0%B9%89%E0%B8%81%E0%B8%A3%E0%B8%AA%E0%B9%80%E0%B8%A5%E0%B8%B4%E0%B8%A8+59%2F3+%E0%B8%AA%E0%B8%96%E0%B8%B2%E0%B8%99%E0%B8%B5+%E0%B8%AD%E0%B8%B3%E0%B9%80%E0%B8%A0%E0%B8%AD%E0%B9%80%E0%B8%A1%E0%B8%B7%E0%B8%AD%E0%B8%87%E0%B8%95%E0%B8%A3%E0%B8%B1%E0%B8%87+%E0%B8%95%E0%B8%A3%E0%B8%B1%E0%B8%87+92000/@10.6321619,97.5786166,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x304d8c3400000001:0x3d30de7e199a6de3!2m2!1d99.6174332!2d7.5538257?hl=th";

                Intent ii = new Intent(Intent.ACTION_VIEW);
                ii.setData(Uri.parse(url));
                startActivity(ii);
            }
        });

//------------------------------------------------------------------------------------------------------
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<>();
        file_maps.put("ขนมเค้กตรากุหลาบ", R.drawable.cakeroood1);
        file_maps.put("ขนมเค้กตรากุหลาบ..", R.drawable.cakeroood2);
        file_maps.put("ขนมเค้กตรากุหลาบ...", R.drawable.cakeroood3);
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