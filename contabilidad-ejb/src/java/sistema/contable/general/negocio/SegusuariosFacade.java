/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.negocio;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sistema.contable.general.entidades.Segusuarios;

/**
 *
 * @author UES_BRYAN
 */
@Stateless
public class SegusuariosFacade extends AbstractFacade<Segusuarios> implements SegusuariosFacadeLocal {

    @PersistenceContext(unitName = "contabilidad-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SegusuariosFacade() {
        super(Segusuarios.class);
    }
    
}
