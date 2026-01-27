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

public val SolidGroup.ChessPawn: ImageVector
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
                curveToRelative(0.0f, 27.0f, -8.9f, 51.9f, -24.0f, 72.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-10.7f, 0.0f)
                lineToRelative(26.7f, 160.0f)
                lineToRelative(56.2f, 70.3f)
                curveToRelative(5.0f, 6.3f, 7.8f, 14.1f, 7.8f, 22.2f)
                curveToRelative(0.0f, 19.6f, -15.9f, 35.5f, -35.5f, 35.5f)
                lineTo(51.5f, 512.0f)
                curveToRelative(-19.6f, 0.0f, -35.5f, -15.9f, -35.5f, -35.5f)
                curveToRelative(0.0f, -8.1f, 2.7f, -15.9f, 7.8f, -22.2f)
                lineTo(80.0f, 384.0f)
                lineTo(106.7f, 224.0f)
                lineTo(96.0f, 224.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                curveToRelative(-15.1f, -20.1f, -24.0f, -45.0f, -24.0f, -72.0f)
                curveToRelative(0.0f, -66.3f, 53.7f, -120.0f, 120.0f, -120.0f)
                close()
            }
        }
        .build()
        return _chessPawn!!
    }

private var _chessPawn: ImageVector? = null
