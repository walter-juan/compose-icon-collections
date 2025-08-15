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

public val SolidGroup.UserXmark: ImageVector
    get() {
        if (_userXmark != null) {
            return _userXmark!!
        }
        _userXmark = Builder(name = "UserXmark", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.4f, 128.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 240.0f, 0.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, -240.0f, 0.0f)
                close()
                moveTo(48.4f, 482.3f)
                curveToRelative(0.0f, -98.5f, 79.8f, -178.3f, 178.3f, -178.3f)
                lineToRelative(59.4f, 0.0f)
                curveToRelative(98.5f, 0.0f, 178.3f, 79.8f, 178.3f, 178.3f)
                curveToRelative(0.0f, 16.4f, -13.3f, 29.7f, -29.7f, 29.7f)
                lineTo(78.1f, 512.0f)
                curveToRelative(-16.4f, 0.0f, -29.7f, -13.3f, -29.7f, -29.7f)
                close()
                moveTo(612.3f, 124.1f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-33.9f, 33.9f)
                lineToRelative(33.9f, 33.9f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-33.9f, -33.9f)
                lineToRelative(-33.9f, 33.9f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(33.9f, -33.9f)
                lineToRelative(-33.9f, -33.9f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(33.9f, 33.9f)
                lineToRelative(33.9f, -33.9f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                close()
            }
        }
        .build()
        return _userXmark!!
    }

private var _userXmark: ImageVector? = null
