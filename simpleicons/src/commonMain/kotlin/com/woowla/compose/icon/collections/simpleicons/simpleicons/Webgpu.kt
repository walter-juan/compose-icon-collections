package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Webgpu: ImageVector
    get() {
        if (_webgpu != null) {
            return _webgpu!!
        }
        _webgpu = Builder(name = "Webgpu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 4.784f)
                lineToRelative(8.652f, 14.432f)
                lineToRelative(8.652f, -14.432f)
                close()
                moveTo(22.032f, 4.929f)
                lineTo(20.07f, 8.202f)
                lineTo(24.0f, 8.202f)
                lineTo(22.032f, 4.93f)
                close()
                moveTo(17.572f, 4.929f)
                lineTo(13.38f, 11.922f)
                horizontalLineToRelative(8.384f)
                close()
                moveTo(20.07f, 8.504f)
                lineTo(22.032f, 11.777f)
                lineTo(24.0f, 8.504f)
                close()
                moveTo(13.38f, 12.224f)
                lineTo(17.572f, 19.216f)
                lineTo(21.764f, 12.224f)
                close()
            }
        }
        .build()
        return _webgpu!!
    }

private var _webgpu: ImageVector? = null
