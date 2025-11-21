/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Locacao;

/**
 *
 * @author Jonathan
 */
public class LocacaoDAO extends PersistenciaJPA {
    public List<Locacao> listaClientes() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Locacao> query
                    = em.createQuery("SELECT l FROM Locacao l", Locacao.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
