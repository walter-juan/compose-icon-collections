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

public val SolidGroup.Number2: ImageVector
    get() {
        if (_number2 != null) {
            return _number2!!
        }
        _number2 = Builder(name = "Number2", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(171.0f, 0.0f)
                curveToRelative(60.2f, 0.0f, 109.0f, 48.8f, 109.0f, 109.0f)
                curveToRelative(0.0f, 43.8f, -26.2f, 83.3f, -66.4f, 100.4f)
                lineToRelative(-139.1f, 59.0f)
                curveTo(119.0f, 315.4f, 96.0f, 350.2f, 96.0f, 388.7f)
                lineToRelative(0.0f, 27.3f)
                lineToRelative(224.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -59.3f)
                curveToRelative(0.0f, -64.2f, 38.4f, -122.2f, 97.5f, -147.3f)
                lineToRelative(139.1f, -59.0f)
                curveToRelative(16.6f, -7.1f, 27.4f, -23.4f, 27.4f, -41.4f)
                curveToRelative(0.0f, -24.9f, -20.2f, -45.0f, -45.0f, -45.0f)
                lineTo(80.0f, 96.0f)
                curveTo(62.3f, 96.0f, 48.0f, 81.7f, 48.0f, 64.0f)
                close()
            }
        }
        .build()
        return _number2!!
    }

private var _number2: ImageVector? = null
