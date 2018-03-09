package mx.appwhere.remittances.front.application.controllers.dudosidad;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import mx.appwhere.remittances.front.application.constants.ViewsLocation;

@RestController
public class DudosidadController {
	@RequestMapping(value = "/Dudosidad", method = RequestMethod.POST)
	public ModelAndView getDudosidadView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.DUDOSIDAD_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
}
