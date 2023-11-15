/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.negocio;

import java.util.List;
import javax.ejb.Local;
import sistema.contable.general.entidades.Segperfiles;

/**
 *
 * @author UES_BRYAN
 */
@Local
public interface SegperfilesFacadeLocal {

    void create(Segperfiles segperfiles);

    void edit(Segperfiles segperfiles);

    void remove(Segperfiles segperfiles);

    Segperfiles find(Object id);

    List<Segperfiles> findAll();

    List<Segperfiles> findRange(int[] range);

    int count();
    
}
