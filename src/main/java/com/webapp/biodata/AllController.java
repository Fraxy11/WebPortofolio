package com.webapp.biodata;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.webapp.biodata.model.Konten;
import com.webapp.biodata.service.KontenService;

@Controller
public class AllController {

    private final KontenService kontenService;

    public AllController(KontenService kontenService) {
        super();
        this.kontenService = kontenService;
    }

    @GetMapping("/home.html")
    public String home(Model model) {
        Konten konten = kontenService.findKontenAll();
        model.addAttribute("konten", konten);
        return "home.html";
    }

    @GetMapping("/projects.html")
    public String project(Model model) {
        Konten konten = kontenService.findKontenAll();
        model.addAttribute("konten", konten);
        return "projects.html";
    }

    @GetMapping("/contact.html")
    public String contact(Model model) {
        return "contact.html";
    }

    @GetMapping("/resume.html")
    public String resume(Model model) {
        Konten konten = kontenService.findKontenAll();
        model.addAttribute("konten", konten);
        return "resume.html";
    }

}
