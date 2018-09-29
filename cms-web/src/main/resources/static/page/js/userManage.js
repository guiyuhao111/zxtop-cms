$(document).ready(function () {
    layui.use('table',function () {
        var table=layui.table;
        table.render({
            //tableId
            elem:"#demo",
            //数据接口
            url:"/user/getUserList",
            //contentType:"application/json",
            //请求参数
            where:{
                currentPage:1
            },
            //请求头
            //headers:{},
            //开启分页
            page:true,
            limit:10,
            height:321,
            //表头
            cols: [[
                {field: 'userId', title: 'ID', sort: true, fixed: 'left'}
                ,{field: 'userName', title: '用户名'}
                ,{field: 'createTime', title: '创建时间', sort: true}
                ,{field: 'lastLoginTime', title: '上次登录时间'}
            ]],
            parseData:function (res) {
                //console.log(res);
                return{
                    "code":res.state==0?1:0,
                    "msg":res.message,
                    "data":res.data.pageInfo,
                    "count":res.data.amount
                }
            }
        })
    })
})
