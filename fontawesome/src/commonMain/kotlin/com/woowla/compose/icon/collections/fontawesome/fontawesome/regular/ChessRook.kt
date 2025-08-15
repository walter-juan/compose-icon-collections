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

public val RegularGroup.ChessRook: ImageVector
    get() {
        if (_chessRook != null) {
            return _chessRook!!
        }
        _chessRook = Builder(name = "ChessRook", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 138.7f)
                curveToRelative(0.0f, 13.8f, -4.5f, 27.3f, -12.8f, 38.4f)
                lineToRelative(-35.2f, 46.9f)
                lineToRelative(0.0f, 112.0f)
                lineToRelative(40.8f, 68.1f)
                curveToRelative(4.7f, 7.8f, 7.2f, 16.7f, 7.2f, 25.8f)
                curveToRelative(0.0f, 27.7f, -22.4f, 50.1f, -50.1f, 50.1f)
                lineTo(50.1f, 512.0f)
                curveToRelative(-27.7f, 0.0f, -50.1f, -22.4f, -50.1f, -50.1f)
                curveToRelative(0.0f, -9.1f, 2.5f, -18.0f, 7.2f, -25.8f)
                lineTo(48.0f, 368.0f)
                lineTo(48.0f, 256.0f)
                lineTo(12.8f, 209.1f)
                curveTo(4.5f, 198.0f, 0.0f, 184.5f, 0.0f, 170.7f)
                lineTo(0.0f, 32.0f)
                curveTo(0.0f, 14.3f, 14.3f, 0.0f, 32.0f, 0.0f)
                lineTo(352.0f, 0.0f)
                close()
                moveTo(48.3f, 460.8f)
                lineToRelative(-0.3f, 1.1f)
                curveToRelative(0.0f, 1.2f, 1.0f, 2.1f, 2.1f, 2.1f)
                lineToRelative(283.8f, 0.0f)
                curveToRelative(1.2f, 0.0f, 2.1f, -1.0f, 2.1f, -2.1f)
                lineToRelative(-0.3f, -1.1f)
                lineToRelative(-36.5f, -60.8f)
                lineToRelative(-214.4f, 0.0f)
                lineToRelative(-36.5f, 60.8f)
                close()
                moveTo(48.0f, 170.7f)
                curveToRelative(0.0f, 2.6f, 0.6f, 5.1f, 1.8f, 7.4f)
                lineToRelative(1.4f, 2.2f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(35.2f, 46.9f)
                lineToRelative(9.6f, 12.8f)
                lineToRelative(0.0f, 112.0f)
                lineToRelative(192.0f, 0.0f)
                lineToRelative(0.0f, -112.0f)
                lineToRelative(9.6f, -12.8f)
                lineToRelative(35.2f, -46.9f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(1.4f, -2.2f)
                curveToRelative(1.2f, -2.3f, 1.8f, -4.8f, 1.8f, -7.4f)
                lineToRelative(0.0f, -122.7f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 24.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -24.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 24.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -24.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 122.7f)
                close()
            }
        }
        .build()
        return _chessRook!!
    }

private var _chessRook: ImageVector? = null
