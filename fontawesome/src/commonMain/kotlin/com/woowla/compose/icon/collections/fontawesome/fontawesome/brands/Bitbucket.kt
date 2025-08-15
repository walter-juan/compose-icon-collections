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

public val BrandsGroup.Bitbucket: ImageVector
    get() {
        if (_bitbucket != null) {
            return _bitbucket!!
        }
        _bitbucket = Builder(name = "Bitbucket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.2f, 32.0f)
                curveToRelative(-2.1f, 0.0f, -4.2f, 0.4f, -6.1f, 1.1f)
                reflectiveCurveToRelative(-3.7f, 1.9f, -5.2f, 3.4f)
                reflectiveCurveToRelative(-2.7f, 3.2f, -3.5f, 5.1f)
                reflectiveCurveToRelative(-1.3f, 4.0f, -1.3f, 6.1f)
                curveToRelative(0.0f, 0.9f, 0.1f, 1.9f, 0.2f, 2.8f)
                lineTo(74.1f, 462.7f)
                curveToRelative(0.8f, 5.1f, 3.4f, 9.7f, 7.3f, 13.0f)
                reflectiveCurveToRelative(8.8f, 5.2f, 14.0f, 5.2f)
                lineToRelative(325.7f, 0.0f)
                curveToRelative(3.8f, 0.1f, 7.5f, -1.3f, 10.5f, -3.7f)
                reflectiveCurveToRelative(4.9f, -5.9f, 5.5f, -9.7f)
                lineTo(505.0f, 50.7f)
                curveToRelative(0.7f, -4.2f, -0.3f, -8.4f, -2.8f, -11.9f)
                reflectiveCurveToRelative(-6.2f, -5.7f, -10.4f, -6.4f)
                curveToRelative(-0.9f, -0.1f, -1.9f, -0.2f, -2.8f, -0.2f)
                lineTo(22.2f, 32.0f)
                close()
                moveTo(308.1f, 329.8f)
                lineToRelative(-104.0f, 0.0f)
                lineToRelative(-28.1f, -147.0f)
                lineToRelative(157.3f, 0.0f)
                lineToRelative(-25.2f, 147.0f)
                close()
            }
        }
        .build()
        return _bitbucket!!
    }

private var _bitbucket: ImageVector? = null
