package com.woowla.compose.icon.collections.devicons.devicons.xamarin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.XamarinGroup

public val XamarinGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF3498DB)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(37.8f, 9.0f)
                curveToRelative(-3.4f, 0.0f, -6.6f, 1.9f, -8.3f, 4.8f)
                lineTo(3.2f, 59.2f)
                curveToRelative(-1.7f, 3.0f, -1.7f, 6.6f, 0.0f, 9.6f)
                lineToRelative(26.2f, 45.4f)
                curveToRelative(1.8f, 2.9f, 4.9f, 4.8f, 8.3f, 4.8f)
                horizontalLineToRelative(52.4f)
                curveToRelative(3.4f, 0.0f, 6.6f, -1.9f, 8.3f, -4.8f)
                lineToRelative(26.2f, -45.4f)
                curveToRelative(1.7f, -3.0f, 1.7f, -6.6f, 0.0f, -9.6f)
                lineTo(98.5f, 13.8f)
                curveTo(96.8f, 10.9f, 93.6f, 9.0f, 90.2f, 9.0f)
                lineTo(37.8f, 9.0f)
                close()
                moveTo(38.3f, 35.6f)
                horizontalLineToRelative(9.3f)
                curveToRelative(0.4f, 0.0f, 0.8f, 0.2f, 1.0f, 0.6f)
                lineToRelative(15.3f, 27.3f)
                curveToRelative(0.1f, 0.1f, 0.1f, 0.3f, 0.1f, 0.4f)
                curveToRelative(0.0f, -0.2f, 0.1f, -0.3f, 0.1f, -0.4f)
                lineToRelative(15.3f, -27.3f)
                curveToRelative(0.2f, -0.4f, 0.6f, -0.6f, 1.0f, -0.6f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.7f, 0.1f, 1.2f, 0.7f, 1.1f, 1.4f)
                curveToRelative(0.0f, 0.1f, 0.0f, 0.2f, -0.1f, 0.4f)
                lineTo(75.6f, 64.0f)
                lineToRelative(15.0f, 26.7f)
                curveToRelative(0.3f, 0.6f, 0.0f, 1.4f, -0.6f, 1.6f)
                curveToRelative(-0.1f, 0.1f, -0.3f, 0.1f, -0.4f, 0.1f)
                horizontalLineToRelative(-9.1f)
                curveToRelative(-0.4f, 0.0f, -0.8f, -0.2f, -1.0f, -0.6f)
                lineTo(64.1f, 64.5f)
                curveToRelative(-0.1f, -0.1f, -0.1f, -0.3f, -0.1f, -0.4f)
                curveToRelative(0.0f, 0.2f, -0.1f, 0.3f, -0.1f, 0.4f)
                lineTo(48.5f, 91.8f)
                curveToRelative(-0.2f, 0.4f, -0.6f, 0.6f, -1.0f, 0.6f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-0.7f, -0.1f, -1.2f, -0.7f, -1.1f, -1.3f)
                curveToRelative(0.0f, -0.1f, 0.1f, -0.3f, 0.1f, -0.4f)
                lineToRelative(15.0f, -26.7f)
                lineToRelative(-15.0f, -26.7f)
                curveToRelative(-0.3f, -0.6f, 0.0f, -1.3f, 0.6f, -1.6f)
                curveToRelative(0.0f, -0.1f, 0.1f, -0.1f, 0.2f, -0.1f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
