/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.negocio;

import java.util.List;
import javax.ejb.Local;
import sistema.contable.general.entidades.Gencorrelativos;

/**
 *
 * @author UES_BRYAN
 */
@Local
public interface GencorrelativosFacadeLocal {

    void create(Gencorrelativos gencorrelativos);

    void edit(Gencorrelativos gencorrelativos);

    void remove(Gencorrelativos gencorrelativos);

    Gencorrelativos find(Object id);

    List<Gencorrelativos> findAll();

    List<Gencorrelativos> findRange(int[] range);

    int count();
    
}
