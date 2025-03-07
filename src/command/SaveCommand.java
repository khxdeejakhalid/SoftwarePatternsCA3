package command;

import app.EmployeeDetails;

public class SaveCommand implements Command {
    private EmployeeDetails employeeDetails;

    public SaveCommand(EmployeeDetails employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    @Override
    public void execute() {
        employeeDetails.save();
    }
}