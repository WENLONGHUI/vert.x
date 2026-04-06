package effective.Item1.exercise2;

public abstract class Animal {
    // 构造器 protected，允许子类继承，但不允许外部直接 new Animal()
    protected Animal() {}

    // 静态工厂方法
    public static Animal of(String type) {
        if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        } else if ("bird".equalsIgnoreCase(type)) {
            return new Bird();
        } else {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
    }

    // 可在此定义抽象方法，如：
    // public abstract void makeSound();
}

// 子类都是包级私有（不加 public），外部包无法直接访问
class Dog extends Animal {
    // 构造器包级私有（默认权限），外部无法调用
    Dog() {}
}

class Cat extends Animal {
    Cat() {}
}

class Bird extends Animal {
    Bird() {}
}