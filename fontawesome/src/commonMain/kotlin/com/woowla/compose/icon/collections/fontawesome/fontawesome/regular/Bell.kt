package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 9.7f)
                curveTo(118.6f, 45.3f, 56.0f, 115.4f, 56.0f, 200.0f)
                lineToRelative(0.0f, 14.5f)
                curveToRelative(0.0f, 37.7f, -10.0f, 74.7f, -29.0f, 107.3f)
                lineTo(5.1f, 359.2f)
                curveTo(1.8f, 365.0f, 0.0f, 371.5f, 0.0f, 378.2f)
                curveTo(0.0f, 399.1f, 16.9f, 416.0f, 37.8f, 416.0f)
                lineToRelative(372.4f, 0.0f)
                curveToRelative(20.9f, 0.0f, 37.8f, -16.9f, 37.8f, -37.8f)
                curveToRelative(0.0f, -6.7f, -1.8f, -13.3f, -5.1f, -19.0f)
                lineTo(421.0f, 321.7f)
                curveToRelative(-19.0f, -32.6f, -29.0f, -69.6f, -29.0f, -107.3f)
                lineToRelative(0.0f, -14.5f)
                curveToRelative(0.0f, -84.6f, -62.6f, -154.7f, -144.0f, -166.3f)
                lineToRelative(0.0f, -9.7f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(392.4f, 368.0f)
                lineToRelative(-336.9f, 0.0f)
                lineToRelative(12.9f, -22.1f)
                curveTo(91.7f, 306.0f, 104.0f, 260.6f, 104.0f, 214.5f)
                lineToRelative(0.0f, -14.5f)
                curveToRelative(0.0f, -66.3f, 53.7f, -120.0f, 120.0f, -120.0f)
                reflectiveCurveToRelative(120.0f, 53.7f, 120.0f, 120.0f)
                lineToRelative(0.0f, 14.5f)
                curveToRelative(0.0f, 46.2f, 12.3f, 91.5f, 35.5f, 131.4f)
                lineTo(392.4f, 368.0f)
                close()
                moveTo(156.1f, 464.0f)
                curveToRelative(9.9f, 28.0f, 36.6f, 48.0f, 67.9f, 48.0f)
                reflectiveCurveToRelative(58.0f, -20.0f, 67.9f, -48.0f)
                lineToRelative(-135.8f, 0.0f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
