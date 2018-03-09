package mx.appwhere.remittances.front.application.controllers.periodos;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import mx.appwhere.remittances.front.application.constants.ViewsLocation;

@RestController

public class PeriodosController {

	@PostMapping(value ="/periodos")
	public ModelAndView getPeriodoView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.PERIODOS_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
}
