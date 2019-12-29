package task1;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Theories.class)
public class TimeTest {

    @Theory
    public void test_successfully() throws Exception {
        List<String> times = List.of("12:30", "23:59:59", "00:00:00", "09:20", "08:09:01");
        List<String> results = Time.checkTimes(times);
        Assume.assumeTrue(times.size() == results.size());
        Assert.assertEquals(times, results);
    }

    @Theory
    public void test_unsuccessfully() throws Exception {
        List<String> times = List.of("24:00", "02:60");
        List<String> results = Time.checkTimes(times);
        Assert.assertTrue(results.isEmpty());
    }
}