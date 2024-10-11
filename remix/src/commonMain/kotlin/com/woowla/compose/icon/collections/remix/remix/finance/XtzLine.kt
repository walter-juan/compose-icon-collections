package com.woowla.compose.icon.collections.remix.remix.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FinanceGroup

public val FinanceGroup.XtzLine: ImageVector
    get() {
        if (_xtzLine != null) {
            return _xtzLine!!
        }
        _xtzLine = Builder(name = "XtzLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 15.209f, 8.791f, 17.0f, 11.0f, 17.0f)
                curveTo(12.024f, 17.0f, 12.96f, 16.614f, 13.667f, 15.981f)
                lineTo(12.333f, 14.491f)
                curveTo(11.979f, 14.808f, 11.513f, 15.0f, 11.0f, 15.0f)
                curveTo(9.895f, 15.0f, 9.0f, 14.105f, 9.0f, 13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.625f)
                lineTo(11.5f, 11.975f)
                lineTo(11.5f, 13.5f)
                horizontalLineTo(12.5f)
                curveTo(15.567f, 13.5f, 17.5f, 15.679f, 17.5f, 17.5f)
                curveTo(17.5f, 19.383f, 15.873f, 21.0f, 13.75f, 21.0f)
                curveTo(11.927f, 21.0f, 10.457f, 19.798f, 10.09f, 18.267f)
                lineTo(8.145f, 18.733f)
                curveTo(8.739f, 21.21f, 11.051f, 23.0f, 13.75f, 23.0f)
                curveTo(16.874f, 23.0f, 19.5f, 20.588f, 19.5f, 17.5f)
                curveTo(19.5f, 14.935f, 17.466f, 12.568f, 14.586f, 11.778f)
                lineTo(19.0f, 7.525f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _xtzLine!!
    }

private var _xtzLine: ImageVector? = null
