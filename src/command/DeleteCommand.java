package command;
import app.EmployeeDetails;

public class DeleteCommand implements Command {
    private EmployeeDetails employeeDetails;

    public DeleteCommand(EmployeeDetails employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    @Override
    public void execute() {
        employeeDetails.delete();
    }
}
