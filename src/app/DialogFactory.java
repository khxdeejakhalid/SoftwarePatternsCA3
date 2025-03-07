package app;

import javax.swing.*;

public class DialogFactory {
    public static JDialog createDialog(String type, EmployeeDetails parent) {
        switch (type) {
            case "AddRecord":
                return new AddRecordDialog(parent);
            case "SearchBySurname":
                return new SearchBySurnameDialog(parent);
            case "SearchById":
                return new SearchByIdDialog(parent);

            // add other dialog types as needed
            default:
                throw new IllegalArgumentException("Unknown dialog type");
        }
    }
}
