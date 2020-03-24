package MyExample;

public class Client {
    public static void main(String[] args) {
        //On crée un nouvel objet Big Black Car
        Car bigBlackCar = CarFactory.getBigCar("BLACK");
        bigBlackCar.build();

        //On crée un autre nouvel objet Big Black Car
        //Le premier objet crée est partagé car il a les mêmes propriétés (BigCar et BLACK)
        Car bigBlackCar2 = CarFactory.getBigCar("BLACK");
        bigBlackCar2.build();

        //On crée un nouvel objet Big Red Car
        Car bigRedCar = CarFactory.getBigCar("RED");
        bigRedCar.build();

        Car bigRedCar2 = CarFactory.getBigCar("REDD");
        bigRedCar2.build();
        //Même objet que le 1er mais pas le même que le 2ème (Donc il est partagé du 1er)
        Car bigRedCar3 = CarFactory.getBigCar("RED");
        bigRedCar3.build();


        //Objets différents ici
        Car smallGreyCar = CarFactory.getSmallCar("GREY");
        smallGreyCar.build();

        Car normalGreyCar = CarFactory.getNormalCar("GREY");
        normalGreyCar.build();

        System.out.println();

        //On analyse si les objets sont les mêmes
        System.out.println("Big Black Car 1 ID : " + bigBlackCar.hashCode());
        System.out.println("Big Black Car 2 ID : " + bigBlackCar2.hashCode());
        System.out.println();

        //Ici, le premier objet est partagé avec le troisième, mais pas avec le deuxième
        System.out.println("Big Red Car 1  ID : " + bigRedCar.hashCode());
        System.out.println("Big Redd Car 2 ID : " + bigRedCar2.hashCode());
        System.out.println("Big Red Car 3  ID : " + bigRedCar3.hashCode());
        System.out.println();

        //Ici les objets ont la même couleur mais un est SmallCar et l'autre NormalCar donc ils ne sont pas partagés
        System.out.println("Small Grey Car  ID : " + smallGreyCar.hashCode());
        System.out.println("Normal Grey Car ID : " + normalGreyCar.hashCode());

    }
}
