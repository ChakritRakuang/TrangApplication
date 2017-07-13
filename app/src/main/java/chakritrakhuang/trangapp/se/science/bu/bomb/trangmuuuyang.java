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

public class trangmuuuyang extends AppCompatActivity implements OnMapReadyCallback, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {

    private SliderLayout mDemoSlider;
    WebView mWebView;

    String htmlstr1 ="<p style=\"text-align: left;\"><br />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">ข้อมูลทั่วไป : </strong></strong><span style=\"color:#000000;\"><span style=\"font-size: 22px;\">หมูย่างตรัง ปาท่องโก๋ เป็น อาหารเช้าของเมืองตรังมีขนมจีบด้วย หมูย่างตรัง รสชาติความอร่อยเป็นที่เลื่องลือเพราะหนังกรอบ หอมเครื่องเทศ ใครไปเยือนเมืองตรังแล้วไม่ควรพลาดที่จะไปแวะชิม โดยร้านหาไม่ยากอยู่แถวถนนห้วยยอดตรงไปเกือบจะถึงซอย 9</span></span><strong> </strong></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">การเดินทาง :&nbsp;</strong><span style=\"color:#000000;\"><span style=\"font-size: 22px;\">ใช้ถนนห้วยยอด มุ่งหน้าไปที่ซอยห้วยยอด 9 จะเห็นร้านหมูย่างเมืองตรัง ตั้งอยู่ใกล้ๆ ซอยห้วยยอด 9</span>&nbsp;</span></span></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">วันเวลาเปิด-ปิด :</strong> <span style=\"color:#000000;\"><span style=\"font-size: 22px;\">เปิดทุกวัน เวลา 06.00 - 13.00 น.&nbsp;</span></span></span></p>\n" +
            "\n" +
            "<p style=\"text-align: left;\">&nbsp;</p>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pha_tho_na_muen_si_tab1);
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fragment);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        LatLng Sangkhawit = new LatLng(7.567146, 99.605128);

        //map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Sangkhawit, 14));
        map.addMarker(new MarkerOptions().title("ตรังหมูย่าง").position(Sangkhawit));

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

        mWebView.loadDataWithBaseURL("",text,"text6/html", "utf-8", "");

        findViewById(R.id.textView1000000000000).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.co.th/maps/dir/13.7125727,100.591817/%E0%B8%95%E0%B8%A3%E0%B8%B1%E0%B8%87%E0%B8%AB%E0%B8%A1%E0%B8%B9%E0%B8%A2%E0%B9%88%E0%B8%B2%E0%B8%87+%E0%B8%95%E0%B8%B3%E0%B8%9A%E0%B8%A5+%E0%B8%99%E0%B8%B2%E0%B8%95%E0%B8%B2%E0%B8%A5%E0%B9%88%E0%B8%A7%E0%B8%87+%E0%B8%AD%E0%B8%B3%E0%B9%80%E0%B8%A0%E0%B8%AD%E0%B9%80%E0%B8%A1%E0%B8%B7%E0%B8%AD%E0%B8%87%E0%B8%95%E0%B8%A3%E0%B8%B1%E0%B8%87+%E0%B8%95%E0%B8%A3%E0%B8%B1%E0%B8%87+92000/@10.6364283,97.5786315,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x304d8c43b6036b03:0x6fbc84349062c559!2m2!1d99.6048922!2d7.5671142?hl=en";
                Intent ii = new Intent(Intent.ACTION_VIEW);
                ii.setData(Uri.parse(url));
                startActivity(ii);
            }
        });

        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<>();
        file_maps.put("ตรังหมูย่าง", R.drawable.muuuu_yang1);
        file_maps.put("ตรังหมูย่าง..", R.drawable.muuuu_yang2);
        file_maps.put("ตรังหมูย่าง...", R.drawable.muuuu_yang3);

        for (String name : file_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(this);

            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

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

    @Override
    protected void onStop() {
        mDemoSlider.stopAutoCycle();
        super.onStop();
    }

    public void onSliderClick(BaseSliderView slider) {
        Toast.makeText(this, slider.getBundle().get("extra") + "", Toast.LENGTH_SHORT).show();

    }

    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    public void onPageSelected(int position) {
        Log.d("Slider Demo", "Page Changed: " + position);
    }

    public void onPageScrollStateChanged(int state) {
    }
}