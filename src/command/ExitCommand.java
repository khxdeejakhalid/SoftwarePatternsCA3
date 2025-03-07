package command;

import app.EmployeeDetails;

public class ExitCommand implements Command {
    private EmployeeDetails employeeDetails;

    public ExitCommand(EmployeeDetails employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    @Override
    public void execute() {
        employeeDetails.exit();
    }
}
