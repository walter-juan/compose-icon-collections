package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.ShuffleFill: ImageVector
    get() {
        if (_shuffleFill != null) {
            return _shuffleFill!!
        }
        _shuffleFill = Builder(name = "ShuffleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 17.883f)
                verticalLineTo(16.0f)
                lineTo(23.0f, 19.0f)
                lineTo(18.0f, 22.0f)
                verticalLineTo(19.91f)
                curveTo(14.922f, 19.47f, 12.251f, 17.458f, 11.003f, 14.545f)
                lineTo(11.0f, 14.539f)
                lineTo(10.997f, 14.545f)
                curveTo(9.579f, 17.854f, 6.325f, 20.0f, 2.725f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.725f)
                curveTo(5.525f, 18.0f, 8.056f, 16.331f, 9.159f, 13.757f)
                lineTo(9.912f, 12.0f)
                lineTo(9.159f, 10.243f)
                curveTo(8.056f, 7.669f, 5.525f, 6.0f, 2.725f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.725f)
                curveTo(6.325f, 4.0f, 9.579f, 6.146f, 10.997f, 9.455f)
                lineTo(11.0f, 9.461f)
                lineTo(11.003f, 9.455f)
                curveTo(12.251f, 6.542f, 14.922f, 4.53f, 18.0f, 4.091f)
                verticalLineTo(2.0f)
                lineTo(23.0f, 5.0f)
                lineTo(18.0f, 8.0f)
                verticalLineTo(6.117f)
                curveTo(15.727f, 6.538f, 13.774f, 8.067f, 12.841f, 10.243f)
                lineTo(12.088f, 12.0f)
                lineTo(12.841f, 13.757f)
                curveTo(13.774f, 15.933f, 15.727f, 17.462f, 18.0f, 17.883f)
                close()
            }
        }
        .build()
        return _shuffleFill!!
    }

private var _shuffleFill: ImageVector? = null
