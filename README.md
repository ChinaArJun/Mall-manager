# Mall-manager
商城项目-2018

### 1.使用技术：
基于Maven搭建项目
按照功能点把系统拆分，拆分成独立的功能，单独为某一个节点添加服务器，需要系统之间配合才能完成整个业务逻辑，分布式部署。

分布式架构：多个子系统相互协作才能完成业务流程。系统之间需要进行通信。
分布式架构：把系统按照模块拆分成多个子系统。
集群服务器：同一个工程部署到多台服务器上。
使用Nginx高可用负载均衡集群
使用Redis高性能集群作为缓存机制

### 2.基于soa的架构
SOA：Service Oriented Architecture面向服务的架构。也就是把工程拆分成服务层、表现层两个工程。
服务层中包含业务逻辑，只需要对外提供服务即可。表现层只需要处理和页面的交互，业务逻辑都是调用服务层的服务来实现。


### 3.项目架构
开发环境：eclipse
Maven的常见打包方式：jar、war、pom
Pom工程一般都是父工程，管理jar包的版本、maven插件的版本、统一的依赖管理。聚合工程。

mall-parent：父工程，打包方式pom，管理jar包的版本号。
    |           项目中所有工程都应该继承父工程。
    |--mall-common：通用的工具类通用的pojo。打包方式jar
    |--mall-manager：服务层工程。聚合工程。Pom工程
        |--mall-manager-dao：打包方式jar
        |--mall-manager-pojo：打包方式jar
        |--mall-manager-interface：打包方式jar
        |--mall-manager-service：打包方式：jar
        |--mall-manager-web：表现层工程。打包方式war
