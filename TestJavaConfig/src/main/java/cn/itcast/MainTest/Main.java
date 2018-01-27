package cn.itcast.MainTest;
import cn.itcast.controller.TestController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 * 使用MockMvc实例执行针对“/home” 的get请求并设置期望得到的视图名，通过这一项来证明
 * url和视图能够执行
 */
public class Main {
  @Test
  public void testHomepage() throws Exception{
    TestController controller = new TestController();
    MockMvc mockMvc =
            standaloneSetup(controller).build();
    mockMvc.perform(get("/login")).andExpect(view().name("home"));
  }

}
