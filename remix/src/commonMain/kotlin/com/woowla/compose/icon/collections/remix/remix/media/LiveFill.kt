package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.LiveFill: ImageVector
    get() {
        if (_liveFill != null) {
            return _liveFill!!
        }
        _liveFill = Builder(name = "LiveFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(16.552f, 4.0f, 17.0f, 4.448f, 17.0f, 5.0f)
                verticalLineTo(9.2f)
                lineTo(22.213f, 5.551f)
                curveTo(22.44f, 5.392f, 22.751f, 5.447f, 22.91f, 5.674f)
                curveTo(22.968f, 5.758f, 23.0f, 5.858f, 23.0f, 5.96f)
                verticalLineTo(18.04f)
                curveTo(23.0f, 18.316f, 22.776f, 18.54f, 22.5f, 18.54f)
                curveTo(22.397f, 18.54f, 22.297f, 18.508f, 22.213f, 18.449f)
                lineTo(17.0f, 14.8f)
                verticalLineTo(19.0f)
                curveTo(17.0f, 19.552f, 16.552f, 20.0f, 16.0f, 20.0f)
                horizontalLineTo(2.0f)
                curveTo(1.448f, 20.0f, 1.0f, 19.552f, 1.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(1.0f, 4.448f, 1.448f, 4.0f, 2.0f, 4.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(7.4f, 8.829f)
                curveTo(7.207f, 8.829f, 7.045f, 8.966f, 7.008f, 9.148f)
                lineTo(7.0f, 9.229f)
                verticalLineTo(14.771f)
                curveTo(7.0f, 14.847f, 7.022f, 14.922f, 7.063f, 14.986f)
                curveTo(7.166f, 15.149f, 7.369f, 15.212f, 7.542f, 15.145f)
                lineTo(7.615f, 15.109f)
                lineTo(11.97f, 12.337f)
                curveTo(12.019f, 12.306f, 12.061f, 12.264f, 12.092f, 12.215f)
                curveTo(12.196f, 12.052f, 12.167f, 11.842f, 12.033f, 11.713f)
                lineTo(11.97f, 11.663f)
                lineTo(7.615f, 8.891f)
                curveTo(7.551f, 8.85f, 7.476f, 8.829f, 7.4f, 8.829f)
                close()
            }
        }
        .build()
        return _liveFill!!
    }

private var _liveFill: ImageVector? = null
