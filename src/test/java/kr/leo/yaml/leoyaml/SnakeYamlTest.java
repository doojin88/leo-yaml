package kr.leo.yaml.leoyaml;

import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SnakeYamlTest {

    @Test
    public void test() {

        String contents = YamlHelper.readLineByLineJava8("src/test/resources/customer.yml");

        Yaml yaml = new Yaml();
        Map<String, Object> obj = yaml.load(contents);

        assertEquals("{firstName=John, lastName=Doe, age=20}", obj.toString());
    }
}
