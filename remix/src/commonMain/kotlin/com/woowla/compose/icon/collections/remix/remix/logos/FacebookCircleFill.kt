package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.FacebookCircleFill: ImageVector
    get() {
        if (_facebookCircleFill != null) {
            return _facebookCircleFill!!
        }
        _facebookCircleFill = Builder(name = "FacebookCircleFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(6.478f, 2.0f, 2.001f, 6.477f, 2.001f, 12.0f)
                curveTo(2.001f, 16.991f, 5.658f, 21.128f, 10.439f, 21.878f)
                verticalLineTo(14.891f)
                horizontalLineTo(7.899f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.439f)
                verticalLineTo(9.797f)
                curveTo(10.439f, 7.291f, 11.931f, 5.906f, 14.216f, 5.906f)
                curveTo(15.31f, 5.906f, 16.454f, 6.102f, 16.454f, 6.102f)
                verticalLineTo(8.563f)
                horizontalLineTo(15.193f)
                curveTo(13.951f, 8.563f, 13.564f, 9.333f, 13.564f, 10.124f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.337f)
                lineTo(15.894f, 14.891f)
                horizontalLineTo(13.564f)
                verticalLineTo(21.878f)
                curveTo(18.344f, 21.128f, 22.001f, 16.991f, 22.001f, 12.0f)
                curveTo(22.001f, 6.477f, 17.524f, 2.0f, 12.001f, 2.0f)
                close()
            }
        }
        .build()
        return _facebookCircleFill!!
    }

private var _facebookCircleFill: ImageVector? = null
