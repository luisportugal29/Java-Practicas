package BinaryTree;

import BinaryTree.Player;
import BinaryTree.Tree;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Tree<Player> tree = new Tree<>();

        // Se Insertan elementos al arbol
        tree.add(new Player("Maria Del Carmen", LocalDate.of(1967,2,2)));
        tree.add(new Player("Luis Alfonso", LocalDate.of(1968,3,7)));
        tree.add(new Player("Pedro Alfonso", LocalDate.of(1992,1,7)));
        tree.add(new Player("Luis Francisco", LocalDate.of(1998,1,26)));
        tree.add(new Player("Jesus Ivan", LocalDate.of(2004,4,16)));
        tree.add(new Player("Ana Maria", LocalDate.of(1990, 5, 15)));
        tree.add(new Player("Carlos Alberto", LocalDate.of(1985, 9, 22)));
        tree.add(new Player("Miguel Angel", LocalDate.of(1975, 12, 12)));
        tree.add(new Player("Sofia Isabel", LocalDate.of(2001, 6, 30)));
        tree.add(new Player("Antonio Jose", LocalDate.of(1995, 8, 18)));
        tree.add(new Player("Manuel Alejandro", LocalDate.of(1980, 7, 25)));
        tree.add(new Player("Rosa Maria", LocalDate.of(1970, 11, 8)));

        tree.preOrder();


    }
}
