/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoDao;

import entidades.Estudiante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.Util;

/**
 *
 * @author win10
 */
public class EstudiantesDAOImpl implements estudianteDAO
{

    @Override
    public void ingresar(Estudiante estudiante) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         String query="INSERT INTO public.estudiantes(nombres, apellidos, email) VALUES (?, ?, ?);";
        Connection conn;
        try {
            conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setString(1,estudiante.getNombres());
            stm.setString(2,estudiante.getApellidos());
            stm.setString(3,estudiante.getEmail());
            stm.execute();

            }
        catch (SQLException e) {
            e.printStackTrace();
    }
    }

    @Override
    public void actualizar(Estudiante estudiante) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String query ="UPDATE public.estudiantes SET  nombres=?, apellidos=?, email=? WHERE id=?;";
        Connection conn;
        try {
            conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setString(1,estudiante.getNombres());
            stm.setString(2,estudiante.getApellidos());
            stm.setString(3,estudiante.getEmail());
            stm.setInt(4,estudiante.getId());
            stm.execute();

            }
        catch (SQLException e) {
            e.printStackTrace();
    }
    }

    @Override
    public void eliminar(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String query ="DELETE FROM public.estudiantes WHERE id=?;";
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

    @Override
    public List<Estudiante> getestudiante() 
    {
        String query ="SELECT *FROM public.estudiantes;";
        List<Estudiante> estudiantes = new ArrayList<>();
        Connection conn;
        try {
            conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
            PreparedStatement stm = conn.prepareStatement(query);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Estudiante estudiante = new Estudiante(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                estudiantes.add(estudiante);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiantes;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
