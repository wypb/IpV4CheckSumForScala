package com.iteblog

/**
 * Author: iteblog.com
 * Date  : 2015/11/13 14:54
 * Email : wyphao.2007@163.com
 * Blog  : http://www.iteblog.com
 * F
 */
object IPv4CheckSum {
  def checksum(header: String): String = {
    val arr = header.split(" ")
    val sum = (for (item <- arr) yield Integer.parseInt(item, 16)).sum
    val result = (~((sum >> 16) + (sum & 0xFFFF))) & 0xFFFF
    arr(5) = Integer.toHexString(result)
    arr.mkString(" ")
  }
}