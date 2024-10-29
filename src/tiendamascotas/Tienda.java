/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

import java.util.ArrayList;
import tiendamascotas.MascotaDuplicadaException;
import tiendamascotas.MascotaNoEncontradaException;



public class Tienda {
    private ArrayList<Mascota> mascotas = new ArrayList<>();

    public void agregarMascota(Mascota mascota) throws MascotaDuplicadaException {
        for (Mascota m : mascotas) {
            if (m.getId().equals(mascota.getId())) {
                throw new MascotaDuplicadaException("Mascota con ID " + mascota.getId() + " ya existe.");
            }
        }
        mascotas.add(mascota);
    }

    public Mascota buscarMascota(String id) throws MascotaNoEncontradaException {
        for (Mascota m : mascotas) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        throw new MascotaNoEncontradaException("Mascota con ID " + id + " no encontrada.");
    }

    public void actualizarMascota(String id, Mascota mascotaActualizada) throws MascotaNoEncontradaException {
        Mascota mascota = buscarMascota(id);
        mascota.setNombre(mascotaActualizada.getNombre());
        mascota.setEspecie(mascotaActualizada.getEspecie());
        mascota.setEdad(mascotaActualizada.getEdad());
        mascota.setPrecio(mascotaActualizada.getPrecio());
    }

    public void eliminarMascota(String id) throws MascotaNoEncontradaException {
        Mascota mascota = buscarMascota(id);
        mascotas.remove(mascota);
    }

    public ArrayList<Mascota> listarMascotas() {
        return mascotas;
    }
}
