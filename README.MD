### demo项目结构

> 使用maven管理项目

| 结构            | 类型 |
| --------------- | ---- |
| dubbo-parent    | pom  |
| dubbo-dao       | jar  |
| dubbo-interface | jar  |
| dubbo-pojo      | jar  |
| dubbo-service   | war  |
| dubbo-web       | war  |

### 搭建zookeeper服务器

在linux服务器搭建zookeeper服务器

### 注意事项

1. 注意各模块之间的依赖
2. 注意@Service导入的包应该是dubbo的包
3. 配置文件：web配置springmvc.xml，在web.xml中引入；service配置spring和mybatis，在web.xml中引入。
