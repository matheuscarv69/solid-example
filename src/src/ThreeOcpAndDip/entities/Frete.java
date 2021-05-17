package src.ThreeOcpAndDip.entities;

import src.ThreeOcpAndDip.solid.Transportadora;

public class Frete implements Transportadora {
    public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
