package com.woowla.compose.icon.collections.devicons.devicons.keras

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.KerasGroup

public val KerasGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                verticalLineTo(0.0f)
                close()
                moveTo(93.9f, 98.0f)
                lineToRelative(-1.9f, 3.7f)
                curveToRelative(0.0f, 0.1f, -0.2f, 0.2f, -0.3f, 0.2f)
                horizontalLineTo(81.1f)
                curveToRelative(-0.1f, 0.0f, -0.2f, -0.1f, -0.3f, -0.1f)
                lineTo(56.7f, 66.1f)
                curveToRelative(-0.1f, -0.1f, -0.2f, -0.1f, -0.2f, 0.0f)
                lineTo(47.0f, 75.2f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.2f, -0.1f, 0.3f)
                verticalLineToRelative(23.8f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.2f, -0.1f, 0.3f)
                lineToRelative(-2.2f, 2.2f)
                curveToRelative(-0.1f, 0.1f, -0.2f, 0.1f, -0.3f, 0.1f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-0.1f, 0.0f, -0.2f, -0.1f, -0.3f, -0.1f)
                lineToRelative(-2.2f, -2.2f)
                curveToRelative(-0.1f, -0.1f, -0.1f, -0.2f, -0.1f, -0.3f)
                verticalLineTo(28.9f)
                curveToRelative(0.0f, -0.1f, 0.1f, -0.2f, 0.1f, -0.3f)
                lineToRelative(2.2f, -2.4f)
                curveToRelative(0.1f, -0.1f, 0.2f, -0.1f, 0.3f, -0.1f)
                horizontalLineToRelative(7.6f)
                curveToRelative(0.1f, 0.0f, 0.2f, 0.1f, 0.3f, 0.1f)
                lineToRelative(2.2f, 2.3f)
                curveToRelative(0.1f, 0.1f, 0.1f, 0.2f, 0.1f, 0.3f)
                verticalLineToRelative(29.6f)
                curveToRelative(0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f)
                lineToRelative(32.2f, -32.3f)
                curveToRelative(0.1f, -0.1f, 0.2f, -0.1f, 0.3f, -0.1f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.1f, 0.0f, 0.2f, 0.1f, 0.2f, 0.2f)
                lineToRelative(1.5f, 3.4f)
                curveToRelative(0.0f, 0.1f, 0.1f, 0.2f, 0.1f, 0.3f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.2f, -0.1f, 0.3f)
                lineTo(65.7f, 56.6f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.2f, 0.0f, 0.3f)
                lineToRelative(28.2f, 40.8f)
                verticalLineToRelative(0.3f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
