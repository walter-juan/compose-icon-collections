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

public val SolidGroup.NetworkWired: ImageVector
    get() {
        if (_networkWired != null) {
            return _networkWired!!
        }
        _networkWired = Builder(name = "NetworkWired", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 88.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                close()
                moveTo(240.0f, 32.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-224.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(192.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-224.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-96.0f, 0.0f)
                close()
                moveTo(448.0f, 376.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(72.0f, 0.0f)
                close()
                moveTo(192.0f, 376.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(72.0f, 0.0f)
                close()
            }
        }
        .build()
        return _networkWired!!
    }

private var _networkWired: ImageVector? = null
