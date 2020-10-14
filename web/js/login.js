function changeCode() {
    let codeImg = document.getElementById("VCode");
    codeImg.src="/CreateVerifyImageController?t="+Math.random();
}