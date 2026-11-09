package interfaces_021126;

public class UserRequest extends Request {
    public UserRequest(long id, int priority) {
        super(id, priority);
    }

    @Override
    public String getDetails() {
        return "";
    }
}
