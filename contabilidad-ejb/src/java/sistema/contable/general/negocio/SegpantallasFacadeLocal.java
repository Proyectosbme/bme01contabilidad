/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.negocio;

import java.util.List;
import javax.ejb.Local;
import sistema.contable.general.entidades.Segpantallas;

/**
 *
 * @author UES_BRYAN
 */
@Local
public interface SegpantallasFacadeLocal {

    void create(Segpantallas segpantallas);

    void edit(Segpantallas segpantallas);

    void remove(Segpantallas segpantallas);

    Segpantallas find(Object id);

    List<Segpantallas> findAll();

    List<Segpantallas> findRange(int[] range);

    int count();
    
}
