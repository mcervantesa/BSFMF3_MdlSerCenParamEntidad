package mx.appwhere.remittances.front.application.controllers.conctitul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import mx.appwhere.remittances.front.application.constants.ViewsLocation;

@RestController
public class CoincidenciasTitularController {

	@RequestMapping(value = "/ListGrupLin", method = RequestMethod.POST)
	public ModelAndView getListGrupLinView(String bsfOper) {
        ModelAndView mav = new ModelAndView(ViewsLocation.COINCID_LISTGRIP_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
	
	@RequestMapping(value = "/CoincidTitul", method = RequestMethod.POST)
	public ModelAndView getCoincidTitulView(String bsfOper) {
        ModelAndView mav = new ModelAndView(ViewsLocation.COINCIDTITUD_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
	
	@RequestMapping(value = "/detallCoinTitu", method = RequestMethod.POST)
	public ModelAndView getdetallCoinTituView(String bsfOper) {
        ModelAndView mav = new ModelAndView(ViewsLocation.COINCIDTITUD_DET_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
}
