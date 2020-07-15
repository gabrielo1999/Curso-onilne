
package CursoDao;

import entidades.Cursos;
import java.util.List;

public interface CursoDAO 
{
    void ingresar (Cursos curso);
    void actualizar (Cursos curso);
    void eliminar (int id);
    List <Cursos> getCursos();     
}
