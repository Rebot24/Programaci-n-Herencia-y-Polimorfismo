package UT6_Colecciones.Actividad4.Set.Ejercicio1;

import java.util.*;

public class Main {
    private static Map<String, CuerpoCeleste> sistemaSolar = new LinkedHashMap<>();
    private static Set<CuerpoCeleste> planetas = new LinkedHashSet<>();

    public static void main(String[] args) {

        //planetas
        Planeta mercurio = new Planeta("Mercurio", 88);
        sistemaSolar.put("Mercurio", mercurio);
        planetas.add(mercurio);

        Planeta venus = new Planeta("Venus", 225);
        sistemaSolar.put("Venus", venus);
        planetas.add(venus);

        Planeta tierra = new Planeta("La Tierra", 365);
        sistemaSolar.put("La Tierra", tierra);
        planetas.add(tierra);

        Planeta marte =  new Planeta("Marte", 687);
        sistemaSolar.put("Marte", marte);
        planetas.add(marte);

        Planeta jupiter = new Planeta("Jupiter", 4332);
        sistemaSolar.put("Jupiter", jupiter);
        planetas.add(jupiter);

        Planeta saturno = new Planeta("Saturno", 10759);
        sistemaSolar.put("Saturno", saturno);
        planetas.add(saturno);

        Planeta urano = new Planeta("Urano", 30660);
        sistemaSolar.put("Urano", urano);
        planetas.add(urano);

        Planeta neptuno = new Planeta("Neptuno", 165);
        sistemaSolar.put("Neptuno", neptuno);
        planetas.add(neptuno);

        Planeta pluton =  new Planeta("Pluton", 248);
        sistemaSolar.put("Pluton", pluton);
        planetas.add(pluton);

        //luna tierra
        Luna luna = new Luna("Luna", 27);
        sistemaSolar.put("Luna", luna);
        tierra.addSatelite(luna);

        //lunas marte
        Luna deimos = new Luna("Deimos", 1.3);
        sistemaSolar.put("Deimos", deimos);
        marte.addSatelite(deimos);

        Luna phobos = new Luna("Phobos", 0.3);
        sistemaSolar.put("Phobos", phobos);
        marte.addSatelite(phobos);

        //lunas jupiter
        Luna io = new Luna("Io", 1.8);
        sistemaSolar.put("Io", io);
        jupiter.addSatelite(io);

        Luna europa = new Luna("Europa", 3.5);
        sistemaSolar.put("Europa", europa);
        jupiter.addSatelite(europa);

        Luna ganymelde = new Luna("Ganymelde", 7.1);
        sistemaSolar.put("Ganymelde", ganymelde);
        jupiter.addSatelite(ganymelde);

        Luna callisto = new Luna("Callisto", 16.7);
        sistemaSolar.put("Callisto", callisto);
        jupiter.addSatelite(callisto);

        //imprimir planetas
        for (CuerpoCeleste c : planetas) {
            System.out.println(c.getNombre());
        }
        System.out.println("------");

        //imprimir lunas de marte
        for (CuerpoCeleste s : marte.getSatelites()) {
            System.out.println(s);
        }
        System.out.println("------");

        //union lunas
        Set<CuerpoCeleste> lunas = new LinkedHashSet<>();
        for (CuerpoCeleste s : planetas) {
            lunas.addAll(s.getSatelites());
        }

        //imprimir lunas
        for (CuerpoCeleste s : lunas) {
            System.out.println(s);
        }
        System.out.println("------");

        //crear duplicado
        //no deja porque solo puede haber uno con ese nombre y tipo, no pueden haber duplicados
        Planeta pluton2 = new Planeta("Pluton", 884);
        sistemaSolar.put("Pluton", pluton2);
        planetas.add(pluton2);

        for (CuerpoCeleste c : planetas) {
            System.out.println(c.getNombre());
        }
        System.out.println("------");

        //creando planeta enano
        PlanetaEnano pluton3 = new PlanetaEnano("Pluton", 885);
        planetas.add(pluton3);

        for (CuerpoCeleste c : planetas) {
            System.out.println(c.getNombre());
        }
        System.out.println("------");

        //interseccion lunas
        Set<CuerpoCeleste> lunasTierra = new HashSet<>(tierra.getSatelites());
        lunasTierra.add(deimos);
        Set<CuerpoCeleste> lunasMarte = new HashSet<>(marte.getSatelites());

        Set<CuerpoCeleste> interseccionLunas = new HashSet<>(lunasTierra);
        interseccionLunas.retainAll(lunasMarte); // lunas comunes entre Tierra y Marte

        System.out.println("Lunas comunes entre Tierra y Marte (intersección):");
        for (CuerpoCeleste moon : interseccionLunas) {
            System.out.println(moon);
        }
        System.out.println("------");

        //diferencia lunas
        Set<CuerpoCeleste> diffLunas = new HashSet<>(lunas);
        diffLunas.removeAll(tierra.getSatelites());

        System.out.println("Todas las lunas menos las de la Tierra (diferencia):");
        for (CuerpoCeleste moon : diffLunas) {
            System.out.println(moon);
        }
    }
}