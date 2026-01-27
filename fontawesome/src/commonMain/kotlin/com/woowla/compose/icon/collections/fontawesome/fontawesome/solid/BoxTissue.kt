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

public val SolidGroup.BoxTissue: ImageVector
    get() {
        if (_boxTissue != null) {
            return _boxTissue!!
        }
        _boxTissue = Builder(name = "BoxTissue", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(103.9f, 32.0f)
                lineToRelative(161.0f, 0.0f)
                curveToRelative(13.8f, 0.0f, 26.0f, 8.8f, 30.4f, 21.9f)
                lineToRelative(17.4f, 52.2f)
                curveToRelative(4.4f, 13.1f, 16.6f, 21.9f, 30.4f, 21.9f)
                lineToRelative(60.5f, 0.0f)
                curveToRelative(21.8f, 0.0f, 37.3f, 21.4f, 30.4f, 42.1f)
                lineTo(384.0f, 320.0f)
                lineTo(128.0f, 320.0f)
                lineTo(72.7f, 70.9f)
                curveTo(68.2f, 51.0f, 83.4f, 32.0f, 103.9f, 32.0f)
                close()
                moveTo(48.0f, 256.0f)
                lineToRelative(16.6f, 0.0f)
                lineToRelative(16.5f, 74.4f)
                curveTo(86.0f, 352.4f, 105.5f, 368.0f, 128.0f, 368.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(20.7f, 0.0f, 39.0f, -13.2f, 45.5f, -32.8f)
                lineToRelative(26.4f, -79.2f)
                lineToRelative(8.1f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 304.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _boxTissue!!
    }

private var _boxTissue: ImageVector? = null
