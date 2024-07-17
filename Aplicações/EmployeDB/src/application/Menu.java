package application;

import controller.InsertIntoControler;
import controller.SelectAllController;
import enums.Options;

public class Menu {
    public static void activateMenu(Options option) {
        switch (option) {
            case SELECT_ALL -> SelectAllController.selectAll();
            case INSERT_INTO -> InsertIntoControler.insertInto();
        }
    }
}
