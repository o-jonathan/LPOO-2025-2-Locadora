/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Jogo;

/**
 *
 * @author Jonathan
 */
public class JogoDAO extends PersistenciaJPA {
    public List<Jogo> listaClientes() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Jogo> query
                    = em.createQuery("SELECT j FROM Jogo j", Jogo.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
