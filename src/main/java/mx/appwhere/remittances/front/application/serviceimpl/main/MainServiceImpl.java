package mx.appwhere.remittances.front.application.serviceimpl.main;

import mx.appwhere.remittances.front.application.constants.ApplicationConstants;
import mx.appwhere.remittances.front.application.dto.bsfoperador.BsfOperadorDTO;
import mx.appwhere.remittances.front.application.serviceimpl.CommonService;
import mx.appwhere.remittances.front.domain.services.main.IMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class MainServiceImpl implements IMainService {

    @Value("${jboss.digitalizacion.uri}")
    private String uriDigitalizacion;
    private CommonService commonService;
    private String digitalizacion = "ig6bpA59BmxGAIwqUPcX5SRRxl3om/4vKuu6jFTBSvU5gKmGr1uJw8UtEY0a81/ln/qt7jxIHGE9hcv8i60x9l3wMLwI0JzXABXqlKpSRnAjEZyjRb3Gw9pX9RD79azdVLMxK77tK+V9DMxQrXQyXzcdZYZfFAZdAv46EBax9n2RQeDMm/YyZ4nWfPcM4mkXP3Nbrl7+W7AyLIxZJsfjPAcsjDwPk6LODqB+2Igq+qJUWQd1Q+8DOdq3ITGxkyIHaiptUThyiP5LsDt0Lk2LhJViS+gguFhWGwfSvg3gtH0lbNDqHnWd/ryTAt0fXzbYNiJ82hA5nxKCVG4VEfcGefu9qcFxcqRd4pOs13p6sJN8scY3gPAp8clP09GDI7KzQQEpCP5laRlQUFz92e7K2j9HhbrYQexRzj8ZEZfOf7fWGHEsIO84ax6tdVT4fH7vLt9aoHWk5vluxKjJlLOLlHqyIeUZRuQrxWRqN4J/6WN/Bi+68coYJfZs5egDiXK0y4ORPULj7zIKAjCOCTnfLnbShp46qNW5+E+y9HD3ulPzOEPKqkTBdnRXEH9acF828dkmp+/vb/tlOqtbYhvw/3boz+r3BgC1gdzp2mJG75W40jsZgzRSAOpY17sQRhB9XYRW35R9xU1+e82jdZFiZ6NsmltpasWG1WZY6icyBz9u8hOGRYlCJBTyKs8POxUsoHiSMVJ4QpqTkGmNf5yJoab1B1M9/qjduuQyrz2EqPa8Z6+rw53uOAwFLyy5fVqg";

    @Autowired
    public MainServiceImpl(CommonService commonService) {
        this.commonService = commonService;
    }

    @Override
    public ModelAndView getMain(String bsfOperador) {
        ModelAndView mav = new ModelAndView(ApplicationConstants.EXAMPLE_VIEW);
        BsfOperadorDTO bsfOperadorDTO = commonService.desencriptarBsfOperador(bsfOperador);
        mav.addObject("nombre", bsfOperadorDTO.getNOMBREEMPLEADO());
        mav.addObject("transportUri", uriDigitalizacion);
        mav.addObject("transport", digitalizacion);
        return mav;
    }

    @Override
    public ModelAndView getMainTranport(String transport) {
        ModelAndView mav = new ModelAndView(ApplicationConstants.EXAMPLE_VIEW);
        BsfOperadorDTO bsfOperadorDTO = commonService.desencriptarBsfOperador(transport);
        mav.addObject("nombre", bsfOperadorDTO.getNOMBREEMPLEADO());
        mav.addObject("transportUri", uriDigitalizacion);
        mav.addObject("transport", digitalizacion);
        mav.addObject("doc", bsfOperadorDTO.getTRANSPORT().getIDDOCUMENTO());
        return mav;
    }
}
