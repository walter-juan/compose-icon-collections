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

public val SolidGroup.PersonSnowboarding: ImageVector
    get() {
        if (_personSnowboarding != null) {
            return _personSnowboarding!!
        }
        _personSnowboarding = Builder(name = "PersonSnowboarding", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(424.5f, 16.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, -112.0f)
                close()
                moveTo(166.4f, 45.5f)
                curveToRelative(10.2f, -14.4f, 30.2f, -17.9f, 44.6f, -7.7f)
                lineToRelative(272.0f, 192.0f)
                curveToRelative(14.4f, 10.2f, 17.9f, 30.2f, 7.7f, 44.6f)
                reflectiveCurveToRelative(-30.2f, 17.9f, -44.6f, 7.7f)
                lineToRelative(-92.2f, -65.1f)
                lineToRelative(-62.2f, 53.3f)
                lineToRelative(32.1f, 26.7f)
                curveToRelative(18.2f, 15.2f, 28.8f, 37.7f, 28.8f, 61.5f)
                lineToRelative(0.0f, 87.8f)
                lineToRelative(77.5f, 15.2f)
                curveToRelative(6.2f, 1.2f, 12.6f, 0.9f, 18.7f, -0.8f)
                lineToRelative(41.2f, -11.8f)
                curveToRelative(12.7f, -3.6f, 26.0f, 3.7f, 29.7f, 16.5f)
                reflectiveCurveToRelative(-3.7f, 26.0f, -16.5f, 29.7f)
                lineToRelative(-41.2f, 11.8f)
                curveToRelative(-13.4f, 3.8f, -27.4f, 4.4f, -41.1f, 1.8f)
                lineTo(87.1f, 443.3f)
                curveToRelative(-17.2f, -3.4f, -33.0f, -11.8f, -45.3f, -24.1f)
                lineTo(15.5f, 393.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(26.2f, 26.2f)
                curveToRelative(5.6f, 5.6f, 12.8f, 9.4f, 20.6f, 11.0f)
                lineToRelative(64.2f, 12.6f)
                lineToRelative(0.0f, -123.7f)
                curveToRelative(0.0f, -27.7f, 12.0f, -54.0f, 32.8f, -72.2f)
                lineToRelative(69.0f, -60.4f)
                lineToRelative(-88.2f, -62.3f)
                curveTo(159.6f, 80.0f, 156.2f, 60.0f, 166.4f, 45.5f)
                close()
                moveTo(224.5f, 421.2f)
                lineToRelative(64.0f, 12.5f)
                lineToRelative(0.0f, -75.3f)
                curveToRelative(0.0f, -4.7f, -2.1f, -9.3f, -5.8f, -12.3f)
                lineToRelative(-58.2f, -48.5f)
                lineToRelative(0.0f, 123.6f)
                close()
            }
        }
        .build()
        return _personSnowboarding!!
    }

private var _personSnowboarding: ImageVector? = null
