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

public val LogosGroup.AlipayFill: ImageVector
    get() {
        if (_alipayFill != null) {
            return _alipayFill!!
        }
        _alipayFill = Builder(name = "AlipayFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.422f, 15.358f)
                curveTo(17.593f, 14.205f, 15.367f, 13.518f, 14.744f, 13.296f)
                curveTo(15.312f, 12.32f, 15.768f, 11.2f, 16.064f, 9.976f)
                horizontalLineTo(12.8f)
                verticalLineTo(8.872f)
                horizontalLineTo(16.8f)
                verticalLineTo(8.192f)
                horizontalLineTo(12.8f)
                verticalLineTo(6.344f)
                horizontalLineTo(11.264f)
                curveTo(10.984f, 6.344f, 10.952f, 6.592f, 10.952f, 6.592f)
                verticalLineTo(8.184f)
                horizontalLineTo(7.2f)
                verticalLineTo(8.864f)
                horizontalLineTo(10.952f)
                verticalLineTo(9.968f)
                horizontalLineTo(7.88f)
                verticalLineTo(10.584f)
                horizontalLineTo(14.104f)
                curveTo(13.88f, 11.36f, 13.576f, 12.096f, 13.216f, 12.76f)
                curveTo(11.808f, 12.296f, 11.024f, 11.976f, 9.304f, 11.816f)
                curveTo(6.048f, 11.504f, 5.296f, 13.296f, 5.176f, 14.392f)
                curveTo(5.0f, 16.064f, 6.48f, 17.424f, 8.688f, 17.424f)
                curveTo(10.896f, 17.424f, 12.368f, 16.4f, 13.768f, 14.704f)
                curveTo(14.935f, 15.262f, 17.106f, 16.229f, 20.282f, 17.606f)
                curveTo(18.483f, 20.258f, 15.445f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 13.178f, 21.796f, 14.308f, 21.422f, 15.358f)
                close()
                moveTo(8.432f, 16.368f)
                curveTo(6.096f, 16.368f, 5.728f, 14.888f, 5.848f, 14.272f)
                curveTo(5.968f, 13.656f, 6.648f, 12.856f, 7.952f, 12.856f)
                curveTo(9.448f, 12.856f, 10.784f, 13.24f, 12.392f, 14.016f)
                curveTo(11.256f, 15.496f, 9.872f, 16.368f, 8.432f, 16.368f)
                close()
            }
        }
        .build()
        return _alipayFill!!
    }

private var _alipayFill: ImageVector? = null
