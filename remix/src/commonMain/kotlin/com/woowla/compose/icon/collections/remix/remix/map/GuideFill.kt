package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.GuideFill: ImageVector
    get() {
        if (_guideFill != null) {
            return _guideFill!!
        }
        _guideFill = Builder(name = "GuideFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(13.0f, 17.657f, 11.657f, 19.0f, 10.0f, 19.0f)
                horizontalLineTo(7.829f)
                curveTo(7.417f, 20.165f, 6.306f, 21.0f, 5.0f, 21.0f)
                curveTo(3.343f, 21.0f, 2.0f, 19.657f, 2.0f, 18.0f)
                curveTo(2.0f, 16.343f, 3.343f, 15.0f, 5.0f, 15.0f)
                curveTo(6.306f, 15.0f, 7.417f, 15.835f, 7.829f, 17.0f)
                horizontalLineTo(10.0f)
                curveTo(10.552f, 17.0f, 11.0f, 16.552f, 11.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(11.0f, 6.343f, 12.343f, 5.0f, 14.0f, 5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                lineTo(22.0f, 6.0f)
                lineTo(17.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                curveTo(13.448f, 7.0f, 13.0f, 7.448f, 13.0f, 8.0f)
                close()
            }
        }
        .build()
        return _guideFill!!
    }

private var _guideFill: ImageVector? = null
