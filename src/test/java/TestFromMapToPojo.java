import com.google.common.collect.Maps;
import org.junit.Test;
import org.modelmapper.ModelMapper;

import java.util.Map;

public class TestFromMapToPojo {

    @Test
    public void testLinkedHashMap1() {
        final ModelMapper modelMapper = new ModelMapper();
        
        //Map a map with all the pojo fields set
        Map<String, Object> mapOfValues = Maps.newLinkedHashMap();
        mapOfValues.put("id", 99L);
        mapOfValues.put("name", "mock name");

        final TestPojo testPojo1 = modelMapper.map(mapOfValues, TestPojo.class);

        System.out.println(testPojo1);

        //Map a map with fields set and a field that does not map to anything on the pojo
        Map<String, Object> mapOfUnmappedFields = Maps.newLinkedHashMap();
        mapOfUnmappedFields.put("id", 99L);

        final TestPojo testPojo2 = modelMapper.map(mapOfUnmappedFields, TestPojo.class);

        System.out.println(testPojo2);
    }

}
