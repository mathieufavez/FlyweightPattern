package MyExample;
import java.util.HashMap;

public class CarFactory
    {
        //On crée une HashMap
        private static final HashMap<String, Car> carsHashMap = new HashMap<>();

        public static Car getBigCar(String color)
        {
            //On indique la clé
            String key = color + "BIG";

            //On récupère la couleur et la taille de Car
            Car car = carsHashMap.get(key);


            //Si cette taille et cette couleur est différent ensemble de null, donc qu'elle existe déjà, on va partager l'objet
            if(car != null) {
                return car;
            //Si cette taille et cette couleur ensemble n'existe pas encore alors on crée le nouvel objet Car et on l'ajoute au Hashmap
            } else {
                car = new BigCar();
                car.setColor(color);
                carsHashMap.put(key, car);
            }

            //Finalement on retourne le nouvel objet Car
            return car;
        }

        //Même commentaire que pour getBigCar
        public static Car getNormalCar(String color)
        {
            String key = color + "NORMAL";

            Car car = carsHashMap.get(key);

            if(car != null) {
                return car;
            } else {
                car = new NormalCar();
                car.setColor(color);
                carsHashMap.put(key, car);
            }

            return car;
        }

        //Même commentaire que pour getBigCar
        public static Car getSmallCar(String color)
        {
            String key = color + "SMALL";

            Car car = carsHashMap.get(key);

            if(car != null) {
                return car;
            } else {
                car = new SmallCar();
                car.setColor(color);
                carsHashMap.put(key, car);
            }

            return car;
        }
    }
