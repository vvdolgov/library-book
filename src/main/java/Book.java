public class Book {
    private int id;
    private String title;
    private boolean availability;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.availability = true;
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

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailable(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Book[" +
                "id=" + id +
                ", title='" + title + '\'' +
                ']';
    }
}