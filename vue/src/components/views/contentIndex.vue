<template>
    <div class="row">
      <div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
        <div class="block">
          <el-carousel height="300px">
            <el-carousel-item v-for="item in 4" :key="item">
            </el-carousel-item>
          </el-carousel>
        </div>
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span><b>最热</b></span>
          </div>
        <ul class="media-list">
          <li class="media"  v-for="i in movie">
            <div class="media-left">
              <a href="#">
                <img class="media-object" src="~@/assets/movieImag/2.jpg" style="width: 220px;height: 150px">
              </a>
            </div>
            <div class="media-body">
              <h3 class="media-heading" style="color: #3071A9;"><el-tag type="success">{{i.movieType}}</el-tag>&nbsp;{{i.movieName}}</h3>
              <p class="icon-title">
                <span class="muted"><i class="el-icon-user-solid"></i>{{i.movieSharpness}}</span>
                <span class="muted"><i class="el-icon-date"></i>{{i.movieReleaseDate}}</span>
                <span class="muted"><i class="el-icon-thumb"></i>{{i.viewCount}}浏览</span>
              </p>
              <span>{{i.movieContent}}</span>

            </div>
          </li>
        </ul>
        </el-card>
      </div>
      <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3" >
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span><b>近期热播</b></span>
          </div>
        <ul class="media-list">
          <li class="media" v-for="i in 5">
            <div class="media-left">
              <a href="#">
                <img class="media-object" src="~@/assets/movieImag/1.jpg" style="height: 45px;width: 80px">
              </a>
            </div>
            <div class="media-body">
              <h4 class="media-heading"><a href="#">复仇者联盟【豆瓣评分G】</a></h4>
              ...
            </div>
          </li>
        </ul>
        </el-card>
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span><b>电影类型</b></span>
          </div>
          <div class="text item" v-for="i in 5">
            <el-tag>剧情</el-tag>
            <el-tag type="success">喜剧</el-tag>
            <el-tag type="info">冒险</el-tag>
            <el-tag type="warning">犯罪</el-tag>
          </div>
        </el-card>


      </div>
    </div>
</template>

<script>
    export default {
        data(){
          return{
            movie:
              [{
                movieType:'欧美电影',
                movieName:'复仇者联盟',
                movieSharpness:'1080P',
                movieContent:'唧歪个鸡儿为唧唧歪个鸡儿为键是独立建国六十打架 反倒是灌水',
                movieReleaseDate:'2015-08-15',
                viewCount:'0',
                imgUrl:'',
                DouBanScore:'8.0',
              },
                {
                  movieType:'大陆电影',
                  movieName:'叶问',
                  movieSharpness:'1080P',
                  movieContent:'是广东省的色温恶个任何人',
                  movieReleaseDate:'2013-08-15',
                  viewCount:'0',
                  imgUrl:'',
                  DouBanScore:'7.0',
                },
              ],
          }
        }
    }
</script>

<style scoped>
  .el-carousel__item h3 {
    color: #475669;
    font-size: 14px;
    opacity: 0.75;
    line-height: 150px;
    margin: 0;
  }

  .el-carousel__item:nth-child(2n) {
    background-color: #99a9bf;
  }

  .el-carousel__item:nth-child(2n+1) {
    background-color: #d3dce6;
  }

  .icon-title{
    color: #999999;
  }
</style>
