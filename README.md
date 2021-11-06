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
3. @Import annotation, thing has more function than @bean, which used to import 3th package or component
   1. set value option to specify the class, and we get the full classname as bean name.
   2. Implement ImportSelector, override the method and return the full classname
   3. Implement ImportBeanDefinitionRegistrar
4. Implement FactoryBean


## ch07
manager lifecycle of bean.
1. bean properties
2. implements InitializingBean, DisposableBean
3. use jsr250 annotation
4. implement BeanPostProcessor, and override postProcessBeforeInitialization and postProcessAfterInitialization.


## ch08
Value annotation. support fellow type:
1. basic java type
2. spring el
3. environment
4. read environment from resources file, use PropertySource annotation on configuration class.

## ch09
The sequence of autowired annotation.
1. use field name to get bean in application context.
2. use type to get bean in application context.

if you want to choose the bean in application context, 
1. use qualifier annotation to specify the which bean name you want to choose.
2. use Primary annotation to specify which bean as the first one to choose when you use type method.
3. 


