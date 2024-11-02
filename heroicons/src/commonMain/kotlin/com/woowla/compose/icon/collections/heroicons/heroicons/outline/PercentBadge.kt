package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.PercentBadge: ImageVector
    get() {
        if (_percentBadge != null) {
            return _percentBadge!!
        }
        _percentBadge = Builder(name = "PercentBadge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.99f, 14.993f)
                lineTo(14.99f, 8.993f)
                moveTo(20.99f, 11.994f)
                curveTo(20.99f, 13.262f, 20.36f, 14.384f, 19.397f, 15.063f)
                curveTo(19.598f, 16.224f, 19.25f, 17.462f, 18.354f, 18.359f)
                curveTo(17.457f, 19.255f, 16.219f, 19.603f, 15.058f, 19.402f)
                curveTo(14.379f, 20.365f, 13.258f, 20.995f, 11.99f, 20.995f)
                curveTo(10.722f, 20.995f, 9.601f, 20.365f, 8.922f, 19.402f)
                curveTo(7.761f, 19.603f, 6.523f, 19.256f, 5.626f, 18.359f)
                curveTo(4.729f, 17.462f, 4.381f, 16.224f, 4.583f, 15.062f)
                curveTo(3.62f, 14.383f, 2.99f, 13.262f, 2.99f, 11.994f)
                curveTo(2.99f, 10.726f, 3.62f, 9.605f, 4.583f, 8.926f)
                curveTo(4.382f, 7.764f, 4.729f, 6.526f, 5.626f, 5.629f)
                curveTo(6.523f, 4.733f, 7.761f, 4.385f, 8.922f, 4.587f)
                curveTo(9.601f, 3.623f, 10.722f, 2.993f, 11.99f, 2.993f)
                curveTo(13.258f, 2.993f, 14.379f, 3.623f, 15.058f, 4.586f)
                curveTo(16.219f, 4.385f, 17.457f, 4.732f, 18.354f, 5.629f)
                curveTo(19.251f, 6.526f, 19.599f, 7.764f, 19.397f, 8.926f)
                curveTo(20.361f, 9.605f, 20.99f, 10.726f, 20.99f, 11.994f)
                close()
                moveTo(9.74f, 9.743f)
                horizontalLineTo(9.748f)
                verticalLineTo(9.75f)
                horizontalLineTo(9.74f)
                verticalLineTo(9.743f)
                close()
                moveTo(10.115f, 9.743f)
                curveTo(10.115f, 9.95f, 9.948f, 10.118f, 9.74f, 10.118f)
                curveTo(9.533f, 10.118f, 9.365f, 9.95f, 9.365f, 9.743f)
                curveTo(9.365f, 9.536f, 9.533f, 9.368f, 9.74f, 9.368f)
                curveTo(9.948f, 9.368f, 10.115f, 9.536f, 10.115f, 9.743f)
                close()
                moveTo(14.24f, 14.243f)
                horizontalLineTo(14.248f)
                verticalLineTo(14.251f)
                horizontalLineTo(14.24f)
                verticalLineTo(14.243f)
                close()
                moveTo(14.615f, 14.243f)
                curveTo(14.615f, 14.45f, 14.447f, 14.618f, 14.24f, 14.618f)
                curveTo(14.033f, 14.618f, 13.865f, 14.45f, 13.865f, 14.243f)
                curveTo(13.865f, 14.036f, 14.033f, 13.868f, 14.24f, 13.868f)
                curveTo(14.447f, 13.868f, 14.615f, 14.036f, 14.615f, 14.243f)
                close()
            }
        }
        .build()
        return _percentBadge!!
    }

private var _percentBadge: ImageVector? = null
