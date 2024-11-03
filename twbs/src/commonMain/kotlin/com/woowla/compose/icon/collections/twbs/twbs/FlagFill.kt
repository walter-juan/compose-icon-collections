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

public val Twbs.FlagFill: ImageVector
    get() {
        if (_flagFill != null) {
            return _flagFill!!
        }
        _flagFill = Builder(name = "FlagFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.778f, 0.085f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 0.5f)
                verticalLineTo(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.314f, 0.464f)
                lineTo(14.5f, 8.0f)
                lineToRelative(0.186f, 0.464f)
                lineToRelative(-0.003f, 0.001f)
                lineToRelative(-0.006f, 0.003f)
                lineToRelative(-0.023f, 0.009f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.397f, 0.15f)
                curveToRelative(-0.264f, 0.095f, -0.631f, 0.223f, -1.047f, 0.35f)
                curveToRelative(-0.816f, 0.252f, -1.879f, 0.523f, -2.71f, 0.523f)
                curveToRelative(-0.847f, 0.0f, -1.548f, -0.28f, -2.158f, -0.525f)
                lineToRelative(-0.028f, -0.01f)
                curveTo(7.68f, 8.71f, 7.14f, 8.5f, 6.5f, 8.5f)
                curveToRelative(-0.7f, 0.0f, -1.638f, 0.23f, -2.437f, 0.477f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 3.0f, 9.342f)
                verticalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(0.282f)
                curveToRelative(0.226f, -0.079f, 0.496f, -0.17f, 0.79f, -0.26f)
                curveTo(4.606f, 0.272f, 5.67f, 0.0f, 6.5f, 0.0f)
                curveToRelative(0.84f, 0.0f, 1.524f, 0.277f, 2.121f, 0.519f)
                lineToRelative(0.043f, 0.018f)
                curveTo(9.286f, 0.788f, 9.828f, 1.0f, 10.5f, 1.0f)
                curveToRelative(0.7f, 0.0f, 1.638f, -0.23f, 2.437f, -0.477f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 1.349f, -0.476f)
                lineToRelative(0.019f, -0.007f)
                lineToRelative(0.004f, -0.002f)
                horizontalLineToRelative(0.001f)
            }
        }
        .build()
        return _flagFill!!
    }

private var _flagFill: ImageVector? = null
