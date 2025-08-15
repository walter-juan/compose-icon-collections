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

public val BrandsGroup.Yoast: ImageVector
    get() {
        if (_yoast != null) {
            return _yoast!!
        }
        _yoast = Builder(name = "Yoast", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(91.3f, 76.0f)
                lineToRelative(186.0f, 0.0f)
                lineToRelative(-7.0f, 18.9f)
                lineToRelative(-179.0f, 0.0f)
                curveToRelative(-39.7f, 0.0f, -71.9f, 31.6f, -71.9f, 70.3f)
                lineToRelative(0.0f, 205.4f)
                curveToRelative(0.0f, 35.4f, 24.9f, 70.3f, 84.0f, 70.3f)
                lineToRelative(0.0f, 19.1f)
                lineToRelative(-12.1f, 0.0f)
                curveTo(41.2f, 460.0f, 0.0f, 419.8f, 0.0f, 370.5f)
                lineTo(0.0f, 165.2f)
                curveTo(0.0f, 115.9f, 40.7f, 76.0f, 91.3f, 76.0f)
                close()
                moveTo(320.4f, 20.0f)
                lineToRelative(66.5f, 0.0f)
                curveToRelative(-143.8f, 378.1f, -145.7f, 398.9f, -184.7f, 439.3f)
                curveToRelative(-20.8f, 21.6f, -49.3f, 31.7f, -78.3f, 32.7f)
                lineToRelative(0.0f, -51.1f)
                curveToRelative(49.2f, -7.7f, 64.6f, -49.9f, 64.6f, -75.3f)
                curveToRelative(0.0f, -20.1f, 0.6f, -12.6f, -82.1f, -223.2f)
                lineToRelative(61.4f, 0.0f)
                lineToRelative(50.4f, 156.6f)
                lineToRelative(102.2f, -279.0f)
                close()
                moveTo(448.0f, 161.5f)
                lineToRelative(0.0f, 298.5f)
                lineToRelative(-214.0f, 0.0f)
                curveToRelative(6.6f, -9.6f, 10.7f, -16.3f, 12.1f, -19.4f)
                lineToRelative(182.5f, 0.0f)
                lineToRelative(0.0f, -279.1f)
                curveToRelative(0.0f, -32.5f, -17.1f, -51.9f, -48.2f, -62.9f)
                lineTo(387.1f, 81.0f)
                curveToRelative(41.7f, 13.6f, 60.9f, 43.1f, 60.9f, 80.5f)
                close()
            }
        }
        .build()
        return _yoast!!
    }

private var _yoast: ImageVector? = null
