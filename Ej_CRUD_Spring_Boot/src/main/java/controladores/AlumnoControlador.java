package controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import modelos.Alumno;
import repositorios.RepoAlumno;

@Controller
@RequestMapping (path= "/alumnos")
public class AlumnoControlador {

	public RepoAlumno repo = new RepoAlumno("185.224.138.154", "u581554845_alumno", "Root1234", "u581554845_indra");

	
	@GetMapping(path = "/detalle/{id}")
	public ModelAndView detalle(@PathVariable("id")int matricula) throws Exception {

		
		Alumno modelo=repo.leer(matricula);				//localhost/alumnos/detalle/123 --> en el navegador
		
		ModelAndView mv=new ModelAndView("/DetalleVista");
		mv.addObject("datos",modelo);
		
		return mv;
	}
	
	
}
