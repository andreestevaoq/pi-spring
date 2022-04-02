package com.site.pi.controllers;

import javax.validation.Valid;

import com.site.pi.models.CadastroCv;
import com.site.pi.repository.CadastroCvRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class formCadastroController {

	@Autowired
	private CadastroCvRepository cv;

	@RequestMapping("/form_cadastro")
	public String form() {
		return "form_cadastro";

	}

	// @GetMapping
	// public String form(){
	// return "form_cadastro";
	// }

	//POST que cadastra os dados
	@RequestMapping(value = "/form_cadastro", method = RequestMethod.POST)
	public String form(@Valid CadastroCv cadastrocv, BindingResult result, RedirectAttributes attributes) {

		if (result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos...");
			return "redirect:/form_cadastro";
		}

		cv.save(cadastrocv);
		attributes.addFlashAttribute("mensagem", "Currículo cadastrado com sucesso!");
		return "redirect:/form_cadastro";
	}

	// GET que lista os Cadastros
	@RequestMapping("/cadastros")
	public ModelAndView listaCadastros() {
		ModelAndView mv = new ModelAndView("/lista_cadastros");
		Iterable<CadastroCv> cadastros = cv.findAll();
		mv.addObject("cadastros", cadastros);
		return mv;
	}

	//GET que mostra detalhes dos Cadastros
	@RequestMapping("/cadastro/{id}")
	public ModelAndView detalhesCadastro(@PathVariable("id") long id) {
		CadastroCv cadastro = cv.findById(id);
		ModelAndView mv = new ModelAndView("/detalhes_cadastro");
		mv.addObject("cadastro", cadastro);
		
	return mv;
	}

	// GET que deleta cadastro
	@RequestMapping("/deletarCadastro")
	public String deletarCadastro(long id) {
		CadastroCv cadastrocv = cv.findById(id);
		cv.delete(cadastrocv);
		return "redirect:/cadastros";

	}

	// Métodos que atualizam cadastro
		// GET que chama o FORM de edição de cadastro
		@RequestMapping("/editarCadastro")
		public ModelAndView editarCadastro(long id) {
			CadastroCv cadastro = cv.findById(id);
			ModelAndView mv = new ModelAndView("/edita_cadastro");
			mv.addObject("cadastro", cadastro);
			return mv;
		}
		
		// POST que atualiza o Cadastro
		@RequestMapping(value = "/editarCadastro", method = RequestMethod.POST)
		public String updateCadastro(@Valid CadastroCv cadastrocv,  BindingResult result, RedirectAttributes attributes){
			
			cv.save(cadastrocv);
			attributes.addFlashAttribute("mensagem", "Cadastro alterado com sucesso!");
			
			long idLong = cadastrocv.getId();
			String id = "" + idLong;
			return "redirect:/cadastro/" + id;
			
		}

}
