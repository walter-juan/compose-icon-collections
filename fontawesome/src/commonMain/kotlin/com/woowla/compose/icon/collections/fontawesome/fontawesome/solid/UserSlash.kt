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

public val SolidGroup.UserSlash: ImageVector
    get() {
        if (_userSlash != null) {
            return _userSlash!!
        }
        _userSlash = Builder(name = "UserSlash", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(-2.3f, -0.3f, 7.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(311.5f, 245.7f)
                curveToRelative(55.0f, -10.9f, 96.5f, -59.5f, 96.5f, -117.7f)
                curveToRelative(0.0f, -66.3f, -53.7f, -120.0f, -120.0f, -120.0f)
                curveToRelative(-58.2f, 0.0f, -106.8f, 41.5f, -117.7f, 96.5f)
                lineTo(41.0f, -24.9f)
                close()
                moveTo(235.6f, 305.4f)
                curveTo(147.9f, 316.6f, 80.0f, 391.5f, 80.0f, 482.3f)
                curveTo(80.0f, 498.7f, 93.3f, 512.0f, 109.7f, 512.0f)
                lineToRelative(332.5f, 0.0f)
                lineToRelative(-206.6f, -206.6f)
                close()
            }
        }
        .build()
        return _userSlash!!
    }

private var _userSlash: ImageVector? = null
