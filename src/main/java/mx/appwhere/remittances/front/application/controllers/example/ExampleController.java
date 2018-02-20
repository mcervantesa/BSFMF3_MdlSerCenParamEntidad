package mx.appwhere.remittances.front.application.controllers.example;

import mx.appwhere.remittances.front.application.constants.ApplicationConstants;
import mx.appwhere.remittances.front.domain.services.main.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("example")
public class ExampleController {

    private MainService mainService;

    @Autowired
    public ExampleController(MainService mainService) {
        this.mainService = mainService;
    }

    @PostMapping(produces = ApplicationConstants.VIEWS_PRODUCE_HTML, params = "BSFOPERADOR")
    public ModelAndView getView(@RequestParam("BSFOPERADOR") String bsfOperadorEncrypt) {
        return mainService.getMain(bsfOperadorEncrypt);
    }

    @PostMapping(params = "TRANSPORT", produces = ApplicationConstants.VIEWS_PRODUCE_HTML)
    public ModelAndView getView2(@RequestParam("TRANSPORT") String transportEncrypt) {
        return mainService.getMainTranport(transportEncrypt);
    }
}
