package com.javakk.spock.service


import spock.lang.Specification;

class ExceptionServiceTest extends Specification {
    class B {
        def b(A a) {
            a.a()
        }
    }

    class A {
        def a() {}
    }


    def "foo"() {
        given:
        def a = Mock(A)
        B b = new B()

        when:
        b.b(a)

        then:
        thrown(catchedeException)
        1 * a.a() >> { throw exception }
        where: "验证异常"
        exception        || catchedeException
        RuntimeException || RuntimeException
        Exception        || Exception
        Exception        || RuntimeException
    }

}
