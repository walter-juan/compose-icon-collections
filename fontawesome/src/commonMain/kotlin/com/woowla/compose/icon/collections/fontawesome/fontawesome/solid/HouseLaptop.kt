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

public val SolidGroup.HouseLaptop: ImageVector
    get() {
        if (_houseLaptop != null) {
            return _houseLaptop!!
        }
        _houseLaptop = Builder(name = "HouseLaptop", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.3f, 8.5f)
                curveToRelative(12.3f, -11.3f, 31.2f, -11.3f, 43.4f, 0.0f)
                lineToRelative(208.0f, 192.0f)
                curveToRelative(6.7f, 6.2f, 10.3f, 14.8f, 10.3f, 23.5f)
                lineToRelative(-144.0f, 0.0f)
                curveToRelative(-19.1f, 0.0f, -36.3f, 8.4f, -48.0f, 21.7f)
                lineToRelative(0.0f, -37.7f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(-160.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -112.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-13.2f, 0.0f, -25.0f, -8.1f, -29.8f, -20.3f)
                reflectiveCurveToRelative(-1.6f, -26.2f, 8.1f, -35.2f)
                lineToRelative(208.0f, -192.0f)
                close()
                moveTo(352.0f, 304.0f)
                lineToRelative(0.0f, 144.0f)
                lineToRelative(192.0f, 0.0f)
                lineToRelative(0.0f, -144.0f)
                lineToRelative(-192.0f, 0.0f)
                close()
                moveTo(304.0f, 288.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(224.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 160.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(-192.0f, 0.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, -160.0f)
                close()
            }
        }
        .build()
        return _houseLaptop!!
    }

private var _houseLaptop: ImageVector? = null
