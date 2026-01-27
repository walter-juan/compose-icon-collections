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

public val SolidGroup.UserCheck: ImageVector
    get() {
        if (_userCheck != null) {
            return _userCheck!!
        }
        _userCheck = Builder(name = "UserCheck", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(286.0f, 304.0f)
                curveToRelative(98.5f, 0.0f, 178.3f, 79.8f, 178.3f, 178.3f)
                curveToRelative(0.0f, 16.4f, -13.3f, 29.7f, -29.7f, 29.7f)
                lineTo(78.0f, 512.0f)
                curveToRelative(-16.4f, 0.0f, -29.7f, -13.3f, -29.7f, -29.7f)
                curveToRelative(0.0f, -98.5f, 79.8f, -178.3f, 178.3f, -178.3f)
                lineToRelative(59.4f, 0.0f)
                close()
                moveTo(585.7f, 105.9f)
                curveToRelative(7.8f, -10.7f, 22.8f, -13.1f, 33.5f, -5.3f)
                reflectiveCurveToRelative(13.1f, 22.8f, 5.3f, 33.5f)
                lineTo(522.1f, 274.9f)
                curveToRelative(-4.2f, 5.7f, -10.7f, 9.4f, -17.7f, 9.8f)
                reflectiveCurveToRelative(-14.0f, -2.2f, -18.9f, -7.3f)
                lineToRelative(-46.4f, -48.0f)
                curveToRelative(-9.2f, -9.5f, -9.0f, -24.7f, 0.6f, -33.9f)
                curveToRelative(9.5f, -9.2f, 24.7f, -8.9f, 33.9f, 0.6f)
                lineToRelative(26.5f, 27.4f)
                lineToRelative(85.6f, -117.7f)
                close()
                moveTo(256.3f, 248.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 0.0f, -240.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 0.0f, 240.0f)
                close()
            }
        }
        .build()
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
