package mx.appwhere.remittances.front.application.controllers.pasivo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import mx.appwhere.remittances.front.application.constants.ViewsLocation;

@RestController
public class PasivoController {
	@PostMapping(value ="/prioridCargo")
	public ModelAndView getprioridCargoView() {
        ModelAndView mav = new ModelAndView(ViewsLocation.PASIVPRIORCARGO_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
}
