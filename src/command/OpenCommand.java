package command;
import app.EmployeeDetails;

public class OpenCommand implements Command {
    private EmployeeDetails employeeDetails;

    public OpenCommand(EmployeeDetails employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    @Override
    public void execute() {
        employeeDetails.open();
    }
}
