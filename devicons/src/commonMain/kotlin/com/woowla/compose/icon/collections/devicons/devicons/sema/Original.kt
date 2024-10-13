package com.woowla.compose.icon.collections.devicons.devicons.sema

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.SemaGroup

public val SemaGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(63.93f, 0.0f)
                curveTo(28.63f, 0.0f, 0.0f, 28.66f, 0.0f, 64.0f)
                reflectiveCurveToRelative(28.63f, 64.0f, 63.93f, 64.0f)
                curveToRelative(35.29f, 0.0f, 63.93f, -28.66f, 63.93f, -64.0f)
                reflectiveCurveTo(99.22f, 0.0f, 63.93f, 0.0f)
                close()
                moveTo(32.47f, 101.66f)
                lineToRelative(22.03f, -81.92f)
                horizontalLineToRelative(12.25f)
                lineToRelative(-22.03f, 81.92f)
                close()
                moveTo(102.82f, 71.56f)
                lineTo(96.13f, 76.98f)
                lineTo(85.49f, 64.89f)
                lineTo(74.39f, 76.98f)
                lineToRelative(-6.96f, -5.12f)
                lineToRelative(8.8f, -13.37f)
                lineTo(61.73f, 52.81f)
                lineToRelative(2.59f, -9.26f)
                lineToRelative(15.31f, 3.99f)
                lineToRelative(1.28f, -15.21f)
                horizontalLineToRelative(8.68f)
                lineToRelative(1.28f, 15.21f)
                lineToRelative(14.51f, -3.69f)
                lineToRelative(2.97f, 8.96f)
                lineToRelative(-14.36f, 5.68f)
                close()
                moveTo(102.82f, 71.56f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
