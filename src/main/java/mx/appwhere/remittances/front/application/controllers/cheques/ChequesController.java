package mx.appwhere.remittances.front.application.controllers.cheques;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import mx.appwhere.remittances.front.application.constants.ViewsLocation;

@RestController
public class ChequesController {

	@PostMapping(value ="/cheques")
	public ModelAndView getChequesView() {
        ModelAndView mav = new ModelAndView(ViewsLocation.CHEQUES_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
}
