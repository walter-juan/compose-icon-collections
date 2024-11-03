package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Inboxes: ImageVector
    get() {
        if (_inboxes != null) {
            return _inboxes!!
        }
        _inboxes = Builder(name = "Inboxes", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.98f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.39f, 0.188f)
                lineTo(1.54f, 5.0f)
                lineTo(6.0f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 5.0f)
                horizontalLineToRelative(4.46f)
                lineToRelative(-3.05f, -3.812f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 11.02f, 1.0f)
                close()
                moveTo(14.934f, 6.0f)
                lineTo(10.45f, 6.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.9f, 0.0f)
                lineTo(1.066f, 6.0f)
                lineToRelative(0.32f, 2.562f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 1.884f, 9.0f)
                horizontalLineToRelative(12.234f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.496f, -0.438f)
                close()
                moveTo(3.809f, 0.563f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.981f, 0.0f)
                horizontalLineToRelative(6.038f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.172f, 0.563f)
                lineToRelative(3.7f, 4.625f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.105f, 0.374f)
                lineToRelative(-0.39f, 3.124f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.117f, 10.0f)
                lineTo(1.883f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.394f, 8.686f)
                lineToRelative(-0.39f, -3.124f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.106f, -0.374f)
                close()
                moveTo(0.125f, 11.17f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 11.0f)
                lineTo(6.0f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.496f, 0.562f)
                lineToRelative(-0.39f, 3.124f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.117f, 16.0f)
                lineTo(1.883f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.489f, -1.314f)
                lineToRelative(-0.39f, -3.124f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.121f, -0.393f)
                close()
                moveTo(1.066f, 12.0f)
                lineTo(1.386f, 14.562f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.497f, 0.438f)
                horizontalLineToRelative(12.234f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.496f, -0.438f)
                lineToRelative(0.32f, -2.562f)
                lineTo(10.45f, 12.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.9f, 0.0f)
                close()
            }
        }
        .build()
        return _inboxes!!
    }

private var _inboxes: ImageVector? = null
