package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.app.AppCompatActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.view.View;
import android.widget.ImageView;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("ALL")
@RunWith(AndroidJUnit4.class)
@SmallTest
public class MainActivityTest extends ActivityInstrumentationTestCase2 implements ViewPagerEx.OnPageChangeListener {
    public MainActivityTest(String pkg, Class activityClass) {
        super(pkg, activityClass);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    abstract class MainActivity extends AppCompatActivity implements View.OnClickListener, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    }

    ImageView imageView;
    ImageView imageView4;
    ImageView imageView3;
    ImageView imageView2;
    private SliderLayout mDemoSlider;

    public MainActivityTest() {
        super(MainActivity.class);
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
        Intent intent = new Intent(getActivity(), FragmentCredit.class);
        intent.setClass(getActivity(), FragmentCredit.class);
    }

    @Test
    public void testOnSliderClick() throws Exception {
        imageView = (ImageView) imageView.findViewById(R.id.imageView);
        imageView4 = (ImageView) imageView4.findViewById(R.id.imageView4);
        imageView3 = (ImageView) imageView3.findViewById(R.id.imageView3);
        imageView2 = (ImageView) imageView2.findViewById(R.id.imageView2);
        mDemoSlider = (SliderLayout) mDemoSlider.findViewById(R.id.slider);

        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(4000);
        mDemoSlider.addOnPageChangeListener(this);
    }

        @Test
        public boolean testOnCreateOptionsMenu() throws Exception {
            return true;

        }

    private View getMenuInflater() {
        return null;
    }

    @Test
        public void testOnPageScrolled() throws Exception {

        }

        @Test
        public void testOnPageSelected() throws Exception {

        }

        @Test
        public void testOnPageScrollStateChanged() throws Exception {

        }

        @Test
        public void testOnOptionsItemSelected() throws Exception {

        }

        @Test
        public void testOnClick() throws Exception {

        }
    }