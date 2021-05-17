package src.OneSRP.solid;

import src.OneSRP.Funcionario;

public class QuinzeOuVinteCincoPorCento implements RegraDeCalculo {
    public QuinzeOuVinteCincoPorCento() {
    }

    public double calcula(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        } else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}