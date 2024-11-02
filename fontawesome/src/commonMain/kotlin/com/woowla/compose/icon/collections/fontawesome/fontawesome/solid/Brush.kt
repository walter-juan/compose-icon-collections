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

public val SolidGroup.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush = Builder(name = "Brush", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.4f, 6.0f)
                curveToRelative(-1.5f, -3.6f, -5.0f, -6.0f, -8.9f, -6.0f)
                lineToRelative(-19.0f, 0.0f)
                curveToRelative(-3.9f, 0.0f, -7.5f, 2.4f, -8.9f, 6.0f)
                lineTo(104.9f, 57.7f)
                curveToRelative(-3.2f, 8.0f, -14.6f, 8.0f, -17.8f, 0.0f)
                lineTo(66.4f, 6.0f)
                curveToRelative(-1.5f, -3.6f, -5.0f, -6.0f, -8.9f, -6.0f)
                lineTo(48.0f, 0.0f)
                curveTo(21.5f, 0.0f, 0.0f, 21.5f, 0.0f, 48.0f)
                lineTo(0.0f, 224.0f)
                lineToRelative(0.0f, 22.4f)
                lineTo(0.0f, 256.0f)
                lineToRelative(9.6f, 0.0f)
                lineToRelative(364.8f, 0.0f)
                lineToRelative(9.6f, 0.0f)
                lineToRelative(0.0f, -9.6f)
                lineToRelative(0.0f, -22.4f)
                lineToRelative(0.0f, -176.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(230.5f, 0.0f)
                curveToRelative(-3.9f, 0.0f, -7.5f, 2.4f, -8.9f, 6.0f)
                lineTo(200.9f, 57.7f)
                curveToRelative(-3.2f, 8.0f, -14.6f, 8.0f, -17.8f, 0.0f)
                lineTo(162.4f, 6.0f)
                close()
                moveTo(0.0f, 288.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -32.0f)
                lineTo(0.0f, 288.0f)
                close()
                moveTo(192.0f, 432.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, -32.0f)
                close()
            }
        }
        .build()
        return _brush!!
    }

private var _brush: ImageVector? = null
