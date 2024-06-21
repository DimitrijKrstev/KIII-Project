package com.example.sitckynoteskiii.web;

import com.example.sitckynoteskiii.service.StickyNoteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class StickyNoteController {
    StickyNoteService stickyNoteService;

    @GetMapping("/")
    public String getMainPage(Model model){
        model.addAttribute("stickyNotes", stickyNoteService.findAll());

        return "index";
    }

    @GetMapping("/add")
    public String getAddPage(){
        return "addNote";
    }

    @PostMapping("/add")
    public String addNote(@RequestParam String title, @RequestParam String description){
        stickyNoteService.createNote(title, description);
        return "redirect:/";
    }
}
