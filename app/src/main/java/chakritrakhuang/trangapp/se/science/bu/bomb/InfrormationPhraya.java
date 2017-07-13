package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@SuppressWarnings("ALL")
public class InfrormationPhraya extends Fragment {

    WebView mWebView;
    String htmlstr1="<header class=\"entry-header\">\n" +
            "<h1 class=\"entry-title\" style=\"text-align: center;\"><strong><span style=\"font-size: 26px;\">ประวัติ พระยารัษฎานุประดิษฐมหิศรภักดี (คอซิมบี้ ณ ระนอง)</span></strong></h1>\n" +
            "</header>\n" +
            "<div class=\"entry-content clearfix\">\n" +
            "<div class=\"center\">\n" +
            "<div class=\"floatnone\"><a href=\"https://tangmo3110.files.wordpress.com/2015/01/1380040362.jpg\" data-cke-saved-href=\"https://tangmo3110.files.wordpress.com/2015/01/1380040362.jpg\"><img class=\"size-medium wp-image-51 alignnone\" style=\"display: block; margin-left: auto; margin-right: auto;\"width=\"550\" height=\"340\" src=\"https://tangmo3110.files.wordpress.com/2015/01/1380040362.jpg\" alt=\"Russada\" width=\"201\" height=\"300\" data-cke-saved-src=\"https://tangmo3110.files.wordpress.com/2015/01/1380040362.jpg\" /></a></div>\n" +
            "<div class=\"floatnone\">&nbsp;</div>\n" +
            "</div>\n" +
            "<p style=\"text-align: justify;\"><span style=\"line-height: 1.6em;\"><span style=\"font-size: 22px;\">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;พระยารัษฎานุประดิษฐ์มหิศรภักดี มีนามเดิมว่า &ldquo;คอซิมบี้ ณ ระนอง&rdquo; แปลว่า ผู้มีจิตใจดีงาม ท่านเกิดเมื่อวันพุธ เดือน 5 ปีมะเส็ง พ.ศ.2400 เป็นบุตรของพระยาดำรงสุจริตมหิศรภักดี กับนางกิม ณ ระนอง เมื่อท่านอายุได้ 9 ขวบ ได้ติดตามบิดาเดินทางไปประเทศจีนเพื่อศึกษาเรียนรู้กิจการของบิดาเป็นเวลา 2 ปี จึงทำให้ท่านไม่ได้เล่าเรียนหนังสือ ถึงกระนั้นท่านก็ยังมีความสามารถพูดได้ถึง 9 ภาษา ได้แก่ ไทย อังกฤษ มลายู ฮินดูสตานี และภาษาจีนต่างๆ อีก 5 ภาษา ด้วยความสามารถและประสบการณ์จากการเรียนรู้งาน ต่อมาในปี พ.ศ.2428 ท่านได้รับการแต่งตั้งให้เป็นพระยาอัษฎงคตทิศรักษา ดำรงตำแหน่งเป็นผู้ว่าราชการเมืองกระบุรีจนเมื่อพระบาทสมเด็จพระจุลจอมเกล้าเจ้าอยู่หัวเสด็จทรงทอดพระเนตรเห็นความสามารถของพระอัษฎงคตทิศรักษา ที่ได้สร้างเมืองกระบุรีขึ้นใหม่ที่ตำบลน้ำจืด และสร้างความเจริญรุ่งเรืองให้กับเมืองกระบุรีไว้มากมาย จึงทรงโปรดปรานมาก และทรงพระกรุณาโปรดเกล้าฯ แต่งตั้งคอซิมบี้ให้เป็นพระยารัษฎานุประดิษฐ์มหิศรภักดี ดำรงตำแหน่งผู้สำเร็จราชการเมืองตรัง </span></span></p>\n" +
            "</div>";
//------------------------------------------------------------------------------------------------------
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myFragmentView2 = inflater.inflate(R.layout.pageone_fragmentinformationphraya, container, false);

        mWebView = (WebView) myFragmentView2.findViewById(R.id.webView3333);
        mWebView.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                view.loadUrl(url);
                return true;
            }
        });
        String head1 = "<head><style>@font-face {font-family: 'arial';src: url('file:///android_asset/fonts/angsa.ttf');}body {font-family: 'verdana';}</style></head>";
        String text = "<html>" + head1 + "<body style=\"font-family: arial\">" + htmlstr1 + "</body></html>";

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.loadDataWithBaseURL("", text, "text4/html", "utf-8", "");

        return myFragmentView2;
    }
//------------------------------------------------------------------------------------------------------
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    @Override
    public void onStart()
    {
        super.onStart();
    }

    @Override
    public void onResume()
    {
        super.onResume();
    }
}