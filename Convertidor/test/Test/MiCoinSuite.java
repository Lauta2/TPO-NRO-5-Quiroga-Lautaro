
package Test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    ConversorTest.class,
    CotizacionTest.class,
    DolaritosTest.class
})
public class MiCoinSuite {}