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

public val SolidGroup.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                curveTo(92.7f, 32.0f, 64.0f, 60.7f, 64.0f, 96.0f)
                lineToRelative(0.0f, 256.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -256.0f)
                lineToRelative(384.0f, 0.0f)
                lineToRelative(0.0f, 256.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -256.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(128.0f, 32.0f)
                close()
                moveTo(19.2f, 384.0f)
                curveTo(8.6f, 384.0f, 0.0f, 392.6f, 0.0f, 403.2f)
                curveTo(0.0f, 445.6f, 34.4f, 480.0f, 76.8f, 480.0f)
                lineToRelative(486.4f, 0.0f)
                curveToRelative(42.4f, 0.0f, 76.8f, -34.4f, 76.8f, -76.8f)
                curveToRelative(0.0f, -10.6f, -8.6f, -19.2f, -19.2f, -19.2f)
                lineTo(19.2f, 384.0f)
                close()
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
