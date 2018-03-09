package mx.appwhere.remittances.front.application.controllers.liquidaciones;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import mx.appwhere.remittances.front.application.constants.ViewsLocation;

@RestController
public class LiquidacionesController {

	@PostMapping(value ="/liquidaciones")
	public ModelAndView getLiquidacionesView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.LIQUIDACIONES_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "BusqLiquid", method = RequestMethod.POST)
	public ModelAndView getprintBusqLiquidView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.FINDLIQUIDACIONES_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "PrintLiquid", method = RequestMethod.POST)
	public ModelAndView getprintLiquidView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.PRINTLIQUIDACIONES_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "ListAudLiquid", method = RequestMethod.POST)
	public ModelAndView getLisAudLiquidView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.LISTAUDPARAMLIQUIDACIONES_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "FindListAudLiquid", method = RequestMethod.POST)
	public ModelAndView getFindListAudLiquidView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.FINDLISTAUDPARAMLIQ_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "PrintListAudLiquid", method = RequestMethod.POST)
	public ModelAndView getPrintListAudLiquidView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.PRINTLISTAUDPARAMLIQ_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "ListAudit", method = RequestMethod.POST)
	public ModelAndView getListAuditView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.LISTAUDITORIA_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "ConsAudit", method = RequestMethod.POST)
	public ModelAndView getConsAuditView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.CONSTAUDITORIA_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
}
