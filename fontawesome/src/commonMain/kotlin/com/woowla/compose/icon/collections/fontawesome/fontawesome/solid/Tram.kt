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

public val SolidGroup.Tram: ImageVector
    get() {
        if (_tram != null) {
            return _tram!!
        }
        _tram = Builder(name = "Tram", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, -32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(160.0f, 24.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(32.0f, 288.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(136.0f, 0.0f)
                lineToRelative(0.0f, -96.2f)
                lineToRelative(-193.4f, 55.3f)
                curveToRelative(-12.7f, 3.6f, -26.0f, -3.7f, -29.7f, -16.5f)
                reflectiveCurveToRelative(3.7f, -26.0f, 16.5f, -29.7f)
                lineToRelative(224.0f, -64.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(224.0f, -64.0f)
                curveToRelative(12.7f, -3.6f, 26.0f, 3.7f, 29.7f, 16.5f)
                reflectiveCurveToRelative(-3.7f, 26.0f, -16.5f, 29.7f)
                lineToRelative(-206.6f, 59.0f)
                lineToRelative(0.0f, 109.9f)
                lineToRelative(136.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 160.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(96.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -160.0f)
                close()
                moveTo(112.0f, 288.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(56.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(-56.0f, 0.0f)
                close()
                moveTo(296.0f, 384.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(80.0f, 0.0f)
                close()
                moveTo(344.0f, 384.0f)
                lineToRelative(56.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineToRelative(-56.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                close()
            }
        }
        .build()
        return _tram!!
    }

private var _tram: ImageVector? = null
