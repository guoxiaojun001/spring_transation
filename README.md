# spring_transation
spring事务的几种实现方式

1、编程方式实现：
  手动写代码进行事务管理（一般不用）
  
2、声明式实现事务管理：
  1）、基于TransationProxyFactoryBean方式（很少使用）
  2）、基于AspectJ的xml配置方式（经常使用）
    一旦配置好，类中不需要添加任何东西
  3）、注解方式（经常使用）
    配置简单，只需要在业务类上添加@Transactional 就可以，但是需要添加的地方比较多
