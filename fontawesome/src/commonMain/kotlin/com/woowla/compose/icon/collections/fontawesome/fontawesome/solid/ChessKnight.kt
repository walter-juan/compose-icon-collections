package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) {
            return _chessKnight!!
        }
        _chessKnight = Builder(name = "ChessKnight", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, -32.0f)
                curveToRelative(106.0f, 0.0f, 192.0f, 86.0f, 192.0f, 192.0f)
                lineToRelative(0.0f, 133.5f)
                curveToRelative(0.0f, 17.0f, -6.8f, 33.2f, -18.7f, 45.2f)
                lineTo(320.0f, 384.0f)
                lineTo(370.8f, 434.7f)
                curveToRelative(8.5f, 8.5f, 13.2f, 20.0f, 13.2f, 32.0f)
                curveToRelative(0.0f, 25.0f, -20.3f, 45.2f, -45.2f, 45.3f)
                lineTo(45.3f, 512.0f)
                curveToRelative(-25.0f, 0.0f, -45.2f, -20.3f, -45.2f, -45.3f)
                curveToRelative(0.0f, -12.0f, 4.8f, -23.5f, 13.2f, -32.0f)
                lineTo(64.0f, 384.0f)
                lineTo(64.0f, 349.4f)
                curveToRelative(0.0f, -18.7f, 8.2f, -36.4f, 22.3f, -48.6f)
                lineToRelative(89.7f, -76.8f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(-12.1f, 12.1f)
                curveToRelative(-12.7f, 12.7f, -30.0f, 19.9f, -48.0f, 19.9f)
                curveToRelative(-37.5f, 0.0f, -67.9f, -30.4f, -67.9f, -67.9f)
                lineToRelative(0.0f, -8.7f)
                curveToRelative(0.0f, -22.8f, 8.2f, -44.9f, 23.1f, -62.3f)
                lineTo(96.0f, 32.0f)
                lineTo(96.0f, 0.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(64.0f, 0.0f)
                close()
                moveTo(160.0f, 72.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
