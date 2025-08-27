# 🧑‍💻 在线编程题目评测系统

基于 **Vue 3 + Spring Boot + Spring Cloud 微服务 + Docker** 的在线编程题目评测系统。  
系统前台支持管理员管理题目、用户搜索与提交代码；系统后端通过 **代码沙箱** 自动编译运行代码，并根据测试用例判断结果是否正确。  
代码沙箱作为独立服务提供，可供其他开发者单独使用。

---

## ✨ 功能特性

### 前台功能
- 🔍 **题目管理**：管理员可创建、编辑、删除、审核编程题目
- 📖 **题目展示**：用户可搜索题目，查看题目详情
- ⌨️ **在线编程**：支持 Markdown 富文本题目描述 + Monaco Editor 代码编辑器
- 🚀 **代码提交**：实时提交代码并返回运行结果

### 后台功能
- 🧰 **微服务架构**：基于 Spring Cloud + Alibaba 技术栈
- 📦 **代码沙箱**：基于 Docker 隔离执行用户代码，支持多语言扩展
- 📡 **异步判题**：RabbitMQ 消息队列解耦判题流程，提升系统吞吐量
- 🔐 **安全防护**：利用 Java 安全管理器 + Docker 沙箱隔离，防止恶意代码攻击
- 📊 **高可用设计**：Redis 分布式 Session + Nacos 注册中心 + Gateway 网关

---

## 🛠️ 技术栈

### 前端
- Vue 3 + Vue-CLI + TypeScript
- Vuex 状态管理
- Arco Design UI 组件库
- ESLint + Prettier 前端工程化
- ⭐️ Markdown 富文本编辑器
- ⭐️ Monaco Editor 在线代码编辑器
- ⭐️ OpenAPI 前端代码生成

### 后端
- Spring Boot 万用后端模板
- Spring Cloud + Spring Cloud Alibaba
- Nacos 注册中心、Gateway 网关、OpenFeign 调用
- MyBatis-Plus & MyBatis X 自动代码生成
- MySQL、Redis
- RabbitMQ 消息队列
- ⭐️ Docker 代码沙箱
- ⭐️ 多种设计模式（策略模式、工厂模式、代理模式、模板方法模式）

---

## 📦 快速开始

### 环境要求
- Node.js >= 16
- JDK >= 17
- Maven >= 3.6
- MySQL >= 8.0
- Redis >= 6.0
- Docker >= 20.10

### 启动步骤

#### 前端
```bash
cd frontend
npm install
npm run serve
```

后端
```bash
cd backend
mvn clean install
mvn spring-boot:run
```

Docker 沙箱
```bash
cd sandbox
docker build -t code-sandbox .
docker run -d -p 8081:8081 code-sandbox
```

📂 项目结构
```bash
.
├── frontend/        # Vue3 前端项目
├── backend/         # Spring Boot + Spring Cloud 后端项目
├── sandbox/         # Docker 代码沙箱服务
├── docs/            # 文档与设计说明
└── README.md
```

📸 系统截图

## 🤝 贡献指南

欢迎提交 Issue 或 Pull Request 来共同完善项目。
分支规范：

- `main`：稳定可运行版本
- `dev`：开发分支

------

## 📜 许可证

本项目基于 **MIT License** 开源，使用前请保留作者信息。

------

## 🌟 Star History

如果这个项目对你有帮助，请点个 Star ⭐️ 支持一下吧！