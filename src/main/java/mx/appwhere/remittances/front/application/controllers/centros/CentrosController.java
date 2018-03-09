package mx.appwhere.remittances.front.application.controllers.centros;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import mx.appwhere.remittances.front.application.constants.ViewsLocation;

@RestController
public class CentrosController {

	@RequestMapping(value = "/Centros", method = RequestMethod.POST)
	public ModelAndView getCentrosView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.CENTROS_VIEW);
        /mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "/PrintCentros", method = RequestMethod.POST)
	public ModelAndView getPrintCentrosView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.PRINTCENTROS_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
}
