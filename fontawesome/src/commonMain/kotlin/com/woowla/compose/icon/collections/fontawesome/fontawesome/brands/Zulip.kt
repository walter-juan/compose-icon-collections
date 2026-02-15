package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Zulip: ImageVector
    get() {
        if (_zulip != null) {
            return _zulip!!
        }
        _zulip = Builder(name = "Zulip", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(424.0f, 99.0f)
                curveToRelative(0.0f, 22.6f, -10.1f, 42.6f, -25.5f, 54.8f)
                lineTo(249.3f, 287.7f)
                curveToRelative(-2.8f, 2.4f, -6.4f, -1.5f, -4.4f, -4.7f)
                lineToRelative(54.7f, -110.1f)
                curveToRelative(1.5f, -3.1f, -0.5f, -6.9f, -3.6f, -6.9f)
                lineTo(83.8f, 166.0f)
                curveTo(50.9f, 166.0f, 24.0f, 135.9f, 24.0f, 99.0f)
                curveTo(24.0f, 62.1f, 50.9f, 32.0f, 83.8f, 32.0f)
                lineToRelative(280.4f, 0.0f)
                curveTo(397.1f, 32.0f, 424.0f, 62.1f, 424.0f, 99.0f)
                close()
                moveTo(83.8f, 480.0f)
                lineToRelative(280.4f, 0.0f)
                curveToRelative(32.9f, 0.0f, 59.8f, -30.2f, 59.8f, -67.0f)
                reflectiveCurveToRelative(-26.9f, -67.0f, -59.8f, -67.0f)
                lineToRelative(-212.3f, 0.0f)
                curveToRelative(-3.1f, 0.0f, -5.1f, -3.8f, -3.6f, -6.9f)
                lineTo(203.1f, 229.0f)
                curveToRelative(2.0f, -3.2f, -1.6f, -7.1f, -4.4f, -4.7f)
                lineTo(49.5f, 358.2f)
                curveTo(34.1f, 370.4f, 24.0f, 390.4f, 24.0f, 413.0f)
                curveTo(24.0f, 449.8f, 50.9f, 480.0f, 83.8f, 480.0f)
                close()
            }
        }
        .build()
        return _zulip!!
    }

private var _zulip: ImageVector? = null
