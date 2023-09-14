class TituloDinamico extends HTMLElement {
  constructor() {
    super();

    const shadow = this.attachShadow({ mode: "open" });

    // base do componente

    const componentRoot = document.createElement("h1");
    componentRoot.textContent = this.getAttribute("titulo");

    // style component

    const style = document.createElement("style");
    style.textContent = `
        h1{
            color:red;
        }
        `;
    // envia para a shodow

    shadow.appendChild(componentRoot);
    shadow.appendChild(style);
  }
}

customElements.define("titulo-dinamico", TituloDinamico);
