package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.intent.Intents;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class AboutUSActivityTest extends ActivityInstrumentationTestCase2  {

    ImageView aboutexit;
    private Boolean isFabOpen = false;
    private FloatingActionButton fab,fab1;
    private Animation fab_open,fab_close,rotate_forward,rotate_backward;

    public AboutUSActivityTest() {
        super(AboutUSActivity.class);
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
        Intents.init();
        aboutexit = (ImageView) aboutexit.findViewById(R.id.aboutexit);
        fab1 = (FloatingActionButton) fab1.findViewById(R.id.fab1);

    }

    @Test
    public void testAnimateFAB() throws Exception {
        Intents.init();
        fab = (FloatingActionButton) fab.findViewById(R.id.fab);
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_backward);
        fab.setOnClickListener((View.OnClickListener) this);

    }

    private Context getApplicationContext() {
        return null;
    }
}