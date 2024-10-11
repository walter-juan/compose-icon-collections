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

public val LogosGroup.StackOverflowFill: ImageVector
    get() {
        if (_stackOverflowFill != null) {
            return _stackOverflowFill!!
        }
        _stackOverflowFill = Builder(name = "StackOverflowFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.001f, 20.003f)
                verticalLineTo(14.669f)
                horizontalLineTo(20.001f)
                verticalLineTo(22.003f)
                horizontalLineTo(4.001f)
                verticalLineTo(14.669f)
                horizontalLineTo(6.001f)
                verticalLineTo(20.003f)
                horizontalLineTo(18.001f)
                close()
                moveTo(7.6f, 14.736f)
                lineTo(7.913f, 12.757f)
                lineTo(16.75f, 14.456f)
                lineTo(16.637f, 16.042f)
                lineTo(7.6f, 14.736f)
                close()
                moveTo(8.799f, 10.204f)
                lineTo(9.532f, 8.605f)
                lineTo(17.53f, 12.337f)
                lineTo(16.797f, 13.936f)
                lineTo(8.799f, 10.204f)
                close()
                moveTo(11.065f, 6.272f)
                lineTo(12.198f, 4.939f)
                lineTo(18.996f, 10.604f)
                lineTo(17.863f, 11.937f)
                lineTo(11.065f, 6.272f)
                close()
                moveTo(15.397f, 2.14f)
                lineTo(20.662f, 9.204f)
                lineTo(19.263f, 10.271f)
                lineTo(13.998f, 3.206f)
                lineTo(15.397f, 2.14f)
                close()
                moveTo(7.333f, 18.668f)
                verticalLineTo(16.669f)
                horizontalLineTo(16.663f)
                verticalLineTo(18.668f)
                horizontalLineTo(7.333f)
                close()
            }
        }
        .build()
        return _stackOverflowFill!!
    }

private var _stackOverflowFill: ImageVector? = null
