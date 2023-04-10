package com.example.parcialprimercorte;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.matcher.IntentMatchers;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class loginprincipalTest {

    @Rule
    public ActivityTestRule<loginprincipal> activityRule = new ActivityTestRule<>(loginprincipal.class);

    @Before
    public void setUp() {
        Intents.init();
    }

    @After
    public void tearDown() {
        Intents.release();
    }

    @Test
    public void testLoginCorrecto() {
        Espresso.onView(ViewMatchers.withId(R.id.usuario)).perform(ViewActions.typeText("Felipe"));
        Espresso.onView(ViewMatchers.withId(R.id.contrasena)).perform(ViewActions.typeText("1234"));
        Espresso.onView(ViewMatchers.withId(R.id.consulta)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.usuest)).check(ViewAssertions.matches(ViewMatchers.withText("FELIPE")));
        Espresso.onView(ViewMatchers.withId(R.id.contres)).check(ViewAssertions.matches(ViewMatchers.withText("BOGOTA")));
        Espresso.onView(ViewMatchers.withText("Bienvenido!")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Intents.intended(IntentMatchers.hasComponent(datosusuario.class.getName()));
    }

    @Test
    public void testLoginIncorrecto() {
        Espresso.onView(ViewMatchers.withId(R.id.usuario)).perform(ViewActions.typeText("Juan"));
        Espresso.onView(ViewMatchers.withId(R.id.contrasena)).perform(ViewActions.typeText("12345"));
        Espresso.onView(ViewMatchers.withId(R.id.consulta)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withText("usuario incorrecto")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Intents.intended(IntentMatchers.hasComponent(datosusuario.class.getName()));
    }
}
