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
public class InformationTrang extends Fragment {

    WebView mWebView;
    String htmlstr1= "<body>\n" +
            "<p style=\"text-align: center;\"><img alt=\"จังหวัดตรัง\" src=\"http://www.sawadee.co.th/thai/trang/images/02welcome_head_th.jpg\" /></p>\n" +
            "\n" +
            "<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"box-sizing: border-box; color: rgb(31, 90, 132); font-family: Tahoma; font-size: 15px; background-color: rgb(255, 255, 255);\" width=\"550\">\n" +
            "\t<tbody style=\"box-sizing: border-box;\">\n" +
            "\t\t<tr style=\"box-sizing: border-box;\">\n" +
            "\t\t\t<td colspan=\"4\" nowrap=\"nowrap\" style=\"box-sizing: border-box; font-stretch: normal; text-align: center;\" width=\"15\">&nbsp;</td>\n" +
            "\t\t\t<td colspan=\"4\" nowrap=\"nowrap\" style=\"box-sizing: border-box; font-stretch: normal; text-align: center;\" width=\"100%\"><img align=\"left\" alt=\"\" height=\"365\" src=\"http://en.inlovesatuntrang.com/images/pulldown_1331388062/700%20en%20trang%20city%207%281%29.jpg\" style=\"box-sizing: border-box; max-width: 100%; height: auto;\" width=\"650\" />\u200B</td>\n" +
            "\t\t</tr>\n" +
            "\t</tbody>\n" +
            "</table>\n" +
            "\n" +
            "<p style=\"text-align:justify;text-justify:inter-cluster;text-indent:.5in;\n" +
            "background:white\"><span style=\"font-size:22px;\">ตัวเมืองตรังไม่คึกคักมาก ในความเรียบง่ายนั้นมีเสน่ห์ ชวนให้หลงใหลและค้นหา เมืองตรังเป็นเมืองเก่าแก่แต่เดิมเป็นตำบลทับเที่ยงและได้ถูกยกฐานะเป็นเทศบาลนครตรัง ตั้งแต่ปี พ.ศ.2542 เป็นต้นมาเสน่ห์เมืองเก่ายังคงมีให้เห็นได้จากตึกสไตล์ชิโนโปรตุกิส ซึ่งเป็นสถาปัตยกรรมผสมผสานศิลปะแนวยุโรปและจีน ยังคงความสวยคลาสสิค เพราะอารยธรรมตะวันตกที่เดินทางเข้ามาพร้อมกับเส้นทางรถไฟสายกรุงเทพ -ทับเที่ยง - กันตัง ทำให้ทับเที่ยงในยุคนั้นและเป็นศูนย์กลางการค้าและการคมนาคมในแถบชายฝั่งทะเล เมื่อแดดร่มลมตก ลองไปเดินหย่อนใจตามถนนราชดำเนิน ถนนพระรามหก ตรอกซอยตลอดสายจะเป็นร้านค้า อาคารพาณิชย์เก่าแก่ ทั้งที่เป็นตึกหรืออาคารไม้ &nbsp;ซึ่งล้วนมีเรื่องราวมากมาย ชวนให้เข้าไปค้นหา</span><span style=\"font-size:16.0pt;font-family:&quot;Angsana New&quot;,&quot;serif&quot;;\n" +
            "color:#222222\"><span lang=\"TH\"><o:p></o:p></span></span></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size:26px;\"><img alt=\"เกาะกระดาน\" class=\"trang-imgright\" height=\"150\" src=\"http://www.cheerhotel.net/wp-content/uploads/2015/04/act-%E0%B8%AB%E0%B8%AD%E0%B8%99%E0%B8%B2%E0%B8%AC%E0%B8%B4%E0%B8%81%E0%B8%B2-%E0%B8%95%E0%B8%A3%E0%B8%B1%E0%B8%87.jpg\" style=\"border-style: none; border-width: 0px; padding: 5px 0px 5px 15px; float: right; font-family: Tahoma, Arial, Helvetica, sans-serif; font-size: 13.3333px;\" width=\"200\" wieght=\"200\" /></span></p>\n" +
            "\n" +
            "<p style=\"background:white\"><span style=\"font-size:26px;\"><strong>หอนาฬิกา ประจำจังหวัดตรัง</strong></span></p>\n" +
            "\n" +
            "<p style=\"text-align:justify;text-justify:inter-cluster;text-indent:.5in;\n" +
            "background:white\"><span style=\"font-size:22px;\">สถาปัตยกรรมที่สุดคลาสสิคเป็นเอกลักษณ์ที่โดดเด่นตั้งตระหง่านอยู่กลางสี่แยกศาลากลางจังหวัดสร้างขึ้นตั้งแต่ปี พ.ศ. 2504 มีการปรับเปลี่ยนไปบ้างแต่สุดท้ายก็กลับมาคงรูปลักษณ์แบบดั้งเดิมเป็นที่ตั้งของหอกระจายข่าวของเทศบาลเมืองตรัง&nbsp;</span></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size:26px;\"><img alt=\"เกาะกระดาน\" class=\"trang-imgright\" height=\"150\" src=\"http://topicstock.pantip.com/library/topicstock/2012/04/K12031560/K12031560-0.jpg\" style=\"border-style: none; border-width: 0px; padding: 5px 0px 5px 15px; float: right; font-family: Tahoma, Arial, Helvetica, sans-serif; font-size: 13.3333px;\" width=\"200\" wieght=\"200\" /></span></p>\n" +
            "\n" +
            "<p style=\"background:white\"><span style=\"font-size:26px;\"><strong>ศาลเจ้าท่ามกงเยี่ย</strong></span><span style=\"font-size:16.0pt;font-family:&quot;Angsana New&quot;,&quot;serif&quot;;color:#222222\"><o:p></o:p></span></p>\n" +
            "\n" +
            "<p style=\"text-align:justify;text-justify:inter-cluster;text-indent:.5in;\n" +
            "background:white\"><span style=\"font-size:22px;\"><span style=\"text-align: justify; text-indent: 48px; background-color: rgb(255, 255, 255);\">ศาลเจ้าท่ามกงเยี่ยเป็นศาลเจ้าแห่งศรัทธาและศักดิ์สิทธิ์ของชาวตรัง ที่อยุ่ที่ถนนเพลินพิทักษ์ ชาวตรังต่างเคารพและนับถือองค์ท่ามกงเยี่ย เทพผู้สูงส่งได้ถูกอัญเชิญจากเมืองจีนมาประทับทรงครั้งแรกและสถิตที่ศาลเจ้า แห่งนี้ ตั้งแต่ปี พ.ศ. 2490 เพื่อเป็นสิริมงคลแก่ชีวิต &nbsp;นักท่องเที่ยวต่างแวะไปสักการะขอพรสิ่งศักดิ์สิทธิ์จากท่าน &nbsp;มีความเลื่องลือถึงความศักดิ์สิทธิ์ &nbsp;ซึ่งคนที่บูชาขอความช่วยเหลือใดๆ มักประสบความสำเร็จ โดยเฉพาะเรื่องการบนบานขอบุตรจากพระท่ามกงเยี่ยแล้วจะได้สมประสงค์</span></p>\n" +
            "\n" +
            "<p style=\"text-align:justify;text-justify:inter-cluster;text-indent:.5in;\n" +
            "background:white\">&nbsp;</p>\n" +
            "\n" +
            "<p style=\"text-align:justify;text-justify:inter-cluster;text-indent:.5in;\n" +
            "background:white\"><span style=\"font-size:26px;\"><span style=\"font-family: 'Angsana New', serif; color: rgb(34, 34, 34);\"><o:p></o:p></span></span></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size:26px;\"><img alt=\"เกาะกระดาน\" class=\"trang-imgright\" height=\"150\" src=\"http://www.cheerhotel.net/wp-content/uploads/2015/04/act-%E0%B8%A3%E0%B8%96%E0%B8%95%E0%B8%B8%E0%B9%8A%E0%B8%81%E0%B8%95%E0%B8%B8%E0%B9%8A%E0%B8%81%E0%B8%AB%E0%B8%B1%E0%B8%A7%E0%B8%81%E0%B8%9A-%E0%B8%95%E0%B8%A3%E0%B8%B1%E0%B8%87.jpg\" style=\"border-style: none; border-width: 0px; padding: 5px 0px 5px 15px; float: right; font-family: Tahoma, Arial, Helvetica, sans-serif; font-size: 13.3333px;\" width=\"200\" wieght=\"200\" /></span></p>\n" +
            "\n" +
            "<p style=\"background:white\"><span style=\"font-size:26px;\"><strong>รถตุ๊กตุ๊กกบ &nbsp;พระเอกคู่เมืองตรัง</strong></span></p>\n" +
            "\n" +
            "<p style=\"text-align:justify;text-justify:inter-cluster;text-indent:.5in;\n" +
            "background:white\"><span style=\"font-size:22px;\">นั่งรถตุ๊กตุ๊กกบเหมือนมาไม่ถึงเมืองตรังไปถ่ายภาพกันได้ที่แถวสถานีรถไฟตรังหรือแถวๆหน้าโรงแรมซึ่งจะเป็นจุดรวมตัวของเหล่ารถตุ๊กตุ๊กกบ รถตุ๊กตุ๊กหัวกบรุ่นดั้งเดิม นำเข้ามาจากประเทศญี่ปุ่น ตั้งแต่ปี พ.ศ. 2502 รูปแบบรถต้นฉบับดั้งเดิม เป็นรถกระบะสามล้อขนาดเล็ก ไม่มีหลังคาครอบ และมีการปรับแต่งเป็นรถโดยสารไว้บรรทุกของและเป็นรถโดยสาร มีความผูกพันกับคนตรังมาตลอด กว่าปี &nbsp;50 รถตุ๊กตุ๊กคือพระเอกคนเก่งของเมืองตรัง จะมีภารกิจมากมายตั้งแต่เช้ามืดฟ้ายังไม่สว่างรถตุ๊กตุ๊กกบนี้จะทำหน้าที่บริการรับส่งแม่ค้าขนสินค้าไปขายที่ตลาดเช้าบ้างก็พาเหล่านักกรีดยางพาราไปส่งที่สวนในช่วงเกือบสว่าง พอสายสัก 7-8 โมงเช้า รถตุ๊กตุ๊กกบก็จะวิ่งรับส่งนักเรียนไปโรงเรียน ส่งคนไปทำงานพอสายๆ ถึงจะได้เวลาสภากาแฟ เจ้าของรถตุ๊กตุ๊กกบ ก็มานั่งจิบชากาแฟ คู่กับหมูย่างเมืองตรัง ปัจจุบันรถตุ๊กตุ๊กกบกว่า 100 คันยังคงให้บริการคนท้องถิ่น&nbsp;</span></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size:26px;\"><img alt=\"เกาะกระดาน\" class=\"trang-imgright\" height=\"150\" src=\"http://www.cheerhotel.net/wp-content/uploads/2015/04/act-%E0%B8%96%E0%B8%99%E0%B8%99%E0%B8%84%E0%B8%99%E0%B9%80%E0%B8%94%E0%B8%B4%E0%B8%99-%E0%B8%95%E0%B8%A3%E0%B8%B1%E0%B8%87.jpg\" style=\"border-style: none; border-width: 0px; padding: 5px 0px 5px 15px; float: right; font-family: Tahoma, Arial, Helvetica, sans-serif; font-size: 13.3333px;\" width=\"200\" wieght=\"200\" /></span></p>\n" +
            "\n" +
            "<p style=\"background:white\"><span style=\"font-size:26px;\"><strong>ถนนคนเดิน &nbsp;สถานีรถไฟตรัง&nbsp;</strong></span></p>\n" +
            "\n" +
            "<p style=\"text-align:justify;text-justify:inter-cluster;text-indent:.5in;\n" +
            "background:white\"><span style=\"font-size:22px;\">สถานีรถไฟตรัง เป็นสถานีเก่าแก่ เป็นศูนย์กลางชุมชนเข้าออกของผู้คนมากมายในอดีตของวันศุกร์ เสาร์ อาทิตย์ ที่บริเวณลานด้านหน้าของสถานีรถไฟตรัง จัดเป็นถนนคนเดินชวนให้นักท่องเที่ยวไปสัมผัสสีสันยามค่ำของตัวเมือง เดินเลือกชิมขนมพื้นบ้าน อาหารพื้นเมือง สินค้าศิลปะหัตถกรรม งานฝีมือของคนท้องถิ่นหรือชมนักดนตรีที่มาร่วมบรรเลงแสดงดนตรีเปิดหมวกเพื่อสร้างบรรยากาศครึกครื้นให้กับถนนคนเดิน &nbsp;<span style=\"font-family: 'Angsana New', serif; color: rgb(34, 34, 34);\">&nbsp;</span></span></p>\n" +
            "\n" +
            "<hr />\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size:26px;\"><img alt=\"เกาะกระดาน\" class=\"trang-imgright\" height=\"150\" src=\"http://www.cheerhotel.net/wp-content/uploads/2015/06/act-%E0%B8%AD%E0%B8%99%E0%B8%B8%E0%B8%AA%E0%B8%B2%E0%B8%A7%E0%B8%A3%E0%B8%B5%E0%B8%A2%E0%B9%8C%E0%B8%9E%E0%B8%A3%E0%B8%B0%E0%B8%A2%E0%B8%B2%E0%B8%A3%E0%B8%B1%E0%B8%A9%E0%B8%8E%E0%B8%B2%E0%B8%99%E0%B8%B8%E0%B8%9B%E0%B8%A3%E0%B8%B0%E0%B8%94%E0%B8%B4%E0%B8%A9%E0%B8%90%E0%B9%8C-%E0%B8%AA%E0%B8%A7%E0%B8%99%E0%B8%AA%E0%B8%B2%E0%B8%98%E0%B8%B2%E0%B8%A3%E0%B8%93%E0%B8%B0%E0%B8%95%E0%B8%A3%E0%B8%B1%E0%B8%87.jpg\" style=\"border-style: none; border-width: 0px; padding: 5px 0px 5px 15px; float: right; font-family: Tahoma, Arial, Helvetica, sans-serif; font-size: 13.3333px;\" width=\"200\" wieght=\"200\" /><strong>อนุสาวรีย์พระยารัษฎานุประดิษฐ์</strong></span></p>\n" +
            "\n" +
            "<p style=\"text-align:justify;text-justify:inter-cluster;text-indent:.5in;\n" +
            "background:white\"><span style=\"font-size:22px;\">พระยารัษฎานุประดิษฐ์ (คอซิมบี้ ณ ระนอง) ราษฎรและข้าราชการ จังหวัดตรังได้สละทรัพย์สมทบสร้างอนุสาวรีย์พระยารัษฎานุประดิษฐ์มหิศรภักดีขึ้นที่ตำบลทับเที่ยงอำเภอเมืองตรัง จังหวัดตรัง ในวันที่ 10 เมษายน ของทุก ๆ ปีซึ่งเรียกกันว่า &quot;วันพระยารัษฎานุประดิษฐ์&quot;จะมีการวางพวงมาลาที่อนุสาวรีย์ ผลงานของพระยารัษฎานุประดิษฐ์ฯ นับได้ว่าเป็นเลิศ ท่านได้รับการยกย่องทั้งในหมู่ชาวต่างชาติ</span></p>\n" +
            "\n" +
            "<hr /></body>";

//------------------------------------------------------------------------------------------------------

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.pagetwo_fragmentinformationtrang, container, false);

        mWebView = (WebView) myFragmentView.findViewById(R.id.webView3);
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

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.loadDataWithBaseURL("", text, "text4/html", "utf-8", "");

        return myFragmentView;
    }

//------------------------------------------------------------------------------------------------------
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
//------------------------------------------------------------------------------------------------------
    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }
//------------------------------------------------------------------------------------------------------
    @Override
    public void onStart()
    {
        super.onStart();
    }
//------------------------------------------------------------------------------------------------------
    @Override
    public void onResume()
    {
        super.onResume();
    }
}