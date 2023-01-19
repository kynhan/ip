public class Task {

    private String description;
    private boolean done;

    public Task(String description) {
        this.description = description;
        this.done = false;
    }

    public String getStatusIcon() {
        return (done ? "X" : " "); // mark done task with X
    }

    public String getDescription() {
        return description;
    }

    public void setDone(boolean val) {
        this.done = val;
    }

}
