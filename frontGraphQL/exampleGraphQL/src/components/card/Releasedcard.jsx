// RELEASED — full data card
export default function ReleasedCard({ game }) {
    return (
        <div style={styles.card}>
            <div style={{ ...styles.strip, background: "#22c55e" }} />

            <div style={styles.badge("#22c55e")}>RELEASED</div>

            <h3 style={{ ...styles.title, color: "#22c55e" }}>{game.title}</h3>

            <p style={styles.meta}>
                {game.studio} · {game.releaseYear}
            </p>

            <p style={styles.genre}>{game.genre}</p>

            <p style={styles.desc}>{game.description}</p>

            <div style={styles.footer}>
                <span style={styles.rating}> {game.ageRating}</span>
                <span style={{ ...styles.price, color: "#22c55e" }}>
          {game.price === 0 ? "FREE" : `$${game.price?.toFixed(2)}`}
        </span>
            </div>
        </div>
    );
}

const styles = {
    card: {
        background: "#0a0f0a",
        border: "1px solid #22c55e55",
        borderRadius: "12px",
        padding: "20px",
        width: "260px",
        boxShadow: "0 0 18px #22c55e22",
        fontFamily: "'Courier New', monospace",
        color: "#f0f0f0",
        position: "relative",
        overflow: "hidden",
        transition: "transform 0.2s, box-shadow 0.2s",
        cursor: "default",
    },
    strip: {
        position: "absolute", top: 0, left: 0, right: 0, height: "3px",
    },
    badge: (color) => ({
        display: "inline-block",
        background: color + "22",
        color: color,
        border: `1px solid ${color}44`,
        borderRadius: "4px",
        padding: "2px 8px",
        fontSize: "10px",
        fontWeight: "bold",
        letterSpacing: "1px",
        marginBottom: "10px",
    }),
    title: {
        margin: "0 0 6px", fontSize: "15px", fontWeight: "bold",
    },
    meta: {
        margin: "0 0 4px", fontSize: "11px", color: "#666",
    },
    genre: {
        margin: "0 0 10px", fontSize: "11px", color: "#888",
        textTransform: "uppercase", letterSpacing: "1px",
    },
    desc: {
        margin: "0 0 14px", fontSize: "12px", color: "#bbb", lineHeight: 1.5,
        display: "-webkit-box",
        WebkitLineClamp: 4,
        WebkitBoxOrient: "vertical",
        overflow: "hidden",
    },
    footer: {
        display: "flex", justifyContent: "space-between",
        fontSize: "11px", color: "#666",
    },
    rating: { color: "#888" },
    price: { fontWeight: "bold", fontSize: "13px" },
};