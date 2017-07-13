package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.webkit.WebView;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class TongHamPhlatActivityTest extends ActivityInstrumentationTestCase2 {

    WebView mWebView;

    public TongHamPhlatActivityTest() {
        super(TongHamPhlatActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCreateIntent() throws Exception {
        Intent intent = new Intent(getActivity(), TongHamPhlatActivity.class);
        intent.setClass(getActivity(), TongHamPhlatActivity.class);
    }

    public void testOnCreate() throws Exception {
        Intent intent = new Intent(getActivity(), FragmentCredit.class);
        intent.setClass(getActivity(), TongHamPhlatActivity.class);
    }

    public void testOnStart() throws Exception {
    }

    public void testOnResume() throws Exception{
        mWebView.onResume();
    }
}