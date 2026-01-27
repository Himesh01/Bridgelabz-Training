package day2.SongVault;

public abstract class Media<T> {
    protected T contentType;

    public Media(T contentType) {
        this.contentType = contentType;
    }

    public T getContentType() {
        return contentType;
    }

    public abstract String getTitle();
}