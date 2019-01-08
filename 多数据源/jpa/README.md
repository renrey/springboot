### 创建JPA多数据源
#### 文件说明
+ `DataSourceConfig.java` 创建数据源
+ `PrimaryDataSourceConfig.java` 主数据源配置repository，entityManagerFactory，entityManager,transactionManager等对象
+ `SecondaryDataSourceConfig.java` 第二数据源配置相关对象
#### 注意
+ 创建数据源要加`@ConfigurationProperties(prefix="")`读取对应的配置
+ 主数据源的相关对象的创建方法要加`@Primary`注解
+ 不同数据源的`repository和实体类`需要分开放`不同`的文件夹，由于entityManagerFactory、JpaRepositories都需要指定对应数据源的实体对象、repository的对象

