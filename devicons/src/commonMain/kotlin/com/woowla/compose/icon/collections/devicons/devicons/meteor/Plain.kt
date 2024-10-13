package com.woowla.compose.icon.collections.devicons.devicons.meteor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.MeteorGroup

public val MeteorGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFDF5052)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.3f, 65.4f)
                curveToRelative(1.2f, 0.0f, 2.1f, -0.9f, 2.1f, -2.1f)
                curveToRelative(0.0f, -0.5f, -0.2f, -1.0f, -0.5f, -1.3f)
                curveToRelative(-0.1f, -0.2f, -28.0f, -25.8f, -28.0f, -25.8f)
                lineToRelative(24.6f, 28.1f)
                curveToRelative(0.3f, 0.7f, 1.0f, 1.1f, 1.8f, 1.1f)
                close()
                moveTo(126.0f, 79.7f)
                lineToRelative(-0.2f, -0.2f)
                lineTo(65.0f, 24.0f)
                lineToRelative(55.7f, 60.6f)
                lineToRelative(0.2f, 0.2f)
                curveToRelative(0.6f, 0.6f, 1.5f, 1.0f, 2.5f, 1.0f)
                curveToRelative(2.0f, 0.0f, 3.6f, -1.6f, 3.6f, -3.6f)
                curveToRelative(0.0f, -0.9f, -0.4f, -1.8f, -1.0f, -2.5f)
                close()
                moveTo(99.1f, 117.3f)
                lineToRelative(-88.0f, -81.5f)
                lineToRelative(81.1f, 88.5f)
                curveToRelative(0.9f, 1.0f, 2.2f, 1.7f, 3.7f, 1.7f)
                curveToRelative(2.7f, 0.0f, 4.9f, -2.2f, 4.9f, -4.9f)
                curveToRelative(0.0f, -1.5f, -0.6f, -2.9f, -1.7f, -3.8f)
                close()
                moveTo(1.0f, 2.0f)
                lineToRelative(107.6f, 114.6f)
                lineToRelative(0.1f, 0.1f)
                curveToRelative(0.9f, 0.9f, 2.1f, 1.4f, 3.4f, 1.4f)
                curveToRelative(2.7f, 0.0f, 4.9f, -2.2f, 4.9f, -4.9f)
                curveToRelative(0.0f, -1.0f, -0.3f, -2.0f, -0.9f, -2.8f)
                curveTo(115.8f, 109.9f, 1.0f, 2.0f, 1.0f, 2.0f)
                close()
                moveTo(123.4f, 94.8f)
                lineToRelative(-88.0f, -81.5f)
                lineToRelative(81.1f, 88.5f)
                curveToRelative(0.9f, 1.0f, 2.2f, 1.7f, 3.7f, 1.7f)
                curveToRelative(2.7f, 0.0f, 4.9f, -2.2f, 4.9f, -4.9f)
                curveToRelative(0.0f, -1.6f, -0.7f, -2.9f, -1.7f, -3.8f)
                close()
                moveTo(80.9f, 119.6f)
                lineToRelative(-0.2f, -0.2f)
                lineToRelative(-60.8f, -55.5f)
                lineToRelative(55.7f, 60.6f)
                lineToRelative(0.2f, 0.2f)
                curveToRelative(0.6f, 0.6f, 1.5f, 1.0f, 2.5f, 1.0f)
                curveToRelative(2.0f, 0.0f, 3.6f, -1.6f, 3.6f, -3.6f)
                curveToRelative(0.0f, -1.0f, -0.4f, -1.8f, -1.0f, -2.5f)
                close()
                moveTo(34.1f, 91.7f)
                lineToRelative(24.6f, 28.1f)
                curveToRelative(0.4f, 0.6f, 1.0f, 1.1f, 1.8f, 1.1f)
                curveToRelative(1.2f, 0.0f, 2.1f, -0.9f, 2.1f, -2.1f)
                curveToRelative(0.0f, -0.5f, -0.2f, -1.0f, -0.5f, -1.3f)
                curveToRelative(-0.2f, -0.1f, -28.0f, -25.8f, -28.0f, -25.8f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
