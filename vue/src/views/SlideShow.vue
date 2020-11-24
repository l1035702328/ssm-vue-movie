<template>
  <div class="block">
    <el-carousel height="400px">
      <el-carousel-item v-for="item in imgList" :key="item.imageUrl">
        <h3 class="small">
          <img :src="item.imageUrl" width="100%" height="100%"/>
        </h3>
      </el-carousel-item>
    </el-carousel>
  </div>
</template>



<script>
    export default {
        name: "SlideShow",
        data(){
          return{
            imgList:[
              {imageUrl:require('../assets/f1.jpg')},
              {imageUrl:require('../assets/f2.jpg')},
              {imageUrl:require('../assets/f3.jpg')},
              {imageUrl:require('../assets/f4.jpg')},
              {imageUrl:require('../assets/f5.jpg')},
              {imageUrl:require('../assets/f6.jpg')},
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

</style>
