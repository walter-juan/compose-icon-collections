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

public val LogosGroup.AnthropicLine: ImageVector
    get() {
        if (_anthropicLine != null) {
            return _anthropicLine!!
        }
        _anthropicLine = Builder(name = "AnthropicLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.122f, 5.0f)
                horizontalLineTo(16.268f)
                lineTo(22.101f, 20.0f)
                horizontalLineTo(19.955f)
                lineTo(14.122f, 5.0f)
                close()
                moveTo(7.66f, 5.0f)
                horizontalLineTo(10.341f)
                lineTo(16.11f, 20.0f)
                horizontalLineTo(13.967f)
                lineTo(12.429f, 16.0f)
                horizontalLineTo(5.572f)
                lineTo(4.033f, 20.0f)
                horizontalLineTo(1.891f)
                lineTo(7.66f, 5.0f)
                close()
                moveTo(11.66f, 14.0f)
                lineTo(9.0f, 7.086f)
                lineTo(6.341f, 14.0f)
                horizontalLineTo(11.66f)
                close()
            }
        }
        .build()
        return _anthropicLine!!
    }

private var _anthropicLine: ImageVector? = null
