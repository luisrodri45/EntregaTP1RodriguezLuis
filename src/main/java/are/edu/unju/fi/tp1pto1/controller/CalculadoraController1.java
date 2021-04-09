package are.edu.unju.fi.tp1pto1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import are.edu.unju.fi.tp1pto1.model.Calculadora;

@Controller
@Repository
@Service
public class CalculadoraController1 {
	@Autowired
	Calculadora calculadora;
	double sum,res,div,mul;
	@GetMapping("/sumar")
	public ModelAndView getSumarNumeros(@RequestParam(value="name")String nombre,@RequestParam(value="name2")String nombre2){
		
		calculadora.setNum1(Integer.parseInt(nombre));
		calculadora.setNum2(Integer.parseInt(nombre2));
		sum=calculadora.sumarNum();
		ModelAndView modelandview=new ModelAndView("resultado");
		modelandview.addObject("name", nombre);
		modelandview.addObject("name2", nombre2);
		modelandview.addObject("name3", sum);
		return modelandview;
		
	}
	@GetMapping("/restar")
	public ModelAndView getRestarNumeros(@RequestParam(value="name")String nombre,@RequestParam(value="name2")String nombre2){
		calculadora.setNum1(Integer.parseInt(nombre));
		calculadora.setNum2(Integer.parseInt(nombre2));
		res=calculadora.restarNum();
		ModelAndView modelandview=new ModelAndView("resultado");
		modelandview.addObject("name", nombre);
		modelandview.addObject("name2", nombre2);
		modelandview.addObject("name3", res);
		return modelandview;
		
	}
	@GetMapping("/multiplicar")
	public ModelAndView getMultiplicarNumeros(@RequestParam(value="name")String nombre,@RequestParam(value="name2")String nombre2){
		calculadora.setNum1(Integer.parseInt(nombre));
		calculadora.setNum2(Integer.parseInt(nombre2));
		mul=calculadora.multiplicarNum();
		ModelAndView modelandview=new ModelAndView("resultado");
		modelandview.addObject("name", nombre);
		modelandview.addObject("name2", nombre2);
		modelandview.addObject("name3", mul);
		return modelandview;
		
	}
	@GetMapping("/dividir")
	public ModelAndView getDividirNumeros(@RequestParam(value="name")String nombre,@RequestParam(value="name2")String nombre2){
		calculadora.setNum1(Integer.parseInt(nombre));
		calculadora.setNum2(Integer.parseInt(nombre2));
		div=calculadora.dividirNum();
		ModelAndView modelandview=new ModelAndView("resultado");
		modelandview.addObject("name", nombre);
		modelandview.addObject("name2", nombre2);
		if(div==-812773627) {
			modelandview.addObject("name3", "Error");
		}
		else {
			modelandview.addObject("name3", div);
		}
		return modelandview;
		
	}
}
