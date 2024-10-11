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

public val LogosGroup.ZcoolFill: ImageVector
    get() {
        if (_zcoolFill != null) {
            return _zcoolFill!!
        }
        _zcoolFill = Builder(name = "ZcoolFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.903f, 21.839f)
                curveTo(5.539f, 21.839f, 2.001f, 18.3f, 2.001f, 13.936f)
                curveTo(2.001f, 10.29f, 4.468f, 7.06f, 7.825f, 6.309f)
                curveTo(11.746f, 5.431f, 13.529f, 4.742f, 14.902f, 2.0f)
                curveTo(15.9f, 3.935f, 15.225f, 5.71f, 14.903f, 6.677f)
                curveTo(19.6f, 5.548f, 21.273f, 3.396f, 21.676f, 3.129f)
                curveTo(21.676f, 7.081f, 20.445f, 9.581f, 19.257f, 11.193f)
                curveTo(20.733f, 11.138f, 21.266f, 10.71f, 22.001f, 10.607f)
                curveTo(21.676f, 12.055f, 20.5f, 14.097f, 17.67f, 15.402f)
                curveTo(16.983f, 19.066f, 13.767f, 21.839f, 9.903f, 21.839f)
                close()
                moveTo(13.613f, 15.387f)
                curveTo(13.613f, 15.71f, 13.559f, 15.871f, 13.21f, 15.871f)
                lineTo(10.059f, 15.873f)
                lineTo(13.02f, 12.625f)
                curveTo(13.88f, 11.765f, 13.88f, 11.335f, 13.88f, 10.237f)
                curveTo(13.88f, 9.903f, 13.832f, 9.52f, 13.928f, 9.186f)
                curveTo(13.975f, 9.043f, 13.88f, 8.995f, 13.737f, 9.043f)
                curveTo(13.402f, 9.138f, 12.829f, 9.138f, 11.874f, 9.138f)
                horizontalLineTo(7.576f)
                curveTo(7.337f, 9.138f, 7.241f, 8.995f, 7.337f, 8.804f)
                curveTo(7.337f, 8.756f, 7.337f, 8.613f, 7.241f, 8.613f)
                curveTo(6.621f, 8.899f, 6.477f, 10.189f, 6.525f, 11.001f)
                curveTo(6.525f, 11.431f, 6.764f, 11.67f, 7.098f, 11.67f)
                horizontalLineTo(10.489f)
                lineTo(7.003f, 15.395f)
                curveTo(6.764f, 15.682f, 6.525f, 16.064f, 6.525f, 16.589f)
                verticalLineTo(17.64f)
                curveTo(6.525f, 18.118f, 6.812f, 18.404f, 7.337f, 18.5f)
                horizontalLineTo(13.325f)
                curveTo(13.88f, 18.5f, 14.258f, 18.267f, 14.258f, 17.645f)
                verticalLineTo(16.516f)
                curveTo(14.258f, 16.308f, 14.258f, 15.548f, 13.613f, 15.387f)
                close()
            }
        }
        .build()
        return _zcoolFill!!
    }

private var _zcoolFill: ImageVector? = null
