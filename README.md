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
注意注册后激活邮箱，需通过电脑打开邮箱来激活

需注意/data 只有管理员能访问，详细信息见项目给的sql文件

<img width="2489" height="1403" alt="9457b6d8f18b29c25fecc8ce32a0bf74" src="https://github.com/user-attachments/assets/808fa299-7e0b-45bf-a77c-a056589d4df8" />
<img width="2489" height="1403" alt="ea85ed53750b9c80d8ef57dd6c117d18" src="https://github.com/user-attachments/assets/85135040-f222-4212-9a13-7ecbd6987ad2" />
<img width="2489" height="1403" alt="33a9213d5121ce26d529dc7e9041ba19" src="https://github.com/user-attachments/assets/527cbfda-3369-494f-86c7-7b674ba9936d" />
<img width="2489" height="1403" alt="ca2dc9dd78fa2aa84fea2c55538bf9cb" src="https://github.com/user-attachments/assets/7cfdf814-99f8-471b-9164-751bfe7611bc" />
<img width="2489" height="1403" alt="993539237a9a93d9dbfecf90bcd0aa8b" src="https://github.com/user-attachments/assets/c34c5fe1-21e7-4c1f-9cdb-aefd30a9a0f3" />
<img width="2489" height="1403" alt="dfd56eba3ab1cc2ba878a755207da10d" src="https://github.com/user-attachments/assets/e28f1e18-705b-4450-a9b6-94a46c6a0125" />
<img width="2489" height="1403" alt="301d5bc93c79197586763db654f6feb4" src="https://github.com/user-attachments/assets/367806a9-59bd-4424-bf45-34c0f50338ba" />
<img width="2489" height="1403" alt="5b85935536e340dfe0bb2af4d438ffb3" src="https://github.com/user-attachments/assets/470dc434-f63e-4ded-ae77-20ecdbe9387d" />
