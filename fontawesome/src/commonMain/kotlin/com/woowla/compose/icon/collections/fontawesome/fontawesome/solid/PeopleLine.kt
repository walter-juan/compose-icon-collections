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

public val SolidGroup.PeopleLine: ImageVector
    get() {
        if (_peopleLine != null) {
            return _peopleLine!!
        }
        _peopleLine = Builder(name = "PeopleLine", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, -128.0f)
                close()
                moveTo(384.0f, 312.0f)
                curveToRelative(0.0f, 25.0f, -12.7f, 47.0f, -32.0f, 59.9f)
                lineToRelative(0.0f, 44.1f)
                lineToRelative(-128.0f, 0.0f)
                lineToRelative(0.0f, -44.1f)
                curveTo(204.7f, 359.0f, 192.0f, 337.0f, 192.0f, 312.0f)
                lineToRelative(0.0f, -40.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 43.0f, 96.0f, 96.0f)
                lineToRelative(0.0f, 40.0f)
                close()
                moveTo(400.0f, 416.0f)
                lineToRelative(0.0f, -27.3f)
                curveToRelative(19.9f, -22.5f, 32.0f, -52.2f, 32.0f, -84.7f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -26.7f, -7.3f, -51.6f, -19.9f, -73.1f)
                curveToRelative(11.1f, -4.5f, 23.2f, -6.9f, 35.9f, -6.9f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 23.7f, -12.9f, 44.4f, -32.0f, 55.4f)
                lineToRelative(0.0f, 40.6f)
                lineToRelative(-112.0f, 0.0f)
                close()
                moveTo(64.0f, 375.4f)
                curveTo(44.9f, 364.4f, 32.0f, 343.7f, 32.0f, 320.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                curveToRelative(12.7f, 0.0f, 24.8f, 2.5f, 35.9f, 6.9f)
                curveToRelative(-12.6f, 21.4f, -19.9f, 46.4f, -19.9f, 73.1f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 32.5f, 12.1f, 62.1f, 32.0f, 84.7f)
                lineToRelative(0.0f, 27.3f)
                lineToRelative(-112.0f, 0.0f)
                lineToRelative(0.0f, -40.6f)
                close()
                moveTo(128.0f, 32.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, -112.0f)
                close()
                moveTo(448.0f, 32.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, -112.0f)
                close()
                moveTo(24.0f, 464.0f)
                lineToRelative(528.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(24.0f, 512.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _peopleLine!!
    }

private var _peopleLine: ImageVector? = null
