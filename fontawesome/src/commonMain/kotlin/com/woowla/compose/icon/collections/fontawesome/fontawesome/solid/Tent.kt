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

public val SolidGroup.Tent: ImageVector
    get() {
        if (_tent != null) {
            return _tent!!
        }
        _tent = Builder(name = "Tent", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.9f, 206.9f)
                lineTo(3.7f, 444.9f)
                curveTo(1.8f, 463.7f, 16.6f, 480.0f, 35.5f, 480.0f)
                lineToRelative(172.7f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -129.0f)
                curveToRelative(0.0f, -8.3f, 6.7f, -15.0f, 15.0f, -15.0f)
                curveToRelative(5.5f, 0.0f, 10.6f, 3.0f, 13.2f, 7.9f)
                lineToRelative(86.1f, 159.0f)
                curveToRelative(8.4f, 15.5f, 24.6f, 25.1f, 42.2f, 25.1f)
                lineToRelative(64.1f, 0.0f)
                curveToRelative(18.9f, 0.0f, 33.7f, -16.3f, 31.8f, -35.1f)
                lineTo(485.6f, 207.1f)
                curveToRelative(-1.9f, -19.6f, -12.8f, -37.3f, -29.5f, -47.8f)
                lineTo(280.9f, 48.3f)
                curveToRelative(-15.7f, -10.0f, -35.8f, -9.9f, -51.5f, 0.1f)
                lineTo(56.1f, 159.2f)
                curveToRelative(-16.5f, 10.6f, -27.3f, 28.2f, -29.2f, 47.7f)
                close()
            }
        }
        .build()
        return _tent!!
    }

private var _tent: ImageVector? = null
