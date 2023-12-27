public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(Product id) {
        super("Товар с id = " + id + "не найден");
    }


}
