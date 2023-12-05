package Robots;

public interface Robot {
    void executeCode(String code);

    void diagnose();

    default boolean isValidCode(String code, String expectedCode) {
        return code.equals(expectedCode);
    }

    boolean isFunctioning(); // method to check if the robot is functioning correctly

    void setFunctioning(boolean inBoolean); // method to mutate functioning


}

