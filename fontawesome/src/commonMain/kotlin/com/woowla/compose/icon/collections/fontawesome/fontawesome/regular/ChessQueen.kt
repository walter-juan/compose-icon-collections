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

public val RegularGroup.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) {
            return _chessQueen!!
        }
        _chessQueen = Builder(name = "ChessQueen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(325.3f, 90.8f)
                curveToRelative(9.1f, -4.8f, 20.6f, -3.3f, 28.2f, 4.3f)
                lineToRelative(39.8f, 39.8f)
                lineToRelative(3.7f, 3.3f)
                curveToRelative(9.1f, 7.1f, 20.9f, 10.0f, 32.4f, 7.7f)
                lineToRelative(46.4f, -9.3f)
                lineToRelative(3.5f, -0.4f)
                curveToRelative(8.0f, -0.4f, 15.8f, 3.2f, 20.6f, 9.8f)
                curveToRelative(5.5f, 7.6f, 6.1f, 17.6f, 1.6f, 25.8f)
                lineToRelative(-112.6f, 202.6f)
                lineToRelative(51.5f, 70.9f)
                lineToRelative(1.8f, 2.7f)
                curveToRelative(4.0f, 6.6f, 6.2f, 14.2f, 6.2f, 22.0f)
                curveToRelative(0.0f, 23.3f, -18.9f, 42.1f, -42.1f, 42.1f)
                lineToRelative(-299.8f, 0.0f)
                curveToRelative(-21.8f, 0.0f, -39.8f, -16.6f, -41.9f, -37.8f)
                lineToRelative(-0.2f, -4.3f)
                lineToRelative(0.1f, -3.3f)
                curveToRelative(0.6f, -7.7f, 3.4f, -15.1f, 7.9f, -21.4f)
                lineToRelative(51.5f, -70.9f)
                lineToRelative(-112.5f, -202.6f)
                curveToRelative(-4.5f, -8.2f, -3.9f, -18.3f, 1.6f, -25.8f)
                reflectiveCurveToRelative(14.9f, -11.2f, 24.1f, -9.4f)
                lineToRelative(46.4f, 9.3f)
                curveToRelative(13.1f, 2.6f, 26.7f, -1.5f, 36.1f, -10.9f)
                lineTo(159.5f, 95.0f)
                lineTo(163.0f, 92.2f)
                curveToRelative(8.6f, -5.8f, 20.1f, -5.6f, 28.5f, 1.1f)
                lineToRelative(40.0f, 32.0f)
                lineToRelative(2.8f, 2.1f)
                curveToRelative(14.4f, 9.6f, 33.5f, 8.9f, 47.2f, -2.1f)
                lineToRelative(40.0f, -32.0f)
                lineToRelative(3.8f, -2.5f)
                close()
                moveTo(164.7f, 400.0f)
                lineToRelative(-46.6f, 64.0f)
                lineToRelative(276.7f, 0.0f)
                lineToRelative(-46.6f, -64.0f)
                lineToRelative(-183.6f, 0.0f)
                close()
                moveTo(311.5f, 162.8f)
                curveToRelative(-30.1f, 24.1f, -72.1f, 25.6f, -103.8f, 4.5f)
                lineToRelative(-6.2f, -4.5f)
                lineToRelative(-23.3f, -18.6f)
                lineToRelative(-24.6f, 24.6f)
                curveToRelative(-19.8f, 19.8f, -47.7f, 28.9f, -75.1f, 24.8f)
                lineToRelative(88.1f, 158.5f)
                lineToRelative(179.8f, 0.0f)
                lineToRelative(88.0f, -158.5f)
                curveToRelative(-25.7f, 3.8f, -51.7f, -3.9f, -71.1f, -21.0f)
                lineToRelative(-4.0f, -3.7f)
                lineToRelative(-24.6f, -24.6f)
                lineToRelative(-23.2f, 18.6f)
                close()
                moveTo(256.5f, 72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, -80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, 80.0f)
                close()
            }
        }
        .build()
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
