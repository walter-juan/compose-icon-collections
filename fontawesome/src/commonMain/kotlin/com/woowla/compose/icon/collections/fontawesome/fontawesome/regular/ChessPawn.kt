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

public val RegularGroup.ChessPawn: ImageVector
    get() {
        if (_chessPawn != null) {
            return _chessPawn!!
        }
        _chessPawn = Builder(name = "ChessPawn", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, -32.0f)
                curveToRelative(66.3f, 0.0f, 120.0f, 53.7f, 120.0f, 120.0f)
                curveToRelative(0.0f, 27.6f, -9.3f, 52.9f, -24.9f, 73.2f)
                curveToRelative(9.8f, 3.0f, 16.9f, 12.1f, 16.9f, 22.8f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-0.6f, 0.0f)
                lineToRelative(24.6f, 160.0f)
                lineToRelative(53.6f, 67.0f)
                curveToRelative(6.7f, 8.4f, 10.4f, 18.8f, 10.4f, 29.6f)
                curveToRelative(0.0f, 26.2f, -21.2f, 47.4f, -47.4f, 47.4f)
                lineTo(63.4f, 512.0f)
                curveToRelative(-26.2f, 0.0f, -47.4f, -21.2f, -47.4f, -47.4f)
                curveToRelative(0.0f, -10.8f, 3.7f, -21.2f, 10.4f, -29.6f)
                lineToRelative(53.6f, -67.0f)
                lineToRelative(24.6f, -160.0f)
                lineToRelative(-0.6f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                curveToRelative(0.0f, -10.8f, 7.1f, -19.8f, 16.9f, -22.8f)
                curveToRelative(-15.6f, -20.3f, -24.9f, -45.6f, -24.9f, -73.2f)
                curveToRelative(0.0f, -66.3f, 53.7f, -120.0f, 120.0f, -120.0f)
                close()
                moveTo(115.9f, 400.0f)
                lineToRelative(-51.2f, 64.0f)
                lineToRelative(254.7f, 0.0f)
                lineToRelative(-51.2f, -64.0f)
                lineToRelative(-152.2f, 0.0f)
                close()
                moveTo(152.1f, 215.3f)
                lineToRelative(-21.0f, 136.7f)
                lineToRelative(121.9f, 0.0f)
                lineToRelative(-21.0f, -136.7f)
                lineToRelative(-1.1f, -7.3f)
                lineToRelative(-77.6f, 0.0f)
                lineToRelative(-1.1f, 7.3f)
                close()
                moveTo(192.0f, 16.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 0.0f, 144.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 0.0f, -144.0f)
                close()
            }
        }
        .build()
        return _chessPawn!!
    }

private var _chessPawn: ImageVector? = null
