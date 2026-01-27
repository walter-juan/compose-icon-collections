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

public val BrandsGroup.Sitrox: ImageVector
    get() {
        if (_sitrox != null) {
            return _sitrox!!
        }
        _sitrox = Builder(name = "Sitrox", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.4f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(235.6f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(-384.0f, 0.0f)
                curveTo(64.0f, 57.6f, 141.8f, 0.5f, 212.4f, 0.0f)
                close()
                moveTo(237.2f, 192.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(69.9f, 0.5f, 146.7f, 57.6f, 146.7f, 128.0f)
                lineToRelative(-173.2f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(140.9f, 319.6f, 64.0f, 262.4f, 64.0f, 192.0f)
                lineToRelative(173.3f, 0.0f)
                close()
                moveTo(235.5f, 512.0f)
                curveToRelative(70.7f, -0.5f, 148.4f, -57.6f, 148.4f, -128.0f)
                lineToRelative(-384.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(235.6f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _sitrox!!
    }

private var _sitrox: ImageVector? = null
