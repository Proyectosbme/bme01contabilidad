/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.negocio;

import java.util.List;
import javax.ejb.Local;
import sistema.contable.general.entidades.Genpersonas;

/**
 *
 * @author UES_BRYAN
 */
@Local
public interface GenpersonasFacadeLocal {

    void create(Genpersonas genpersonas);

    void edit(Genpersonas genpersonas);

    void remove(Genpersonas genpersonas);

    Genpersonas find(Object id);

    List<Genpersonas> findAll();

    List<Genpersonas> findRange(int[] range);

    int count();
    
}
