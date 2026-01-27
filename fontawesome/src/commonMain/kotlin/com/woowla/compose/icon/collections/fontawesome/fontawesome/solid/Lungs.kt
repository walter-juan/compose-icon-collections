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

public val SolidGroup.Lungs: ImageVector
    get() {
        if (_lungs != null) {
            return _lungs!!
        }
        _lungs = Builder(name = "Lungs", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 141.9f)
                lineToRelative(-32.0f, 19.2f)
                lineToRelative(0.0f, -116.7f)
                curveToRelative(0.0f, -24.5f, -19.9f, -44.4f, -44.4f, -44.4f)
                curveToRelative(-12.5f, 0.0f, -24.4f, 5.3f, -32.8f, 14.5f)
                lineToRelative(-26.4f, 29.0f)
                curveTo(42.9f, 160.8f, 0.0f, 271.8f, 0.0f, 387.0f)
                lineToRelative(0.0f, 30.5f)
                curveToRelative(0.0f, 52.2f, 42.3f, 94.5f, 94.5f, 94.5f)
                curveToRelative(22.0f, 0.0f, 43.7f, -5.1f, 63.4f, -15.0f)
                lineToRelative(5.0f, -2.5f)
                curveToRelative(37.4f, -18.7f, 61.0f, -56.9f, 61.0f, -98.8f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(64.0f, -38.4f)
                lineToRelative(64.0f, 38.4f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 41.8f, 23.6f, 80.1f, 61.0f, 98.8f)
                lineToRelative(5.0f, 2.5f)
                curveToRelative(19.7f, 9.8f, 41.4f, 15.0f, 63.4f, 15.0f)
                curveToRelative(52.2f, 0.0f, 94.5f, -42.3f, 94.5f, -94.5f)
                lineToRelative(0.0f, -6.2f)
                curveToRelative(0.0f, -111.1f, -36.7f, -219.0f, -104.4f, -307.0f)
                lineTo(428.9f, 48.7f)
                curveToRelative(-8.1f, -10.6f, -20.7f, -16.7f, -34.0f, -16.7f)
                curveToRelative(-23.7f, 0.0f, -42.9f, 19.2f, -42.9f, 42.9f)
                lineToRelative(0.0f, 118.2f)
                lineToRelative(-32.0f, -19.2f)
                lineToRelative(0.0f, -141.9f)
                close()
            }
        }
        .build()
        return _lungs!!
    }

private var _lungs: ImageVector? = null
