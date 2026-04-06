package effective.Item1.exercise5;

import java.util.NoSuchElementException;

public abstract class Optional<T> {
    private Optional() {}  // 私有构造器
    
    // 静态工厂方法
    public static <T> Optional<T> of(T value) {
        if (value == null) throw new NullPointerException();
        return new Present<>(value);
    }
    
    public static <T> Optional<T> empty() {
        return (Optional<T>) Absent.INSTANCE;
    }
    
    // 抽象行为方法（省略具体实现）
    public abstract T get();
    public abstract boolean isPresent();
    
    // 子类：Present
    private static final class Present<T> extends Optional<T> {
        private final T value;
        Present(T value) { this.value = value; }
        @Override public T get() { return value; }
        @Override public boolean isPresent() { return true; }
    }
    
    // 子类：Absent（单例）
    private static final class Absent<T> extends Optional<T> {
        static final Absent<Object> INSTANCE = new Absent<>();
        private Absent() {}
        @Override public T get() { throw new NoSuchElementException("No value present"); }
        @Override public boolean isPresent() { return false; }
    }


    // 调用地方
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("hello");
        Optional<String> empty = Optional.empty();
    }
}