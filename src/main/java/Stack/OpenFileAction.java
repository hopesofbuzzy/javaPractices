package Stack;

public class OpenFileAction extends Action {
    private static final String ACTION_NAME = "Открытие файла";
    private final String filename;

    public OpenFileAction(String name, String filename) {
        super(name);
        this.filename = filename;
    }

    @Override
    public String describe() {
        return "";
    }
}
