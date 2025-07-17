let view
window.onload = function(){
     view = document.querySelector("#view");
     
     const cursor = document.querySelector("#cursor");
     cursor.style.top = "-1000px";
     cursor.style.left = "-1000px";
     

     bind()
}

function bind(){
    view.innerHTML = "안녕?<br>"

    document.querySelector("#mouse")
    .addEventListener("mousedown", function(evt){
        view.innerHTML = "mousedown 발생<br>" + view.innerHTML
        
        console.log(evt)
        // offset : dom의 좌상단 기준
        // page   : 스크롤에 관계없이 문서 좌상단 기준
        // client : 지금 보이는 화면 좌상단 기준

        view.innerHTML = `
        event.offsetX : ${evt.offsetX} event.offsetY : ${view.offsetY}<br>
        event.pageX : ${evt.pageX} event.pageY : ${view.pageY}<br>
        event.clientX : ${evt.pageX} event.clientY : ${view.clientY}<br>
        <br>
        ${view.innerHTML}
        
        `
        // document.querySelector("#mouse").style.backgroundColor = "yellow"
        
    })
    
    document.querySelector("#mouse")
    .addEventListener("mouseup", function(){
        view.innerHTML = "mouseup 발생<br>" + view.innerHTML
        document.querySelector("#mouse").style.backgroundColor = "yellow"
    })
    // 확인 했고 너무 많이생겨 주석
    // document.querySelector("#mouse")
    // .addEventListener("mousemove", function(){
        //     view.innerHTML = "mousemove 발생<br>" + view.innerHTML
        // })
        document.querySelector("#mouse")
        .addEventListener("mouseover", function(){
            view.innerHTML = "mouseover 발생<br>" + view.innerHTML
            document.querySelector("#mouse").style.backgroundColor = "yellow"
        })
        document.querySelector("body")
        .addEventListener("mousemove", function(evt){
           const cursor = document.getElementById("cursor")

           cursor.style.top = evt.pageY+3 +"px";
           cursor.style.left = evt.pageX+3 +"px";
        })
        let drag = document.getElementById("drag");
        let offsetX = 0;
        let offsetY = 0;

        drag.addEventListener("mousedown", function (evt) {
            isDragging = true;
            offsetX = evt.offsetX;
            offsetY = evt.offsetY;
            drag.style.position = "absolute";
            document.body.appendChild(drag);
        });

        document.addEventListener("mousemove", function (evt) {
            if (isDragging) {
                drag.style.left = (evt.pageX - offsetX) + "px";
                drag.style.top = (evt.pageY - offsetY) + "px";
            }
        });

        document.addEventListener("mouseup", function () {
            isDragging = false;
        });
        
    }
    
    
    
    