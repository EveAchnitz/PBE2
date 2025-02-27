package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Material;
import br.com.joalheriajoiasjoia.app.services.MaterialService;

@RestController
@RequestMapping("/materiais")
public class MaterialController {

	//ATRIBUTOS
	@Autowired
	private MaterialService materialService;
	
	//MÉTODOS
	@PostMapping
	public Material createMaterial(@RequestBody Material material) {
		return materialService.saveMaterial(material);
	}
	
	@GetMapping
	public List<Material> getAllMateriais() {
		return materialService.getAllMateriais();
	}
	
	@GetMapping("/{id}")
	public Material getMaterialById(Long id) {
		return materialService.getMaterialById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMaterial(Long id) {
		materialService.deleteMaterial(id);
	}
}
