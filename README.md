# windows本地部署


# 需下载，提供参考版本：
mysql 随便
redis 随便
kafka   kafka_2.13-3.9.0
elasticsearch elasticsearch-6.4.3


# 配置：
application.develop.xml配置：去idea的src/main/resource下找到application.develop.xml

DataSourceProperties 的账号密码（你自己的）

community 的路径（你自己的）

MailProperties 的信息（你自己的）



kafka配置：去你下载kafka的地方

config/zookeeper.properties  找到dataDir 修改成你想将数据存到路径 参考dataDir=g:/Kafka/data3/zookeeper

config/server.properties 找到log.dirs 修改成你想将数据存到路径 参考log.dirs=g:/Kafka/data3/kafka-logs


elasticsearch配置：去你下载elasticsearch的地方

log/elasticsearch.yml 找到path.data: G:\ElasticSearch\data 和path.logs: G:\ElasticSearch\logs改成你自己的
        
      
# 启动
将redis kafka elasticsearch 手动启动后即可本地运行并访问

kafka运行：开启命令提示符
  {
    需去kafka对应目录启动两个命令
    先启动bin\windows\zookeeper-server-start.bat config\zookeeper.properties
    后新开一个窗口后启动bin\windows\kafka-server-start.bat config\server.properties
    由于在windows不适配，易报错，需常重新配置data
  }

elasticsearch运行：启动bin/elasticsearch.bat即可

redis运行：启动redis.exe即可

# 演示



