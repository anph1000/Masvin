package Masvin;

public class Masvin {
        private String name;
        private String breed;
        private int food;

        public Masvin (String name, String breed, int food) {
            this.name = name;
            this.breed = breed;
            this.food = food;
        }

        @Override
        public String toString() {
            return name + " (" + breed + "," + food + ")";
        }
    }

}
