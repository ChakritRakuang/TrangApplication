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

public class atttaction6 extends AppCompatActivity implements OnMapReadyCallback, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    private SliderLayout mDemoSlider;
    WebView mWebView;

    String htmlstr1 = "<p style=\"text-align: left;\">&nbsp;</p>\n" +
            "\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">ข้อมูลทั่วไป :</strong><span style=\"font-size: 22px;\"> นอกจากจังหวัดตรังจะมีทะเลที่สวยงามน่าเที่ยวแล้ว <strong><span style=\"font-size: 22px;\">ในตัวเมืองยังมีย่านตึกเก่าที่มีสถาปัตยกรรมแบบชิโน - โปรตุกีส  และแบบจีนโบราณ</strong> เนื่องจากในอดีตที่เคยเป็นเมืองท่าทางการค้า เดิมเข้าใจว่าอาคารเหล่านี้คงมีหลายหลังต่อเนื่องกัน ต่อมามีการรื้อออกและสร้างเป็นอาคารสมัยใหม่แทรกอยู่ปัจจุบันจึงเห็นอาคารเก่าเหล่านี้กระจัดกระจายอยู่ทั่วไป เช่น ตลาดสด การค้าใกล้กับสถานีรถไฟ หอนาฬิกา เกิดความเปลี่ยนแปลงของตัวตึกและอาคารภายในเกาะทับเที่ยงทั้งเกาะ แขกบ้านแขกเมืองรวมถึงนักท่องเที่ยวเมื่อมาเยือนเมืองตรัง จะรู้สึกสะดุดตาสัมผัสได้ถึงความเป็นความสวยงามสีสันสดใสของตึกตามสไตล์ชิโนโปรตุกีส ผสมผสานสถาปัตยกรรมตะวันออกและตะวันตกได้อย่างลงตัว ไม่ว่าจะเป็นบริเวณราชดำเนินอาคารห้างสิริบรรณเก่า ถนนกันตัง ร้านข้าวต้มกิมปริญญา และถนนพระรามหกโรงแรมวัฒนา สามารถใช้เป็นจุดนัดพบบันทึกภาพความสวยงามอย่างประทับใจ</p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">การเดินทาง :</strong></p>\n" +
            "\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">รถยนต์ :</strong><span style=\"font-size: 22px;\"> จากกรุงเทพฯ   ไปตรังได้  2  เส้นทาง   คือ   ใช้ทางหลวงหมายเลข  4   (เพชรเกษม)  ผ่านจังหวัดเพชรบุรี  ประจวบคีรีขันธ์  ชุมพร  ใช้ทางหลวงหมายเลข  41  ผ่าน  สุราษฎร์ธานี ทุ่งสง ใช้หลวงหมายเลข 403 สู่อำเภอห้วยยอด จากนั้นเลี้ยวซ้ายเข้าทางหลวงหมายเลข 4 ไปจนถึงตรัง ระยะทางประมาณ 828 กิโลเมตร ในตัวเมืองตรัง ตามถนน ถ. ราชดำเนิน ถ. กันตัง และ ถ. พระรามหก</p>\n" +
            "\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">รถประจำทาง :</strong><span style=\"font-size: 22px;\"> มีรถโดยสารธรรมดาและรถโดยสารปรับอากาศของบริษัท ขนส่ง จำกัด และของเอกชน สายกรุงเทพฯ-ตรัง ออกจากสถานีขนส่ง สายใต้ ถนนบรมราชชนนี ทุกวัน วันละหลายเที่ยว ใช้เวลาเดินทางประมาณ 12 ชั่วโมง</p>\n" +
            "\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">รถไฟ :</strong><span style=\"font-size: 22px;\"> มีรถไฟออกจากสถานีหัวลำโพงไปถึงสถานีตรังทุกวัน</p>\n" +
            "\n" +
            "<p style=\"text-align: left;\"><strong><span style=\"font-size: 22px;\">วันเวลาเปิด-ปิด :</strong><span style=\"font-size: 22px;\"> เที่ยวชมได้ตลอดวัน</p>";
    //------------------------------------------------------------------------------------------------------
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atttaction6);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fragment10);
        mapFragment.getMapAsync(this);
    }
    //------------------------------------------------------------------------------------------------------
    @Override
    public void onMapReady(GoogleMap map) {
        LatLng RamaVI = new LatLng(7.556263, 99.608417);

        //map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(RamaVI, 14));
        map.addMarker(new MarkerOptions().title("ตึกเก่าเมืองตรัง").position(RamaVI));
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

        findViewById(R.id.textViewatttaction6 ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.co.th/maps/dir/13.7125727,100.591817/7.5557222,99.6071944/@10.6330178,97.5786314,7z/data=!3m1!4b1!4m4!4m3!1m1!4e1!1m0";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

//------------------------------------------------------------------------------------------------------
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<>();
        file_maps.put("ตึกเก่าเมืองตรัง.", R.drawable.attraction7);
        file_maps.put("ตึกเก่าเมืองตรัง..", R.drawable.attraction8);
        file_maps.put("ตึกเก่าเมืองตรัง...", R.drawable.a1a4);

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