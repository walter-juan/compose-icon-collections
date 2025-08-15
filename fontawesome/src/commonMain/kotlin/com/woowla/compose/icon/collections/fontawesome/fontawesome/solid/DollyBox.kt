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

public val SolidGroup.DollyBox: ImageVector
    get() {
        if (_dollyBox != null) {
            return _dollyBox!!
        }
        _dollyBox = Builder(name = "DollyBox", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 0.0f)
                curveTo(14.3f, 0.0f, 0.0f, 14.3f, 0.0f, 32.0f)
                reflectiveCurveTo(14.3f, 64.0f, 32.0f, 64.0f)
                lineToRelative(72.9f, 0.0f)
                lineToRelative(92.1f, 276.2f)
                curveToRelative(-22.5f, 17.6f, -37.0f, 45.0f, -37.0f, 75.8f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                curveToRelative(52.4f, 0.0f, 95.1f, -42.0f, 96.0f, -94.3f)
                lineToRelative(202.1f, -67.4f)
                curveToRelative(16.8f, -5.6f, 25.8f, -23.7f, 20.2f, -40.5f)
                reflectiveCurveToRelative(-23.7f, -25.8f, -40.5f, -20.2f)
                lineTo(331.8f, 357.0f)
                curveToRelative(-17.2f, -22.1f, -43.9f, -36.5f, -74.0f, -37.0f)
                lineTo(165.7f, 43.8f)
                curveTo(156.9f, 17.6f, 132.5f, 0.0f, 104.9f, 0.0f)
                lineTo(32.0f, 0.0f)
                close()
                moveTo(208.0f, 416.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(280.5f, 89.3f)
                curveToRelative(-25.2f, 8.2f, -39.0f, 35.3f, -30.8f, 60.5f)
                lineToRelative(39.6f, 121.7f)
                curveToRelative(8.2f, 25.2f, 35.3f, 39.0f, 60.5f, 30.8f)
                lineToRelative(121.7f, -39.6f)
                curveToRelative(25.2f, -8.2f, 39.0f, -35.3f, 30.8f, -60.5f)
                lineTo(462.8f, 80.5f)
                curveToRelative(-8.2f, -25.2f, -35.3f, -39.0f, -60.5f, -30.8f)
                lineTo(280.5f, 89.3f)
                close()
            }
        }
        .build()
        return _dollyBox!!
    }

private var _dollyBox: ImageVector? = null
