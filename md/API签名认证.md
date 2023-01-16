# API签名认证

## 本质

1. 签发签名
2. 使用签名（校验签名）

为什么需要？ —— >  **保证安全性，不能随便一个人就可以调用**

## 实现

通过http request header头传递参数

1. **accessKey** 调用的标识（复杂，无序，无规律）
2. **secretKey**  密钥 （复杂，无序，无规律）；**该参数不传递**
	* ak和sk可以自己实现生成算法，但是不应该在服务器之间传递，可能会被拦截获取
3. 用户请求参数
4. **sign** 签名
	* 加密方式：对称加密、非对称加密、md5签名
	* 用户参数 + 密钥 + 签名生成算法 ——>  不可解密的值
	* 服务端验证方式：用一样的用户参数 + 密钥 + 签名生成算法生成对应值 ，比较与用户传递的值是否一致即可
5. **nonce** 随机数	
	* 防止重复：只能用一次，服务端要保存用过的随机数	
6. **timestamp** 时间戳，校验它的有效期

## 开发一个简单易用的客户端 SDK

编写 openapi-clientsdk 提供统一的API接口调用方式和签名算法的封装。

* 选择Spring Initializr (Lombok,Spring Configuration Processor)
* pom.xml修改version,删除build依赖
* 使用Hutool库
* **META_INF**新建**spring.factories**
* mvn install 生成jar包即可