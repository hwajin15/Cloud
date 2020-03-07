package exception;

public class AutoClose implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("close되었습니다");
    }
}
