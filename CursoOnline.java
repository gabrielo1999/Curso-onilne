            
package cursoonline;

import CursoDao.CursoDAO;
import CursoDao.CursoDAOimpl;
import entidades.Cursos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class CursoOnline {



    public static void main(String[] args) 
    {
        CursoDAO cursoDAO = new CursoDAOimpl();
        //Cursos newCurso = new Cursos(0,"nuevo curso de java");
        //cursoDAO.ingresar(newCurso);
        //Cursos newCurso = new Cursos(4,"modificado java");
        //cursoDAO.actualizar(newCurso);
        Cursos newCurso = new Cursos(4,"modificado java");
        cursoDAO.eliminar(4);
        List<Cursos> cursos = cursoDAO.getCursos();
        System.out.println(cursos);
       
        
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

    }

}
