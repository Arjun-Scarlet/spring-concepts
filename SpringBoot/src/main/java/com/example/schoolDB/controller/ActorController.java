package com.example.schoolDB.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.schoolDB.entity.Actor;
import com.example.schoolDB.repository.ActorRepository;

@Controller
public class ActorController {
	
	@Autowired
	private ActorRepository ar;
	
	@GetMapping("/register")
	public String addActor(Model m) {
		m.addAttribute("actor", new Actor());
		return "a_register";
	}
	
	//Save
	@PostMapping("/saveActor")
	public String save(@ModelAttribute Actor actor, Model m) {
		ar.save(actor);
		m.addAttribute("actor", actor);//it will send saved Actor object to jsp page
		return "a_edit";
	}
	
	//Fetch
	@GetMapping("/displayActor")
	public String fetch(Model m) {
		List<Actor> list = ar.findAll();
		if(list.isEmpty()) m.addAttribute("message", "No Actors Found!");
		else m.addAttribute("actors", list);//fetch all actors from DB and sends to jsp page
		return "a_display";
	}
	
	//Delete
	@GetMapping("/deleteActor")
	public String showDeletePage() {
        return "a_delete";
    }
	
	@PostMapping("/showDelete")
	public String delete(@RequestParam int id, Model m) {
		if(ar.existsById(id)) {
			ar.deleteById(id);
			m.addAttribute("message", "Actor with Id: "+id+" has been deleted successfully!");
		}
		else m.addAttribute("message", "No Id found! Please enter a valid Actor Id");
		return "a_delete";
	}
	
	//Update
	@GetMapping("/updateActor")
	public String showUpdatePage() {
		return "a_update";
	}
	
	@GetMapping("/getActorById")
	public String getActorById(@RequestParam int id, Model m) {
		if(ar.existsById(id)) {
			Actor a = ar.findById(id).orElse(null);
			m.addAttribute("actor", a);
		}
		else m.addAttribute("message", "No Id found! Please enter a valid Actor Id");
		return "a_update";
	}
	
	@PostMapping("/showUpdate")
	public String update(@ModelAttribute Actor actor, Model m) {
		ar.save(actor);
		return "redirect:/displayActor";
	}

}

















