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

public val SolidGroup.ChessKing: ImageVector
    get() {
        if (_chessKing != null) {
            return _chessKing!!
        }
        _chessKing = Builder(name = "ChessKing", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, -32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(153.8f, 0.0f)
                curveToRelative(21.1f, 0.0f, 38.2f, 17.1f, 38.2f, 38.2f)
                curveToRelative(0.0f, 6.4f, -1.6f, 12.7f, -4.7f, 18.3f)
                lineTo(352.0f, 384.0f)
                lineTo(408.2f, 454.3f)
                curveToRelative(5.0f, 6.3f, 7.8f, 14.1f, 7.8f, 22.2f)
                curveToRelative(0.0f, 19.6f, -15.9f, 35.5f, -35.5f, 35.5f)
                lineTo(67.5f, 512.0f)
                curveToRelative(-19.6f, 0.0f, -35.5f, -15.9f, -35.5f, -35.5f)
                curveToRelative(0.0f, -8.1f, 2.7f, -15.9f, 7.8f, -22.2f)
                lineTo(96.0f, 384.0f)
                lineTo(4.7f, 216.6f)
                curveTo(1.6f, 210.9f, 0.0f, 204.6f, 0.0f, 198.2f)
                curveTo(0.0f, 177.1f, 17.1f, 160.0f, 38.2f, 160.0f)
                lineToRelative(153.8f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
