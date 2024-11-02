package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Jxl: ImageVector
    get() {
        if (_jxl != null) {
            return _jxl!!
        }
        _jxl = Builder(name = "Jxl", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(412.2f, 32.0f)
                lineTo(35.8f, 32.0f)
                curveTo(16.0f, 32.0f, 0.0f, 48.0f, 0.0f, 67.8f)
                lineTo(0.0f, 444.2f)
                curveTo(0.0f, 464.0f, 16.0f, 480.0f, 35.8f, 480.0f)
                lineTo(412.2f, 480.0f)
                curveToRelative(19.8f, 0.0f, 35.8f, -16.0f, 35.8f, -35.8f)
                lineTo(448.0f, 67.8f)
                curveTo(448.0f, 48.0f, 432.0f, 32.0f, 412.2f, 32.0f)
                close()
                moveTo(378.6f, 333.7f)
                curveToRelative(0.0f, 40.2f, -32.6f, 72.8f, -72.8f, 72.8f)
                lineTo(70.2f, 406.5f)
                curveToRelative(0.0f, -40.2f, 32.6f, -72.8f, 72.8f, -72.8f)
                lineTo(378.6f, 333.7f)
                close()
                moveTo(378.6f, 219.8f)
                curveToRelative(0.0f, 40.2f, -32.6f, 72.8f, -72.8f, 72.8f)
                lineTo(70.2f, 292.6f)
                curveToRelative(0.0f, -40.2f, 32.6f, -72.8f, 72.8f, -72.8f)
                lineTo(378.6f, 219.8f)
                close()
                moveTo(378.6f, 105.9f)
                curveToRelative(0.0f, 40.2f, -32.6f, 72.8f, -72.8f, 72.8f)
                lineTo(70.2f, 178.7f)
                curveToRelative(0.0f, -40.2f, 32.6f, -72.8f, 72.8f, -72.8f)
                lineTo(378.6f, 105.9f)
                close()
            }
        }
        .build()
        return _jxl!!
    }

private var _jxl: ImageVector? = null
