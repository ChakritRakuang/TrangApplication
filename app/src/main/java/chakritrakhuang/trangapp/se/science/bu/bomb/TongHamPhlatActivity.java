package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TongHamPhlatActivity extends AppCompatActivity {

    WebView mWebView;
    String htmlstr1 = "<table border=\"0\" cellpadding=\"7\" cellspacing=\"0\" width=\"100%\">\n" +
            "\t<tbody>\n" +
            "\t\t<tr>\n" +
            "\t\t\t<div class=\"thumb\" style=\"margin: 0px 15px 0px 0px; padding: 0px; border: 0px; font-size: 14px; font-family: Helvetica, Arial, Tahoma, 'Lucida Grande', sans-serif; vertical-align: bottom; font-stretch: inherit; line-height: 17.5px; float: left;\"><a href=\"http://travel.mthai.com/world-travel/131760.html\" style=\"margin: 0px; padding: 0px; border: 0px; font-weight: inherit; font-style: inherit; font-size: inherit; font-family: inherit; vertical-align: bottom; font-variant: inherit; font-stretch: inherit; line-height: inherit; color: rgb(1, 93, 158); text-decoration: none;\" title=\"\"><img alt=\"\" border=\"0\" height=\"400\" src=\"https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQmr6pPwth8SiL2yMXGpW6nAada7ofTZ1lV7TK3IPXCphZ7zBt8\" style=\"border: 2px solid rgb(255, 255, 255); margin: 0px; padding: 0px; font-weight: inherit; font-style: inherit; font-size: inherit; font-family: inherit; vertical-align: bottom; font-variant: inherit; font-stretch: inherit; line-height: inherit; height: 176px; width: 225px;\" wieght=\"600\" /></a></div>\n" +
            "\n" +
            "<p>&nbsp;</p>\n" +
            "\n" +
            "<p style=\"margin: 10px 0px; padding: 0px; border: 0px; font-size: 14px; font-family: Helvetica, Arial, Tahoma, 'Lucida Grande', sans-serif; vertical-align: bottom; font-stretch: inherit; line-height: 17.5px; color: rgb(79, 72, 64); text-shadow: white 1px 1px;\">&nbsp;</p>\n" +
            "\n" +
            "<p style=\"margin: 10px 0px; padding: 0px; border: 0px; font-size: 14px; font-family: Helvetica, Arial, Tahoma, 'Lucida Grande', sans-serif; vertical-align: bottom; font-stretch: inherit; line-height: 17.5px; color: rgb(79, 72, 64); text-shadow: white 1px 1px;\">&nbsp;</p>\n" +
            "\n" +
            "<p style=\"margin: 10px 0px; padding: 0px; border: 0px; font-size: 14px; font-family: Helvetica, Arial, Tahoma, 'Lucida Grande', sans-serif; vertical-align: bottom; font-stretch: inherit; line-height: 17.5px; color: rgb(79, 72, 64); text-shadow: white 1px 1px;\"><span style=\"font-size:24px;\"><span style=\"font-family:arial,helvetica,sans-serif;\"><span style=\"color:#000000;\">มาเที่ยวตรังต้องห้ามพลาด 9 อย่าง</span></span></span></p>\n" +
            "\n" +
            "\n" +
            "\t\t</tr>\n" +
            "\t\t\t<td width=\"33%\">\n" +
            "\t\t\t<div><span style=\"color: #000000;\"><img alt=\"\" border=\"0\" src=\"http://thaiclassicclub.com/wp-content/uploads/2015/06/%E0%B8%97%E0%B8%B5%E0%B9%88%E0%B8%A1%E0%B8%B2-%E0%B8%A3%E0%B8%96%E0%B8%95%E0%B8%B8%E0%B9%8A%E0%B8%81%E0%B8%95%E0%B8%B8%E0%B9%8A%E0%B8%81-TUK-TUK-THAILAND-teen.mthaicnv000038_resize.jpg\" title=\"\" vspace=\"5\" /></span></div>\n" +
            "\n" +
            "\t\t\t<div>&nbsp;</div>\n" +
            "\n" +
            "\t\t\t<div>&nbsp;</div>\n" +
            "\n" +
            "\t\t\t<div class=\"h3\"><strong><span style=\"color: #000000;\"><span class=\"h3\"><span style=\"font-size: 22px;\">1) ตุ๊กตุ๊กหัวกบ</span></span></strong></div>" +
            "\n" +
            "\t\t\t<div class=\"h3\">&nbsp;</div>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t</tbody>\n" +
            "\t<tbody>\n" +
            "\t\t<tr>\n" +
            "\t\t\t<td>\n" +
            "\t\t\t<p><span style=\"font-size: 22px;\">ลองทำตัวเปรี้ยว ไม่เจี๊ยวจ๊าว แต่กิ๊ปเก๋ นั่งเต๊ะท่าเท่ห์ บนรถ  &quot;ตุ๊กตุ๊กหัวกบ&quot;  แวะวนไปแถวๆ วงเวียนพะยูน แล้ว Selfie ส่งไปให้ใครต่อใครออกอาการตาร้อนผ่าว จนอดใจไม่ไหว ต้องเก็บผ้าผ่อนลงกระเป๋ามาเที่ยวเมืองตรัง สักครั้งหนึ่ง</p>\n" +
            "\n" +
            "\t\t\t<hr />\n" +
            "\t\t\t<p>&nbsp;</p>\n" +
            "\t\t\t</td>\n" +
            "\t\t</tr>\n" +
            "\t</tbody>\n" +
            "</table>\n" +
            "<div><span style=\"color: #000000;\"><img alt=\"\" border=\"0\" wieght=\"600\"height=\"400\"src=\"http://img.painaidii.com/images/20140527_6_1401173970_931105.jpg#\" title=\"\" vspace=\"5\" /></span></div>\n" +
            "\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "\n" +
            "<div class=\"h3\"><strong><span style=\"color: #000000;\"><span class=\"h3\"><span style=\"font-size: 22px;\">2) นั่งร้านโกปี๊ กินติ่มซำยามเช้า</span></span></strong></div>\n" +
            "\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "\n" +
            "<div><span style=\"color: #000000;\"><span style=\"font-size: 22px;\">อยากรู้ว่า ติ่มซำกับโกปี้ จะเข้ากันได้ดีขนาดไหน ลองแวะไปร้านโกปี๊ ที่มีอยู่เกือบทุกมุมของเมืองทับเที่ยง เลือกกินติ่มซำจานใดก็ได้ ที่อยู่ในใจคุณ ถ้าใครคิดจะ &quot;มื้อเช้าอย่างพระราชา&quot; ก็ต้องมาเที่ยวเมืองตรัง</span>\n" +
            "\n" +
            "<hr /></div>\n" +
            "\n" +
            "<p>&nbsp;</p>\n"+
            "<div><span style=\"color: #000000;\"><img alt=\"\" border=\"0\" wieght=\"600\"height=\"400\"src=\"http://2.bp.blogspot.com/-2eUsr6Rpxh8/T7oE0wvPu7I/AAAAAAAAAO4/VcO9NA82QLI/s1600/%E0%B8%AD%E0%B8%B2%E0%B8%AB%E0%B8%B2%E0%B8%A3%E0%B9%80%E0%B8%8A%E0%B9%89%E0%B8%B25.JPG\" title=\"\" vspace=\"5\" /></span></div>\n" +
            "\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "\n" +
            "<div class=\"h3\"><strong><span style=\"color: #000000;\"><span class=\"h3\"><span style=\"font-size: 22px;\">3) เคล็ดมงคลยามเช้า กับหมูย่างสูตรตรัง</span></span></strong></div>\n" +
            "\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "\n" +
            "<div><span style=\"color: #000000;\"><span style=\"font-size: 22px;\">เชื่อกันว่า ถ้าอยากให้กิจกรรมและกิจการในแต่ละวัน เป็นไปแบบหมูหมู ไม่ติดขัด ลองกิน &quot;หมูย่างสูตรตรัง&quot; เป็นอาหารมือเช้า แล้วทุกอย่างจะสมใจนึก เป็นความเชื่อที่มีแต่โบราณ คือสิ่งที่ห้ามพลาด เมื่อมาเยือนถื่นตรัง</span>\n" +
            "\n" +
            "<hr /></div>\n" +
            "\n" +
            "<div>\n" +
            "<p>&nbsp;</p>\n"+
            "<div><span style=\"color: #000000;\"><img alt=\"\" border=\"0\" wieght=\"600\"height=\"400\"src=\"http://www.trangzone.com/upload/story/147_Thumb.jpg\" title=\"\" vspace=\"5\" /></span></div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "\n" +
            "<div class=\"h3\"><strong><span style=\"color: #000000;\"><span class=\"h3\"><span style=\"font-size: 22px;\">4) เค้กภูรา ต้นตับรับเค้กมีรู</span></span></strong></div>\n" +
            "\n" +
            "<div class=\"h3\"><strong><span style=\"color: #000000;\"></span></strong></div>\n" +
            "\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<div><span style=\"color: #000000;\"><span style=\"font-size: 22px;\">เค้กลำภูรา เค้กมีรู เค้กดังประจำเมืองตรัง อร่อยแบบใสๆ รสชาติกลมกล่อมของเนื้อเค้กนุ่มๆ  หลากรสให้เลือก รสชา กาแฟ ส้ม ใบเตย ผลไม้รวมและอีกหลายรส และยังห้ามพลาดกับขนมพื้นเมืองหลายเมนู ขนมจีบสังขยา ขนมพริกไทย ขนมเป๊ยะฮ่องเต้ เปี๊ยะยิ้ม</span>\n" +
            "\n" +
            "<hr /></div>\n" +
            "\n" +
            "<div>\n" +
            "<p>&nbsp;</p>\n"+
            "<div><span style=\"color: #000000;\"><img alt=\"\" border=\"0\" wieght=\"400\"height=\"400\"src=\"http://f.ptcdn.info/046/009/000/1377789819-DSC0869JPG-o.jpg\" title=\"\" vspace=\"5\" /></span></div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "\n" +
            "<div class=\"h3\"><span style=\"color: #000000;\"><strong><span class=\"h3\"><span style=\"font-size: 22px;\">5) เที่ยวกันตัง สุดทางรถไฟฝั่งอันดามัน</span></strong></span></div>\n" +
            "\n" +
            "<div class=\"h3\"><span style=\"color: #000000;\"></span></div>\n" +
            "\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<div><span style=\"color: #000000;\"><span style=\"font-size: 22px;\">กันตัง อำเภอเล็กๆ ที่โด่งดังเมื่อร้อยกว่าปีก่อน เป็นเมืองท่าทางเศรษฐกิจที่สำคัญของโลกเมืองหนึ่ง มีสถานีรถไฟที่สวยคลาสิก ซึ่งคือสุดทางรถไฟฝั่งอันดามัน นั่งรถไฟไปเที่ยวกันตังสนุกอีกอารมณ์ มีร้านอาหารทะเลชื่อดัง ชวนนักชิมให้ไปลิ้มลองกัน</span>\n" +
            "\n" +
            "<hr /></div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<p>&nbsp;</p>\n"+
            "<div><span style=\"color: #000000;\"><img alt=\"\" border=\"0\" wieght=\"600\"height=\"400\"src=\"http://www.oknation.net/blog/home/blog_data/966/48966/images/tour5.JPG\" title=\"\" vspace=\"5\" /></span></div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "\n" +
            "<div class=\"h3\"><span style=\"color: #000000;\"><strong><span class=\"h3\"><span style=\"font-size: 22px;\">6) ปลูกหญ้า มหาบุญ อุดหนุนชุมชน</span></strong></span></div>\n" +
            "\n" +
            "<div class=\"h3\"><span style=\"color: #000000;\"></span></div>\n" +
            "\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<div><span style=\"color: #000000;\"><span style=\"font-size: 22px;\">ไปเดินแหวกทะเล  ปลูกหญ้าทะเล ดูปลาในกระชัง ชมธนาคารปู แล้วพายคายัคเที่ยวถ้ำ บ่อน้ำร้อนเค็ม และอิ่มเอมกับอาหารพื้นบ้านในบรรยากาศดีดี ที่บ่อหินฟาร์มสเตย์ อ.สิเกา เป็นแหล่งท่องเที่ยวเชิงนิเวศที่ไ้ด้รางวัลกินรี ปี 2556</span>\n" +
            "\n" +
            "<hr /></div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<p>&nbsp;</p>\n"+
            "<div><span style=\"color: #000000;\"><img alt=\"\" border=\"0\" wieght=\"600\"height=\"400\"src=\"http://images.thaiza.com/109/109_200806161538321..jpg\" title=\"\" vspace=\"5\" /></span></div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "\n" +
            "<div class=\"h3\"><strong><span style=\"color: #000000;\"><span class=\"h3\"><span style=\"font-size: 22px;\">7) สนุกสุดคุ้ม วันเดียว เที่ยวสี่เกาะ</span></span></strong></div>\n" +
            "\n" +
            "<div class=\"h3\"><strong><span style=\"color: #000000;\"></span></strong></div>\n" +
            "\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<div><span style=\"color: #000000;\"><span style=\"font-size: 22px;\">สี่เกาะชื่อดังในทะเลตรัง เกาะมุก ที่มีถ้ำมรกต เป็นหนึ่งใน Unseen Thailand เกาะกระดาน หาดทรายขาวน้ำใสราวกับกระจก เป็นเกาะแห่งความรัก  เกาะเชือกและเกาะม้า  เป็นจุดดำน้ำที่สวยสุด โลกใต้ทะเล รอให้คุณไปชื่นชม</span>\n" +
            "\n" +
            "<hr /></div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<p>&nbsp;</p>\n"+
            "<div><span style=\"color: #000000;\"><img alt=\"\" border=\"0\" wieght=\"600\"height=\"400\"src=\"http://board.trekkingthai.com/board/upload/photo/2010-06/2558eaf09281f17b818d1d033b67bab4.jpg\" title=\"\" vspace=\"5\" /></span></div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "\n" +
            "<div class=\"h3\"><strong><span style=\"color: #000000;\"><span class=\"h3\"><span style=\"font-size: 22px;\">8) ลอดท้องช่องมังกร ที่ถ้ำเลเขากอบ</span></span></strong></div>\n" +
            "\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<div><span style=\"color: #000000;\"><span style=\"font-size: 22px;\">ถ้ำเลเขากอบ เป็นถ้ำน้ำขนาดใหญ่ เต็มไปด้วยหินงอกหินย้อยที่สวยงามตระการตาซึ่งต้องนั่งเรือท้องแบนเข้ามาชม ไฮไลต์อยู่ที่ &ldquo;ท้องมังกรถ้ำ&rdquo; เป็นช่วงเพดานถ้ำที่ต่ำมาก จนทุกคนต้องนอนราบในเรือ นักท่องเที่ยวชาวจีนและไต้หวัน เชื่อว่าการลอดท้องมังกรจะช่วยเสริมดวง มีโชค</span>\n" +
            "\n" +
            "<hr/></div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<p>&nbsp;</p>\n"+
            "<div><span style=\"color: #000000;\"><img alt=\"\" border=\"0\" wieght=\"600\"height=\"400\"src=\"http://www.mots.go.th/trang/images/article/news104/n20140210141516_568.jpg\" title=\"\" vspace=\"5\" /></span></div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "\n" +
            "<div class=\"h3\"><strong><span style=\"color: #000000;\"><span class=\"h3\"><span style=\"font-size: 22px;\">9) เดินสูงเทียมยอดไม้ </span></span></strong></div>\n" +
            "\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "\n" +
            "<div class=\"h3\">&nbsp;</div>\n" +
            "\n" +
            "<div class=\"h3\"><span style=\"line-height: 1.6em;\"><span style=\"font-size: 22px;\">สวนพฤกษศาสตร์ภาคใต้ (ทุ่งค่าย)</span></div>\n" +
            "</div>\n" +
            "\n" +
            "<div>\n" +
            "<p><span style=\"font-size: 22px;\">เป็นหนึ่งเดียวในประเทศไทยที่มีสะพานให้ชมต้นไม้และสิ่งมีชีวิตที่อาศัยอยู่บนต้นไม้กันแบบใกล้ชิด&nbsp; เรียกสะพานนี้ว่า &ldquo;สะพานศึกษาเรือนยอดไม้&rdquo;&nbsp; อยู่ที่ป่าสงวนแห่งชาติป่าทุ่งค่าย อำเภอย่านตาขาว&nbsp; มีพื้นที่ประมาณ 2,600 ไร่</p>\n" +
            "\n" +
            "<hr />\n" +
            "<p>&nbsp;</p>\n" +
            "</div>\n";

    public static Intent createIntent(Context context) {
        return new Intent(context, TongHamPhlatActivity.class);
    }
//------------------------------------------------------------------------------------------------------
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tonghamphlat_activity);

        mWebView = (WebView) findViewById(R.id.webViewFace);
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
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.loadDataWithBaseURL("", text, "text1/html", "utf-8", "");
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