package cc.peaks.androidtestingbible.jetpack

//import androidx.test.InstrumentationRegistry
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

import cc.peaks.androidtestingbible.R
import org.assertj.core.api.Assertions.assertThat

@RunWith(AndroidJUnit4::class)
class JetpackLocalUnitTest {
  @Test
  fun gettingContextTest() {
    val context = InstrumentationRegistry.getInstrumentation().context
    val appName = context.getString(R.string.app_name)
    assertThat(appName).isEqualTo("AndroidTestingBible")
  }
}

