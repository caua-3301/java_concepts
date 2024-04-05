package throwExceptions.model.exceptions;

import java.io.Serial;

//criando exctions persnonalizada, devem ser extendidas e exceptions (obrigadas a serem tartadas) ou Rum time exception (sem obrigação de tratamento), ou seja, não é necessário capturar em um catch ou extender a classe para a exception
public class DomainExceptions extends Exception{
    public DomainExceptions(String msg) {
        super(msg);
    }
}
