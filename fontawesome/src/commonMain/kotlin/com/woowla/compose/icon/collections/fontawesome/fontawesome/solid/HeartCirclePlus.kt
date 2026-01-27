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

public val SolidGroup.HeartCirclePlus: ImageVector
    get() {
        if (_heartCirclePlus != null) {
            return _heartCirclePlus!!
        }
        _heartCirclePlus = Builder(name = "HeartCirclePlus", defaultWidth = 576.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.0f, 87.1f)
                lineToRelative(15.0f, 20.7f)
                lineToRelative(15.0f, -20.7f)
                curveTo(296.0f, 52.5f, 336.2f, 32.0f, 378.9f, 32.0f)
                curveTo(452.4f, 32.0f, 512.0f, 91.6f, 512.0f, 165.1f)
                lineToRelative(0.0f, 2.6f)
                curveToRelative(0.0f, 17.6f, -3.4f, 35.6f, -9.5f, 53.7f)
                curveToRelative(-21.8f, -8.6f, -45.6f, -13.4f, -70.5f, -13.4f)
                curveToRelative(-106.0f, 0.0f, -192.0f, 86.0f, -192.0f, 192.0f)
                curveToRelative(0.0f, 28.5f, 6.2f, 55.6f, 17.4f, 80.0f)
                curveToRelative(-0.5f, 0.0f, -0.9f, 0.0f, -1.4f, 0.0f)
                curveToRelative(-15.5f, 0.0f, -30.8f, -4.6f, -43.1f, -14.1f)
                curveToRelative(-73.0f, -55.7f, -212.9f, -186.0f, -212.9f, -298.2f)
                lineToRelative(0.0f, -2.6f)
                curveTo(0.0f, 91.6f, 59.6f, 32.0f, 133.1f, 32.0f)
                curveTo(175.8f, 32.0f, 216.0f, 52.5f, 241.0f, 87.1f)
                close()
                moveTo(432.0f, 256.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 0.0f, 288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 0.0f, -288.0f)
                close()
                moveTo(448.0f, 336.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _heartCirclePlus!!
    }

private var _heartCirclePlus: ImageVector? = null
