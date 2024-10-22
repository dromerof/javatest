package dromerof.util;

import org.junit.Test;

import static dromerof.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_whr_has_less_than_8_letters() {

        assertEquals(WEAK, PasswordUtil.asessPassword("asd123!"));

    }

    @Test
    public void weak_when_has_only_letters() {

        assertEquals(WEAK, PasswordUtil.asessPassword("asdasdasdasdasd"));

    }

    @Test
    public void medium_when_has_letters_and_numbers() {

        assertEquals(MEDIUM, PasswordUtil.asessPassword("dasdasd123"));

    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {

        assertEquals(STRONG, PasswordUtil.asessPassword("dasdas!#d123"));

    }
}