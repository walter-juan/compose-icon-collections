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

public val SolidGroup.EyeDropper: ImageVector
    get() {
        if (_eyeDropper != null) {
            return _eyeDropper!!
        }
        _eyeDropper = Builder(name = "EyeDropper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.098f, 2.598f)
                curveTo(17.563f, 1.134f, 19.937f, 1.134f, 21.402f, 2.598f)
                curveTo(22.866f, 4.063f, 22.866f, 6.437f, 21.402f, 7.902f)
                curveTo(20.919f, 8.384f, 20.336f, 8.708f, 19.72f, 8.873f)
                lineTo(18.0f, 9.333f)
                verticalLineTo(12.0f)
                curveTo(18.0f, 12.199f, 17.921f, 12.39f, 17.78f, 12.53f)
                lineTo(17.03f, 13.28f)
                curveTo(16.737f, 13.573f, 16.263f, 13.573f, 15.97f, 13.28f)
                lineTo(15.0f, 12.311f)
                lineTo(7.061f, 20.25f)
                curveTo(6.58f, 20.73f, 5.929f, 21.0f, 5.25f, 21.0f)
                curveTo(4.969f, 21.0f, 4.699f, 21.112f, 4.5f, 21.311f)
                lineTo(3.53f, 22.28f)
                curveTo(3.237f, 22.573f, 2.763f, 22.573f, 2.47f, 22.28f)
                lineTo(1.72f, 21.53f)
                curveTo(1.427f, 21.237f, 1.427f, 20.763f, 1.72f, 20.47f)
                lineTo(2.689f, 19.5f)
                curveTo(2.888f, 19.301f, 3.0f, 19.031f, 3.0f, 18.75f)
                curveTo(3.0f, 18.071f, 3.27f, 17.42f, 3.75f, 16.939f)
                lineTo(11.689f, 9.0f)
                lineTo(10.72f, 8.03f)
                curveTo(10.427f, 7.737f, 10.427f, 7.263f, 10.72f, 6.97f)
                lineTo(11.47f, 6.22f)
                curveTo(11.61f, 6.079f, 11.801f, 6.0f, 12.0f, 6.0f)
                horizontalLineTo(14.666f)
                lineTo(15.127f, 4.28f)
                curveTo(15.292f, 3.663f, 15.616f, 3.08f, 16.098f, 2.598f)
                close()
                moveTo(12.75f, 10.061f)
                lineTo(4.811f, 18.0f)
                curveTo(4.612f, 18.199f, 4.5f, 18.469f, 4.5f, 18.75f)
                curveTo(4.5f, 19.068f, 4.441f, 19.38f, 4.328f, 19.672f)
                curveTo(4.62f, 19.559f, 4.932f, 19.5f, 5.25f, 19.5f)
                curveTo(5.531f, 19.5f, 5.801f, 19.388f, 6.0f, 19.189f)
                lineTo(13.939f, 11.25f)
                lineTo(12.75f, 10.061f)
                close()
            }
        }
        .build()
        return _eyeDropper!!
    }

private var _eyeDropper: ImageVector? = null
