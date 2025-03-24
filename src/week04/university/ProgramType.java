package week04.university;

public enum ProgramType {
    //public static final
    MAJOR(240), MINER(120);

    private int programTypeCredits;

    ProgramType(int programTypeCredits) {
        this.programTypeCredits = programTypeCredits;
    }

    public int getProgramTypeCredits() {
        return programTypeCredits;
    }

    public void setProgramTypeCredits(int programTypeCredits) {
        this.programTypeCredits = programTypeCredits;
    }
}
