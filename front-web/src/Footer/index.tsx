import './styles.css';
import { ReactComponent as YoutubeIcon } from './youtube.svg';
import { ReactComponent as LinkedinIcon } from './linkedin.svg';
import { ReactComponent as InstagranIcon } from './instagram.svg';

function Footer() {
    return (
        <footer className="main-footer">
            <div>
                O jeito fácil de saciar a sua fome sem enfrentar filas! < br /> < br />
                <a href="http://www.youtube.com/c/DevSuperior" target="_new">
                    <YoutubeIcon />

                </a>
                
                <a href="https://www.linkedin.com/school/devsuperior" target="_new">
                    <LinkedinIcon />

                </a>               

                <a href="https://www.instagram.com/devsuperior.ig/?hl=pt" target="_new">
                    <InstagranIcon />

                </a>
            </div>

        </footer>
    )
}

export default Footer;
