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

public val SolidGroup.CaretRight: ImageVector
    get() {
        if (_caretRight != null) {
            return _caretRight!!
        }
        _caretRight = Builder(name = "CaretRight", defaultWidth = 256.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.3f, 235.8f)
                curveToRelative(10.2f, 12.6f, 9.5f, 31.1f, -2.2f, 42.8f)
                lineToRelative(-128.0f, 128.0f)
                curveToRelative(-9.2f, 9.2f, -22.9f, 11.9f, -34.9f, 6.9f)
                reflectiveCurveTo(64.5f, 396.9f, 64.5f, 384.0f)
                lineToRelative(0.0f, -256.0f)
                curveToRelative(0.0f, -12.9f, 7.8f, -24.6f, 19.8f, -29.6f)
                reflectiveCurveToRelative(25.7f, -2.2f, 34.9f, 6.9f)
                lineToRelative(128.0f, 128.0f)
                lineToRelative(2.2f, 2.4f)
                close()
            }
        }
        .build()
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
