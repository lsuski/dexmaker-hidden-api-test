package lsuski.github.com.dexmakerhiddenapibug

import android.support.test.runner.AndroidJUnit4
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun useAppContext() {

        val realPackageManager = android.support.test.InstrumentationRegistry.getTargetContext().packageManager

        Assert.assertNotNull(realPackageManager.getPackageInfo("lsuski.github.com.dexmakerhiddenapibug",0))

        val spy = Mockito.spy(realPackageManager)


        //with dexmaker-mockito:
        //passes on API 27
        //fails on API 28
        //with dexmaker-mockito-inline:
        //fails on API 27
        //passes on API 28
        Assert.assertNotNull(spy.getPackageInfo("lsuski.github.com.dexmakerhiddenapibug",0))

    }
}
