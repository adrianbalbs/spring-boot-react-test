package com.adrian.react;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReactForwardController {

    @GetMapping(value = {"/", "/{path:(?!api|static).*}/**"})
    public String forward(@PathVariable String path) {
        return "forward:/index.html";
    }

}
