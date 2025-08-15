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

public val SolidGroup.UserInjured: ImageVector
    get() {
        if (_userInjured != null) {
            return _userInjured!!
        }
        _userInjured = Builder(name = "UserInjured", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.7f, 80.0f)
                lineTo(334.0f, 80.0f)
                curveToRelative(-10.7f, -24.6f, -29.5f, -44.9f, -52.9f, -57.6f)
                lineTo(242.7f, 80.0f)
                close()
                moveTo(241.8f, 9.3f)
                curveTo(236.0f, 8.4f, 230.0f, 8.0f, 224.0f, 8.0f)
                curveTo(174.8f, 8.0f, 132.5f, 37.6f, 114.0f, 80.0f)
                lineToRelative(80.6f, 0.0f)
                lineToRelative(47.1f, -70.7f)
                close()
                moveTo(224.0f, 248.0f)
                curveToRelative(66.3f, 0.0f, 120.0f, -53.7f, 120.0f, -120.0f)
                lineToRelative(-240.0f, 0.0f)
                curveToRelative(0.0f, 66.3f, 53.7f, 120.0f, 120.0f, 120.0f)
                close()
                moveTo(98.7f, 341.8f)
                curveTo(49.3f, 370.2f, 16.0f, 423.5f, 16.0f, 484.6f)
                curveTo(16.0f, 499.7f, 28.3f, 512.0f, 43.4f, 512.0f)
                lineToRelative(151.0f, 0.0f)
                lineToRelative(-95.8f, -170.2f)
                close()
                moveTo(143.8f, 324.1f)
                lineToRelative(42.7f, 75.9f)
                lineToRelative(85.5f, 0.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                curveToRelative(0.0f, 11.4f, -2.4f, 22.2f, -6.7f, 32.0f)
                lineToRelative(59.2f, 0.0f)
                curveToRelative(15.1f, 0.0f, 27.4f, -12.3f, 27.4f, -27.4f)
                curveToRelative(0.0f, -90.9f, -73.7f, -164.6f, -164.6f, -164.6f)
                lineToRelative(-86.9f, 0.0f)
                curveToRelative(-12.6f, 0.0f, -24.9f, 1.4f, -36.7f, 4.1f)
                close()
                moveTo(213.5f, 448.0f)
                lineToRelative(36.0f, 64.0f)
                lineToRelative(22.5f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-58.5f, 0.0f)
                close()
            }
        }
        .build()
        return _userInjured!!
    }

private var _userInjured: ImageVector? = null
