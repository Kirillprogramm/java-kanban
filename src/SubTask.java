class SubTask extends Task {
    private final int idEpicTask;

    SubTask(int id, String nameSubTask, String descriptionSubTask, String statusSubTask) {
        super(id, nameSubTask, descriptionSubTask, statusSubTask);
        this.idEpicTask = id;
    }

    SubTask(SubTask subtask) {
        this(subtask.idEpicTask, subtask.getTitle(), subtask.getDescription(), subtask.getStatus());
    }

    @Override
    public String toString() {
        return "ID подзадачи SubTask = " + idEpicTask + "," + "\nID Epic задачи = " + getId()
                + ", " + "\nНазвание подзадачи = " + getTitle() + ", " + "\nОписание = " + getDescription() + ", "
                +  "\nСтатус = " + getStatus() + "\n";
    }
}
