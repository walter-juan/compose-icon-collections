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

public val BrandsGroup.Ello: ImageVector
    get() {
        if (_ello != null) {
            return _ello!!
        }
        _ello = Builder(name = "Ello", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, 496.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, -496.0f)
                close()
                moveTo(399.8f, 293.2f)
                curveTo(383.3f, 358.5f, 323.8f, 404.8f, 256.0f, 404.8f)
                reflectiveCurveTo(128.7f, 358.5f, 112.2f, 293.2f)
                curveToRelative(-1.6f, -7.4f, 2.5f, -15.7f, 9.9f, -17.4f)
                reflectiveCurveToRelative(15.7f, 2.5f, 17.4f, 9.9f)
                curveToRelative(14.0f, 52.9f, 62.0f, 90.1f, 116.6f, 90.1f)
                reflectiveCurveToRelative(102.5f, -37.2f, 116.6f, -90.1f)
                curveToRelative(1.7f, -7.4f, 9.9f, -12.4f, 17.4f, -9.9f)
                curveToRelative(7.4f, 1.7f, 12.4f, 9.9f, 9.9f, 17.4f)
                close()
            }
        }
        .build()
        return _ello!!
    }

private var _ello: ImageVector? = null
