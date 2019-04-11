package kr.leo.yaml.leoyaml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FasterxmlYamlTest {

    @Test
    public void testYaml() throws IOException {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        User user = mapper.readValue(new File("src/test/resources/user.yml"), User.class);

        assertEquals("", user.toString());
    }
}
