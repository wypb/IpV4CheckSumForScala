package com.iteblog

import org.scalatest.FunSuite

/**
 * Author: iteblog.com
 * Date  : 2015/11/13 14:55
 * Email : wyphao.2007@163.com
 * Blog  : http://www.iteblog.com
 */

class IPv4CheckSumSuit extends FunSuite {

  test("basic accumulation") {
    import com.iteblog.IPv4CheckSum._
    assert(checksum("4500 0073 0000 4000 4011 0000 c0a8 0001 c0a8 00c7") == "4500 0073 0000 4000 4011 b861 c0a8 0001 c0a8 00c7")
    assert(checksum("4500 0042 3038 0000 4011 0000 c0a8 0afa af90 6ce9") == "4500 0042 3038 0000 4011 6257 c0a8 0afa af90 6ce9")
  }
}
