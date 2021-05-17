package src.OneSRP;

import src.OneSRP.solid.DezOuVintePorCento;
import src.OneSRP.solid.QuinzeOuVinteCincoPorCento;
import src.OneSRP.solid.RegraDeCalculo;

public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteCincoPorCento()),
    TESTER(new QuinzeOuVinteCincoPorCento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra) {
        this.regra = regra;
    }

    public RegraDeCalculo getRegra(){
        return regra;
    }
}
