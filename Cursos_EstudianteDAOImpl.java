/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoDao;


import entidades.Cursos_Estudiante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.Util;

/**
 *
 * @author win10
 */
public class Cursos_EstudianteDAOImpl implements curso_estudianteDAO
{

    @Override
    public void ingresar(Cursos_Estudiante cursos_estudiante) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String query="INSERT INTO public.cursos_estudiantes(curso_id, estudiante_id) VALUES (?, ?);";
        Connection conn;
        try {
            conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setInt(1,cursos_estudiante.getCursos_id());
            stm.setInt(2,cursos_estudiante.getEstudiantes_id());
            stm.execute();

            }
        catch (SQLException e) {
            e.printStackTrace();
    }
    }
    
    
}
