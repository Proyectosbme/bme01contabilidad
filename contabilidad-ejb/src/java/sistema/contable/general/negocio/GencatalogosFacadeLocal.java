/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.negocio;

import java.util.List;
import javax.ejb.Local;
import sistema.contable.general.entidades.Gencatalogos;

/**
 *
 * @author UES_BRYAN
 */
@Local
public interface GencatalogosFacadeLocal {

    void create(Gencatalogos gencatalogos);

    void edit(Gencatalogos gencatalogos);

    void remove(Gencatalogos gencatalogos);

    Gencatalogos find(Object id);

    List<Gencatalogos> findAll();

    List<Gencatalogos> findRange(int[] range);

    int count();
    
}
