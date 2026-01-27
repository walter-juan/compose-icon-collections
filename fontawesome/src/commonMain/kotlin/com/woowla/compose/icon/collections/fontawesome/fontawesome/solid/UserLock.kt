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

public val SolidGroup.UserLock: ImageVector
    get() {
        if (_userLock != null) {
            return _userLock!!
        }
        _userLock = Builder(name = "UserLock", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 8.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 0.0f, 240.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 0.0f, -240.0f)
                close()
                moveTo(194.3f, 304.0f)
                lineToRelative(59.4f, 0.0f)
                curveToRelative(29.7f, 0.0f, 57.7f, 7.3f, 82.3f, 20.1f)
                lineToRelative(0.0f, 4.3f)
                curveToRelative(-19.6f, 17.6f, -32.0f, 43.1f, -32.0f, 71.5f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 5.5f, 0.5f, 10.9f, 1.3f, 16.1f)
                lineTo(45.7f, 512.0f)
                curveTo(29.3f, 512.0f, 16.0f, 498.7f, 16.0f, 482.3f)
                curveTo(16.0f, 383.8f, 95.8f, 304.0f, 194.3f, 304.0f)
                close()
                moveTo(496.0f, 304.1f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 47.9f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -47.9f)
                close()
                moveTo(352.0f, 400.0f)
                curveToRelative(0.0f, -20.9f, 13.4f, -38.7f, 32.0f, -45.3f)
                lineToRelative(0.0f, -50.6f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                lineToRelative(0.0f, 50.6f)
                curveToRelative(18.6f, 6.6f, 32.0f, 24.4f, 32.0f, 45.3f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -96.0f)
                close()
            }
        }
        .build()
        return _userLock!!
    }

private var _userLock: ImageVector? = null
