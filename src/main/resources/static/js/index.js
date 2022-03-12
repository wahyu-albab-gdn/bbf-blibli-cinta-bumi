var pointUtama = localStorage.getItem("generalPoint")
var pohonPoint = localStorage.getItem("pohonPoint")
var listrikPoint = localStorage.getItem("listrikPoint")
var plastikPoint = localStorage.getItem("plastikPoint")
var campaignPointDasar = 560
var kontribusiCampaign = (parseInt(pointUtama) - 198) / 10;
var campaignPohon = campaignPointDasar + ((parseInt(pointUtama) - 200) / 10);

document.getElementById("pointUtama").innerHTML = pointUtama
document.getElementById("value-pohon").innerHTML = pohonPoint
document.getElementById("bar-pohon").style.width = pohonPoint+"%"
document.getElementById("value-listrik").innerHTML = listrikPoint
document.getElementById("bar-listrik").style.width = listrikPoint+"%"
document.getElementById("value-plastik").innerHTML = plastikPoint
document.getElementById("bar-plastik").style.width = plastikPoint+"%"
document.getElementById("kontribusi-campaign").innerHTML = kontribusiCampaign
document.getElementById("campaign-pohon").innerHTML = campaignPohon



function kembalikanDus(){
    localStorage.setItem("pohonPoint", parseInt(pohonPoint) + 0.5)
    localStorage.setItem("generalPoint", parseInt(pointUtama) + 5)

    alert("point berhasil ditambahkan")
}

function belanjaTanpaKemasanPlastik(){
    localStorage.setItem("plastikPoint", parseInt(plastikPoint) + 5)
    localStorage.setItem("generalPoint", parseInt(pointUtama) + 5)

    alert("point berhasil ditambahkan")
}

function pengirimanHematKemasan(){
    // localStorage.setItem("pohonPoint", pohonPoint + 0.5)
    localStorage.setItem("generalPoint", parseInt(pointUtama) + 5)

    alert("point berhasil ditambahkan")
}

function belanjaEco(){
    // localStorage.setItem("pohonPoint", pohonPoint + 0.5)
    localStorage.setItem("generalPoint", parseInt(pointUtama) + 5)

    alert("point berhasil ditambahkan")
}










