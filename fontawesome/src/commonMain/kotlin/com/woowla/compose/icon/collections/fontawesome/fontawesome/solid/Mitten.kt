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

public val SolidGroup.Mitten: ImageVector
    get() {
        if (_mitten != null) {
            return _mitten!!
        }
        _mitten = Builder(name = "Mitten", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 384.0f)
                lineTo(64.0f, 384.0f)
                lineTo(5.4f, 178.9f)
                curveTo(1.8f, 166.4f, 0.0f, 153.4f, 0.0f, 140.3f)
                curveTo(0.0f, 62.8f, 62.8f, 0.0f, 140.3f, 0.0f)
                lineToRelative(3.4f, 0.0f)
                curveToRelative(66.0f, 0.0f, 123.5f, 44.9f, 139.5f, 108.9f)
                lineToRelative(31.4f, 125.8f)
                lineToRelative(17.6f, -20.1f)
                curveTo(344.8f, 200.2f, 362.9f, 192.0f, 382.0f, 192.0f)
                lineToRelative(2.8f, 0.0f)
                curveToRelative(34.9f, 0.0f, 63.3f, 28.3f, 63.3f, 63.3f)
                curveToRelative(0.0f, 15.9f, -6.0f, 31.2f, -16.8f, 42.9f)
                lineTo(352.0f, 384.0f)
                close()
                moveTo(32.0f, 448.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(288.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                close()
            }
        }
        .build()
        return _mitten!!
    }

private var _mitten: ImageVector? = null
