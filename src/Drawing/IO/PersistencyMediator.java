/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing.IO;

import Drawing.Domain.Drawing;
import java.util.Properties;
/**
 *
 * @author Thomas
 */
public interface PersistencyMediator {
    Drawing load(String name);
    boolean save(Drawing drawing);
    boolean init(Properties props);
}
