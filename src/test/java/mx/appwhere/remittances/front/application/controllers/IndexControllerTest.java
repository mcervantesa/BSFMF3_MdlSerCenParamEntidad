package mx.appwhere.remittances.front.application.controllers;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Alejandro Martin
 * @version 1.0 - 2017/10/06
 */
public class IndexControllerTest {

    private IndexController indexController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        indexController = new IndexController();
        mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
    }

    @Test
    public void testIndex() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().isOk()).
                andExpect(MockMvcResultMatchers.view().name("index"));
    }
}
