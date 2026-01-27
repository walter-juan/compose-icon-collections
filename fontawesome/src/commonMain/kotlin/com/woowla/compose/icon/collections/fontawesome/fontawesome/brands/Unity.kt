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

public val BrandsGroup.Unity: ImageVector
    get() {
        if (_unity != null) {
            return _unity!!
        }
        _unity = Builder(name = "Unity", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.6f, 91.6f)
                lineToRelative(80.1f, 46.8f)
                curveToRelative(2.9f, 1.6f, 3.0f, 6.2f, 0.0f, 7.8f)
                lineToRelative(-95.2f, 55.6f)
                curveToRelative(-2.9f, 1.7f, -6.3f, 1.6f, -9.0f, 0.0f)
                lineToRelative(-95.2f, -55.6f)
                curveToRelative(-2.9f, -1.6f, -3.0f, -6.3f, 0.0f, -7.8f)
                lineToRelative(80.1f, -46.8f)
                lineToRelative(0.0f, -91.6f)
                lineToRelative(-204.4f, 119.4f)
                lineToRelative(0.0f, 238.8f)
                lineToRelative(78.4f, -45.8f)
                lineToRelative(0.0f, -93.6f)
                curveToRelative(-0.1f, -3.3f, 3.8f, -5.7f, 6.7f, -3.9f)
                lineToRelative(95.2f, 55.6f)
                curveToRelative(2.9f, 1.7f, 4.5f, 4.7f, 4.5f, 7.8f)
                lineToRelative(0.0f, 111.2f)
                curveToRelative(0.1f, 3.3f, -3.8f, 5.7f, -6.7f, 3.9f)
                lineTo(98.0f, 346.8f)
                lineTo(19.6f, 392.6f)
                lineTo(224.0f, 512.0f)
                lineTo(428.4f, 392.6f)
                lineTo(350.0f, 346.8f)
                lineTo(269.9f, 393.6f)
                curveToRelative(-2.8f, 1.7f, -6.8f, -0.5f, -6.7f, -3.9f)
                lineToRelative(0.0f, -111.2f)
                curveToRelative(0.0f, -3.3f, 1.8f, -6.3f, 4.5f, -7.8f)
                lineTo(362.9f, 215.0f)
                curveToRelative(2.8f, -1.7f, 6.8f, 0.5f, 6.7f, 3.9f)
                lineToRelative(0.0f, 93.6f)
                lineToRelative(78.4f, 45.8f)
                lineToRelative(0.0f, -238.8f)
                lineToRelative(-204.4f, -119.4f)
                lineToRelative(0.0f, 91.6f)
                close()
            }
        }
        .build()
        return _unity!!
    }

private var _unity: ImageVector? = null
