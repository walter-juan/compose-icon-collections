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

public val SolidGroup.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) {
            return _chessQueen!!
        }
        _chessQueen = Builder(name = "ChessQueen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 80.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
                moveTo(5.5f, 185.0f)
                lineTo(128.0f, 384.0f)
                lineTo(71.8f, 454.3f)
                curveToRelative(-5.0f, 6.3f, -7.8f, 14.1f, -7.8f, 22.2f)
                curveToRelative(0.0f, 19.6f, 15.9f, 35.5f, 35.5f, 35.5f)
                lineToRelative(312.9f, 0.0f)
                curveToRelative(19.6f, 0.0f, 35.5f, -15.9f, 35.5f, -35.5f)
                curveToRelative(0.0f, -8.1f, -2.7f, -15.9f, -7.8f, -22.2f)
                lineTo(384.0f, 384.0f)
                lineTo(506.5f, 185.0f)
                curveToRelative(3.6f, -5.9f, 5.5f, -12.7f, 5.5f, -19.6f)
                lineToRelative(0.0f, -0.6f)
                curveToRelative(0.0f, -20.3f, -16.5f, -36.8f, -36.8f, -36.8f)
                curveToRelative(-7.3f, 0.0f, -14.4f, 2.2f, -20.4f, 6.2f)
                lineToRelative(-16.9f, 11.3f)
                curveToRelative(-12.7f, 8.5f, -29.6f, 6.8f, -40.4f, -4.0f)
                lineToRelative(-34.1f, -34.1f)
                curveTo(356.1f, 100.1f, 346.2f, 96.0f, 336.0f, 96.0f)
                reflectiveCurveToRelative(-20.1f, 4.1f, -27.3f, 11.3f)
                lineToRelative(-30.1f, 30.1f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                lineToRelative(-30.1f, -30.1f)
                curveTo(196.1f, 100.1f, 186.2f, 96.0f, 176.0f, 96.0f)
                reflectiveCurveToRelative(-20.1f, 4.1f, -27.3f, 11.3f)
                lineToRelative(-34.1f, 34.1f)
                curveToRelative(-10.8f, 10.8f, -27.7f, 12.5f, -40.4f, 4.0f)
                lineTo(57.3f, 134.2f)
                curveToRelative(-6.1f, -4.0f, -13.2f, -6.2f, -20.4f, -6.2f)
                curveToRelative(-20.3f, 0.0f, -36.8f, 16.5f, -36.8f, 36.8f)
                lineToRelative(0.0f, 0.6f)
                curveToRelative(0.0f, 6.9f, 1.9f, 13.7f, 5.5f, 19.6f)
                close()
            }
        }
        .build()
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
