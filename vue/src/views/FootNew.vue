<template>
    <div class="box">

      <el-card class="box-card" shadow="hover">
          <h3>热门电影</h3>
        <br>
          <div v-for="o in 2" :key="o" class="text item">
            <div class="list">
            <div class="focus">
              <a class="thumbnail" href="https://www.baidu.com">
                <img src="../assets/f1.jpg">
              </a>
            </div>
          <header>
            <a class="label" href="www.baidu.com">欧美电影</a>
            <h2><a href="www.baidu.com" title="有希望的男人1080P高清下载_豆瓣7.6高分喜剧" style="text-decoration:none;">有希望的男人1080P高清下载_豆瓣7.6高分喜剧</a></h2>
          </header>
            <p>
              <span class="muted"><i class="el-icon-user-solid"></i>1080P高清</span>
              <span class="muted"><i class="el-icon-date"></i>08-15</span>
              <span class="muted"><i class="el-icon-thumb"></i>9141浏览</span>
            </p>
            <p class="note"><span style="margin-left: 20px">都说忠诚和信任是维持婚姻的重要纽带，但卢德福（波莱克·波利夫卡 Bolek Polívka 饰）觉得这简直是一派胡言，在他的婚姻观里，不忠和出轨不仅能够增加婚姻里的趣味，更能给妻子制造危机感，令两人的关系因危机感而充满情趣</span></p>
          </div>
            <br><br><br><br>
            <br><br>

<!--                    <a href="https://www.ele.me" target="_blank" style="text-decoration:none;">-->
<!--                        <span><i class="el-icon-user-solid"></i>1080P高清</span>&nbsp;&nbsp;&nbsp;-->
<!--                        <span><i class="el-icon-date"></i>08-15</span>&nbsp;&nbsp;&nbsp;-->
<!--                        <span><i class="el-icon-thumb"></i>9141浏览</span>-->

<!--                    </a>-->



          </div>
      </el-card>
      </div>
</template>

<script>
    export default {
        name: "FootNew"
    }
</script>

<style scoped>

  header{
    margin: 0 40px 15px 0;
    display: block;
    text-align: left;

  }
  .note{
    color: #777;
    font-size: 14px;
    line-height: 24px;
    margin: 0 0 10px 0;
  }
  .muted{
    margin-left: 20px;
    color: #999999;
  }


   h2{
     display: inline;
     font-size: 20px;
     margin: 1px;
     font-weight: normal;
     position: relative;
     top: 1px;
     line-height: 25px;
   }
  .focus{
    float: left;
    width: 220px;
    text-align: center;
    position: relative;
  }
  .label{
    margin-left: 10px;
    position: relative;
    top: 2px;
    background-color: #d9534f;
    display: inline-block;
    padding: 4px 6px 3px;
    font-size: 10.152px;
    line-height: 14px;
    color: #ffffff;
    vertical-align: baseline;
    white-space: nowrap;
    text-decoration: none;
    float: left;
  }
  .thumbnail img{
    width: 220px;
    height: 150px;
    display: block;
    max-width: 100%;
    border: 0;
  }

  .footTitle{
    text-decoration: none;
    text-align: left;
    font-size: 20px;
    color: #303133;
    display: block;
    line-height: 20px;
    height: 25%;
    margin-top: 10px;
  }
  .titleImg{
    width: 220px;
    height: 150px;
    display: block;
    float: left;
  }
  .title{
    display: block;
  }
  .text{
    text-align: left;
    margin-right: 20px;
    font-size: 13px;
  }
</style>
