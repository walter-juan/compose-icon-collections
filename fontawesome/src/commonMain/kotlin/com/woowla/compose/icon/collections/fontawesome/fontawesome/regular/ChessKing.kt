package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.ChessKing: ImageVector
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
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 40.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, 80.0f)
                lineToRelative(161.8f, 0.0f)
                curveToRelative(21.1f, 0.0f, 38.2f, 17.1f, 38.2f, 38.2f)
                curveToRelative(0.0f, 6.4f, -1.6f, 12.7f, -4.7f, 18.3f)
                lineTo(357.2f, 374.5f)
                lineTo(405.6f, 435.0f)
                curveToRelative(6.7f, 8.4f, 10.4f, 18.8f, 10.4f, 29.6f)
                curveToRelative(0.0f, 26.2f, -21.2f, 47.4f, -47.4f, 47.4f)
                lineTo(79.4f, 512.0f)
                curveToRelative(-26.2f, 0.0f, -47.4f, -21.2f, -47.4f, -47.4f)
                curveToRelative(0.0f, -10.8f, 3.7f, -21.2f, 10.4f, -29.6f)
                lineTo(90.8f, 374.5f)
                lineTo(4.7f, 216.6f)
                curveTo(1.6f, 210.9f, 0.0f, 204.6f, 0.0f, 198.2f)
                curveTo(0.0f, 177.1f, 17.1f, 160.0f, 38.2f, 160.0f)
                lineToRelative(161.8f, 0.0f)
                lineToRelative(0.0f, -80.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, -40.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(131.8f, 400.0f)
                lineToRelative(-3.6f, 4.4f)
                lineToRelative(-47.6f, 59.6f)
                lineToRelative(286.6f, 0.0f)
                lineToRelative(-47.6f, -59.6f)
                lineToRelative(-3.6f, -4.4f)
                lineToRelative(-184.3f, 0.0f)
                close()
                moveTo(132.9f, 351.5f)
                lineToRelative(0.3f, 0.5f)
                lineToRelative(181.6f, 0.0f)
                lineToRelative(0.3f, -0.5f)
                lineToRelative(78.3f, -143.5f)
                lineToRelative(-338.7f, 0.0f)
                lineToRelative(78.3f, 143.5f)
                close()
            }
        }
        .build()
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
