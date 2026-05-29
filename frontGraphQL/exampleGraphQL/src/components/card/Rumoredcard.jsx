// RUMORED — name, studio, description only
export default function RumoredCard({ game }) {
    return (
        <div style={styles.card}>
            <div style={{ ...styles.strip, background: "#ef4444" }} />

            <div style={styles.badge}> RUMORED</div>

            <h3 style={{ ...styles.title, color: "#ef4444" }}>{game.title}</h3>

            <p style={styles.meta}>{game.studio}</p>

            <p style={styles.desc}>{game.description}</p>

            {/* everything else redacted */}
            <div style={styles.redactedBlock}>
                <div style={styles.redactedLine} />
                <div style={{ ...styles.redactedLine, width: "60%" }} />
                <div style={{ ...styles.redactedLine, width: "80%" }} />
            </div>

            <p style={styles.footnote}>* No official confirmation</p>
        </div>
    );
}

const styles = {
    card: {
        background: "#0f0000",
        border: "1px solid #ef444455",
        borderRadius: "12px",
        padding: "20px",
        width: "260px",
        boxShadow: "0 0 18px #ef444422",
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
        background: "#ef444422",
        color: "#ef4444",
        border: "1px solid #ef444444",
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
        margin: "0 0 10px", fontSize: "11px", color: "#666",
    },
    desc: {
        margin: "0 0 14px", fontSize: "12px", color: "#bbb", lineHeight: 1.5,
    },
    redactedBlock: {
        display: "flex", flexDirection: "column", gap: "6px", marginBottom: "12px",
    },
    redactedLine: {
        height: "10px", background: "#ef444433", borderRadius: "3px", width: "100%",
    },
    footnote: {
        fontSize: "10px", color: "#ef444466", margin: 0, fontStyle: "italic",
    },
};