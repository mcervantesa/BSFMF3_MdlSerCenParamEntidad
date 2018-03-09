package mx.appwhere.remittances.front.application.controllers.tabreferen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import mx.appwhere.remittances.front.application.constants.ViewsLocation;

@RestController
public class TablaReferenController {

	@RequestMapping(value = "/MantCentrAut", method = RequestMethod.POST)
	public ModelAndView getPasAportacionesView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.TABREFMANCENTAUT_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "/PrintMantCentAut", method = RequestMethod.POST)
	public ModelAndView getPrintMantCentAutView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.PRINTTABREFMANCENTAUT_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "/ConsTabRef", method = RequestMethod.POST)
	public ModelAndView getConsTabRefView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.TABREFCONSULTA_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "/PrintConsTabRef", method = RequestMethod.POST)
	public ModelAndView getPrintConsTabRefView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.PRINTTABREFCONSULTA_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "/SelecAmpFil", method = RequestMethod.POST)
	public ModelAndView getSelecAmpFilView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.SELECTAMPLFIL_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "/PrintSelecAmpFil", method = RequestMethod.POST)
	public ModelAndView getPrintSelecAmpFilView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.PRINTSELECTAMPLFIL_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "/DetSelecAmpFil", method = RequestMethod.POST)
	public ModelAndView getDetSelecAmpFilView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.DETSELECTAMPLFIL_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "/ConsTabAsoc", method = RequestMethod.POST)
	public ModelAndView getConsTabAsocView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.CONSTABASOC_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "/ManFilTabRef", method = RequestMethod.POST)
	public ModelAndView getManFilTabRefView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.MANFILTABREF_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "/ConsDomColTabRef", method = RequestMethod.POST)
	public ModelAndView getConsDomColTabRefView(String bsfOper) {
        ModelAndView mav = new ModelAndView(ViewsLocation.CONSDOMCOL_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
	
	@RequestMapping(value = "/TabRefPrincipal", method = RequestMethod.POST)
	public ModelAndView getTabRefPrincipalView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.TABREFPRINC_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "/DetalleTabRefPrincipal", method = RequestMethod.POST)
	public ModelAndView getDetalleTabRefPrincipalView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.DETALLTABREFPRINC_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "/PrintTabRefPrincipal", method = RequestMethod.POST)
	public ModelAndView getPrintTabRefPrincipalView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.PRINTTABREFPRINC_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
}
