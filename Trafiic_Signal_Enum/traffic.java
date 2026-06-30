package Trafiic_Signal_Enum;

public enum traffic {
    RED("Stop"), YELLOW("Wait"), GREEN("Go");

    private String action;

    traffic(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

}
