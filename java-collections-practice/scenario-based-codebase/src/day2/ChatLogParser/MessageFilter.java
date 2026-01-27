package day2.ChatLogParser;

	public interface MessageFilter<T> {
	    boolean allow(T message);
}
