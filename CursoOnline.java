            
package cursoonline;

import CursoDao.CursoDAO;
import CursoDao.CursoDAOimpl;
import CursoDao.Cursos_EstudianteDAOImpl;
import CursoDao.EstudiantesDAOImpl;
import CursoDao.curso_estudianteDAO;
import CursoDao.estudianteDAO;

import entidades.Cursos;
import entidades.Cursos_Estudiante;
import entidades.Estudiante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class CursoOnline {



    public static void main(String[] args) 
    {
            curso_estudianteDAO estudianteDAO = new Cursos_EstudianteDAOImpl();
            Cursos_Estudiante estudiante = new Cursos_Estudiante(0,1,2);
            System.out.println("listo");
          
//          CursoDAO cursoDAO = new CursoDAOimpl();
//          List<Estudiante> estudiante1=cursoDAO.getEstudiantePorCurso(1);
//          System.out.println(estudiante1);
//        estudianteDAO estudianteDAO = new EstudiantesDAOImpl();
//        List<Cursos>curso1=estudianteDAO.getCursosPorEstudiante(1);
//        List<Cursos>curso2=estudianteDAO.getCursosPorEstudiante(2);
//        System.out.println(curso1);
//        System.out.println(curso2);
        
        
        //CursoDAO cursoDAO = new CursoDAOimpl();
//      estudianteDAO estudianteDAO = new EstudiantesDAOImpl();
//      //Estudiante estudiantes = new Estudiante(0, "gabriel","jara","gabriel@gmail.com");
//      
//     // estudianteDAO.ingresar(estudiantes);
//     //   estudianteDAO.eliminar(3);
//        Estudiante estudiantes = new Estudiante(4,"jose","perez","joseperez@gmail.com");
//        estudianteDAO.actualizar(estudiantes);
//        List <Estudiante> estudiante= estudianteDAO.getestudiante();
//        System.out.println(estudiante);
        

      
        
                
                //Cursos newCurso = new Cursos(0,"nuevo curso de java");
                //cursoDAO.ingresar(newCurso);
//        Cursos newCurso = new Cursos(4,"modificado java");
//        cursoDAO.actualizar(newCurso);
//        Cursos newCurso = new Cursos(4,"modificado java");
//        cursoDAO.eliminar(4);
//        List<Cursos> cursos = cursoDAO.getCursos();
//        System.out.println(cursos);
//
                
                
                
//        Connection conn;
//        try {
//            conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
//            System.out.println("conexion existosa");
//            String sql = "SELECT id, nombre FROM public.cursos";
//            PreparedStatement stm = conn.prepareStatement(sql);
//
//            ResultSet rs = stm.executeQuery();
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "" + rs.getString(2));
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
;

    }

}
