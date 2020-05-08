package com.yx.baselibrary

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONObject
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val json = "{\"success\":true,\"payload\":{\"appLoginMethod\":\"1\",\"authC2C\":0,\"avatar\":\"\",\"email\":\"tes***.com\",\"inviteCode\":\"\",\"inviteCodeSwitch\":\"1\",\"isBindGa\":0,\"name\":\"\",\"nickName\":\"\",\"phone\":\"188****8605\",\"regType\":2,\"userId\":\"341161\"}}";
        val toJSONString = JSON.toJSONString(json)
        val parseObject = JSONObject.parseObject(json)
        val toJSONString1 = JSON.toJSONString(parseObject)

        println(toJSONString)
        println(parseObject.get("success"))
        println(toJSONString1)
    }
}
