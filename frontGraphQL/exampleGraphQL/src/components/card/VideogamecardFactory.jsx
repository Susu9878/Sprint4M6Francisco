import ReleasedCard from "./ReleasedCard";
import AnnouncedCard from "./AnnouncedCard";
import RumoredCard from "./RumoredCard";

// FACTORY METHOD
// depende de game status
export default function VideogameCardFactory({ game }) {
    const status = game.status?.toUpperCase();

    switch (status) {
        case "RELEASED":
            return <ReleasedCard game={game} />;
        case "ANNOUNCED":
            return <AnnouncedCard game={game} />;
        case "RUMORED":
            return <RumoredCard game={game} />;
        default:
            return <ReleasedCard game={game} />;
    }
}