package digital.escuela.notepad.com.demo1.POJOS;

/**
 * Created by martinto on 12/01/18.
 */

public class Note {
    private int id;
    private String title;
    private String body;

    public Note() {
    }

    public Note(int id, String title, String body) {
        this.setId(id);
        this.setTitle(title);
        this.setBody(body);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
