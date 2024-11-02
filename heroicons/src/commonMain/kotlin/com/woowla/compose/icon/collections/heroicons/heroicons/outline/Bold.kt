package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Bold: ImageVector
    get() {
        if (_bold != null) {
            return _bold!!
        }
        _bold = Builder(name = "Bold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.75f, 3.744f)
                horizontalLineTo(5.997f)
                verticalLineTo(11.995f)
                horizontalLineTo(13.122f)
                curveTo(15.4f, 11.995f, 17.247f, 10.148f, 17.247f, 7.87f)
                curveTo(17.247f, 5.591f, 15.4f, 3.744f, 13.122f, 3.744f)
                horizontalLineTo(6.75f)
                close()
                moveTo(6.75f, 3.744f)
                verticalLineTo(4.125f)
                moveTo(6.75f, 20.246f)
                horizontalLineTo(13.497f)
                curveTo(15.982f, 20.246f, 17.997f, 18.231f, 17.997f, 15.745f)
                curveTo(17.997f, 13.26f, 15.982f, 11.245f, 13.497f, 11.245f)
                horizontalLineTo(5.997f)
                verticalLineTo(20.246f)
                horizontalLineTo(6.75f)
                close()
                moveTo(6.75f, 20.246f)
                verticalLineTo(19.875f)
                moveTo(6.75f, 4.125f)
                horizontalLineTo(12.75f)
                curveTo(14.821f, 4.125f, 16.5f, 5.804f, 16.5f, 7.875f)
                curveTo(16.5f, 9.946f, 14.821f, 11.625f, 12.75f, 11.625f)
                horizontalLineTo(6.75f)
                moveTo(6.75f, 4.125f)
                verticalLineTo(11.625f)
                moveTo(6.75f, 11.625f)
                verticalLineTo(19.875f)
                moveTo(6.75f, 11.625f)
                horizontalLineTo(13.125f)
                curveTo(15.404f, 11.625f, 17.25f, 13.472f, 17.25f, 15.75f)
                curveTo(17.25f, 18.028f, 15.404f, 19.875f, 13.125f, 19.875f)
                horizontalLineTo(6.75f)
                moveTo(7.497f, 4.494f)
                horizontalLineTo(12.372f)
                curveTo(14.236f, 4.494f, 15.747f, 6.005f, 15.747f, 7.87f)
                curveTo(15.747f, 9.734f, 14.236f, 11.245f, 12.372f, 11.245f)
                horizontalLineTo(7.497f)
                verticalLineTo(4.494f)
                close()
                moveTo(7.497f, 11.995f)
                horizontalLineTo(12.747f)
                curveTo(14.818f, 11.995f, 16.497f, 13.674f, 16.497f, 15.745f)
                curveTo(16.497f, 17.816f, 14.818f, 19.496f, 12.747f, 19.496f)
                horizontalLineTo(7.497f)
                verticalLineTo(11.995f)
                close()
            }
        }
        .build()
        return _bold!!
    }

private var _bold: ImageVector? = null
