public class App {
  void f(org.slf4j.Logger log) {
    log.error("message" /*1*//*2*//*3*//*4*//*5*//*6*//*end*/);
    log.error("message" /*1*/ /*2*/ /*3*/ /*4*/ /*5*/ /*6*/ /*end*/);
    log.error("{}", /*1*//*2*//*3*//*4*//*5*//*6*/1/*end*/);
    log.error("{}", /*1*/ /*2*/ /*3*/ /*4*/ /*5*/ /*6*/1/*end*/);
    log.error("{}", /*1*/ /*2*/ /*3*/ /*4*/ /*5*/ /*6*/1/*end*/);
    log.error("{}, {}!", /*1*//*2*//*3*//*4*//*5*//*6*/"Hello"/*7*/, /*8*/ "World"/*end*/);
    log.error("{}, {}!", /*1*/ /*2*/ /*3*/ /*4*/ /*5*/ /*6*/"Hello"/*7*/, /*8*/ "World"/*end*/);
    log.error("{}, {}!", /*1*/ /*2*/ /*3*/ /*4*/ /*5*/ /*6*/"Hello"/*7*/, /*8*/ "World"/*end*/);
    log.error("{}, {} {}!", /*1*/ /*2*/ /*3*/ /*4*/ /*5*/ /*6*/"Hello"/*7*/, /*8*/ "World", "World"/*end*/);
  }
}