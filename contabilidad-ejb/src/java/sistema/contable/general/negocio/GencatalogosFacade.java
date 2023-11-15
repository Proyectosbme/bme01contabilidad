/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.negocio;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sistema.contable.general.entidades.Gencatalogos;

/**
 *
 * @author UES_BRYAN
 */
@Stateless
public class GencatalogosFacade extends AbstractFacade<Gencatalogos> implements GencatalogosFacadeLocal {

    @PersistenceContext(unitName = "contabilidad-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GencatalogosFacade() {
        super(Gencatalogos.class);
    }
    
}
