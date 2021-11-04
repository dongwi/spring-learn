# spring-learn
Personal study of spring.

## ch01
use `beans.xml` to create beans. import list:
1. beans.xml
2. ClassPathXmlApplicationContext appContext which create spring application context

## ch02
use ComponentScan Annotation to choose which class will be created. import list
1. ComponentScan
2. includeFilter, excludeFilter, FilterType.CUSTOM, FilterType.ANNOTATION
3. CustomTypeFilter must implements TypeFilter and override match function

## ch05
Through Condition to control bean create or not.

## ch06
annotation way to create bean:
1. @Bean annotation, normal to import 3th package or component
2. @ComponentScan annotation, normal the class developed by us
3. @Import annotation, thing has more function than @bean
   1. set value option to specify the class, and we get the full classname as bean name.
   2. Implement ImportSelector, override the method and return the full classname
   3. Implement ImportBeanDefinitionRegistrar
4. Implement FactoryBean

