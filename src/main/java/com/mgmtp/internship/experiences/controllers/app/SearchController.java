package com.mgmtp.internship.experiences.controllers.app;

import com.mgmtp.internship.experiences.services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/search")
public class SearchController {
    @Autowired
    private ActivityService activityService;

    @GetMapping
    public String postSearch(Model model, @RequestParam(name = "searchInfor", required = false) String searchInfor) {
        System.out.println(searchInfor);
        model.addAttribute("activities", activityService.find(searchInfor));
        return "search";
    }
}
