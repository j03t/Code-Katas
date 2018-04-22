package kata.time;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeFormatterTest {

	@Test
	public void test() {
		assertEquals("now", TimeFormatter.formatDuration(0));
        assertEquals("1 second", TimeFormatter.formatDuration(1));
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
        assertEquals("182 days, 1 hour, 44 minutes and 40 seconds", TimeFormatter.formatDuration(15731080));
        assertEquals("4 years, 68 days, 3 hours and 4 minutes", TimeFormatter.formatDuration(132030240));
	}

}
