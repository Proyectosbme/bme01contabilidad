/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.negocio;

import java.util.List;
import javax.ejb.Local;
import sistema.contable.general.entidades.Segusuarios;

/**
 *
 * @author UES_BRYAN
 */
@Local
public interface SegusuariosFacadeLocal {

    void create(Segusuarios segusuarios);

    void edit(Segusuarios segusuarios);

    void remove(Segusuarios segusuarios);

    Segusuarios find(Object id);

    List<Segusuarios> findAll();

    List<Segusuarios> findRange(int[] range);

    int count();
    
}
