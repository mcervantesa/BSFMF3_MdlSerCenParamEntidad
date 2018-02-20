package mx.appwhere.remittances.front.domain.services.main;

import org.springframework.web.servlet.ModelAndView;

public interface IMainService {
    ModelAndView getMain(String BsfOperador);

    ModelAndView getMainTranport(String transport);
}
