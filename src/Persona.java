public class Persona implements Comparable<Persona> {

    private int id, edad, amigos, prioridad,num;
    private String nombreCompleto;

    public Persona(int id, int edad, int amigos, int prioridad, int num, String nombreCompleto) {
        this.id = id;
        this.edad = edad;
        this.amigos = amigos;
        this.prioridad = prioridad;
        this.num = num;
        this.nombreCompleto = nombreCompleto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAmigos() {
        return amigos;
    }

    public void setAmigos(int amigos) {
        this.amigos = amigos;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "\nNombre: " +this.nombreCompleto+ "- Id: "+ this.id+ "- Prioridad: "+ this.prioridad+ "- Edad: "+ this.edad+"- Amigos: "+ this.amigos;
    }
    @Override
    public int compareTo(Persona a) {
        if (this.num<getNum()){
            return -1;
        }else if(this.num>getNum()){
            return 1;

        }else {
            return 0;
        }
    }
}
