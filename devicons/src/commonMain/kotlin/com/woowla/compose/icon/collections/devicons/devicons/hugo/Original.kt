package com.woowla.compose.icon.collections.devicons.devicons.hugo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.HugoGroup

public val HugoGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFFF4088)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(71.2f, 8.5f)
                lineToRelative(36.7f, 21.3f)
                curveToRelative(4.3f, 2.5f, 7.0f, 7.2f, 7.0f, 12.2f)
                verticalLineToRelative(43.7f)
                curveToRelative(0.0f, 5.6f, -3.0f, 10.7f, -7.8f, 13.4f)
                lineToRelative(-36.4f, 20.5f)
                curveToRelative(-4.8f, 2.7f, -10.7f, 2.7f, -15.5f, -0.1f)
                lineToRelative(-33.5f, -19.3f)
                curveToRelative(-5.3f, -3.0f, -8.5f, -8.6f, -8.5f, -14.7f)
                verticalLineTo(44.1f)
                curveToRelative(0.0f, -6.1f, 3.2f, -11.8f, 8.4f, -15.0f)
                lineTo(54.4f, 8.8f)
                curveToRelative(5.1f, -3.2f, 11.6f, -3.3f, 16.8f, -0.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC9177E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.0f, 126.0f)
                curveToRelative(-3.5f, 0.0f, -6.9f, -0.9f, -10.0f, -2.7f)
                lineTo(19.5f, 104.0f)
                curveToRelative(-6.6f, -3.8f, -10.7f, -10.9f, -10.7f, -18.5f)
                lineTo(8.8f, 44.1f)
                curveToRelative(0.0f, -7.7f, 3.9f, -14.6f, 10.4f, -18.7f)
                lineTo(52.1f, 5.1f)
                curveToRelative(6.5f, -4.0f, 14.6f, -4.1f, 21.2f, -0.3f)
                lineTo(110.0f, 26.1f)
                curveToRelative(5.7f, 3.3f, 9.2f, 9.4f, 9.2f, 15.9f)
                verticalLineToRelative(43.7f)
                curveToRelative(0.0f, 7.1f, -3.8f, 13.7f, -10.0f, 17.2f)
                lineToRelative(-36.4f, 20.5f)
                curveToRelative(-3.0f, 1.7f, -6.4f, 2.6f, -9.8f, 2.6f)
                close()
                moveTo(63.0f, 10.7f)
                curveToRelative(-2.2f, 0.0f, -4.4f, 0.6f, -6.3f, 1.8f)
                lineToRelative(-33.0f, 20.3f)
                curveToRelative(-4.0f, 2.4f, -6.3f, 6.7f, -6.3f, 11.3f)
                verticalLineToRelative(41.5f)
                curveToRelative(0.0f, 4.5f, 2.4f, 8.7f, 6.3f, 11.0f)
                lineToRelative(33.5f, 19.3f)
                curveToRelative(3.5f, 2.0f, 7.8f, 2.0f, 11.3f, 0.1f)
                lineToRelative(36.4f, -20.5f)
                curveToRelative(3.5f, -2.0f, 5.6f, -5.6f, 5.6f, -9.6f)
                lineTo(110.5f, 42.1f)
                curveToRelative(0.0f, -3.5f, -1.9f, -6.7f, -4.9f, -8.5f)
                lineTo(69.0f, 12.3f)
                curveToRelative(-1.8f, -1.1f, -3.9f, -1.6f, -6.0f, -1.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.6f, 96.9f)
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
                verticalLineToRelative(29.0f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
