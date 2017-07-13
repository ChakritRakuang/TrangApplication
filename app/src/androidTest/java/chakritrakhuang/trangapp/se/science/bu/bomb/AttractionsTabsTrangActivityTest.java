package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.app.AppCompatActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.view.View;
import android.widget.ImageView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(AndroidJUnit4.class)
@SmallTest
public class AttractionsTabsTrangActivityTest extends ActivityInstrumentationTestCase2 {
    public AttractionsTabsTrangActivityTest(String pkg, Class activityClass) {
        super(pkg, activityClass);
    }

    public static class AttractionsTabsTrangActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView Attractiontrangimg1;
    ImageView nnnFrameLayoutpak_meng_sin2;
    ImageView nnnFrameLayoutpak_meng_sin3;
    ImageView nnnFrameLayoutpak_meng_sin4;
    ImageView nnnFrameLayoutpak_meng_sin5;
    ImageView nnnFrameLayoutpak_meng_sin6;
    ImageView nnnFrameLayoutpak_meng_sin7;
    ImageView nnnFrameLayoutpak_meng_sin8;
    ImageView nnnFrameLayoutpak_meng_sin9;
    ImageView nnnFrameLayoutpak_meng_sin10;

        public static Intent createIntent(Context context) {
            return new Intent(context, AttractionsTabsTrangActivity.class);
        }

        @Override
        public void onClick(View v) {

        }
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
        Intent intent = new Intent(getActivity(), AttractionsTabsTrangActivity.class);
        intent.setClass(getActivity(), AttractionsTabsTrangActivity.class);

    }

//------------------------------------------------------------------------------------------------------

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Attractiontrangimg1:
                break;
            case R.id.nnnFrameLayoutpak_meng_sin2:
                break;
            case R.id.nnnFrameLayoutpak_meng_sin3:
                break;
            case R.id.nnnFrameLayoutpak_meng_sin4:
                break;
            case R.id.nnnFrameLayoutpak_meng_sin5:
                break;
            case R.id.nnnFrameLayoutpak_meng_sin6:
                break;
            case R.id.nnnFrameLayoutpak_meng_sin7:
                break;
            case R.id.nnnFrameLayoutpak_meng_sin8:
                break;
            case R.id.nnnFrameLayoutpak_meng_sin9:
                break;
            case R.id.nnnFrameLayoutpak_meng_sin10:
                break;
        }
    }
}