package application;

import controller.CloseProcess;
import controller.InsertIntoControler;
import controller.SelectAllController;
import enums.Options;

import java.security.NoSuchAlgorithmException;

public class Menu {
    public static void activateMenu(Options option) throws NoSuchAlgorithmException {
        switch (option) {
            case SELECT_ALL -> SelectAllController.selectAll();
            case INSERT_INTO -> InsertIntoControler.insertInto();
            case CLOSE -> CloseProcess.close();
        }
    }
}
