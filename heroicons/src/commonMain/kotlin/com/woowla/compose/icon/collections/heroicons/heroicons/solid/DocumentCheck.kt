package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.DocumentCheck: ImageVector
    get() {
        if (_documentCheck != null) {
            return _documentCheck!!
        }
        _documentCheck = Builder(name = "DocumentCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 1.5f)
                horizontalLineTo(5.625f)
                curveTo(4.589f, 1.5f, 3.75f, 2.339f, 3.75f, 3.375f)
                verticalLineTo(20.625f)
                curveTo(3.75f, 21.66f, 4.589f, 22.5f, 5.625f, 22.5f)
                horizontalLineTo(18.375f)
                curveTo(19.41f, 22.5f, 20.25f, 21.66f, 20.25f, 20.625f)
                verticalLineTo(12.75f)
                curveTo(20.25f, 10.679f, 18.571f, 9.0f, 16.5f, 9.0f)
                horizontalLineTo(14.625f)
                curveTo(13.59f, 9.0f, 12.75f, 8.161f, 12.75f, 7.125f)
                verticalLineTo(5.25f)
                curveTo(12.75f, 3.179f, 11.071f, 1.5f, 9.0f, 1.5f)
                close()
                moveTo(15.61f, 12.436f)
                curveTo(15.851f, 12.099f, 15.773f, 11.63f, 15.436f, 11.39f)
                curveTo(15.099f, 11.149f, 14.63f, 11.227f, 14.39f, 11.564f)
                lineTo(11.154f, 16.094f)
                lineTo(9.53f, 14.47f)
                curveTo(9.237f, 14.177f, 8.763f, 14.177f, 8.47f, 14.47f)
                curveTo(8.177f, 14.763f, 8.177f, 15.237f, 8.47f, 15.53f)
                lineTo(10.72f, 17.78f)
                curveTo(10.876f, 17.936f, 11.092f, 18.016f, 11.312f, 17.997f)
                curveTo(11.532f, 17.979f, 11.732f, 17.865f, 11.86f, 17.686f)
                lineTo(15.61f, 12.436f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.971f, 1.816f)
                curveTo(13.768f, 2.736f, 14.25f, 3.937f, 14.25f, 5.25f)
                verticalLineTo(7.125f)
                curveTo(14.25f, 7.332f, 14.418f, 7.5f, 14.625f, 7.5f)
                horizontalLineTo(16.5f)
                curveTo(17.813f, 7.5f, 19.014f, 7.982f, 19.934f, 8.779f)
                curveTo(19.046f, 5.38f, 16.37f, 2.704f, 12.971f, 1.816f)
                close()
            }
        }
        .build()
        return _documentCheck!!
    }

private var _documentCheck: ImageVector? = null
