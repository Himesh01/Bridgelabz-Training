package iostreampractice.JSON.AdvancedProblem;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.*;

public class JsonToXml {
    public static void main(String[] args) throws Exception {

        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        JsonNode node = jsonMapper.readTree(new File("data.json"));
        String xml = xmlMapper.writeValueAsString(node);

        System.out.println(xml);
    }
}