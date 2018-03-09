package mx.appwhere.remittances.front.application.controllers.cajacentraliz;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import mx.appwhere.remittances.front.application.constants.ViewsLocation;

@RestController
public class CajaCentralizadController {

	@PostMapping(value ="/cajacentraliz")
	public ModelAndView getCajaCentralizView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.CAJACENTRALIZ_VIEW);
        mav.addObject("BSFOPERADOR", BSFOPERADOR);
        return mav;
    }
	
	@RequestMapping(value = "printParamEnt", method = RequestMethod.POST)
	public ModelAndView getprintParamEntView(String BSFOPERADOR) {
        ModelAndView mav = new ModelAndView(ViewsLocation.PRINTPARAMENTID_VIEW);
        //mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
}
