package org.example.bangbuje.tables;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class objectController {
    private final objectRepository objectRepository;
    @GetMapping("/insert")
    String insert(){
        return "/insert.html";
    }

    @PostMapping("/insert_post")
    String insert_post(@RequestParam String place_name){
        object objects = new object();
        objects.setPlace_name(place_name);
        objectRepository.save(objects);
        return "redirect:/insert";
    }

}
