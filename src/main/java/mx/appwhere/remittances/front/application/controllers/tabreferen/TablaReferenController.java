package mx.appwhere.remittances.front.application.controllers.tabreferen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import mx.appwhere.remittances.front.application.constants.ViewsLocation;

@RestController
public class TablaReferenController {

	@RequestMapping(value = "/MantCentrAut", method = RequestMethod.POST)
	public ModelAndView getPasAportacionesView(String bsfOper) {
        ModelAndView mav = new ModelAndView(ViewsLocation.TABREFMANCENTAUT_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
	
	@RequestMapping(value = "/PrintMantCentAut", method = RequestMethod.POST)
	public ModelAndView getPrintMantCentAutView(String bsfOper) {
        ModelAndView mav = new ModelAndView(ViewsLocation.PRINTTABREFMANCENTAUT_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
	
	@RequestMapping(value = "/ConsTabRef", method = RequestMethod.POST)
	public ModelAndView getConsTabRefView(String bsfOper) {
        ModelAndView mav = new ModelAndView(ViewsLocation.TABREFCONSULTA_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
	
	@RequestMapping(value = "/PrintConsTabRef", method = RequestMethod.POST)
	public ModelAndView getPrintConsTabRefView(String bsfOper) {
        ModelAndView mav = new ModelAndView(ViewsLocation.PRINTTABREFCONSULTA_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
	
	@RequestMapping(value = "/SelecAmpFil", method = RequestMethod.POST)
	public ModelAndView getSelecAmpFilView(String bsfOper) {
        ModelAndView mav = new ModelAndView(ViewsLocation.SELECTAMPLFIL_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
	
	@RequestMapping(value = "/PrintSelecAmpFil", method = RequestMethod.POST)
	public ModelAndView getPrintSelecAmpFilView(String bsfOper) {
        ModelAndView mav = new ModelAndView(ViewsLocation.PRINTSELECTAMPLFIL_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
}
