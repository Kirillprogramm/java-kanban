public class Task {
    private final int id;
    private String title;
    private String description;
    private String status;


    Task(int id, String titleTask, String descriptionTask, String statusTask) {
        this.id = id;
        this.title = titleTask;
        this.description = descriptionTask;
        this.status = statusTask;
    }

    Task(Task task,int id) {
        this(id, task.title, task.description, task.status);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "ID задачи Task = " + id + ", " + "\nНазвание задачи = " + title + ",\nОписание = " + description
                + ", " + "\nСтатус = " + status + "\n";
    }
}