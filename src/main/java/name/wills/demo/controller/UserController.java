package name.wills.demo.controller;

import name.wills.demo.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class UserController {

    private org.slf4j.Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @RequestMapping("/userPage")
    public ModelAndView userPage() {
        ModelAndView mv = new ModelAndView();

        int userCount = userService.countAll();
        mv.getModel().put("userCount", userCount);
        mv.setViewName("/pages/userPage.html");

        LOGGER.info("userCount: " + userCount);
        return mv;
    }

}
