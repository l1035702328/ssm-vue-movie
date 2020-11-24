<template>
  <div style="margin-top: 20px;">
    <el-card class="box-card">
      <div slot="header" class="clearfix">
        <span><b>热门影视</b></span>
      </div>
          <el-menu :default-active="activeIndex" class="el-menu-demo" @select="handleSelect">
            <el-menu-item index="1" v-for="i in [1,2,3,4,5,6]" :key="i">
        <a href="https://www.ele.me" target="_blank" style="text-decoration:none;">
              <span>
                <img src="../assets/f1.jpg" class="titleImg">
              </span>
              <span class="text title">&nbsp;&nbsp;&nbsp;隐秘的角落(1080P)</span>
<!--              <span class="text">2020-06-25</span>-->
<!--              <span class="text">30775万次阅读</span>-->
      </a>
            </el-menu-item>
          </el-menu>
    </el-card>
  </div>
</template>

<script>
    export default {
        name: "rightIndex1",
      data() {
        return {
          activeIndex: '',
          activeIndex2: ''
        };
      },
      methods: {
        handleSelect(key, keyPath) {
          console.log(key, keyPath);
        }
      }
    }
</script>

<style scoped>
  .el-menu-demo{
    border: 1px solid #DCDFE6;
    padding:15px 15px 10px 10px;
    -webkit-border-radius: 5px;
    -moz-border-radius: 5px;
    border-radius: 10px;
  }
  .titleImg{
    float:left;
    max-width: 90px;
    max-height: 49px
  }
  .title{
    display: block;
  }
  .text{
    text-align: left;
    /*margin-right: 0px;*/
    font-size: 13px;
  }
</style>
