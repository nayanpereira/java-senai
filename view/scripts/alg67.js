const nome = document.querySelector("form")
const res = document.querySelector("h5")

frm.addEventListener("submit",(e)=>{
    const nome = frm.nome.value
    res.textContent = `Alô, ${nome}!` 
    e.preventDedault()
})
