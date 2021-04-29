package com.biz.app;

import com.biz.app.hello.HelloService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping({"/", "/hello"})
    public String hello(Model model, @RequestParam(value = "name", required = false, defaultValue = "World(defaultValue)") String name) {
        model.addAttribute("name", name);

        helloService.helloProcess(name);

        return "hello";
    }
}
