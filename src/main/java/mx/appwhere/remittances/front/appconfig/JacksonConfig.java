package mx.appwhere.remittances.front.appconfig;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * @author Alejandro Martin
 * @version 1.0 - 2017/09/22
 */
@Configuration
public class JacksonConfig {

    /**
     * Configure jackson mapper to write dates with ISO 8601
     *
     * @param jackson2ObjectMapperBuilder builder
     * @return jackson object mapper instance
     */
    @Bean
    public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder) {
        ObjectMapper objectMapper = jackson2ObjectMapperBuilder.createXmlMapper(false).build();
        // avoid to write date as timestamps and use dates as ISO 8601
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        return objectMapper;
    }
}
