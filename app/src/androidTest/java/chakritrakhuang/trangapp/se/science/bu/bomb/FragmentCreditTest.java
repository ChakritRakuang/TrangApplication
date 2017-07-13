package chakritrakhuang.trangapp.se.science.bu.bomb;

import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class FragmentCreditTest extends ActivityInstrumentationTestCase2 {

    public FragmentCreditTest() {
        super(FragmentCredit.class);
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
    public void testCreateIntent() throws Exception {
        Intent intent = new Intent(getActivity(), FragmentCredit.class);
        intent.setClass(getActivity(), FragmentCredit.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        Intent intent = new Intent(getActivity(), FragmentCredit.class);
        intent.setClass(getActivity(), FragmentCredit.class);

    }
}