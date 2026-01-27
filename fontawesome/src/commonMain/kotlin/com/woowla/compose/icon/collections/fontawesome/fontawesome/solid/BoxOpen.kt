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

public val SolidGroup.BoxOpen: ImageVector
    get() {
        if (_boxOpen != null) {
            return _boxOpen!!
        }
        _boxOpen = Builder(name = "BoxOpen", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(560.3f, 237.2f)
                curveToRelative(10.4f, 11.8f, 28.3f, 14.4f, 41.8f, 5.5f)
                curveToRelative(14.7f, -9.8f, 18.7f, -29.7f, 8.9f, -44.4f)
                lineToRelative(-48.0f, -72.0f)
                curveToRelative(-2.8f, -4.2f, -6.6f, -7.7f, -11.1f, -10.2f)
                lineTo(351.4f, 4.7f)
                curveToRelative(-19.3f, -10.7f, -42.8f, -10.7f, -62.2f, 0.0f)
                lineTo(88.8f, 116.0f)
                curveToRelative(-5.4f, 3.0f, -9.7f, 7.4f, -12.6f, 12.8f)
                lineTo(27.7f, 218.7f)
                curveToRelative(-12.6f, 23.4f, -3.8f, 52.5f, 19.6f, 65.1f)
                lineToRelative(33.0f, 17.7f)
                lineToRelative(0.0f, 53.3f)
                curveToRelative(0.0f, 23.0f, 12.4f, 44.3f, 32.4f, 55.7f)
                lineToRelative(176.0f, 99.7f)
                curveToRelative(19.6f, 11.1f, 43.5f, 11.1f, 63.1f, 0.0f)
                lineToRelative(176.0f, -99.7f)
                curveToRelative(20.1f, -11.4f, 32.4f, -32.6f, 32.4f, -55.7f)
                lineToRelative(0.0f, -117.5f)
                close()
                moveTo(320.3f, 227.4f)
                lineTo(170.2f, 144.0f)
                lineTo(320.3f, 60.6f)
                lineTo(470.4f, 144.0f)
                lineTo(320.3f, 227.4f)
                close()
                moveTo(278.8f, 277.6f)
                lineToRelative(-21.3f, 46.2f)
                lineToRelative(-165.8f, -88.8f)
                lineToRelative(25.4f, -47.2f)
                lineToRelative(161.7f, 89.8f)
                close()
            }
        }
        .build()
        return _boxOpen!!
    }

private var _boxOpen: ImageVector? = null
