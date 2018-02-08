package mx.appwhere.remittances.front.appconfig.init;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Alejandro Martin
 * @version 1.0 - 2017/10/04
 */
@Component
@Profile("nodataservice")
public class BoostrapNodataservice implements ApplicationListener<ContextRefreshedEvent> {



    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

    }

}
