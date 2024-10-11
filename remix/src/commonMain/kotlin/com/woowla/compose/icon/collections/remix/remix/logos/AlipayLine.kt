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

public val LogosGroup.AlipayLine: ImageVector
    get() {
        if (_alipayLine != null) {
            return _alipayLine!!
        }
        _alipayLine = Builder(name = "AlipayLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.408f, 16.79f)
                curveTo(16.235f, 15.84f, 14.689f, 15.144f, 13.768f, 14.704f)
                curveTo(12.368f, 16.4f, 10.896f, 17.424f, 8.688f, 17.424f)
                curveTo(6.48f, 17.424f, 5.0f, 16.064f, 5.176f, 14.392f)
                curveTo(5.296f, 13.296f, 6.048f, 11.504f, 9.304f, 11.816f)
                curveTo(11.024f, 11.976f, 11.808f, 12.296f, 13.216f, 12.76f)
                curveTo(13.576f, 12.096f, 13.88f, 11.36f, 14.104f, 10.584f)
                horizontalLineTo(7.88f)
                verticalLineTo(9.968f)
                horizontalLineTo(10.952f)
                verticalLineTo(8.864f)
                horizontalLineTo(7.2f)
                verticalLineTo(8.184f)
                horizontalLineTo(10.952f)
                verticalLineTo(6.592f)
                curveTo(10.952f, 6.592f, 10.984f, 6.344f, 11.264f, 6.344f)
                horizontalLineTo(12.8f)
                verticalLineTo(8.192f)
                horizontalLineTo(16.8f)
                verticalLineTo(8.872f)
                horizontalLineTo(12.8f)
                verticalLineTo(9.976f)
                horizontalLineTo(16.064f)
                curveTo(15.768f, 11.2f, 15.312f, 12.32f, 14.744f, 13.296f)
                curveTo(15.254f, 13.478f, 16.841f, 13.972f, 19.504f, 14.778f)
                curveTo(19.825f, 13.913f, 20.0f, 12.977f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(14.622f, 20.0f, 16.949f, 18.739f, 18.408f, 16.79f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(8.432f, 16.368f)
                curveTo(9.872f, 16.368f, 11.256f, 15.496f, 12.392f, 14.016f)
                curveTo(10.784f, 13.24f, 9.448f, 12.856f, 7.952f, 12.856f)
                curveTo(6.648f, 12.856f, 5.968f, 13.656f, 5.848f, 14.272f)
                curveTo(5.728f, 14.888f, 6.096f, 16.368f, 8.432f, 16.368f)
                close()
            }
        }
        .build()
        return _alipayLine!!
    }

private var _alipayLine: ImageVector? = null
