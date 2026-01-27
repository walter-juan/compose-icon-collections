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

public val BrandsGroup.Stackpath: ImageVector
    get() {
        if (_stackpath != null) {
            return _stackpath!!
        }
        _stackpath = Builder(name = "Stackpath", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.6f, 232.4f)
                curveToRelative(0.0f, 8.5f, -4.3f, 20.5f, -21.3f, 20.5f)
                lineToRelative(-19.6f, 0.0f)
                lineToRelative(0.0f, -41.5f)
                lineToRelative(19.6f, 0.0f)
                curveToRelative(17.1f, 0.0f, 21.3f, 12.4f, 21.3f, 21.0f)
                close()
                moveTo(448.0f, 32.0f)
                lineToRelative(0.0f, 448.0f)
                lineToRelative(-448.0f, 0.0f)
                lineToRelative(0.0f, -448.0f)
                lineToRelative(448.0f, 0.0f)
                close()
                moveTo(151.3f, 287.8f)
                curveToRelative(0.0f, -21.2f, -12.1f, -34.5f, -46.7f, -44.8f)
                curveToRelative(-20.6f, -7.4f, -26.0f, -10.9f, -26.0f, -18.6f)
                reflectiveCurveToRelative(7.0f, -14.6f, 20.4f, -14.6f)
                curveToRelative(14.1f, 0.0f, 20.8f, 8.4f, 20.8f, 18.4f)
                lineToRelative(30.7f, 0.0f)
                lineToRelative(0.2f, -0.6f)
                curveToRelative(0.5f, -19.6f, -15.1f, -41.6f, -51.1f, -41.6f)
                curveToRelative(-23.4f, 0.0f, -52.6f, 10.8f, -52.6f, 38.3f)
                curveToRelative(0.0f, 19.4f, 9.2f, 31.3f, 50.7f, 44.4f)
                curveToRelative(17.3f, 6.2f, 21.9f, 10.4f, 21.9f, 19.5f)
                curveToRelative(0.0f, 15.2f, -19.1f, 14.2f, -19.5f, 14.2f)
                curveToRelative(-20.4f, 0.0f, -25.7f, -9.1f, -25.7f, -21.9f)
                lineToRelative(-30.8f, 0.0f)
                lineToRelative(-0.2f, 0.6f)
                curveToRelative(-0.7f, 31.3f, 28.4f, 45.2f, 56.6f, 45.2f)
                curveToRelative(30.0f, 0.0f, 51.1f, -13.6f, 51.1f, -38.3f)
                close()
                moveTo(276.7f, 232.2f)
                curveToRelative(0.0f, -25.3f, -18.4f, -45.5f, -53.4f, -45.5f)
                lineToRelative(-51.8f, 0.0f)
                lineToRelative(0.0f, 138.2f)
                lineToRelative(32.2f, 0.0f)
                lineToRelative(0.0f, -47.4f)
                lineToRelative(19.6f, 0.0f)
                curveToRelative(30.3f, 0.0f, 53.4f, -16.0f, 53.4f, -45.4f)
                close()
                moveTo(297.9f, 325.0f)
                lineToRelative(49.1f, -138.2f)
                lineToRelative(-31.1f, 0.0f)
                lineToRelative(-47.9f, 138.2f)
                lineToRelative(29.9f, 0.0f)
                close()
                moveTo(404.5f, 186.8f)
                lineToRelative(-31.1f, 0.0f)
                lineToRelative(-47.9f, 138.2f)
                lineToRelative(29.9f, 0.0f)
                lineToRelative(49.1f, -138.2f)
                close()
            }
        }
        .build()
        return _stackpath!!
    }

private var _stackpath: ImageVector? = null
