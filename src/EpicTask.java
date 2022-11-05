import java.util.List;

class EpicTask extends Task {
    private List<SubTask> subTasks;


    EpicTask(int id, String titleEpicTask, String descriptionEpicTask, List<SubTask> subTasks) {
        super(id,titleEpicTask, descriptionEpicTask, "NEW");

    }

    EpicTask(EpicTask epicTask,int id) {
        this(id, epicTask.getTitle(), epicTask.getDescription(), epicTask.subTasks);
    }

    List<SubTask> getSubTasks() {
        return subTasks;
    }

    @Override
    public String toString() {
        return "ID задачи Epic = " + getId() + ", " + "\nНазвание Epic задачи = " + getTitle() + ",\nОписание = " + getDescription()
                + ", " + subTasks + ", " + "\nСтатус = " + getStatus() + "\n";
    }
}
