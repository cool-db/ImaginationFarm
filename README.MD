ImaginationFarm
========

Introduction
--------
A farm framework. You can use your imagination to build an application.

项目结构
--------

├── abst  （抽象设计模式）  
│   ├── abstFactory  
│   ├── abstIter  
│   ├── abstNullPattern  
│   ├── abstStrategy  
│   ├── chainRespon  
│   ├── container  
│   ├── interpret  
│   ├── logger  
│   │   ├── formatStrategy  
│   │   ├── logAdapter  
│   │   ├── logFilter  
│   │   ├── logStrategy  
│   │   └── printer  
│   ├── mediator  
│   ├── observe  
│   ├── printFormat  
│   ├── singlecharacter  
│   └── state  
├── application  （simple）  
├── lib  （公共类库）  
├── old  （早期测试）  
├── spirit  （实体类）  
│   ├── activity  
│   │   ├── breed  
│   │   ├── exerorder  
│   │   └── girlToPig  
│   ├── charactor  
│   ├── creature  
│   │   ├── animal  
│   │   │   └── chineseZodiac  
│   │   ├── crop  
│   │   └── plant  
│   ├── item  
│   │   ├── IterSpirits  
│   │   ├── abstProducts  
│   │   ├── breakfasts  
│   │   ├── breakfirst  
│   │   ├── buildingshape  
│   │   ├── cakes  
│   │   ├── cleaner  
│   │   ├── cloths  
│   │   ├── hairstate  
│   │   ├── momentoHairSpirit  
│   │   ├── nullPatternSpirit  
│   │   ├── snake  
│   │   └── strategySpirit  
│   └── place  
├── story  （故事实例）  
│   ├── action  
│   ├── bakeCake  
│   ├── chooseOutfits  
│   ├── discoverHairStolen  
│   ├── game  
│   ├── girlToPig  
│   ├── makeBreakfast  
│   └── snakeconfess  
└── test  （测试实例）

开发工具
--------
**IntelliJ IDEA**

Design Patterns
--------
**创建型模式**  
*这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。*	
- [x] 工厂模式（Factory Pattern）
```
实现了两个Factory，包括AnimalFactory和CropFactory，用于生成动物和作物
```
- [x] 抽象工厂模式（Abstract Factory Pattern）
```
构造了一个抽象工厂FactoryProducer，能够产生AnimalFactory和CropFactory
```
- [x] 单例模式（Singleton Pattern）
```
12生肖使用枚举实现了单例模式（最佳实现）
Logger使用static实现了单例模式
```
- [x] 建造者模式（Builder Pattern）
```
早餐 todo rename
日志系统，PrettyFormatStrategy链式初始化、建造
```
- [x] 原型模式（Prototype Pattern）
```
蛋糕
```

**结构型模式**  
*这些设计模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。*
- [x] 适配器模式（Adapter Pattern）
```
日志系统，适配不同的log模式
```
- [x] 桥接模式（Bridge Pattern）
```
养家禽
```
- [x] 过滤器模式（Filter、Criteria Pattern）
```
日志系统，loglevel
```
- [x] 组合模式（Composite Pattern）
```
给家禽加职位
```
- [x] 装饰器模式（Decorator Pattern）
```
日志系统，适配不同的log模式
```
- [x] 外观模式（Facade Pattern
```
日志系统，分别包装了FormatStrategy,LogAdapter,LogStrategy
```
- [x] 享元模式（Flyweight Pattern）
```
日志系统，适配不同的log模式
```
- [x] 代理模式（Proxy Pattern）
```
设置supervisor角色
```

**行为型模式**  
*这些设计模式特别关注对象之间的通信。*
- [x] 责任链模式（Chain of Responsibility Pattern）
```
传递通知
```
- [x] 命令模式（Command Pattern）
```
分发命令
```
- [x] 解释器模式（Interpreter Pattern）
```
日志系统，loglevel转换到输出
```
- [x] 迭代器模式（Iterator Pattern）
```
十二生肖的名单列表
```
- [x] 中介者模式（Mediator Pattern）
```

```
- [x] 备忘录模式（Memento Pattern）
```
冰箱冷藏食品
```
- [x] 观察者模式（Observer Pattern）
```
通知
```
- [x] 状态模式（State Pattern）
```
角色死亡、清醒、睡眠三种状态
```
- [x] 空对象模式（Null Object Pattern）
- [x] 策略模式（Strategy Pattern）
```
日志系统，不同的log格式
```
- [x] 模板模式（Template Pattern）
```
日志系统，适配不同的log模式
```
- [x] 访问者模式（Visitor Pattern）
```
日志系统，适配不同的log模式
```

**J2EE 模式**  
*这些设计模式特别关注表示层。这些模式是由 Sun Java Center 鉴定的。*
- [ ] MVC 模式（MVC Pattern）
- [ ] 业务代表模式（Business Delegate Pattern）
- [ ] 组合实体模式（Composite Entity Pattern）
- [ ] 数据访问对象模式（Data Access Object Pattern）
- [ ] 前端控制器模式（Front Controller Pattern）
- [ ] 拦截过滤器模式（Intercepting Filter Pattern）
- [ ] 服务定位器模式（Service Locator Pattern）
- [ ] 传输对象模式（Transfer Object Pattern）
