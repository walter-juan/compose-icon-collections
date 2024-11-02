package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ArrowPath: ImageVector
    get() {
        if (_arrowPath != null) {
            return _arrowPath!!
        }
        _arrowPath = Builder(name = "ArrowPath", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.755f, 10.059f)
                curveTo(5.827f, 6.058f, 9.94f, 3.684f, 13.941f, 4.756f)
                curveTo(15.262f, 5.11f, 16.403f, 5.794f, 17.303f, 6.695f)
                lineTo(19.206f, 8.598f)
                horizontalLineTo(16.023f)
                curveTo(15.608f, 8.598f, 15.273f, 8.934f, 15.273f, 9.348f)
                curveTo(15.273f, 9.763f, 15.608f, 10.098f, 16.023f, 10.098f)
                horizontalLineTo(21.015f)
                curveTo(21.214f, 10.098f, 21.405f, 10.019f, 21.546f, 9.879f)
                curveTo(21.686f, 9.738f, 21.765f, 9.547f, 21.765f, 9.348f)
                verticalLineTo(4.356f)
                curveTo(21.765f, 3.942f, 21.43f, 3.606f, 21.015f, 3.606f)
                curveTo(20.601f, 3.606f, 20.265f, 3.942f, 20.265f, 4.356f)
                verticalLineTo(7.536f)
                lineTo(18.365f, 5.636f)
                curveTo(17.284f, 4.553f, 15.911f, 3.731f, 14.329f, 3.307f)
                curveTo(9.528f, 2.02f, 4.593f, 4.869f, 3.306f, 9.671f)
                curveTo(3.199f, 10.071f, 3.437f, 10.482f, 3.837f, 10.589f)
                curveTo(4.237f, 10.696f, 4.648f, 10.459f, 4.755f, 10.059f)
                close()
                moveTo(20.163f, 13.411f)
                curveTo(19.763f, 13.304f, 19.351f, 13.541f, 19.244f, 13.941f)
                curveTo(18.172f, 17.942f, 14.059f, 20.316f, 10.059f, 19.244f)
                curveTo(8.737f, 18.89f, 7.596f, 18.206f, 6.696f, 17.305f)
                lineTo(4.794f, 15.402f)
                horizontalLineTo(7.977f)
                curveTo(8.391f, 15.402f, 8.727f, 15.066f, 8.727f, 14.652f)
                curveTo(8.727f, 14.238f, 8.391f, 13.902f, 7.977f, 13.902f)
                lineTo(2.984f, 13.902f)
                curveTo(2.57f, 13.902f, 2.234f, 14.238f, 2.234f, 14.652f)
                verticalLineTo(19.644f)
                curveTo(2.234f, 20.059f, 2.57f, 20.394f, 2.984f, 20.394f)
                curveTo(3.398f, 20.394f, 3.734f, 20.059f, 3.734f, 19.644f)
                verticalLineTo(16.463f)
                lineTo(5.634f, 18.365f)
                curveTo(6.715f, 19.448f, 8.088f, 20.269f, 9.67f, 20.693f)
                curveTo(14.471f, 21.98f, 19.406f, 19.131f, 20.693f, 14.329f)
                curveTo(20.8f, 13.929f, 20.563f, 13.518f, 20.163f, 13.411f)
                close()
            }
        }
        .build()
        return _arrowPath!!
    }

private var _arrowPath: ImageVector? = null
