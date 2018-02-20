package mx.appwhere.remittances.front.domain.services.main;

import mx.appwhere.remittances.front.application.dto.ejemplo.EjemploDto;
import org.springframework.web.servlet.ModelAndView;

public interface MainService {
    ModelAndView getMain(String BsfOperador);

    ModelAndView getMainTranport(String transport);

    EjemploDto utilizarConverter();
}
