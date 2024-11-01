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

public val LogosGroup.AnthropicFill: ImageVector
    get() {
        if (_anthropicFill != null) {
            return _anthropicFill!!
        }
        _anthropicFill = Builder(name = "AnthropicFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.764f, 5.0f)
                horizontalLineTo(13.457f)
                lineTo(19.38f, 20.0f)
                horizontalLineTo(22.611f)
                lineTo(16.764f, 5.0f)
                close()
                moveTo(7.226f, 5.0f)
                lineTo(1.38f, 20.0f)
                horizontalLineTo(4.688f)
                lineTo(5.995f, 16.846f)
                horizontalLineTo(12.149f)
                lineTo(13.38f, 19.923f)
                horizontalLineTo(16.688f)
                lineTo(10.688f, 5.0f)
                horizontalLineTo(7.303f)
                horizontalLineTo(7.226f)
                close()
                moveTo(6.918f, 14.077f)
                lineTo(8.918f, 8.769f)
                lineTo(10.995f, 14.077f)
                horizontalLineTo(6.995f)
                horizontalLineTo(6.918f)
                close()
            }
        }
        .build()
        return _anthropicFill!!
    }

private var _anthropicFill: ImageVector? = null
