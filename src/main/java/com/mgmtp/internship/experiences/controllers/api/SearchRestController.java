package com.mgmtp.internship.experiences.controllers.api;

import com.mgmtp.internship.experiences.dto.ActivityDTO;
import com.mgmtp.internship.experiences.services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/search")
public class SearchRestController extends BaseRestController {
    @Autowired
    ActivityService activityService;

    @GetMapping
    public List<ActivityDTO> search(@RequestParam ("searchInfo") String searchInfor){
        return activityService.find(searchInfor);
    }
}
