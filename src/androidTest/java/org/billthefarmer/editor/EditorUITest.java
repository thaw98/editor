package org.billthefarmer.editor;

import android.content.Context;

import androidx.test.filters.LargeTest;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class EditorUITest {

    @Rule
    public ActivityTestRule<Editor> mActivityTestRule = new ActivityTestRule<>(Editor.class);

    @Test
    public void editorTest3() {
    }
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("org.billthefarmer.editor", appContext.getPackageName());
    }

}
