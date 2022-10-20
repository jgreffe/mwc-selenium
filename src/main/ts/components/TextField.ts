import {html, LitElement} from "lit";
import {customElement, property} from 'lit/decorators';

@customElement('custom-text-field')
export class TextField extends LitElement {
    render() {
        return html`
            <mwc-textfield
                    outlined
                    id="textfield-shadow"
                    label="Something here"
            ></mwc-textfield>
        `
    }
}