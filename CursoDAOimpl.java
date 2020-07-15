package CursoDao;

import entidades.Cursos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.Util;


public class CursoDAOimpl implements CursoDAO {
    
    

    @Override
    public List<Cursos> getCursos() {
        List<Cursos> cursos = new ArrayList<>();
        Connection conn;
        try {
            conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
            System.out.println("conexion existosa!!!!!!!!!!!!!1");
            String sql = "SELECT id, nombre FROM public.cursos";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Cursos curso = new Cursos(rs.getInt(1),rs.getString(2));
                cursos.add(curso);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cursos;
        
    }

    @Override
    public void ingresar(Cursos curso) {
        String query ="INSERT INTO public.cursos( nombre) VALUES (?);"; 
        Connection conn;
        try {
            conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setString(1,curso.getNombre());
            stm.execute();

            }
        catch (SQLException e) {
            e.printStackTrace();
    }
    }

    @Override
    public void actualizar(Cursos curso)
    {
        String query ="UPDATE public.cursos SET nombre=? WHERE id=?;"; 
        Connection conn;
        try {
            conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setString(1,curso.getNombre());
            stm.setInt(2,curso.getId());
            stm.execute();

            }
        catch (SQLException e) {
            e.printStackTrace();
    }
        
        
    }

    @Override
    public void eliminar(int id) 
    {
        String query="DELETE FROM public.cursos WHERE id=?; "; 
        Connection conn;
        try {
            conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setInt(1,id);
            stm.execute();

            }
        catch (SQLException e) {
            e.printStackTrace();
      
    }
    
   
        
    }
}
    
