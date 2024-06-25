class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
    class Warrior extends Fighter {

        @Override
        public String toString() {
            return "Fighter is a Warrior";
            }
        @Override
        public boolean isVulnerable() {
            return false;
        }
        @Override
        public int getDamagePoints(Fighter fighter) {
            return fighter.isVulnerable() ? 10 : 6;
        }
}
// TODO: define the Wizard class
    class Wizard extends Fighter {
        private boolean activePrep = false;
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
    public void prepareSpell() {
        if (!activePrep) activePrep = true;
    }
    @Override
    public boolean isVulnerable() {
        return !activePrep;
    }
    @Override
    public int getDamagePoints(Fighter fighter) {
        return activePrep ? 12 : 3;
    }
}