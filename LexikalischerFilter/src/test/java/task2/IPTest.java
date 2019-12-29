package task2;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Theories.class)
public class IPTest {

    @Theory
    public void test_successfully() throws Exception {
        List<String> ips = List.of("0.0.0.0", "255.255.255.255", "192.168.42.42", "42.120.1.70", "127.0.0.1");
        List<String> results = IP.checkIPs(ips);
        Assume.assumeTrue(ips.size() == results.size());
        Assert.assertEquals(ips, results);
    }

    @Theory
    public void test_unsuccessfully() throws Exception {
        List<String> ips = List.of("1.012.13.140", "256.256.256.256");
        List<String> results = IP.checkIPs(ips);
        Assert.assertTrue(results.isEmpty());
    }

}