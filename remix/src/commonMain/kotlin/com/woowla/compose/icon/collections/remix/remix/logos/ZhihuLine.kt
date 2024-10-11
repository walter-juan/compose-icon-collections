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

public val LogosGroup.ZhihuLine: ImageVector
    get() {
        if (_zhihuLine != null) {
            return _zhihuLine!!
        }
        _zhihuLine = Builder(name = "ZhihuLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.344f, 17.963f)
                lineTo(10.657f, 19.037f)
                lineTo(8.525f, 15.687f)
                curveTo(8.085f, 17.089f, 7.354f, 18.353f, 6.387f, 19.512f)
                curveTo(5.985f, 19.995f, 5.568f, 20.43f, 5.086f, 20.888f)
                curveTo(4.931f, 21.035f, 4.311f, 21.604f, 4.208f, 21.707f)
                lineTo(2.794f, 20.293f)
                curveTo(2.933f, 20.154f, 3.581f, 19.559f, 3.708f, 19.437f)
                curveTo(4.138f, 19.029f, 4.504f, 18.648f, 4.851f, 18.232f)
                curveTo(6.117f, 16.713f, 6.88f, 15.021f, 6.988f, 13.0f)
                horizontalLineTo(3.001f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.001f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.133f)
                curveTo(5.444f, 8.266f, 4.575f, 9.222f, 3.515f, 9.858f)
                lineTo(2.486f, 8.143f)
                curveTo(3.882f, 7.305f, 4.912f, 5.54f, 5.525f, 2.783f)
                lineTo(7.477f, 3.217f)
                curveTo(7.336f, 3.85f, 7.174f, 4.445f, 6.988f, 5.0f)
                horizontalLineTo(11.501f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.001f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.501f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.186f)
                lineTo(12.344f, 17.963f)
                close()
                moveTo(16.183f, 17.893f)
                lineTo(17.299f, 17.0f)
                horizontalLineTo(19.001f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.001f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.737f)
                lineTo(16.183f, 17.893f)
                close()
                moveTo(13.001f, 5.0f)
                horizontalLineTo(21.001f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.001f)
                lineTo(15.501f, 21.0f)
                lineTo(14.501f, 19.0f)
                horizontalLineTo(13.001f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _zhihuLine!!
    }

private var _zhihuLine: ImageVector? = null
