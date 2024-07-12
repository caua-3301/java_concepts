package fabrica;

import interfaces.ModeloVeiculo;
import modelos.Carro;
import modelos.Moto;
import tipo.Veiculos;

public class Fabrica {
    public static ModeloVeiculo criarVeiculo(Veiculos veiculo) {
        switch (veiculo) {
            case CARRO:
                return new Carro();
            case MOTO:
                return new Moto();
            default:
                return null;
        }
    }
}
