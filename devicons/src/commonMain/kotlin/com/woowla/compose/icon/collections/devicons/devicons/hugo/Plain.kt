package com.woowla.compose.icon.collections.devicons.devicons.hugo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.HugoGroup

public val HugoGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFFF4088)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(110.0f, 26.1f)
                lineTo(73.3f, 4.8f)
                curveToRelative(-6.6f, -3.8f, -14.7f, -3.7f, -21.2f, 0.3f)
                lineTo(19.2f, 25.4f)
                curveToRelative(-6.5f, 4.1f, -10.4f, 11.0f, -10.4f, 18.7f)
                verticalLineToRelative(41.4f)
                curveToRelative(0.0f, 7.6f, 4.1f, 14.7f, 10.7f, 18.5f)
                lineTo(53.0f, 123.3f)
                curveToRelative(3.1f, 1.8f, 6.5f, 2.7f, 10.0f, 2.7f)
                curveToRelative(3.4f, 0.0f, 6.8f, -0.9f, 9.8f, -2.6f)
                lineToRelative(36.4f, -20.5f)
                curveToRelative(6.2f, -3.5f, 10.0f, -10.1f, 10.0f, -17.2f)
                verticalLineTo(42.0f)
                curveToRelative(0.0f, -6.5f, -3.5f, -12.6f, -9.2f, -15.9f)
                close()
                moveTo(52.5f, 67.9f)
                verticalLineToRelative(29.0f)
                horizontalLineTo(38.6f)
                verticalLineTo(30.5f)
                horizontalLineToRelative(13.9f)
                verticalLineToRelative(24.2f)
                horizontalLineToRelative(23.0f)
                verticalLineTo(30.5f)
                horizontalLineToRelative(13.9f)
                verticalLineToRelative(66.4f)
                horizontalLineTo(75.5f)
                verticalLineToRelative(-29.0f)
                horizontalLineToRelative(-23.0f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
