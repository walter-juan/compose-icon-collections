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

public val SolidGroup.ChessRook: ImageVector
    get() {
        if (_chessRook != null) {
            return _chessRook!!
        }
        _chessRook = Builder(name = "ChessRook", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                lineTo(0.0f, 133.5f)
                curveToRelative(0.0f, 17.0f, 6.7f, 33.3f, 18.7f, 45.3f)
                lineTo(64.0f, 224.0f)
                lineTo(64.0f, 384.0f)
                lineTo(7.8f, 454.3f)
                curveTo(2.7f, 460.6f, 0.0f, 468.4f, 0.0f, 476.5f)
                curveTo(0.0f, 496.1f, 15.9f, 512.0f, 35.5f, 512.0f)
                lineToRelative(312.9f, 0.0f)
                curveToRelative(19.6f, 0.0f, 35.5f, -15.9f, 35.5f, -35.5f)
                curveToRelative(0.0f, -8.1f, -2.7f, -15.9f, -7.8f, -22.2f)
                lineToRelative(-56.2f, -70.3f)
                lineToRelative(0.0f, -160.0f)
                lineToRelative(45.3f, -45.3f)
                curveToRelative(12.0f, -12.0f, 18.7f, -28.3f, 18.7f, -45.3f)
                lineTo(384.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(320.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(176.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveTo(96.0f, 14.3f, 81.7f, 0.0f, 64.0f, 0.0f)
                lineTo(32.0f, 0.0f)
                curveTo(14.3f, 0.0f, 0.0f, 14.3f, 0.0f, 32.0f)
                close()
            }
        }
        .build()
        return _chessRook!!
    }

private var _chessRook: ImageVector? = null
