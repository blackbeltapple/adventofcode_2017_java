package days.day1;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class CaptchaTest {

    @Test void finalTestCases() {
        Captcha captcha  = new Captcha();
        Integer expected = 3;
        assertEquals(expected, captcha.doCaptcha("1122"));
//        assertEquals(1, captcha.doCaptcha(1111));
//        assertEquals(0, captcha.doCaptcha(1234));
//        assertEquals(9, captcha.doCaptcha(91212129));
    }

    @Test void testMakeArray() {
        Captcha captcha  = new Captcha();
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(2);
        assertEquals(expected, captcha.convertToList("1122"));
    }

    @Test void testSummInt() {
        Captcha captcha = new Captcha();
        Integer expected = 6;

        assertEquals(expected, captcha.sumString("1122"));

    }

    @Test void testFilteredArray() {
        Captcha captcha  = new Captcha();
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);

        assertEquals(expected, captcha.doCaptcha("1122"));

    }
}

