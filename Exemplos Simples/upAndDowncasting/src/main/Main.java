package main;

import account.Account;
import account.BusnessAccount;
import account.SavingAccount;

public class Main {
    public static void main(String[] args) {
        Account conta01 = new Account(1001, "Caua", 0);
        BusnessAccount contaBss01 = new BusnessAccount(1201, "Maria", 1500, 500);

        //UPCASTIING
        Account conta02Recebe = contaBss01;
        Account conta03 = new BusnessAccount(1202, "Joao", 0.0, 200);
        Account conta4 = new SavingAccount(1400, "cce", 1432, 222);

        //DOWNCASTING

        //==> Isso vai gerar erro de tipo, o casting deve ser forçado
        //BusnessAccount contabis =conta01;

        BusnessAccount contaBuss = (BusnessAccount) conta01;

        //não podemos atribuir (nem mesmo com casting) um tipo Account instaciado por Saving a um tipo Busness

        //verifica a se determinada variavel foi instanciada por algo
        if (conta03 instanceof BusnessAccount) {
            //adicionar atribuições
        }
    }
}
