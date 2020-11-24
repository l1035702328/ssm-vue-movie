<template>
  <div style="margin-top: 0px">
          <el-card class="box-card" shadow="hover">
            <div slot="header" class="clearfix">
              <span><b>热门影视</b></span>
            </div>
            <div v-for="i in [3,4,5,6,7,8,9,10]" :key="i">

                    <a href="https://www.ele.me" target="_blank" style="text-decoration:none;">
                          <span>
                            <img src="../assets/f1.jpg" class="titleImg">
                          </span>
                      <span class="title">&nbsp;&nbsp;&nbsp;隐秘的角落1080P全集高清下载[豆瓣9.0分]</span>
                      <div style="margin-top: 10px">
                       <span class="text">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2020-06-25</span>
                        <span class="text">30775万次阅读</span>
                    </div>
                    </a>
                <br><br><br>
            </div>
          </el-card>
        </div>
</template>

<script>
    export default {
        name: "IndexCard"
    }
</script>

<style scoped>
  .titleImg{
    float:left;
    max-width: 80px;
    max-height: 49px
  }
  .title{
    display: block;
    margin-right: 20px;
    font-size: 13px;
  }
  .text{
    text-align: left;
    margin-right: 20px;
    font-size: 13px;
  }
</style>
