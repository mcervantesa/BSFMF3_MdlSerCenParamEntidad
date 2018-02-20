package mx.appwhere.remittances.front.application.controllers.example;

import mx.appwhere.remittances.front.domain.services.main.IMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("example")
public class ExampleController {

    private IMainService mainService;

    @Autowired
    public ExampleController(IMainService mainService) {
        this.mainService = mainService;
    }

    @PostMapping(produces = "text/html; charset=UTF-8", params = "BSFOPERADOR")
    public ModelAndView getView(@RequestParam("BSFOPERADOR") String bsfOperadorEncrypt) {
        return mainService.getMain(bsfOperadorEncrypt);
    }

    @PostMapping(params = "TRANSPORT", produces = "text/html; charset=UTF-8")
    public ModelAndView getView2(@RequestParam("TRANSPORT") String transportEncrypt) {
        return mainService.getMainTranport(transportEncrypt);
    }
}
