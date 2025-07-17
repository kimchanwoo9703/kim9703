window.addEventListener("load", function () {
    bind(); 
    setupCheckboxes(); 
    showToppings();
});

function bind() {
    const keyword = document.querySelector("#keyword");
    const siteSelect = document.querySelector("#site");
    const form = document.querySelector("form");

    keyword.addEventListener("focus", () => {
        keyword.style.backgroundColor = "red";
    });

    keyword.addEventListener("blur", () => {
        keyword.style.backgroundColor = "yellow";
    });

    keyword.addEventListener("input", () => {
        const r = parseInt(Math.random() * 256);
        const g = parseInt(Math.random() * 256);
        const b = parseInt(Math.random() * 256);
        const a = Math.random().toFixed(2); 
        keyword.style.backgroundColor = `rgba(${r},${g},${b},${a})`;
    });

    siteSelect.addEventListener("change", () => {
        const value = siteSelect.value;
        console.log("change 이벤트 value", value);

        if (value === "1") {
            form.setAttribute("action", "https://search.naver.com/search.naver");
        } else if (value === "2") {
            form.setAttribute("action", "https://www.google.com/search");
        }
    });

    form.addEventListener("submit", (event) => {
        event.preventDefault();
        const value = keyword.value;

        if (value.trim().length < 2) {
            alert("검색어는 두 글자 이상입니다.");
        } else {
            form.submit();
        }
    });

    window.addEventListener("copy", (event) => {
        event.preventDefault();
        alert("복사금지");
    });

    window.addEventListener("selectstart", (event) => {
        event.preventDefault();
    });
}

function setupCheckboxes() {
    const chkAll = document.querySelector(".chk_all");
    const checkboxes = document.querySelectorAll(".check");

    chkAll.addEventListener("change", function () {
        const isChecked = chkAll.checked;
        checkboxes.forEach(chk => chk.checked = isChecked);
    });

    checkboxes.forEach(chk => {
        chk.addEventListener("change", function () {
            const total = checkboxes.length;
            const checkedCount = document.querySelectorAll(".check:checked").length;
            chkAll.checked = (checkedCount === total);
        });
    });
}

function showToppings() {
    const selected = Array.from(document.querySelectorAll(".check:checked"))
        .map(chk => chk.value);

    document.querySelector("#Topping").textContent = selected.join(", ");

    
    
    // 콜백을 화살표함수로 하면 this 는 여전히 window로 유지됨
    document.querySelector("#parent").addEventListener("click", function(event){
        console.log("부모 클릭");
        
        
        //event.target : 이벤트가 발생한 DOM
        console.log("event.target :", event.target);
        
        //currentTarget: 이벤트가 적용된 DOM  
        console.log("event.currentTarget :", event.currentTarget);
        
        
        //이벤트 안에서 this는 더이상 window 가 아니다
        //js에서 this는 뭔지 알고 있을때만 사용하세요
        console.log( this )
        console.log( this === event.currentTarget )


        // event.target.parenNode
        console.log("event.target.parentNode :",event.target.parenNode)
        console.log("event.target.parentNode.parentNode :",event.target.parentNode.parentNode)


    }, true);

    // document.querySelector("#child1").addEventListener("click", function(event){

    //     //전파방지
    //     //부모로 전달되는 이벤트 중지
    //     // event.preventDefault()    둘중 하나 사용        
    //     // event.stopPropagation()
    //     // this 배우기 위헤서 일단 주석처리
    //     console.log("자식1 클릭");
        
    //     // console.log( this )


    // })

    // this : window 객체를 가지고있다
    console.log("밖 ", this )
    console.log("밖 ", this === window )


}
