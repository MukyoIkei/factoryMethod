public class factoryMethod {
    public static void main(final String[] args) {
        final Creator creator1 = new ConcreteCreator1();
        final Creator creator2 = new ConcreteCreator2();
        final Product p1 = creator1.anOperation();
        final Product p2 = creator2.anOperation();
        final Product p3 = creator1.anOperation();
    }
}

abstract class Creator {
    public abstract Product factoryMethod();

    public abstract void operation1(Product product);

    public abstract void operation2(Product product);

    public final Product anOperation() {
        final Product product = factoryMethod();
        operation1(product);
        operation2(product);
        return product;
    }
}

class ConcreteCreator1 extends Creator {
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }

    public void operation1(final Product product) {
        final ConcreteProduct1 product1 = (ConcreteProduct)product ;
        // product に施す処理を記述
    }

    public void operation2(final Product product) {
        final ConcreteProduct1 product1 = (ConcreteProduct)product;
    // product に施す処理を記述
    }
}

class ConcreteCreator2 extends Creator {
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }

    public void operation1(final Product product) {
        final ConcreteProduct1 product1 = (ConcreteProduct)product ;
        // product に施す処理を記述
    }

    public void operation2(final Product product) {
        final ConcreteProduct1 product1 = (ConcreteProduct)product;
    // product に施す処理を記述
    }
}

abstract class Product {
}

class ConcreteProduct1 extends Product {
}

class ConcreteProduct2 extends Product{
}

