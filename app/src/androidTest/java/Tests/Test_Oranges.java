package Tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.cse110.orangesarecircles.MainActivity;
import com.cse110.orangesarecircles.R;

/**
 * Created by Aaron on 4/19/2016.
 */
public class Test_Oranges extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public Test_Oranges()
    {
        super(MainActivity.class);
    }

    public void test_first()
    {
        mainActivity = getActivity();

        int x,y;
        x = 100;
        y = 150;

        assertEquals(250, mainActivity.sum(x,y));
    }
}
