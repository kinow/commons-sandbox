package br.eti.kinoshita.commons.jxpath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.jxpath.JXPathContext;

public class TestsJxpath {

    public static class Request {
        private Foo foo;
        public Foo getFoo() {
            return foo;
        }
        public void setFoo(Foo foo) {
            this.foo = foo;
        }
        @Override
        public String toString() {
            return "Request [foo=" + foo + "]";
        }
    }

    public static class Foo {
        private String subscriberNumber;
        private Bar bar;
        public String getSubscriberNumber() {
            return subscriberNumber;
        }
        public void setSubscriberNumber(String subscriberNumber) {
            this.subscriberNumber = subscriberNumber;
        }
        public Bar getBar() {
            return bar;
        }
        public void setBar(Bar bar) {
            this.bar = bar;
        }
        @Override
        public String toString() {
            return "Foo [subscriberNumber=" + subscriberNumber + ", bar=" + bar + "]";
        }
    }

    public static class Bar {
        private List<String> numbers = Arrays.asList("");
        public List<String> getNumbers() {
            return numbers;
        }
        @Override
        public String toString() {
            return "Bar [numbers=" + numbers + "]";
        }
    }

    // added after OP reported on
    // https://stackoverflow.com/questions/44530112/how-to-get-jxpath-to-cleanly-set-list-collection-entries
    public static void main(String[] args) {
        Request request = new Request();
        JXPathContext context = JXPathContext.newContext(request);
        context.setValue("foo", new Foo());
        context.setValue("foo/subscriberNumber", "1234567890");
        context.setValue("foo/bar", new Bar());
        context.setValue("foo/bar/numbers[1]", "123"); // this fails
        System.out.println(request);
    }

    public static void main2(String[] args) {
        Phone p1 = new Phone(1);
        Phone p2 = new Phone(2);
        List<Phone> phones = new ArrayList<>();
        phones.add(p1);
        phones.add(p2);

        JXPathContext ctx = JXPathContext.newContext(phones);
        System.out.println(phones);
        long phone1 = (long) ctx.getValue("/*[type='br.eti.kinoshita.commons.jxpath.Phone']");
        System.out.println(phone1);
    }
}
