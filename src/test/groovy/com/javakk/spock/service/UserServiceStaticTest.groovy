package com.javakk.spock.service

import com.javakk.spock.dao.UserDao
import com.javakk.spock.model.UserDTO
import com.javakk.spock.util.IDNumberUtils
import com.javakk.spock.util.LogUtils
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.powermock.api.mockito.PowerMockito
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor
import org.powermock.modules.junit4.PowerMockRunner
import org.powermock.modules.junit4.PowerMockRunnerDelegate
import org.spockframework.runtime.Sputnik
import spock.lang.Specification

/**
 * 测试静态方法mock
 * @Author: www.javakk.com
 * @Description: 公众号:Java老K
 * @Date: Created in 20:53 2020/7/16
 * @Modified By:
 */
@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(Sputnik.class)
@PrepareForTest([LogUtils.class, IDNumberUtils.class])
@SuppressStaticInitializationFor(["com.javakk.spock.util.LogUtils"])
class UserServiceStaticTest extends Specification {
    def processor = new UserService()
    def dao = Mock(UserDao)

    void setup() {
        processor.userDao = dao
        // mock静态类
        PowerMockito.mockStatic(LogUtils.class)
        PowerMockito.mockStatic(IDNumberUtils.class)
    }

    def "GetUserByIdStatic"() {
        given: "设置请求参数"
        def user1 = new UserDTO(id: 1, name: "张三", province: "上海")
        def user2 = new UserDTO(id: 2, name: "李四", province: "江苏")
        def idMap = ["birthday": "1992-09-18", "sex": "男", "age": "28"]
        def rawInt = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
        def rawLong = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0L]
        def set = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0] as Set
        def list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0] as List

        def hashset = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0] as HashSet
        def minus = hashset - 2
        println(minus)
        def plus = minus << 2
        print(plus)



        and: "mock掉接口返回的用户信息"
        dao.getUserInfo() >> [user1, user2]

        and: "mock静态方法返回值"
        PowerMockito.when(IDNumberUtils.getBirAgeSex(Mockito.any())).thenReturn(idMap)

        when: "调用获取用户信息方法"
        def response = processor.getUserByIdStatic(1)

        then: "验证返回结果是否符合预期值"
        with(response) {
            name == "张三"
            abbreviation == "沪"
            postCode == 200000
            age == 28
        }
    }
}
