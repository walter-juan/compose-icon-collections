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

public val SolidGroup.UsersSlash: ImageVector
    get() {
        if (_usersSlash != null) {
            return _usersSlash!!
        }
        _usersSlash = Builder(name = "UsersSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(73.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(29.7f, -0.3f, 39.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(321.8f, 224.0f)
                curveToRelative(56.6f, -1.0f, 102.2f, -47.2f, 102.2f, -104.0f)
                curveToRelative(0.0f, -57.4f, -46.6f, -104.0f, -104.0f, -104.0f)
                curveToRelative(-56.8f, 0.0f, -103.0f, 45.6f, -104.0f, 102.2f)
                lineTo(73.0f, -24.9f)
                close()
                moveTo(512.0f, 288.0f)
                curveToRelative(-17.2f, 0.0f, -33.7f, 3.4f, -48.7f, 9.6f)
                lineToRelative(170.0f, 170.0f)
                curveToRelative(4.2f, -5.4f, 6.7f, -12.2f, 6.7f, -19.6f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -70.7f, -57.3f, -128.0f, -128.0f, -128.0f)
                close()
                moveTo(59.9f, 97.7f)
                curveToRelative(-21.5f, 12.5f, -35.9f, 35.7f, -35.9f, 62.3f)
                curveToRelative(0.0f, 39.8f, 32.2f, 72.0f, 72.0f, 72.0f)
                curveToRelative(26.6f, 0.0f, 49.8f, -14.4f, 62.3f, -35.9f)
                lineTo(59.9f, 97.7f)
                close()
                moveTo(250.2f, 288.0f)
                curveTo(196.8f, 313.9f, 160.0f, 368.7f, 160.0f, 432.0f)
                lineToRelative(0.0f, 16.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(250.2f, 0.0f)
                lineToRelative(-192.0f, -192.0f)
                close()
                moveTo(128.0f, 288.0f)
                curveTo(57.3f, 288.0f, 0.0f, 345.3f, 0.0f, 416.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(86.7f, 0.0f)
                curveToRelative(-4.3f, -9.8f, -6.7f, -20.6f, -6.7f, -32.0f)
                lineToRelative(0.0f, -16.0f)
                curveToRelative(0.0f, -53.2f, 20.0f, -101.8f, 52.9f, -138.6f)
                curveToRelative(-11.7f, -3.5f, -24.1f, -5.4f, -36.9f, -5.4f)
                close()
                moveTo(616.0f, 160.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, -144.0f, 0.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 144.0f, 0.0f)
                close()
            }
        }
        .build()
        return _usersSlash!!
    }

private var _usersSlash: ImageVector? = null
