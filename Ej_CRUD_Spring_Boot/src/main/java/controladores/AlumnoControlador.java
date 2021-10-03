package controladores;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import modelos.Alumno;
import repositorios.RepoAlumno;

@Controller
@RequestMapping (path= "/alumnos")
public class AlumnoControlador {

	public RepoAlumno repo = new RepoAlumno("185.224.138.154", "u581554845_alumno", "Root1234", "u581554845_indra");

	//Leer alumno
	@GetMapping(path = "/detalle/{id}")
	public ModelAndView detalle(@PathVariable("id")int matricula) throws Exception {

		
		Alumno modelo=repo.leer(matricula);				//localhost/alumnos/detalle/123 --> en el navegador
		
		ModelAndView mv=new ModelAndView("/DetalleVista");
		mv.addObject("datos",modelo);
		
		return mv;
	}
	
	//Listar alumnos
	@GetMapping (path="")
	public ModelAndView listar() throws Exception{
		ModelAndView mv = new ModelAndView("/ListadoVista");
		
		ArrayList<Alumno> modelo = this.repo.listar();
		mv.addObject("modelo", modelo);
		
		return mv;	
	}
	
	//Nuevo alumno
	@GetMapping(path="/nuevo")
	public ModelAndView nuevo() throws Exception
	{
		ModelAndView mv = null;
		mv = new ModelAndView("NuevoVista");
		mv.addObject("modelo", null);

		return mv;
	}
	@PostMapping(path="/nuevo")
	public ModelAndView nuevo(Alumno modelo) throws Exception
	{
		ModelAndView mv = null;
			
		this.repo.nuevo(modelo);
			
		mv = new ModelAndView("NuevoVista");
		mv.addObject("modelo", modelo);
			
		return mv;
	}
	
	//Editar alumno
	@GetMapping(path="/editar/{id}")
	public ModelAndView editar(@PathVariable("id") int matricula) throws Exception	//Para acceder desde el listado
	{
		Alumno modelo = this.repo.leer(matricula);
		ModelAndView mv = null;
		mv = new ModelAndView("EditarVista");
		mv.addObject("modelo", modelo);

		return mv;
	}
	@PostMapping(path="/editar")
	public ModelAndView editar(int matricula_OLD, Alumno modelo) throws Exception
	{
		ModelAndView mv = null;
		
		this.repo.editar(matricula_OLD, modelo);
		
		mv = new ModelAndView("EditarVista");
		mv.addObject("modelo", modelo);
		
		return mv;
	}	
	
	//Eliminar alumno
	@GetMapping(path="/eliminar/{id}")
	public String eliminar(@PathVariable("id") int matricula) throws Exception
	{
		this.repo.eliminar(matricula);

		// redirigimos al listado después de borrar
		return "redirect:/alumnos";
	}
	
}
