define({
  "name": "XXXX接口文档",
  "version": "1.0.0",
  "description": "在这里添加详细描述",
  "title": "XXXX接口文档",
  "url": "http://xxx.xxx.xxx.xxx:8301",
  "sampleUrl": "http://192.168.39.128:8301",
  "order": [],
  "header": {
    "title": "文档说明（必读）",
    "content": "<h2>文档说明</h2>\n<ul>\n<li>请求协议：HTTP/1.1</li>\n<li>返回数据：json字符串</li>\n<li>字符编码：utf-8</li>\n</ul>\n<h3>接口正常请求时统一按如下格式返回json数据</h3>\n<pre><code>{\n\t&quot;code&quot;:1,//返回码\n\t&quot;message&quot;:&quot;success&quot;,//提示信息\n\t&quot;data&quot;:&quot;&quot;//实际业务数据，当code=1时data才有意义\n}\n</code></pre>\n"
  },
  "footer": {
    "title": "附录",
    "content": "<h2>附录</h2>\n<ul>\n<li>暂无</li>\n</ul>\n"
  },
  "template": {
    "withCompare": true,
    "withGenerator": true
  },
  "defaultVersion": "0.0.0",
  "apidoc": "0.3.0",
  "generator": {
    "name": "apidoc",
    "time": "2018-04-10T14:11:11.928Z",
    "url": "http://apidocjs.com",
    "version": "0.17.6"
  }
});
