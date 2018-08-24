package days.day1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaptchaTest {

    @Test public void finalTestCases() {
        Captcha captcha  = new Captcha();
        Integer expected = 3;
        assertEquals(expected, captcha.doCaptcha("1122", 1));
        expected = 4;
        assertEquals(expected, captcha.doCaptcha("1111", 1));
        expected = 0;
        assertEquals(expected, captcha.doCaptcha("1234", 1));
        expected = 9;
        assertEquals(expected, captcha.doCaptcha("91212129", 1));
    }




}