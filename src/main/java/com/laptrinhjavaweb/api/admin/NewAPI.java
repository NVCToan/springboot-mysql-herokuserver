package com.laptrinhjavaweb.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.repository.NewRepository;
import com.laptrinhjavaweb.service.INewService;
import com.laptrinhjavaweb.service.impl.NewService;

@RestController(value="newAPIOfAdmin") // @RestController = @Controller + @ResponseBody
public class NewAPI {
	
@Autowired
private INewService newService;

	@PostMapping("/api/new") //  = @RequestMapping(value="/api/new", method = RequestMethod.POST)
	public NewDTO createNew(@RequestBody NewDTO newDTO) {
		return newService.save(newDTO);
	}
	
	@PutMapping("/api/new")
	public NewDTO updateNew(@RequestBody NewDTO newDTO) {
		return  newService.save(newDTO);
	}
	
	//Xoa nhieu bai viet
	@DeleteMapping("/api/new")
	public void deleteNew(@RequestBody Long[] ids) {
		newService.delete(ids);
	}
}
