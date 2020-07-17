/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoDao;

import entidades.Estudiante;
import java.util.List;

/**
 *
 * @author win10
 */
public interface estudianteDAO 
{
    void ingresar(Estudiante estudiante);
    void actualizar(Estudiante estudiante);
    void eliminar(int id);
    List <Estudiante> getestudiante();
    
}
