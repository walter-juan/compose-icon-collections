package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.FindReplaceFill: ImageVector
    get() {
        if (_findReplaceFill != null) {
            return _findReplaceFill!!
        }
        _findReplaceFill = Builder(name = "FindReplaceFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.031f, 16.617f)
                lineTo(22.314f, 20.899f)
                lineTo(20.899f, 22.314f)
                lineTo(16.617f, 18.031f)
                curveTo(15.077f, 19.263f, 13.124f, 20.0f, 11.0f, 20.0f)
                curveTo(6.032f, 20.0f, 2.0f, 15.968f, 2.0f, 11.0f)
                curveTo(2.0f, 6.032f, 6.032f, 2.0f, 11.0f, 2.0f)
                curveTo(15.968f, 2.0f, 20.0f, 6.032f, 20.0f, 11.0f)
                curveTo(20.0f, 13.124f, 19.263f, 15.077f, 18.031f, 16.617f)
                close()
                moveTo(16.659f, 9.0f)
                curveTo(15.836f, 6.669f, 13.614f, 5.0f, 11.0f, 5.0f)
                curveTo(7.685f, 5.0f, 5.0f, 7.685f, 5.0f, 11.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 8.792f, 8.792f, 7.0f, 11.0f, 7.0f)
                curveTo(11.691f, 7.0f, 12.342f, 7.176f, 12.909f, 7.485f)
                lineTo(12.0f, 9.0f)
                horizontalLineTo(16.659f)
                close()
                moveTo(17.0f, 11.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 13.208f, 13.208f, 15.0f, 11.0f, 15.0f)
                curveTo(10.309f, 15.0f, 9.658f, 14.824f, 9.091f, 14.515f)
                lineTo(10.0f, 13.0f)
                horizontalLineTo(7.536f)
                horizontalLineTo(5.341f)
                curveTo(6.164f, 15.331f, 8.386f, 17.0f, 11.0f, 17.0f)
                curveTo(14.315f, 17.0f, 17.0f, 14.315f, 17.0f, 11.0f)
                close()
            }
        }
        .build()
        return _findReplaceFill!!
    }

private var _findReplaceFill: ImageVector? = null
