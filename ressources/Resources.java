package ressources;

public enum Resources {
        FOOD("nourriture"),
        WOOD("bois"),
        STONE("pierre"),
        METAL("métal"),
        WATER("eau");
    
    
        private String name;
    
        // Constructeur pour initialiser le nom de la ressource
        Resources(String name) {
            this.name = name;
        }
    
        @Override
        public String toString() {
            return name;
        }
}

