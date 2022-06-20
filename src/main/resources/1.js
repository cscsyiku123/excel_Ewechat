// 定义线条颜色
const colors = ['#91cc75', '#5470c6', '#ee6666', '#7a22ef', '#3bbcd9']

// 折线图1
function echarts_1(data) {
    var data1= data[0]   // 定义三组折线数据
    var dom = document.getElementById("echart1");
    var myChart1 = echarts.init(dom);
    var option = {
        dataZoom: [                         // 缩放和进度组件
            {
                type: 'slider',
                show: true,
                xAxisIndex: [0],
                start: 0,
                end: 100,
                filterMode: 'filter'
            },
            {
                type: 'inside',
                start: 0,
                end: 100
            },
        ],
        tooltip: {
            trigger: 'axis',
        },
        grid: {
            left: '5%',
            right: '5%',
            bottom: '15%',
        },
        xAxis: {
            type: 'category',
            boundaryGap: false,
            data: []
        },
        yAxis: {
            type: 'value'
        },
        series: []
    };

    if (option && typeof option === 'object') {
        myChart1.setOption(option, true);
    }

    showChart(data1, myChart1, option);   // 初始渲染

// 折线图切换渲染
//     $('.database1 .tags li').on('click', function () {
//         let index = $(this).index() + 1;
//         $(this).addClass('check').siblings().removeClass('check');
//         let targetdata = eval('data' + index);
//         showChart(targetdata, myChart1, option);
//     })
}


/*
* 设置折线样式及名称
* set_series
* @param {Object} data 折线数据
* @return {arr} 返回配置项
*/
function set_series(data) {
    var series = [];
    var series_data = data.series;

    series_data.forEach(function (e,index) {
        var item = {
            name: e.name,
            data: e.data,
            type: 'line',
            itemStyle: {
                normal: {
                    color: colors[index],  //圈圈的颜色
                    lineStyle: {
                        color: colors[index]  //线的颜色
                    }
                }
            },
        }
        series.push(item);
    })

    return series
}


/*
* 折线数据渲染
* @showChart()
* @param {Object} data 折线数据
* @param {Object} myChart echars实例对象
* @param {Object} option  echarts 配置项
*/
function showChart(data, myChart, option) {
    const new_legend = [];                      // 获取折线类别数量

    if (data) {
        const new_series = set_series(data)

        data.series.forEach(function(e){
            new_legend.push(e.name);
        })

        myChart.setOption(option, true)        // 清除上次数据
        myChart.setOption({
                xAxis: {
                    data: data.categories
                },

                legend: {
                    data: new_legend
                },
                series: new_series
            }
        );
    }
}
