// ANNOUNCED — title, genre, description, releaseYear, studio
export default function AnnouncedCard({ game }) {
    return (
        <div style={styles.card}>
            <div style={{ ...styles.strip, background: "#f59e0b" }} />

            <div style={styles.badge}> ANNOUNCED</div>

            <h3 style={{ ...styles.title, color: "#f59e0b" }}>{game.title}</h3>

            <p style={styles.meta}>
                {game.studio} · Expected {game.releaseYear}
            </p>

            <p style={styles.genre}>{game.genre}</p>

            <p style={styles.desc}>{game.description}</p>

        </div>
    );
}

const styles = {
    card: {
        background: "#0f0d00",
        border: "1px solid #f59e0b55",
        borderRadius: "12px",
        padding: "20px",
        width: "260px",
        boxShadow: "0 0 18px #f59e0b22",
        fontFamily: "'Courier New', monospace",
        color: "#f0f0f0",
        position: "relative",
        overflow: "hidden",
    },
    strip: {
        position: "absolute", top: 0, left: 0, right: 0, height: "3px",
    },
    badge: {
        display: "inline-block",
        background: "#f59e0b22",
        color: "#f59e0b",
        border: "1px solid #f59e0b44",
        borderRadius: "4px",
        padding: "2px 8px",
        fontSize: "10px",
        fontWeight: "bold",
        letterSpacing: "1px",
        marginBottom: "10px",
    },
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
    redacted: {
        display: "flex", gap: "8px",
        fontSize: "13px", color: "#f59e0b44",
        marginTop: "8px",
    },
};