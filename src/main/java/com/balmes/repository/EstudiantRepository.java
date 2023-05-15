package com.balmes.repository;

import com.balmes.model.Curs;
import com.balmes.model.Estudiant;

import java.util.ArrayList;
import java.util.List;

public class EstudiantRepository implements crudRepository<Estudiant> {
    public List<Estudiant> findAll() {
        // TODO Auto-generated method stub
        List<Estudiant> estudiantList = new ArrayList<>();
        CursRepository cursRepository = new CursRepository();
        final List<Curs> allCursos = cursRepository.findAll();
        estudiantList.add(new Estudiant(1, "Andres", "Gascon", allCursos.get(0)));
        estudiantList.add(new Estudiant(2, "Cesar", "Rubio", allCursos.get(1)));
        estudiantList.add(new Estudiant(3, "Daniel", "Belenguer", allCursos.get(2)));
        estudiantList.add(new Estudiant(4, "Miguel", "Urdaneta", allCursos.get(0)));
        estudiantList.add(new Estudiant(5, "Edgar", "Minguillon", allCursos.get(1)));
        estudiantList.add(new Estudiant(6, "Laia", "Gonzalez", allCursos.get(2)));
        estudiantList.add(new Estudiant(7, "Valentin", "Lechuga", allCursos.get(0)));
        estudiantList.add(new Estudiant(8, "Maximiliano", "Ibañez", allCursos.get(1)));
        estudiantList.add(new Estudiant(9, "Artyom", "Osipov", allCursos.get(2)));
        estudiantList.add(new Estudiant(10, "Thomas", "Habtay", allCursos.get(0)));
        estudiantList.add(new Estudiant(11, "Troy", "Kennedy", allCursos.get(1)));
        estudiantList.add(new Estudiant(12, "Victor", "Chacon", allCursos.get(2)));
        estudiantList.add(new Estudiant(13, "Edu", "Martorell", allCursos.get(0)));
        estudiantList.add(new Estudiant(14, "Josybel", "Rodriguez", allCursos.get(1)));
        estudiantList.add(new Estudiant(15, "Oriana", "Valero", allCursos.get(2)));
        estudiantList.add(new Estudiant(16, "Dimitra", "Sofianou", allCursos.get(0)));
        estudiantList.add(new Estudiant(17, "Titman", "Gregor", allCursos.get(1)));
        estudiantList.add(new Estudiant(18, "John ", "Lennon", allCursos.get(2)));
        estudiantList.add(new Estudiant(19, "Paul", "Mccartney", allCursos.get(0)));






        return estudiantList;
    }

    public List<Estudiant> getEstudiantsperCurs(int cursId) {
        List<Estudiant> estudiantList = findAll();
        List<Estudiant> estudiantsPerCurs = new ArrayList<>();

        for (Estudiant estudiant : estudiantList) {
            if (estudiant.getCurs().getCursId() == cursId) {
                estudiantsPerCurs.add(estudiant);
            }
        }

        return estudiantsPerCurs;

    }
}