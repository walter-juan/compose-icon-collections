package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 128.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 160.0f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, -160.0f, 0.0f)
                close()
                moveTo(352.0f, 128.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, -256.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 256.0f, 0.0f)
                close()
                moveTo(48.0f, 480.0f)
                curveToRelative(0.0f, -70.7f, 57.3f, -128.0f, 128.0f, -128.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, 57.3f, 128.0f, 128.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -8.0f)
                curveToRelative(0.0f, -97.2f, -78.8f, -176.0f, -176.0f, -176.0f)
                lineToRelative(-96.0f, 0.0f)
                curveTo(78.8f, 304.0f, 0.0f, 382.8f, 0.0f, 480.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
