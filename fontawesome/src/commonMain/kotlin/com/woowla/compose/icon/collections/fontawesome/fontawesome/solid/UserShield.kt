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

public val SolidGroup.UserShield: ImageVector
    get() {
        if (_userShield != null) {
            return _userShield!!
        }
        _userShield = Builder(name = "UserShield", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 248.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, false, 0.0f, -240.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, false, 0.0f, 240.0f)
                close()
                moveTo(194.3f, 304.0f)
                curveTo(95.8f, 304.0f, 16.0f, 383.8f, 16.0f, 482.3f)
                curveTo(16.0f, 498.7f, 29.3f, 512.0f, 45.7f, 512.0f)
                lineToRelative(251.5f, 0.0f)
                curveTo(261.0f, 469.4f, 240.0f, 414.5f, 240.0f, 356.4f)
                lineToRelative(0.0f, -31.1f)
                curveToRelative(0.0f, -7.3f, 1.0f, -14.5f, 2.9f, -21.3f)
                lineToRelative(-48.6f, 0.0f)
                close()
                moveTo(445.3f, 488.5f)
                lineToRelative(-13.3f, 6.3f)
                lineToRelative(0.0f, -188.1f)
                lineToRelative(96.0f, 32.0f)
                lineToRelative(0.0f, 19.6f)
                curveToRelative(0.0f, 55.8f, -32.2f, 106.5f, -82.7f, 130.3f)
                close()
                moveTo(421.9f, 259.5f)
                lineToRelative(-112.0f, 37.3f)
                curveToRelative(-13.1f, 4.4f, -21.9f, 16.6f, -21.9f, 30.4f)
                lineToRelative(0.0f, 31.1f)
                curveToRelative(0.0f, 74.4f, 43.0f, 142.1f, 110.2f, 173.7f)
                lineToRelative(18.5f, 8.7f)
                curveToRelative(4.8f, 2.2f, 10.0f, 3.4f, 15.2f, 3.4f)
                reflectiveCurveToRelative(10.5f, -1.2f, 15.2f, -3.4f)
                lineToRelative(18.5f, -8.7f)
                curveTo(533.0f, 500.3f, 576.0f, 432.6f, 576.0f, 358.2f)
                lineToRelative(0.0f, -31.1f)
                curveToRelative(0.0f, -13.8f, -8.8f, -26.0f, -21.9f, -30.4f)
                lineToRelative(-112.0f, -37.3f)
                curveToRelative(-6.6f, -2.2f, -13.7f, -2.2f, -20.2f, 0.0f)
                close()
            }
        }
        .build()
        return _userShield!!
    }

private var _userShield: ImageVector? = null
