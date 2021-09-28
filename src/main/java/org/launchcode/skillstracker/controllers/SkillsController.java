package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@ResponseBody
public class SkillsController {

    @GetMapping
    public String listOfSkills() {
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2><b>We have a few skills we would like to learn. Here's the list!</b></h2>" +
                "<body>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>HTML</li>" +
                "<li>Java</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "favorites")
    public String favoriteSkills(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<html>" +
                "<h1>" + name + "</h1>" +
                "<h2>List of Favorite Languages</h2>" +
                "<body>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String formFavSkills() {
        return "<html>" +
                "<body>" +
                "<form action='favorites' method='POST'>" + //submit a request to base path
                "<label>Name" +
                "<br><input type='text' Name='name'>" +
                "</label>" +
                "<br><label>Favorite language:" +
                "<select name='language1' id='fav-lang'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='html'>HTML</option>" +
                "<option value='java'>Java</option>" +
                "</select>" +
                "</label>" +
                "<br><label>Second Favorite language:" +
                "<select name='language2' id='second-lang'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='html'>HTML</option>" +
                "<option value='java'>Java</option>" +
                "</select>" +
                "</label>" +
                "<br><label>Third Favorite language:" +
                "<select name='language3' id='third-lang'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='html'>HTML</option>" +
                "<option value='java'>Java</option>" +
                "</select>" +
                "</label>" +
                "<br><input type='submit' value='Submit!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}