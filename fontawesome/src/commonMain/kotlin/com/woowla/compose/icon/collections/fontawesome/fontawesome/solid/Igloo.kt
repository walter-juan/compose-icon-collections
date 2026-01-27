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

public val SolidGroup.Igloo: ImageVector
    get() {
        if (_igloo != null) {
            return _igloo!!
        }
        _igloo = Builder(name = "Igloo", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 33.8f)
                lineToRelative(0.0f, 126.2f)
                lineToRelative(-271.5f, 0.0f)
                curveToRelative(51.7f, -77.2f, 139.6f, -128.0f, 239.5f, -128.0f)
                curveToRelative(10.8f, 0.0f, 21.5f, 0.6f, 32.0f, 1.8f)
                close()
                moveTo(368.0f, 160.0f)
                lineToRelative(0.0f, -116.7f)
                curveToRelative(66.0f, 19.0f, 122.2f, 61.0f, 159.5f, 116.7f)
                lineTo(368.0f, 160.0f)
                close()
                moveTo(22.6f, 208.0f)
                lineToRelative(73.4f, 0.0f)
                lineToRelative(0.0f, 112.0f)
                lineToRelative(-96.0f, 0.0f)
                curveToRelative(0.0f, -39.7f, 8.0f, -77.6f, 22.6f, -112.0f)
                close()
                moveTo(176.0f, 320.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, -112.0f)
                lineToRelative(288.0f, 0.0f)
                lineToRelative(0.0f, 112.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(176.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(176.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                close()
                moveTo(480.0f, 320.0f)
                lineToRelative(0.0f, -112.0f)
                lineToRelative(73.4f, 0.0f)
                curveTo(568.0f, 242.4f, 576.0f, 280.3f, 576.0f, 320.0f)
                lineToRelative(-96.0f, 0.0f)
                close()
                moveTo(288.0f, 288.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                lineToRelative(0.0f, 80.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _igloo!!
    }

private var _igloo: ImageVector? = null
