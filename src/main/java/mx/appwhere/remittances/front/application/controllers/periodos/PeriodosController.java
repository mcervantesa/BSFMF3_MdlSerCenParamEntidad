package mx.appwhere.remittances.front.application.controllers.periodos;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import mx.appwhere.remittances.front.application.constants.ViewsLocation;

@RestController

public class PeriodosController {

	@PostMapping(value ="/periodos")
	public ModelAndView getPeriodoView() {
        ModelAndView mav = new ModelAndView(ViewsLocation.PERIODOS_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
}
