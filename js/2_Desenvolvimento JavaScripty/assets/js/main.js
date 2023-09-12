const pokemonsList = document.getElementById("pokemonsList");
const loadMoreButton = document.getElementById("loadMoreButton");
const maxRecord = 151;
const limit = 5;
let offset = 0;

function loadPokemonItens(offset, limit) {
  pokeAPI.getPokemons(offset, limit).then((pokemons = []) => {
    const newHtml = pokemons
      .map((pokemon) => {
        return `
      <li class="pokemon ${pokemon.type}">
          <span class="number">#${pokemon.number}</span>
          <span class="name">${pokemon.name}</span>
  
          <div class="detail">
            <ol class="types ">
              ${pokemon.types
                .map((type) => `<li class="type ${type}">${type}</li>`)
                .join("")}
            </ol>
            <img src="${pokemon.photo}"
              alt="${pokemon.name}"/>
          </div>
        </li>
      `;
      })
      .join("");
    pokemonsList.innerHTML += newHtml;
  });
}

loadPokemonItens(offset, limit);

loadMoreButton.addEventListener("click", () => {
  offset += limit;
  let qtRecordWithNexPage = offset + limit;

  if (qtRecordWithNexPage >= maxRecord) {
    const newLimit = maxRecord - offset;
    loadPokemonItens(offset, newLimit);
    loadMoreButton.parentElement.removeChild(loadMoreButton);
  } else {
    loadPokemonItens(offset, limit);
  }
});
