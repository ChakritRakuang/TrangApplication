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

public class atttaction3 extends AppCompatActivity implements OnMapReadyCallback, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    private SliderLayout mDemoSlider;
    WebView mWebView;

    String htmlstr1 = "<p style=\"text-align: center;\">&nbsp;</p>\n" +
            "\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">ข้อมูลทั่วไป : เกาะม้า&nbsp; เกาะเชือก&nbsp; </strong><span style=\"font-size: 22px;\">อยู่ระหว่างเกาะมุกและเกาะไหง&nbsp; <strong>ทั้งสองเกาะถือเป็นจุดดำน้ำชมปะการังที่สวยที่สุดของทะเลตรัง</strong> สามารถชมปะการังอ่อนมีทั้งสีแดง สีส้ม สีม่วง สีเหลือง สีชมพู และอีกมากมาย <strong>เกาะเชือก</strong>เป็นเกาะเล็กๆ ตั้งอยู่ในวงล้อมของเกาะมุกและเกาะกระดาน  ห่างจากเกาะไหงประมาณ  4  กิโลเมตร  มีลักษณะเป็นโขดหิน และ หน้าผาหินสูงชัน  ไม่มีชายหาด  หรือบ้านเรือนของผู้คน  บริเวณรอบเกาะเป็นแหล่งดำน้ำ  ปะการังชนิดต่างๆ  มีทั้ง  ปะการังน้ำตื้น  และน้ำลึกรายรอบ  มีฝูงปลาทะเลสีสันสวยงามนานาชนิด เช่น ปลานกแก้ว ปลาโนรี ปลาสินสมุทร ปลาลายเสือ <strong>ส่วนเกาะม้า</strong> อยู่ใกล้กับเกาะเชือก ไม่มีชายหาดซึ่งหากมองผิวเผินจะดูเหมือนกองหินขนาดใหญ่โผล่พ้นน้ำขึ้นมาเท่านั้น <strong> 2 เกาะนี้อยู่ที่จุดดำน้ำตื้นที่สมบูรณ์และสวยงาม ระหว่าง 2 เกาะนี้มีกระแสน้ำเชี่ยว จึงต้องใช้เชือกคอยช่วงพยุงตัวเวลาดำน้ำ จึงเป็นที่มาของเกาะเชือก ส่วนเกาะม้า รูปร่างของเกาะคล้ายกับห้วม้ากลางทะเล</strong></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">การเดินทาง :</strong><span style=\"font-size: 22px;\"> สามารถเหมาเรือจากท่าเรือปากเมงมาเที่ยว แต่ส่วนใหญ่นักท่องเที่ยวจะใช้บริการแพ็กเกจทัวร์ในรูปแบบ <strong> One Day Tour</strong> ซึ่งราคาจะถูกกว่า และมีอุปกรณ์ดำน้ำให้ครบครัน ทั้งเสื้อชูชีพ หน้ากากดำน้ำและท่อหายใจ</p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">วันเวลาเปิด-ปิด :</strong><span style=\"font-size: 22px;\"> ฤดูท่องเที่ยวคือ ช่วงเดือน พฤศจิกายน - เมษายน </p>\n" +
            "\n" +
            "<p style=\"text-align: left;\">&nbsp;</p>";

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, atttaction3.class);
        return intent;
    }
//------------------------------------------------------------------------------------------------------
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atttaction3);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fragment7);
        mapFragment.getMapAsync(this);
    }
//------------------------------------------------------------------------------------------------------
    @Override
    public void onMapReady(GoogleMap map) {
        LatLng เกาะม้าเกาะเชือก = new LatLng(7.406062, 99.231117);

        //map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(เกาะม้าเกาะเชือก, 14));
        map.addMarker(new MarkerOptions().title("เกาะม้า เกาะเชือก").position(เกาะม้าเกาะเชือก));
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

        findViewById(R.id.textViewatttaction3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.co.th/maps/dir/13.7125627,100.5918791/%E0%B8%97%E0%B9%88%E0%B8%B2%E0%B9%80%E0%B8%A3%E0%B8%B7%E0%B8%AD%E0%B8%9B%E0%B8%B2%E0%B8%81%E0%B9%80%E0%B8%A1%E0%B8%87+Tambon+Administrative+Organizations+TRANG2004+,+Mai+Fat+,+92150+Sikao,+Trang,+Thailand/@10.6028575,97.4431337,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x304de4d20918ddc1:0xd7bbd0a2af9a8e63!2m2!1d99.312079!2d7.507778?hl=en";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

//------------------------------------------------------------------------------------------------------
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<>();
        file_maps.put("เกาะม้า เกาะเชือก.", R.drawable.attraction29);
        file_maps.put("เกาะม้า เกาะเชือก..", R.drawable.attraction30);
        file_maps.put("เกาะม้า เกาะเชือก...", R.drawable.attraction31);

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