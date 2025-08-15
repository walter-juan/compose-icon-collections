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

public val SolidGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.6f, 12.8f)
                curveToRelative(56.2f, -56.2f, 147.4f, -56.2f, 203.6f, 0.0f)
                reflectiveCurveToRelative(56.2f, 147.4f, 0.0f, 203.6f)
                lineToRelative(-164.0f, 164.0f)
                curveToRelative(-34.4f, 34.4f, -90.1f, 34.4f, -124.5f, 0.0f)
                reflectiveCurveToRelative(-34.4f, -90.1f, 0.0f, -124.5f)
                lineTo(292.5f, 103.3f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, 32.8f, 0.0f, 45.3f)
                lineTo(185.0f, 301.3f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(164.0f, -164.0f)
                curveToRelative(31.2f, -31.2f, 31.2f, -81.9f, 0.0f, -113.1f)
                reflectiveCurveToRelative(-81.9f, -31.2f, -113.1f, 0.0f)
                lineToRelative(-164.0f, 164.0f)
                curveToRelative(-53.1f, 53.1f, -53.1f, 139.2f, 0.0f, 192.3f)
                reflectiveCurveToRelative(139.2f, 53.1f, 192.3f, 0.0f)
                lineTo(428.3f, 284.3f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, 32.8f, 0.0f, 45.3f)
                lineTo(343.4f, 459.6f)
                curveToRelative(-78.1f, 78.1f, -204.7f, 78.1f, -282.8f, 0.0f)
                reflectiveCurveToRelative(-78.1f, -204.7f, 0.0f, -282.8f)
                lineToRelative(164.0f, -164.0f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
