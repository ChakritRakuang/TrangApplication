package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;
import android.widget.TextView;

public class InformationTrangProvinceActivity extends AppCompatActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, InformationTrangProvinceActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.includeinformation_trang_activity);

        //ติดตั้ง Tabhost ขั้นตอนเริ่มต้น
        TabHost mTabHost = (TabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup();

        ViewPager mViewPager = (ViewPager) findViewById(R.id.pager);
        TabsAdapter mTabsAdapter = new TabsAdapter(this, mTabHost, mViewPager);

        mTabsAdapter.addTab(mTabHost.newTabSpec("ชมตัวเมืองตรัง").setIndicator("ชมตัวเมืองตรัง"), InformationTrang.class, null);
        mTabsAdapter.addTab(mTabHost.newTabSpec("ประวัติพระยารัษฎานุประดิษฐ์").setIndicator("ประวัติพระยารัษฎา"), InfrormationPhraya.class, null);

        if (savedInstanceState != null) {
            mTabHost.setCurrentTabByTag(savedInstanceState.getString("tab"));
        }

        // เพิ่มจำนวน TabWidget โดยการ For คำสั่ง   for (int i = 0; i < mTabHost.getTabWidget().getChildCount(); i++)
        for (int i = 0; i < mTabHost.getTabWidget().getChildCount(); i++) {
            TextView tv = (TextView) mTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);// รับค่าจาก  mTabsAdapter.addTab(mTabHost.newTabSpec  มาแสดง ไตเติ้ล
            //ปรับขนาดฟ้อนตัวอักษร
            tv.setTextSize(14);
            //ฟ้อนตัวอักษรในแทปจะแสดงสีขาว
            tv.setTextColor(Color.parseColor("#ffffff"));
        }

    }
}