package mx.appwhere.remittances.front.appconfig.init;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Jenaro Bello
 * @version 1.0 - 2017/11/13
 */
@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
    }
}
