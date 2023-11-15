package modelo;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TAREAS", schema = "dbo", catalog = "TASKMAKER")
public class TareasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic
    @Column(name = "FECHA")
    private Date fecha;
    @Basic
    @Column(name = "HORA")
    private Object hora;
    @Basic
    @Column(name = "ESTADO")
    private String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Object getHora() {
        return hora;
    }

    public void setHora(Object hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TareasEntity that = (TareasEntity) o;

        if (id != that.id) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (hora != null ? !hora.equals(that.hora) : that.hora != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (hora != null ? hora.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }

    public void vencer() {
        // Lógica para marcar la tarea como vencida
        // Puedes actualizar el estado o realizar otras acciones necesarias
    }

    public void finalizar() {
        // Lógica para marcar la tarea como finalizada
        // Puedes actualizar el estado o realizar otras acciones necesarias
    }

    public void enviarRecordatorio() {
        // Lógica para enviar un recordatorio (puede ser un correo electrónico, notificación, etc.)
    }

    public void modificar(String nuevoNombre, String nuevaDescripcion, Date nuevaFecha, Object nuevaHora, String nuevoEstado) {
        // Lógica para modificar los atributos de la tarea
        if (nuevoNombre != null) {
            this.nombre = nuevoNombre;
        }
        if (nuevaDescripcion != null) {
            this.descripcion = nuevaDescripcion;
        }
        if (nuevaFecha != null) {
            this.fecha = nuevaFecha;
        }
        if (nuevaHora != null) {
            this.hora = nuevaHora;
        }
        if (nuevoEstado != null) {
            this.estado = nuevoEstado;
        }
    }
}
