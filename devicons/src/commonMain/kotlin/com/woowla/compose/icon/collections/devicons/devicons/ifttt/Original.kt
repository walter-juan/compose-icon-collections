package com.woowla.compose.icon.collections.devicons.devicons.ifttt

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.IftttGroup

public val IftttGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 47.6f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(32.9f)
                lineTo(2.0f, 80.5f)
                lineTo(2.0f, 47.6f)
                close()
                moveTo(61.8f, 47.6f)
                horizontalLineToRelative(-18.0f)
                lineTo(43.8f, 58.0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(22.4f)
                horizontalLineToRelative(10.5f)
                lineTo(61.8f, 58.0f)
                horizontalLineToRelative(7.5f)
                lineTo(69.3f, 47.6f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(90.1f, 47.6f)
                lineTo(72.2f, 47.6f)
                lineTo(72.2f, 58.0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(22.4f)
                horizontalLineToRelative(10.5f)
                lineTo(90.2f, 58.0f)
                horizontalLineToRelative(7.5f)
                lineTo(97.7f, 47.6f)
                horizontalLineToRelative(-7.6f)
                close()
                moveTo(118.5f, 47.6f)
                horizontalLineToRelative(-17.9f)
                lineTo(100.6f, 58.0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(22.4f)
                horizontalLineToRelative(10.5f)
                lineTo(118.6f, 58.0f)
                horizontalLineToRelative(7.5f)
                lineTo(126.1f, 47.6f)
                horizontalLineToRelative(-7.6f)
                close()
                moveTo(40.8f, 58.0f)
                lineTo(40.8f, 47.6f)
                lineTo(16.9f, 47.6f)
                verticalLineToRelative(32.9f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(9.0f)
                lineTo(36.4f, 61.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(13.4f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
