package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.ImageView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class SouvenirsTabsTrangActivityTest extends ActivityInstrumentationTestCase2 {

    //http://idea.lanyus.com
    ImageView FrameLayoutn1;
    ImageView FrameLayoutpak_meng_sin2;
    ImageView FrameLayoutpak_meng_sin3;
    ImageView FrameLayoutpak_meng_sin4;
    ImageView FrameLayoutpak_meng_sin5;

    public SouvenirsTabsTrangActivityTest() {
        super(SouvenirsTabsTrangActivity.class);
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

    @Test
    public void testOnCreate() throws Exception {
        Intent intent = new Intent(getActivity(), AboutUSActivity.class);
        intent.setClass(getActivity(), AboutUSActivity.class);
    }


    @Test
    public void testOnClick() throws Exception {

    }
}