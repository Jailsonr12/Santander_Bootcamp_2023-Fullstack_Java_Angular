class CardNews extends HTMLElement {
  constructor() {
    super();
    const shadow = this.attachShadow({ mode: "open" });

    shadow.appendChild(this.build());
    shadow.appendChild(this.style());
  }

  build() {
    const componentRoot = document.createElement("div");
    const cardLeft = document.createElement("div");
    const cardRight = document.createElement("div");

    componentRoot.appendChild(cardLeft);
    componentRoot.appendChild(cardRight);
    componentRoot.setAttribute("class", "card");

    cardLeft.setAttribute("class", "card__left");
    cardRight.setAttribute("class", "card__right");

    const autor = document.createElement("span");
    const title = document.createElement("h1");
    const newsContent = document.createElement("p");

    cardLeft.appendChild(autor);
    cardLeft.appendChild(title);
    cardLeft.appendChild(newsContent);

    const newsImage = document.createElement("img");
    cardRight.appendChild(newsImage);

    autor.textContent = "By " + (this.getAttribute("autor") || "Anonymous");
    title.textContent = this.getAttribute("title");
    newsContent.textContent = this.getAttribute("content");

    newsImage.src =
      this.getAttribute("photo") ||
      "/js/4_TrabalhandoComWebComponentes/desafio-01/assests/default-profile-picture1.jpg";
    newsImage.alt = this.getAttribute("photolt");
    return componentRoot;
  }

  style() {
    const stykeCard = document.createElement("style");

    stykeCard.textContent = `
    * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: "Segoe UI", sans-serif;
    }
    .card {
        width: 80%;
        -webkit-box-shadow: 10px 10px 22px 8px rgba(0, 0, 0, 0.4);
        -moz-box-shadow: 10px 10px 22px 8px rgba(0, 0, 0, 0.4);
        box-shadow: 10px 10px 22px 8px rgba(0, 0, 0, 0.4);
        display: flex;
        flex-direction: row;
        justify-content: space-between;
        margin-bottom: 1rem
    }
      
    .card__left {
        display: flex;
        flex-direction: column;
        justify-content: center;
        padding-left: 10px;
    }
    .card__left h1 {
        margin-top: 15px;
        font-size: 35px;
    }
      
    .card__left p {
        color: gray;
    }
      
    .card__left span {
        font-weight: 400;
    }

    .card__right img {
        width: 225px;
    }
      
    `;
    return stykeCard;
  }
}

customElements.define("card-news", CardNews);
