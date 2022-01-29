package unitTesting.mockito;

import lombok.Data;

@Data
public class Database {
    private int id;

    public boolean isAvailable(){
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
