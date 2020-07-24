package entidades;


public class Cursos_Estudiante 
{
    private int id;
    private int cursos_id;
    private int estudiantes_id;
    
    
    public Cursos_Estudiante()
    {
        
    }

    public Cursos_Estudiante(int id, int cursos_id, int estudiantes_id)
    {
        super();
        this.id = id;
        this.cursos_id=cursos_id;
        this.estudiantes_id=estudiantes_id;
        
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCursos_id() {
        return cursos_id;
    }

    public void setCursos_id(int cursos_id) {
        this.cursos_id = cursos_id;
    }

    public int getEstudiantes_id() {
        return estudiantes_id;
    }

    public void setEstudiantes_id(int estudiantes_id) {
        this.estudiantes_id = estudiantes_id;
    }
    

  
    
    
    
}
