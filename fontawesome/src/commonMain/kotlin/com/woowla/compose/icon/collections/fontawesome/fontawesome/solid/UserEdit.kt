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

public val SolidGroup.UserEdit: ImageVector
    get() {
        if (_userEdit != null) {
            return _userEdit!!
        }
        _userEdit = Builder(name = "UserEdit", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.1f, 248.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, false, 0.0f, -240.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, false, 0.0f, 240.0f)
                close()
                moveTo(226.4f, 304.0f)
                curveToRelative(-98.5f, 0.0f, -178.3f, 79.8f, -178.3f, 178.3f)
                curveToRelative(0.0f, 16.4f, 13.3f, 29.7f, 29.7f, 29.7f)
                lineToRelative(196.5f, 0.0f)
                lineToRelative(10.9f, -54.5f)
                curveToRelative(4.3f, -21.7f, 15.0f, -41.6f, 30.6f, -57.2f)
                lineToRelative(67.3f, -67.3f)
                curveToRelative(-28.0f, -18.3f, -61.4f, -28.9f, -97.4f, -28.9f)
                lineToRelative(-59.4f, 0.0f)
                close()
                moveTo(332.3f, 466.9f)
                lineToRelative(-11.9f, 59.6f)
                curveToRelative(-0.2f, 0.9f, -0.3f, 1.9f, -0.3f, 2.9f)
                curveToRelative(0.0f, 8.0f, 6.5f, 14.6f, 14.6f, 14.6f)
                curveToRelative(1.0f, 0.0f, 1.9f, -0.1f, 2.9f, -0.3f)
                lineToRelative(59.6f, -11.9f)
                curveToRelative(12.4f, -2.5f, 23.8f, -8.6f, 32.7f, -17.5f)
                lineToRelative(118.9f, -118.9f)
                lineToRelative(-80.0f, -80.0f)
                lineToRelative(-118.9f, 118.9f)
                curveToRelative(-8.9f, 8.9f, -15.0f, 20.3f, -17.5f, 32.7f)
                close()
                moveTo(600.1f, 343.9f)
                curveToRelative(22.1f, -22.1f, 22.1f, -57.9f, 0.0f, -80.0f)
                reflectiveCurveToRelative(-57.9f, -22.1f, -80.0f, 0.0f)
                lineToRelative(-28.8f, 28.8f)
                lineToRelative(80.0f, 80.0f)
                lineToRelative(28.8f, -28.8f)
                close()
            }
        }
        .build()
        return _userEdit!!
    }

private var _userEdit: ImageVector? = null
