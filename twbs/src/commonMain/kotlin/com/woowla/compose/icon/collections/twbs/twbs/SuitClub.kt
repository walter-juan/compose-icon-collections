package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.SuitClub: ImageVector
    get() {
        if (_suitClub != null) {
            return _suitClub!!
        }
        _suitClub = Builder(name = "SuitClub", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.25f, 3.25f)
                curveToRelative(0.0f, 0.186f, 0.0f, 0.29f, 0.016f, 0.41f)
                curveToRelative(0.014f, 0.12f, 0.045f, 0.27f, 0.12f, 0.527f)
                lineToRelative(0.19f, 0.665f)
                lineToRelative(-0.692f, -0.028f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, 2.357f, 5.334f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.844f, 0.518f)
                lineToRelative(-0.003f, 0.005f)
                lineToRelative(-0.006f, 0.015f)
                lineToRelative(-0.024f, 0.055f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -0.438f, 0.92f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -1.266f, 2.197f)
                curveToRelative(-0.013f, 0.018f, -0.02f, 0.05f, 0.001f, 0.09f)
                quadToRelative(0.016f, 0.029f, 0.03f, 0.036f)
                arcTo(0.04f, 0.04f, 0.0f, false, false, 5.9f, 15.0f)
                horizontalLineToRelative(4.2f)
                quadToRelative(0.014f, 0.0f, 0.022f, -0.006f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, 0.029f, -0.035f)
                curveToRelative(0.02f, -0.04f, 0.014f, -0.073f, 0.001f, -0.091f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, true, -1.704f, -3.117f)
                lineToRelative(-0.024f, -0.054f)
                lineToRelative(-0.006f, -0.015f)
                lineToRelative(-0.002f, -0.004f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.838f, -0.524f)
                curveToRelative(0.601f, 0.7f, 1.516f, 1.168f, 2.496f, 1.168f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, -0.139f, -6.498f)
                lineToRelative(-0.699f, 0.03f)
                lineToRelative(0.199f, -0.671f)
                curveToRelative(0.14f, -0.47f, 0.14f, -0.745f, 0.139f, -0.927f)
                verticalLineTo(4.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 8.0f, 1.0f)
                moveToRelative(2.207f, 12.024f)
                curveToRelative(0.225f, 0.405f, 0.487f, 0.848f, 0.78f, 1.294f)
                curveTo(11.437f, 15.0f, 10.975f, 16.0f, 10.1f, 16.0f)
                horizontalLineTo(5.9f)
                curveToRelative(-0.876f, 0.0f, -1.338f, -1.0f, -0.887f, -1.683f)
                curveToRelative(0.291f, -0.442f, 0.552f, -0.88f, 0.776f, -1.283f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, true, -2.007f, -8.187f)
                lineToRelative(-0.009f, -0.064f)
                curveToRelative(-0.023f, -0.187f, -0.023f, -0.348f, -0.023f, -0.52f)
                verticalLineTo(4.25f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, 8.5f, 0.0f)
                curveToRelative(0.0f, 0.14f, 0.0f, 0.333f, -0.04f, 0.596f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, -0.46f, 8.476f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -1.543f, -0.298f)
            }
        }
        .build()
        return _suitClub!!
    }

private var _suitClub: ImageVector? = null
