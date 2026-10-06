// Alterado de 'nome' para 'frm' para bater com o resto do código
const frm = document.querySelector("form");

frm.addEventListener("submit", (e) => {
    // O name no HTML é "filme", então usamos frm.filme.value
    const nomeFilme = frm.filme.value; 
    alert(`O filme escolhido foi: ${nomeFilme}!`); 
    
    // Corrigido de vírgula para ponto (.)
    const tempo = Number(frm.tempo.value); 
    const horas = Math.floor(tempo / 60);
    const minutos = tempo % 60;

    // Impede a página de recarregar imediatamente
    e.preventDefault(); 
    
    alert(`O filme tem ${horas} hora(s) e ${minutos} minutos de duração.`);
});