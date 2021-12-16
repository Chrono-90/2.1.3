package allPack.model.controller;

import allPack.model.model.User;
import allPack.model.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ControllerUsers {

    @Autowired
    private ServiceUser serviceUser;

    @GetMapping("/")
    public String testContr(Model userModel) {
        List<User> someUsers = serviceUser.getAllUsers();
        userModel.addAttribute("solders", someUsers);
        return "ak103";
    }
    @PostMapping ("/create")
    public String createNewUser(@ModelAttribute("BRDM") User user) {
        serviceUser.createUser(user);
        return "redirect:/";
    }
    @GetMapping("/update/{id}")
    public String updateUser(@PathVariable("id") int id, Model userModel) {
        User user = serviceUser.fiendUserById(id);
        userModel.addAttribute("BRDM", user);
        return "recrut";
    }
    @GetMapping("/delete/{id}")
    public String removeUser(@PathVariable("id") int id) {
        serviceUser.removeUser(id);
        return "redirect:/";
    }
    @PostMapping("getNew")
    public String getNewUser(Model userModel) {
        User user = new User();
        userModel.addAttribute("BRDM", user);
        return "recrut";
    }

}
