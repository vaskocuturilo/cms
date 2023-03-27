package com.example.cms.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/cms")
public class CmsRestController {

    @GetMapping("")
    private String openMainPage() {
        return "index";
    }
}
