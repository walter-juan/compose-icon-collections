package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox = Builder(name = "Inbox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(91.8f, 32.0f)
                curveTo(59.9f, 32.0f, 32.9f, 55.4f, 28.4f, 86.9f)
                lineTo(0.6f, 281.2f)
                curveToRelative(-0.4f, 3.0f, -0.6f, 6.0f, -0.6f, 9.1f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -125.7f)
                curveToRelative(0.0f, -3.0f, -0.2f, -6.1f, -0.6f, -9.1f)
                lineTo(483.6f, 86.9f)
                curveTo(479.1f, 55.4f, 452.1f, 32.0f, 420.2f, 32.0f)
                lineTo(91.8f, 32.0f)
                close()
                moveTo(91.8f, 96.0f)
                lineToRelative(328.5f, 0.0f)
                lineToRelative(27.4f, 192.0f)
                lineToRelative(-59.9f, 0.0f)
                curveToRelative(-12.1f, 0.0f, -23.2f, 6.8f, -28.6f, 17.7f)
                lineToRelative(-14.3f, 28.6f)
                curveToRelative(-5.4f, 10.8f, -16.5f, 17.7f, -28.6f, 17.7f)
                lineToRelative(-120.4f, 0.0f)
                curveToRelative(-12.1f, 0.0f, -23.2f, -6.8f, -28.6f, -17.7f)
                lineToRelative(-14.3f, -28.6f)
                curveToRelative(-5.4f, -10.8f, -16.5f, -17.7f, -28.6f, -17.7f)
                lineTo(64.3f, 288.0f)
                lineTo(91.8f, 96.0f)
                close()
            }
        }
        .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null
