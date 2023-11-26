package modelo;

import controlador.ControladorListaTareas;
import controlador.ControladorTarea;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.mockito.Mockito;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Arrays;
import static org.mockito.Mockito.when;

public class Main {

    public static void main(String[] args) {

        ControladorTarea c = new ControladorTarea();
        TareasEntity tarea = c.crearTarea(1,"a","a",
       "a",new Date(123,10,26), new Time(0,0,0));
        System.out.println(tarea);

/*
        TareasEntity tareaMock = Mockito.mock(TareasEntity.class);

        when(tareaMock.getId()).thenReturn(1);
        when(tareaMock.getNombre()).thenReturn("Tarea uno");
        when(tareaMock.getFecha()).thenReturn(new Date(124, 11, 17));
        when(tareaMock.getHora()).thenReturn(Time.valueOf("00:00:00"));
        when(tareaMock.getDescripcion()).thenReturn("ninguna");
        when(tareaMock.getEstado()).thenReturn("En progreso");
        when(tareaMock.getFromDatabase()).thenReturn(tareaMock );

        System.out.println(tareaMock.getFromDatabase());
        System.out.println(tareaMock.getFromDatabase().getNombre());


        EntityManager entityManagerMock = Mockito.mock(EntityManager.class);
        TypedQuery<TareasEntity> queryMock = Mockito.mock(TypedQuery.class);

        TareasEntity tarea1 = new TareasEntity();
        tarea1.setId(1);
        tarea1.setNombre("Tarea uno");
        tarea1.setFecha(new Date(124, 11, 17));
        tarea1.setHora(Time.valueOf("00:00:00"));
        tarea1.setDescripcion("ninguna");
        tarea1.setEstado("En progreso");

        TareasEntity tarea2 = new TareasEntity();
        tarea2.setId(2);
        tarea2.setNombre("Tarea dos");
        tarea2.setFecha(new Date(124, 11, 18));
        tarea2.setHora(Time.valueOf("01:00:00"));
        tarea2.setDescripcion("otra");
        tarea2.setEstado("Completada");


        when(entityManagerMock.createQuery(Mockito.anyString(), Mockito.eq(TareasEntity.class))).thenReturn(queryMock);
        when(queryMock.getResultList()).thenReturn(Arrays.asList(tarea1, tarea2));

        List<TareasEntity> tareasList = entityManagerMock.createQuery("SELECT t FROM TareasEntity t", TareasEntity.class).getResultList();

        for (TareasEntity tarea : tareasList) {
            System.out.println(tarea);
        }*/


    }
}
