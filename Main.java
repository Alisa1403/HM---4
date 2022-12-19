import controller.TaskController;
import model.*;
import view.ViewTask;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("tasks.csv");
        Repository repository = new RepositoryFile(fileOperation);
        TaskController controller = new TaskController(repository);
        ViewTask view = new ViewTask(controller);
        view.run();
    }
}