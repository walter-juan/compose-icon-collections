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

public val SolidGroup.HomeUser: ImageVector
    get() {
        if (_homeUser != null) {
            return _homeUser!!
        }
        _homeUser = Builder(name = "HomeUser", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(277.8f, 8.6f)
                curveToRelative(-12.3f, -11.4f, -31.3f, -11.4f, -43.5f, 0.0f)
                lineToRelative(-224.0f, 208.0f)
                curveToRelative(-9.6f, 9.0f, -12.8f, 22.9f, -8.0f, 35.1f)
                reflectiveCurveTo(18.8f, 272.0f, 32.0f, 272.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, 176.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(288.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -176.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(13.2f, 0.0f, 25.0f, -8.1f, 29.8f, -20.3f)
                reflectiveCurveToRelative(1.6f, -26.2f, -8.0f, -35.1f)
                lineToRelative(-224.0f, -208.0f)
                close()
                moveTo(200.0f, 256.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
                close()
                moveTo(144.0f, 432.0f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineToRelative(-192.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _homeUser!!
    }

private var _homeUser: ImageVector? = null
