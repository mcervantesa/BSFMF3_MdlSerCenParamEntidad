package mx.appwhere.remittances.front.appconfig;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;

/**
 * Test deserialization and deserialization for date and time types with Jackson library.
 *
 * @author Alejandro Martin
 * @version 1.0 - 2017/09/22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DateJacksonTest {
    /**
     * Jackson mapper
     */
    private ObjectMapper objectMapper;

    @Component
    private static class LocalDateJacksonTest {
        private LocalDate localDateTimeZone;
        private LocalDate localDate;

        // setters & getters

        LocalDate getLocalDateTimeZone() {
            return localDateTimeZone;
        }

        public void setLocalDateTimeZone(LocalDate localDateTimeZone) {
            this.localDateTimeZone = localDateTimeZone;
        }

        LocalDate getLocalDate() {
            return localDate;
        }

        public void setLocalDate(LocalDate localDate) {
            this.localDate = localDate;
        }
    }

    @Before
    public void setup() {
    }

    /**
     * Test {@link LocalDate} deserialization with Jackson.
     */
    @Test
    public void testLocalDateDeserialization() throws Exception {

        Integer year = 1989;
        Month month = Month.AUGUST;
        Integer day = 12;

        String localDateTimeZoneString = String.format("%d-%02d-%02dT16:12:10.140Z",
                year, month.getValue(), day);
        String localDateString = String.format("%d-%02d-%02d",
                year, month.getValue(), day);
        String serializedJson = "{"
                + "\"localDateTimeZone\":\"" + localDateTimeZoneString + "\","
                + "\"localDate\":\"" + localDateString + "\""
                + "}";

        // ------------- perform test ------------------
        LocalDateJacksonTest deserializedObject = objectMapper.readValue(serializedJson, LocalDateJacksonTest.class);

        LocalDate expectedDate = LocalDate.of(year, month, day);

        assertEquals(expectedDate, deserializedObject.getLocalDateTimeZone());

        assertEquals(expectedDate, deserializedObject.getLocalDate());
    }

    // setters & getters

    @Autowired
    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
}
