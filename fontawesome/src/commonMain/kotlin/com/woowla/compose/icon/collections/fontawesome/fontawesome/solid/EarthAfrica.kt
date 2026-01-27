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

public val SolidGroup.EarthAfrica: ImageVector
    get() {
        if (_earthAfrica != null) {
            return _earthAfrica!!
        }
        _earthAfrica = Builder(name = "EarthAfrica", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(447.6f, 175.0f)
                curveToRelative(-31.6f, -74.6f, -105.5f, -127.0f, -191.6f, -127.0f)
                curveToRelative(-22.1f, 0.0f, -43.4f, 3.5f, -63.4f, 9.8f)
                curveToRelative(-0.4f, 2.0f, -0.6f, 4.1f, -0.6f, 6.2f)
                lineToRelative(0.0f, 73.4f)
                curveToRelative(0.0f, 12.5f, 10.1f, 22.6f, 22.6f, 22.6f)
                curveToRelative(6.0f, 0.0f, 11.8f, -2.4f, 16.0f, -6.6f)
                lineToRelative(16.0f, -16.0f)
                curveToRelative(6.0f, -6.0f, 14.1f, -9.4f, 22.6f, -9.4f)
                lineToRelative(5.5f, 0.0f)
                curveToRelative(28.5f, 0.0f, 42.8f, 34.5f, 22.6f, 54.6f)
                curveToRelative(-6.0f, 6.0f, -14.1f, 9.4f, -22.6f, 9.4f)
                lineToRelative(-61.5f, 0.0f)
                curveToRelative(-8.5f, 0.0f, -16.6f, 3.4f, -22.6f, 9.4f)
                lineToRelative(-21.3f, 21.3f)
                curveToRelative(-6.0f, 6.0f, -9.4f, 14.1f, -9.4f, 22.6f)
                lineToRelative(0.0f, 42.7f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(2.7f, 0.0f)
                curveToRelative(8.5f, 0.0f, 16.6f, -3.4f, 22.6f, -9.4f)
                lineToRelative(29.3f, -29.3f)
                curveToRelative(6.0f, -6.0f, 9.4f, -14.1f, 9.4f, -22.6f)
                lineToRelative(0.0f, -18.7f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -34.7f)
                curveToRelative(0.0f, -8.5f, -3.4f, -16.6f, -9.4f, -22.6f)
                lineToRelative(-16.0f, -16.0f)
                curveToRelative(-4.2f, -4.2f, -6.6f, -10.0f, -6.6f, -16.0f)
                curveToRelative(0.0f, -12.5f, 10.1f, -22.6f, 22.6f, -22.6f)
                lineToRelative(45.0f, 0.0f)
                curveToRelative(12.4f, 0.0f, 22.7f, -7.1f, 28.0f, -17.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
                close()
            }
        }
        .build()
        return _earthAfrica!!
    }

private var _earthAfrica: ImageVector? = null
